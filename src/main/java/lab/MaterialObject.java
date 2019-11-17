package lab;

import java.util.Objects;

public abstract class MaterialObject {

    protected Place place;
    private String name;

    public MaterialObject(double x,
                          double y,
                          double z,
                          String name) {
        place = new Place(x, y, z);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void move(double offsetX, double offsetY, double offsetZ);

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }

        if (this == object) {
            return true;
        }

        if (!(object instanceof MaterialObject)) {
            return false;
        }

        if (this.name == ((MaterialObject) object).name) {
            return true;
        }

        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(place, name);
    }
}
