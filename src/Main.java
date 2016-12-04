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
        Calculation calc[] = new Calculation[3];
        for (int i = 0; i < 3; i++) {
            calc[i] = new Calculation(sc.nextDouble(), sc.nextDouble());
            System.out.println(calc[i].Solver());
        }
        sc.close();
    }
}
