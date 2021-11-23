import java.util.Scanner;
public class Lab2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число:");
        while (!sc.hasNextInt()) {
            System.out.print("Ошибка, введите число снова:");
            sc.next();
        }
        int n = sc.nextInt();
        int m = 1;
        System.out.print(n + "!=");
        if (n > 1 && n < 15) {
            while (n > 1){
                m = m * n;
                n--;
            }
            System.out.println(m);
        }
        else {
            System.out.println("Ошибка");
        }

        sc.close();

    }
}

