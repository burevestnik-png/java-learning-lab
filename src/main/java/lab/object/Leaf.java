package lab.object;

import java.util.*;

public class Leaf extends Object {

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