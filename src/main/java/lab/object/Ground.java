package lab.object;

import lab.ISeatable;

public class Ground extends Object implements ISeatable {

    public Ground(double x,
                  double y,
                  double z,
                  String name) {
        super(x, y, z, name);
    }

    @Override
    public String exist() {
        return "существует миллиарды лет";
    }

    @Override
    public void move(double offsetX, double offsetY, double offsetZ) {
        place.setX(place.getX() + offsetX*0.000000001);
        place.setY(place.getY() + offsetY*0.000000001);
        place.setZ(place.getZ() + offsetZ*0.000000001);
    }
}