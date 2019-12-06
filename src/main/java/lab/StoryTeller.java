package lab;

import com.google.inject.Injector;
import lab.exceptions.InjectorCreatingException;
import lab.object.Food;
import lab.object.Ground;
import lab.object.IObjectFactory;
import lab.object.tree.IPart.IPart;
import lab.object.tree.IPart.IPartFactory;
import lab.object.tree.IPart.LeafFactory;
import lab.subject.Tree;
import lab.subject.*;

import java.util.List;

public class StoryTeller {
    private Creator creator;

    public StoryTeller(Creator creator) {
        this.creator = creator;
    }

    public StringBuilder tellStory()  {
        Skuperfield skuperfield = (Skuperfield) creator.createSubject("Skuperfield");
        Flower flower = (Flower) creator.createSubject("Flower");
        Bird bird = (Bird) creator.createSubject("Bird");
        Wind wind = (Wind) creator.createSubject("Wind");
        Rush rush = (Rush) creator.createSubject("Rush");
        Ground ground = (Ground) creator.createObject("Ground");
        List<IPart> parts = creator.createSupport("LeafFactory");
        Tree tree = (Tree) creator.createTree(parts, "Tree");


        StringBuilder story = new StringBuilder();
        story.append(skuperfield + " " + skuperfield.wasteStrength() + " и " + skuperfield.makeSure() + " что, "
                + skuperfield.notGetFree() + ", поэтому " + skuperfield.doNotMove() + ". ");
        story.append("У " + skuperfield + " " + skuperfield.goNumb() + ", " + skuperfield.doNotFeel() + ". ");
        story.append("У " + skuperfield + " " + skuperfield.dissapear(PartOfBody.TORSO) + " и " +skuperfield.painDissapear() + ". ");
        story.append(wind).append(" ").append(wind.gust(rush)).append(" и ").append(wind.stirLeaves()).append(". ");
        story.append(skuperfield + " " + skuperfield.seem() + ", " + tree + " " + tree.waveLeaves() + " и " + tree.speak() + ". ");
        story.append("На " + ground + " " + Colors.BLUE + " и " + Colors.PINK +" " +flower + " " + flower.dazzle() + ". ");
        story.append(skuperfield + " " + skuperfield.doNotKnow(flower) + ". ");
        story.append(skuperfield + " " + skuperfield.lookAtObject(flower) + ". ");
        story.append(bird + " " + bird.fly(tree) + ". ");
        story.append(bird + " " + bird.tweet() + ". ");
        story.append(bird + " " + bird.sitOnObject(ground) + ", " + bird.peckFood(Food.CORNS) + ", " +
                bird.sitOnObject(tree) + ". ");
        story.append(skuperfield + " " + skuperfield.doNotKnow(bird) + " вблизи. ");
        story.append(skuperfield + " " + skuperfield.lookAtObject(bird) + ". ");
        story.append(skuperfield + " " + skuperfield.doNotMove() + ". ");
        story.append(bird + " " + bird.stopAfraid() + ". ");
        story.append(bird + " " + bird.flyNear(skuperfield) + ". ");
        story.append(bird + " " + bird.think(skuperfield) + ". ");
        story.append(bird + " " + bird.sitOnObject(skuperfield) + ". ");
        story.append(bird + " " + bird.lookToSide() + ". ");
        story.append(bird + " " + bird.shakeHead() + ". ");
        story.append(bird + " " + bird.goAway() + " и " + bird.touch(skuperfield) + ". ");
        story.append(skuperfield + " " +skuperfield.melt() + " и " + skuperfield.cry() + ". ");
        story.append("\"" + skuperfield.sayInspiringSpeech() + " " + skuperfield.thinkAbout(skuperfield) + " " +
                skuperfield.explainWhy() + ". ");
        story.append(skuperfield.swear(skuperfield, tree, bird) + ". ");
        story.append(skuperfield.sayEndOfSpeech() + "\". ");

        return story;
    }
}