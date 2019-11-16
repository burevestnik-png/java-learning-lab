package lab;

public class Place {
    private double x;
    private double y;
    private double z;

    public Place(double x,
                 double y,
                 double z) {
        setX(x);
        setY(y);
        setZ(z);
    }
    public Double getX() {
        return x;
    }

    public Double getY() {
        return y;
    }

    public Double getZ() {
        return z;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setZ(double z) {
        this.z = z;
    }
}
