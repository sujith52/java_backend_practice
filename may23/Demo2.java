// we we are working on the parallel stream of the data man !

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Demo2 {
    public static void main(String[] args) {
        int size = 10_000;
        List<Integer> nums = new ArrayList<Integer>(size);
        Random re = new Random();
        for(int i=1; i<=size; i++){
            nums.add(re.nextInt(100));
        }

        long seqtim = System.currentTimeMillis();
        int sum1 = nums.stream()
                        .map(i -> {

                            try {
                                Thread.sleep(1);
                            } catch (Exception e) {
                            }
                            return i *2;
                        })
                        .reduce(0, (c,e) -> c+e);
        long seqend = System.currentTimeMillis();
        long partim = System.currentTimeMillis();
        int sum2 = nums.stream()
                    .map(i -> {

                            try {
                                Thread.sleep(1);
                            } catch (Exception e) {
                            }
                            return i *2;
                        })
                    .mapToInt(i -> i)
                    .sum();
        long parend = System.currentTimeMillis();

        // System.out.println(sum1 + "   :    "+ sum2);

        System.out.println("sequential is "+ (seqend - seqtim ));
        System.out.println("Parallel is "+ (parend - partim ));
    }
}
