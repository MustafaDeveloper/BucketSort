import java.util.ArrayList;


public class BucketSort {

    private ArrayList<ArrayList<Integer>> bucketList = new ArrayList<>();
    private ArrayList<Integer> list;
    private int BUCKET_SORT;
    private ArrayList<BucketSort> arrBucketSort;

//    public void bucketSort() {
//        ArrayList<Integer> arrBS=new ArrayList<>();
//        bucketSortList(this);
//        for (ArrayList<Integer> a: bucketList  ) {
//            if (a.size()>1){
//                arrBS
//            }else{
//
//            }
//        }
//
//    }

    public ArrayList<ArrayList<Integer>> bucketSortList(BucketSort bs) {

        bucketList = sortOfList(this.list);
        // newArr = bucketList;
        boolean bucketSorted = true;
        System.out.println("bucketList 01 = " + bucketList);

        while (bucketSorted) {
            ArrayList<ArrayList<Integer>> newArr = new ArrayList<>();
            System.out.println("WHILE bucketList = " + bucketList);
            //System.out.println("WHILE newArr = " + newArr);

            for (int i = 0; i < bucketList.size(); i++) {
                int newIndex = 0;
                System.out.println("************************");
                System.out.println("i = " + i);
                System.out.println("FOR bucketList = " + bucketList);
                System.out.println("FOR newArr = " + newArr);

                if (bucketList.get(i).size() > 1) {
                    ArrayList<ArrayList<Integer>> temp = new ArrayList<>();
                    int index = bucketList.indexOf(bucketList.get(i));
                    temp = sortOfList(bucketList.get(i));
                    System.out.println("temp 02 = " + temp);
                    if (i != 0) newIndex++;
                        for (int j = 0; j < bucketList.size(); j++) {
                            if (j == i) {
                                for (int k = 0; k < 3; k++) {
                                    newArr.add(temp.get(k));
                                }

                            }
                        }

                    System.out.println("newArr 05 : " + newArr);
                } else {
                    //   bucketList = newArr;
                    newArr.add(bucketList.get(i));
                    System.out.println("  newArr   son  ::: " + newArr);
                    System.out.println("bucketList son  ::: " + bucketList);
                }


            }
            bucketList = newArr;

            for (int m = 0; m < bucketList.size(); m++) {
                if (bucketList.get(m).size() > 1) {
                    bucketSorted = true;
                    break;
                } else {
                    bucketSorted = false;
                }
            }


        }

        System.out.println("SON bucketList = " + bucketList);
        list.clear();
        for (ArrayList<Integer> a:bucketList ) {
            if(a.size()>0) list.add(a.get(0));
        }
        System.out.print("\n");
        return bucketList;
    }

    public ArrayList<ArrayList<Integer>> sortOfList(ArrayList<Integer> l) {
        ArrayList<ArrayList<Integer>> newList = new ArrayList<>();
        int min = getMin(l);
        int max = getMax(l);
        int offset = 0;
//        System.out.println("min = " + min);
//        System.out.println("max = " + max);
//        System.out.println("offset = " + offset);
        if (min < 0) offset = (min * -1);
        int index = 0;

        for (int i = 0; i < BUCKET_SORT; i++) {
            newList.add(i, new ArrayList<Integer>());
        }

        for (int i = 0; i < l.size(); i++) {
            int el = l.get(i);
            index = (BUCKET_SORT - 1) * (el + offset) / (max + offset);
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
// Sorted Algorithm
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
