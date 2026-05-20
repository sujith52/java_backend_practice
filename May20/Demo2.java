import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo2 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        int i = 0;
        int j = 4;
        try {
            j = 18/i;
            System.out.println("the output will be :: "+ j);
        } catch (Exception e) {
            System.out.println(e);
        } finally{
            System.out.println("The closing block man !");
        }
        int num = 0;
        BufferedReader br = null;
        try{
            InputStreamReader in = new InputStreamReader(System.in);
            br = new BufferedReader(in);
            num = Integer.parseInt(br.readLine());
            System.out.println(num);
        } finally{
            br.close();
        }
        int num = 1;
        try(BufferedReader br = new BufferedReader(new InputStreamReader (System.in)))
        {
            num = Integer.parseInt(br.readLine());
            System.out.println(num);
        } finally{
            System.out.println("This is the ending of this thing !");
        }
    }
}
