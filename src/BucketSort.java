import java.util.ArrayList;


public class BucketSort {

    private ArrayList<ArrayList<Integer>> bucketList = new ArrayList<>();
    private ArrayList<Integer> list;
    private int BUCKET_SORT;

    public ArrayList<ArrayList<Integer>> bucketSortList(BucketSort bs) {

        bucketList = sortOfList(this.list);
        boolean bucketSorted = true;

        while (bucketSorted) {
            ArrayList<ArrayList<Integer>> newArr = new ArrayList<>();
            for (int i = 0; i < bucketList.size(); i++) {
                int newIndex = 0;

                if (bucketList.get(i).size() > 1) {
                    ArrayList<ArrayList<Integer>> temp = new ArrayList<>();
                    int index = bucketList.indexOf(bucketList.get(i));
                    temp = sortOfList(bucketList.get(i));

                    if (i != 0) newIndex++;
                    for (int j = 0; j < bucketList.size(); j++) {
                        if (j == i) {
                            for (int k = 0; k < BUCKET_SORT; k++) {
                                newArr.add(temp.get(k));
                            }
                        }
                    }
                } else {
                    newArr.add(bucketList.get(i));
                }

            }
            //updated bucketList with new buckets
            bucketList = newArr;

            // flag to check if bucketList still dont sort by and bucket has more number than one
            // Güncellenmis bucketList'de, kovalar tek ya da bos mu kontrol ediyoruz. Gerekirse while'a dönüyoruz
            for (int m = 0; m < bucketList.size(); m++) {
                if (bucketList.get(m).size() > 1) {
                    bucketSorted = true;
                    break;
                } else {
                    bucketSorted = false;
                }
            }


        }
        // sorted list
        list.clear();
        for (ArrayList<Integer> a : bucketList) {
            if (a.size() > 0) list.add(a.get(0));
        }
        return bucketList;
    }

    public ArrayList<ArrayList<Integer>> sortOfList(ArrayList<Integer> l) {
        ArrayList<ArrayList<Integer>> newList = new ArrayList<>();
        int min = getMin(l);
        int max = getMax(l);
        int offset = 0;

        if (min < 0) offset = (min * -1);
        int index = 0;

        for (int i = 0; i < BUCKET_SORT; i++) {
            newList.add(i, new ArrayList<Integer>());
        }

        for (int i = 0; i < l.size(); i++) {
            int el = l.get(i);
           try{
               index = (BUCKET_SORT - 1) * (el + offset) / (max + offset);
           }catch (ArithmeticException e){
               System.out.println(index+e.getMessage());
               break;
           }
            newList.get(index).add(el);
        }
        return newList;
    }

    public int getMin(ArrayList<Integer> l) {
        int min = l.get(0);
        for (int i = 0; i < l.size(); i++) {
            if (l.get(i) < min) min = l.get(i);
        }
        return min;
    }

    public int getMax(ArrayList<Integer> l) {
        int max = l.get(0);
        for (int i = 0; i < l.size(); i++) {
            if (l.get(i) > max) max = l.get(i);
        }
        return max;
    }

    public ArrayList<Integer> getList() {
        return list;
    }

    public void setList(ArrayList<Integer> list) {
        this.list = list;
    }

    public int getBUCKET_SORT() {
        return BUCKET_SORT;
    }

    public void setBUCKET_SORT(int BUCKET_SORT) {
        this.BUCKET_SORT = BUCKET_SORT;
    }

    public ArrayList<ArrayList<Integer>> getBucketList() {
        return bucketList;
    }
// Easy sort Algorithm
//    public ArrayList<Integer> sortedList(ArrayList<Integer> l) {
//        boolean sorted = false;
//        int temp;
//        while (!sorted) {
//            sorted = true;
//            for (int i = 0; i < l.size() - 1; i++) {
//                if (l.get(i) > l.get(i + 1)) {
//                    temp = l.get(i);
//                    l.set(i, l.get(i + 1));
//                    l.set(i + 1, temp);
//                    sorted = false;
//                }
//            }
//        }
//        return l;
//    }

}
