/**
 * Created by BYT9C0D9 on 22.11.2016.
 */
public class Calculation {
    double x, y, l;

    public Calculation(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public Length Solver() {
        double dis = x*x + y*y;
        l = Math.sqrt(dis);
        return new Length(l);
    }
    public Length Printer() {
        System.out.println("Точка имеет кординаты " + "(" + x + "; " + y + ") ее растояние от начала координат = " + l);
        return new Length(l);
    }

}
