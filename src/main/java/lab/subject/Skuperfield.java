package lab.subject;

import com.google.inject.assistedinject.Assisted;
import com.google.inject.assistedinject.AssistedInject;
import lab.ISeatable;
import lab.MaterialObject;
import lab.exceptions.MovementException;

public class Skuperfield extends Subject implements ISeatable {
    @AssistedInject
    public Skuperfield(@Assisted("x") double x,
                       @Assisted("y") double y,
                       @Assisted("z") double z,
                       @Assisted String name) {
        super(x, y, z, name);
    }

    @Override
    public String getAbilities() {
        return "может передвигаться" + System.lineSeparator() + "может не двигаться" + System.lineSeparator() +
                "может умиляться" + System.lineSeparator() + "может расплакаться" + System.lineSeparator()
                + lookAtObject(null);
    }

    @Override
    public void move(double offsetX, double offsetY, double offsetZ) throws MovementException {
        if ((offsetX < 0) || (offsetY < 0) || (offsetZ < 0)) {
            throw new MovementException("Отрицательная дичь...");
        }
        place.setX(place.getX() + offsetX);
        place.setY(place.getY() + offsetY);
        place.setZ(place.getZ() + offsetZ);
    }

    public String doNotMove() {
        class Local {
            private String description = "This is a local class";

            public String getDescription() {
                return description;
            }
        }
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

    public  String seem() {
        return "кажется";
    }

    public  String doNotKnow(MaterialObject object) {
        if (object instanceof ILookable) return "не знает " + object;
        return "не знает " + object;
    }

    public static class InnerStaticClass {
        String description = "This is static inner class";

        public String getDescription() {
            return description;
        }
    }

    public class InnerClass {
        String description = "This is inner class";

        public String getDescription() {
            return description;
        }
    }
}
