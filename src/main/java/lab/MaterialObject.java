package lab;

public abstract class MaterialObject {

    protected Place place;

    //композиция place и Materialobject
    public MaterialObject(double x,
                          double y,
                          double z) {
        place = new Place(x, y, z);
    }
    public abstract void move(double offsetX, double offsetY, double offsetZ);
}
