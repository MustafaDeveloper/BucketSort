import java.util.ArrayList;


public class BucketSort {

    private ArrayList<ArrayList<Integer>> bucketList = new ArrayList<>();
    private ArrayList<Integer> list;
    private int BUCKET_SORT;

    int min;
    int max;
    int offset;

    public BucketSort(ArrayList<Integer> list, int BUCKET_SORT) {
        this.list = list;
        this.BUCKET_SORT = BUCKET_SORT;
        min = getMinMax("min");
        max = getMinMax("max");
    }

    public void bucketSortList() {
        if (min >= 0) offset = 0;
        else offset = (min * -1);

        int index = 0;

        for (int i = 0; i < BUCKET_SORT; i++) {
            bucketList.add(i, new ArrayList<Integer>());
        }

        for (int i = 0; i < list.size(); i++) {
            int el = list.get(i);
            index = (BUCKET_SORT - 1) * (el + offset) / (max + offset);
            bucketList.get(index).add(el);
        }
    }

    public int getMinMax(String min_max) {
        min = list.get(0);
        max = list.get(0);

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < min) min = list.get(i);
            else if (list.get(i) > max) max = list.get(i);
        }

        if (min_max.equals("min")) return min;
        else if (min_max.equals("max")) return max;
        else return -1;
    }

    public ArrayList<Integer> sortedList(ArrayList<Integer> l) {
        boolean sorted = false;
        int temp;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < l.size() - 1; i++) {
                if (l.get(i) > l.get(i + 1)) {
                    temp = l.get(i);
                    l.set(i, l.get(i + 1));
                    l.set(i + 1, temp);
                    sorted = false;
                }
            }
        }
        return l;
    }

    public ArrayList<ArrayList<Integer>> sortedListLast(ArrayList<ArrayList<Integer>> lol) {
        lol.forEach(i -> sortedList(i));
        return lol;
    }

    public void printBS() {
        System.out.println("bs list: " + bucketList);
        for (int i = 0; i < BUCKET_SORT; i++) {
            System.out.println("Bucket-" + (i + 1) + " " + bucketList.get(i));
        }
    }

    public ArrayList<ArrayList<Integer>> getBucketList() {
        return bucketList;
    }
}
