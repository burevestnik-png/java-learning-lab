package lab.subject;

import com.google.inject.assistedinject.Assisted;
import com.google.inject.assistedinject.AssistedInject;
import lab.exceptions.MovementException;

public class Flower extends Subject implements ILookable, IKnowledge {
    @AssistedInject
    public Flower(@Assisted("x") double x,
                  @Assisted("y") double y,
                  @Assisted("z") double z,
                  @Assisted String name) {
        super(x, y, z, name);
    }

    @Override
    public String getAbilities() {
        return "может передвигаться" + System.lineSeparator() + "может пестреть";
    }

    @Override
    public void move(double offsetX, double offsetY, double offsetZ) throws MovementException {
        if ((offsetX < 0) || (offsetY < 0) || (offsetZ < 0)) {
            throw new MovementException("Отрицательная дичь...");
        }
        place.setX(place.getX() + offsetX*0.0001);
        place.setY(place.getY() + offsetY*0.0001);
        place.setZ(place.getZ() + offsetZ*0.0001);
    }

    public String dazzle() {
        return "пестреет";
    }
}
