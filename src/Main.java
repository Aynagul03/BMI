import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        Scanner ht = new Scanner(System.in);
        System.out.print("Пожалуйста, введите ваш рост, с точностью до 2 после десятичной, единицы (м): ");
        double height = ht.nextDouble();

        Scanner wt = new Scanner(System.in);
        System.out.print("Пожалуйста, введите ваш вес, блок (кг): ");
        double weight = wt.nextDouble();

        service.calculate(weight, height);
    }
}
