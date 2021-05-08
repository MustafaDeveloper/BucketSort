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
        list.add(3000);
        list.add(-110);
        list.add(220);

        //    System.out.println("********* Sendet List ********");
        int BUCKET_SORT =3;
        BucketSort bs = new BucketSort();
        bs.setBUCKET_SORT(BUCKET_SORT);
        bs.setList(list);

        bs.bucketSortList(bs);
       // System.out.println(bs.getBucketList());
        System.out.println(bs.getList());
    }
}
