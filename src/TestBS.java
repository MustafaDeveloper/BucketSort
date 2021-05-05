import java.util.ArrayList;


public class TestBS {

    // Testing of Bucket Sort (BS) algorithm
    public static void main(String[] args) {

        ArrayList<Integer> firstList = new ArrayList();
        firstList.add(8);
        firstList.add(-2);
        firstList.add(6);
        firstList.add(3);
        firstList.add(-5);
        firstList.add(4);
        firstList.add(-10);
        firstList.add(30);
        firstList.add(-11);
        firstList.add(22);
        System.out.println("********* Sendet List ********");

        System.out.println( firstList);

        int BUCKET_SORT = 5;
        BucketSort bs = new BucketSort(firstList,BUCKET_SORT);
        bs.bucketSortList();
        //bs.printBS();
        System.out.println("********* Bucket List *********");
        System.out.println(bs.bucketList);
        System.out.println("******* Sorted Bucket List ******");
        System.out.println(bs.sortedListLast(bs.bucketList));


    }
}
