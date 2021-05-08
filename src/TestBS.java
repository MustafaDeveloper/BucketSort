import java.util.ArrayList;


public class TestBS {

    // Testing of Bucket Sort (BS) algorithm
    public static void main(String[] args) {

        ArrayList<Integer> unSortedList = new ArrayList();

        unSortedList.add(8);
        unSortedList.add(-2);
        unSortedList.add(6);
        unSortedList.add(3);
        unSortedList.add(-5);
        unSortedList.add(4);
        unSortedList.add(-10);
        unSortedList.add(30);
        unSortedList.add(-11);
        unSortedList.add(22);
        unSortedList.add(3000);
        unSortedList.add(-110);
        unSortedList.add(220);
       // unSortedList.add(8);

        int BUCKET_SORT =5;
        BucketSort bs = new BucketSort();
        bs.setBUCKET_SORT(BUCKET_SORT);
        bs.setList(unSortedList);
        System.out.println("Unsorted list:\t" + bs.getList());
        bs.bucketSortList(bs);
       System.out.println("Bucket list  :\t "+bs.getBucketList());
        System.out.println("Sorted list  :\t"+bs.getList());
    }
}
