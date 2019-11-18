package lab.subject;

public class Flower extends Subject implements ILookable, IKnowledge {

    public Flower(double x,
                  double y,
                  double z,
                  String name) {
        super(x, y, z, name);
    }

    @Override
    public String getAbilities() {
        return "может передвигаться" + System.lineSeparator() + "может пестреть";
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
