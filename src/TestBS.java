import java.util.ArrayList;


public class TestBS {

    // Testing of Bucket Sort (BS) algorithm
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList();
        list.add(8);
        list.add(-2);
        list.add(6);
        list.add(3);
        list.add(-5);
        list.add(4);
        list.add(-10);
        list.add(30);
        list.add(-11);
        list.add(22);
        System.out.println("********* Sendet List ********");

        System.out.println( list);

        int BUCKET_SORT = 4;
        BucketSort bs = new BucketSort(list,BUCKET_SORT);
        bs.bucketSortList();
        //bs.printBS();
        System.out.println("********* Bucket List *********");
        System.out.println(bs.getBucketList());
        System.out.println("******* Sorted Bucket List ******");
        System.out.println(bs.sortedListLast(bs.getBucketList()));


    }
}
