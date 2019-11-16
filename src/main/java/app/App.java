package app;

import lab.object.tree.IPart.Creater;
import lab.object.tree.IPart.IPartFactory;
import lab.object.tree.IPart.LeafFactory;
import lab.object.tree.Tree;
import lab.subject.Bird;

public class App {
    public static void main(String[] args) {
        System.out.println("это работает");
        Bird was = new Bird(1,2,3);
        String a = was.getAbilities();
        System.out.println(a);

        Creater creater = new Creater(new LeafFactory());
        Tree tree = creater.createTree();
        System.out.println(tree.toString());
    }
}