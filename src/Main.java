import java.util.Scanner;
/**
 * Created by BYT9C0D9 on 22.11.2016.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Нахождение ближайшего к центру.");
        System.out.println("Сколько всего точек?");
//        int count = sc.nextInt();
        System.out.println("Введите координаты точек");
//        Calculation calc[] = new Calculation[count];
//        for (int i = 0; i < count; i++) {
//            calc[i] = new Calculation(sc.nextDouble(), sc.nextDouble());
//            calc[i].Solver();
//        }
        Calculation calc = new Calculation(sc.nextDouble(), sc.nextDouble());
        System.out.println(calc.Solver());
        sc.close();
    }
}
