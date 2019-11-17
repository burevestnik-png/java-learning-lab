package lab.subject;

import lab.ISeatable;
import lab.MaterialObject;

public class Skuperfield extends Subject implements ISeatable {
    public Skuperfield(double x,
                       double y,
                       double z,
                       String name) {
        super(x, y, z, name);
    }

    @Override
    public String getAbilities() {
        return "может передвигаться" + System.lineSeparator() + "может не двигаться" + System.lineSeparator() +
                "может умиляться" + System.lineSeparator() + "может расплакаться" + System.lineSeparator()
                + lookAtObject(null);
    }

    @Override
    public void move(double offsetX, double offsetY, double offsetZ) {
        place.setX(place.getX() + offsetX);
        place.setY(place.getY() + offsetY);
        place.setZ(place.getZ() + offsetZ);
    }

    public String doNotMove() {
        return "не двигается";
    }

    public String melt() {
        return "умиляется";
    }

    public String cry() {
        return "плачет";
    }

    public String lookAtObject(MaterialObject object) {
        if (object == null) return "может любоваться чем-то";
        if (object instanceof ILookable) return "любуется на " + object;
        return "не может любоваться на " + object;
    }
}
