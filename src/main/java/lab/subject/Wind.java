package lab.subject;

public class Wind extends Subject {
    public Wind(double x, double y, double z) {
        super(x, y, z);
    }

    @Override
    public String getAbilities() {
        return null;
    }

    @Override
    public void move(double offsetX, double offsetY, double offsetZ) {
        place.setX(place.getX() + offsetX*1000);
        place.setY(place.getY() + offsetY*1000);
        place.setZ(place.getZ() + offsetZ*2);
    }
}
