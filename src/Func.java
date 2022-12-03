import java.util.Scanner;
public class Func {
    public void func() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите функцию x:");
        String func = sc.nextLine();
        sc.close();
        if (func.equalsIgnoreCase("x")) {
            System.out.println("Производная равна 1");
        }
        else {
            System.out.println("Вы ввели не x");
        }
    }
}