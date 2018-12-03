import java.util.ArrayList;
import java.util.concurrent.*;

public class Parallelism {

    public static void main(String[] args) throws Exception{

        ArrayList<String> content = new ArrayList<>(5);
        for (int i=1; i< 6; i++)
            content.add("string"+i);

        ForkJoinPool pool = new ForkJoinPool(4);
        Integer sum = pool.invoke(new MyThread(0, content.size(), content));
        System.out.println(sum);    // 35

    }

}

class MyThread extends RecursiveTask<Integer> {

    int low;
    int high;
    ArrayList<String> content;

    MyThread(int low, int high,ArrayList<String>  lines) {
        this.content = lines;
        this.low   = low;
        this.high  = high;
    }

    @Override
    protected Integer compute() {

        if(high - low <= 20) {
            int sum = 0;
            // Base Case - Implementation
            for (String string: content)
                sum += string.length();
            return sum;

        } else {
            int mid = low + (high - low) / 2;

            MyThread left  = new MyThread(low, mid, content);
            MyThread right = new MyThread(mid, high, content);

            left.fork();
            right.fork();

            int right_result = right.join();
            int left_result  = left.join();

            // Merging results - Implementation
            return left_result + right_result;
        }
    }
}