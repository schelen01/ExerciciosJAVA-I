import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digital o n da sequência");
        int n = sc.nextInt();

        List<Integer> primos = new ArrayList<Integer>();
        int num = 2;
        int nDiv = 0;
        while (num > 0);

        for (int i = 1; i <= num; i++) {
            if (num % i == 0)
                nDiv++;
        }


        if (nDiv == 2) {
            primos.add(num);
            num--;
            num++;
        }
        System.out.println(primos);
    }
}

