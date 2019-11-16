package lab.subject;

public class Skuperfield extends Subject {
    public Skuperfield(double x, double y, double z) {
        super(x, y, z);
    }

    @Override
    public String getAbilities() {
        return null;
    }

    @Override
    public void move(double offsetX, double offsetY, double offsetZ) {
        place.setX(place.getX() + offsetX);
        place.setY(place.getY() + offsetY);
        place.setZ(place.getZ() + offsetZ);
    }
}
