import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Demo {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(5,6,7,5,8,5);
        System.out.println(nums);

        Consumer<Integer> con = new Consumer<Integer>() {
            public void accept(Integer n){
                System.out.println(n);
            }
        };
        nums.forEach(con);

        Stream<Integer> s1 =  nums.stream();
        Stream<Integer> s2 =  s1.filter(n -> n %2  == 0);
        Stream<Integer> s3 = s2.map(n -> n*2);
        int  s4 = s3.reduce(0, (c ,e) -> c+e);
        System.out.println(s4);
        s3.forEach(n -> System.out.println(n));

        Predicate<Integer> p = new Predicate<Integer>() {
            public boolean test(Integer n) {
                if(n%2 == 0)
                    return true;
                else
                    return false;
            }
            
        };

        Function<Integer, Integer> fun = new Function<Integer,Integer>() {
            public Integer apply(Integer n) {
                return n * 2;
            } 
        }; // this was the main method man !

        //using the lamda methods 
        Function<Integer, Integer> fun = (n) ->  n * 2;

        int results = nums.stream()
            .filter(p)
            .map(fun)
            .reduce(0, (c,e) -> c+e);
        System.out.println(results);
        Stream<Integer> Sortted = nums.parallelStream()
            .filter(n -> n%2 ==0)
            .sorted();
        Sortted.forEach(n -> System.out.println(n));

    }
}
