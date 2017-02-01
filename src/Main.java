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
        System.out.print("1. ");
        double y = solver(sc.nextDouble(), sc.nextDouble());
        int n = 1;
        for (int i = 1; i < count; i++) {
            int n1 = i+1;
            System.out.print(n1+ ". ");
            double x = solver(sc.nextDouble(), sc.nextDouble());
            if (y>x) {y = x; n = n1;}
        }
        System.out.println("Ближайщая точка к началу координат имеет номер "+ n+ " и длинну " + y);
        sc.close();
    }
    public static double solver(double x, double y) {
        double l;
        double dis = x*x + y*y;
        l = Math.sqrt(dis);
        return l;
    }
}
