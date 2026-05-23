import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Demo3 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Sujith","Sreeja","Latha");

        String ns = names.stream()
                        .filter(str -> str.contains("j"))
                        .findFirst()
                        .orElse("it is no values ");
        System.out.println(ns);
    }
}
