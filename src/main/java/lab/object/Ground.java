package lab.object;

public class Ground extends Object {
    public Ground(double x, double y, double z) {
        super(x, y, z);
    }

    @Override
    public void move(double offsetX, double offsetY, double offsetZ) {
        place.setX(place.getX() + offsetX*0.000000001);
        place.setY(place.getY() + offsetY*0.000000001);
        place.setZ(place.getZ() + offsetZ*0.000000001);
    }
}