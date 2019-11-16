package lab.object.tree;

import lab.object.Leaf;
import lab.object.Object;
import lab.object.tree.IPart.IPart;

import java.util.List;

public class Tree extends Object {

    private List<IPart> parts;

    public Tree(double x, double y, double z, List<IPart> parts) {
        super(x, y, z);
        this.parts = parts;
    }


    @Override
    public void move(double offsetX, double offsetY, double offsetZ) {
        place.setX(place.getX() + offsetX/1000);
        place.setY(place.getY() + offsetY/1000);
        place.setZ(place.getZ() + offsetZ/1000);
    }
}
