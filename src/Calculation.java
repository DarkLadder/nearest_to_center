/**
 * Created by BYT9C0D9 on 22.11.2016.
 */
public class Calculation {
    double x, y;

    public Calculation(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public Length Solver() {
        double l;
        double dis = x*x + y*y;
        l = Math.sqrt(dis);
        return new Length(l);
    }
}
