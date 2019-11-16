package lab.subject;

import lab.MaterialObject;

public abstract class Subject extends MaterialObject {
    public Subject(double x,
                   double y,
                   double z) {
        super(x, y, z);
    }

    public abstract String getAbilities();
}
