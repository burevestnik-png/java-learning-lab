package lab.subject;

public class Flower extends Subject {
    public Flower(double x, double y, double z) {
        super(x, y, z);
    }

    @Override
    public String getAbilities() {
        return null;
    }

    @Override
    public void move(double offsetX, double offsetY, double offsetZ) {
        place.setX(place.getX() + offsetX*0.0001);
        place.setY(place.getY() + offsetY*0.0001);
        place.setZ(place.getZ() + offsetZ*0.0001);
    }

    public String dazzle() {
        return "пестреет";
    }
}
