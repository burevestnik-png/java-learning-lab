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

    public String lookAtBeing(Beings being) {
        return "смотрит на " + being;
    }

    public String hearBeing(MaterialObject being) {
        return "слушает " + being;
    }

    public  String seem() {
        return "кажется";
    }

    public  String doNotKnow(MaterialObject object) {
        if (object instanceof ILookable) return "не знает " + object;
        return "не знает " + object;
    }

    public String wasteStrength() {
        return "расстратил силы";
    }

    public String makeSure() {
        return "убеждается";
    }

    public String notGetFree() {
        return "освободится не получится";
    }

    public String goNumb() {
        return "одеревенели " + PartOfBody.HANDS + ", " + PartOfBody.LEGS + ", " + PartOfBody.TORSO;
    }

    public String doNotFeel() {
        return "не чувствовал ничего";
    }

    public String dissapear(PartOfBody part) {
        return part + " исчезло";
    }

    public String painDissapear() {
        return "исчезла боль";
    }

    public String sayInspiringSpeech() {
        return "Как прекрасен мир и как хороша жизнь!";
    }

    public String thinkAbout(Skuperfield skuperfield) {
        return " -- подумал " + skuperfield + " --";
    }

    public String explainWhy() {
        return "Почему я раньше не замечал этого?  Почему никогда не ходил в лес и не видел всей этой красоты?";
    }

    public String swear(Skuperfield skuperfield, Tree tree, Bird bird) {
        return "Клянусь, если " + skuperfield + " жив, если " + skuperfield.escape() + " отсюда, буду "
                + skuperfield.goToForest() +", буду " + skuperfield.lookAtObject(tree) + ", " + skuperfield.lookAtObject(bird) +
                ", "+ skuperfield.hearBeing(bird) + " буду " + skuperfield.lookAtBeing(Beings.BUTTERFLY) + ", " +
                skuperfield.lookAtBeing(Beings.DRAGONFLY) + ", " + skuperfield.lookAtBeing(Beings.ANT) + ", " +
                skuperfield.lookAtBeing(Beings.GOOSE) + ", " + skuperfield.lookAtBeing(Beings.DUCK) + " и " +
                skuperfield.lookAtBeing(Beings.TURKEY);
    }

    public String escape() {
        return "вырвется";
    }

    public String goToForest() {
        return "ходить в лес";
    }

    public String sayEndOfSpeech() {
        return "Никогда мне это не надоест!";
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
