package lab.object.tree.IPart;


import lab.object.Ground;
import lab.object.tree.Tree;
import lab.subject.*;


import java.util.List;

public class Creator {
    private IPartFactory partFactory;

    public Creator(IPartFactory partFactory) {
        this.partFactory = partFactory;
    }

    public Tree createTree() {
        List<IPart> parts = partFactory.createParts();
        return new Tree(2, 2, 0, parts, "Дерево");
    }

    public Bird createBird() {
        return new Bird(0,0,10, "Птичка");

    }

    public Wind createWind() {
        return new Wind(12, 12, 100, "Ветерок");
    }

    public Flower createFlower() {
        return new Flower(12, 12, 100, "Цветочек");
    }

    public Skuperfield createSkuperfield() {
        return new Skuperfield(0, 0, 0, "Скуперфильд");
    }

    public Ground createGround() {
        return new Ground(1, 1, 0, "Земля");
    }
}


