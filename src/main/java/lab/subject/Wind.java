package lab.subject;

public class Wind extends Subject {

    public Wind(double x,
                double y,
                double z,
                String name) {
        super(x, y, z, name);
    }

    @Override
    public String getAbilities() {
        return "может передвигаться" + System.lineSeparator() + "может налетать порывами" + System.lineSeparator() +
                "может шевелить листочки";
    }

    @Override
    public void move(double offsetX, double offsetY, double offsetZ) {
        place.setX(place.getX() + offsetX*1000);
        place.setY(place.getY() + offsetY*1000);
        place.setZ(place.getZ() + offsetZ*2);
    }

    public String gust(Rush rush) {
        return  "налетает " + rush;
    }

    public String stirLeaves() {
        return "шевелит листочки";
    }
}
