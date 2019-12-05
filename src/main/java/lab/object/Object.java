package lab.object;

import lab.MaterialObject;
import lab.exceptions.MovementException;

public abstract class Object extends MaterialObject {

    public Object(double x,
                  double y,
                  double z,
                  String name) {
        super(x, y, z, name);
    }

    public abstract String exist();
}