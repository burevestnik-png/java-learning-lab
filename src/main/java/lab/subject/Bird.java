package lab.subject;

import com.google.inject.assistedinject.Assisted;
import com.google.inject.assistedinject.AssistedInject;
import lab.ISeatable;
import lab.MaterialObject;
import lab.exceptions.MovementException;
import lab.object.Food;

public class Bird extends Subject implements ILookable, IKnowledge {

    @AssistedInject
    public Bird(@Assisted("x") double x,
                @Assisted("y") double y,
                @Assisted("z") double z,
                @Assisted String name) {
        super(x, y, z, name);
    }

    @Override
    public void move(double offsetX, double offsetY, double offsetZ) throws MovementException {
        if ((offsetX < 0) || (offsetY < 0) || (offsetZ < 0)) {
            throw new MovementException("Отрицательная дичь...");
        }
        place.setX((place.getX() + offsetX)*10);
        place.setY((place.getY() + offsetY)*10);
        place.setZ((place.getZ() + offsetZ)*10);
    }

    @Override
    public String getAbilities() {
        return "может передвигаться" + System.lineSeparator() +  "может чирикать" + System.lineSeparator() +
                "может клевать что-то" + System.lineSeparator() + "может смотреть по сторонам" + System.lineSeparator()
                + sitOnObject(null);
    }

    public String tweet() {
        return "чирикает";
    }

    public String peckFood(Food food) {
        String meal = "";
        if (food == Food.CORNS) meal = "птица клюёт " + Food.CORNS;
        if (food == Food.CROW) meal = "птица клюёт " + Food.CROW;
        if (food == Food.SUNFLOWER_SEEDS) meal = "птица клюёт " + Food.SUNFLOWER_SEEDS;
        return meal;
    }

    public String lookToSide() {
        return "смотрит по сторонам";
    }

    public String sitOnObject(MaterialObject object) {
        if (object == null) return "может сидеть на определенных объектах";
        if (object instanceof ISeatable) return "садится на " + object;
        return "птичка не сможет сесть на " + object;
    }

    public String goAway() {
        return "улетает";
    }

    public String fly(MaterialObject object) {
        if (object instanceof ISeatable) return "порхает на " + object;
        return "не порхает на " + object;
    }

    public String stopAfraid() {
        return "перестали бояться";
    }

    public  String flyNear(MaterialObject object) {
        return "летает около " + object;
    }

    public  String shakeHead() {
        return "наклоняет голову в разные стороны";
    }

    public String touch(MaterialObject object) {
        return "задевает " + object;
    }

    public  String think(MaterialObject object) {
        return "думает что " + object + " неживой предмет";
    }
}
