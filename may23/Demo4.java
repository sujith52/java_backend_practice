import java.util.Arrays;
import java.util.List;

public class Demo4 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Sujith", "sreeja","latha");
        List<String> unas = names.stream()
                            // .map(n -> n.toUpperCase())
                            .map(String :: toUpperCase)
                            .toList();
        // System.out.println(unas);
        // unas.forEach(n -> System.out.println(n));
        unas.forEach(System.out :: println);
    }
}
