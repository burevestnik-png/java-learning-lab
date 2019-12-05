package lab.object.tree.IPart;

import lab.object.Object;

public class Leaf extends Object implements IPart{

    public Leaf(double x,
                double y,
                double z,
                String name) {
        super(x, y, z, name);
    }

    @Override
    public String exist() {
        return "существует полгода";
    }


    @Override
    public void move(double offsetX, double offsetY, double offsetZ) {
        place.setX(place.getX() + offsetX*3);
        place.setY(place.getY() + offsetY*3);
        place.setZ(place.getZ() + offsetZ*7);
    }
}