package lab.subject;

import lab.ISeatable;
import lab.object.Object;
import lab.object.tree.IPart.IPart;
import lab.subject.IFlyPlace;

import java.util.List;

public class Tree extends Object implements ISeatable, IFlyPlace {

    private List<IPart> parts;

    public Tree(double x,
                double y,
                double z,
                List<IPart> parts,
                String name) {
        super(x, y, z, name);
        this.parts = parts;
    }


    @Override
    public void move(double offsetX, double offsetY, double offsetZ) {
        place.setX(place.getX() + offsetX/1000);
        place.setY(place.getY() + offsetY/1000);
        place.setZ(place.getZ() + offsetZ/1000);
    }

    @Override
    public String exist() {
        return "существует десятилетиями";
    }

    public String waveLeaves() {
        return "машет листочками";
    }

    public String speak() {
        return "шепчут на своем языке";
    }

}
