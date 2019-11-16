package lab.object.tree.IPart;

import lab.object.tree.Tree;

import java.util.List;

public class Creater {
    private IPartFactory partFactory;

    public Creater(IPartFactory partFactory) {
        this.partFactory = partFactory;
    }

    public Tree createTree() {
        List<IPart> parts = partFactory.createParts();
        return new Tree(1, 2, 3, parts);
    }
}


