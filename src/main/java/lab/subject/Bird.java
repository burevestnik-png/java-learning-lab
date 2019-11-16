package lab.subject;

public class Bird extends Subject{
    public Bird(double x,
                double y,
                double z) {
        super(x, y, z);
    }

    @Override
    public void move(double offsetX, double offsetY, double offsetZ) {
        place.setX((place.getX() + offsetX)*10);
        place.setY((place.getY() + offsetY)*10);
        place.setZ((place.getZ() + offsetZ)*10);
    }

    @Override
    public String getAbilities() {
        String result = Bird.tweet();
        return result;
    }

    public static String tweet() {
        return "чирикает";
    }
}
