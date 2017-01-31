import java.util.Scanner;
/**
 * Created by BYT9C0D9 on 22.11.2016.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Нахождение ближайшего к центру.");
        System.out.println("Сколько всего точек?");
        int count = sc.nextInt();
        System.out.println("Введите координаты точек");
        Calculation calc = new Calculation();
        System.out.print("1. ");
        double y = calc.solver(sc.nextDouble(), sc.nextDouble());
        int n = 1;
        for (int i = 1; i < count; i++) {
            int n1 = i+1;
            System.out.print(n1+ ". ");
            double x = calc.solver(sc.nextDouble(), sc.nextDouble());
            if (y>x) {y = x; n = n1;}
        }
        System.out.println("Ближайщая точка имеет номер "+n+ " и имеет длинну " + y);
        sc.close();
    }
}
