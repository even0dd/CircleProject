
public class Circle {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getL() {
        double Y;
        Y = Math.PI*radius*2;
        return Math.round(Y);
    }

    @Override
    public String toString() {
        return "Circle [radius=" + radius + ", getL()=" + (int) getL() + "]";
    }

}

