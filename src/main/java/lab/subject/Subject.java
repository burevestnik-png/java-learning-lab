package lab.subject;

import lab.MaterialObject;

public abstract class Subject extends MaterialObject {
    public Subject(double x,
                   double y,
                   double z,
                   String name) {
        super(x, y, z, name);
    }

    public abstract String getAbilities();
}
