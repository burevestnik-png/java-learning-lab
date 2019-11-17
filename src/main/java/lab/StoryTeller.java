package lab;

import lab.object.Food;
import lab.object.Ground;
import lab.object.tree.Tree;
import lab.object.tree.IPart.Creator;
import lab.subject.*;

public class StoryTeller {
    private Creator creator;

    public StoryTeller(Creator creator) {
        this.creator = creator;
    }

    public StringBuilder tellStory() {
        Tree tree = creator.createTree();
        Bird bird = creator.createBird();
        Ground ground = creator.createGround();
        Skuperfield skuperfield = creator.createSkuperfield();
        Wind wind = creator.createWind();
        Flower flower = creator.createFlower();

        StringBuilder story = new StringBuilder();
        story.append(wind + " " + wind.gust() + " и " + wind.stirLeaves() + ". ");
        story.append(flower + " " + flower.dazzle() + ". ");
        story.append(skuperfield + " " + skuperfield.lookAtObject(flower) + ". ");
        story.append(bird + " " + bird.tweet() + ". ");
        story.append(bird + " " + bird.sitOnObject(ground) + ", " + bird.peckFood(Food.CORNS) + ", " +
                bird.sitOnObject(tree) + ". ");
        story.append(skuperfield + " " + skuperfield.lookAtObject(bird) + ". ");
        story.append(bird + " " + bird.sitOnObject(skuperfield) + ". ");
        story.append(skuperfield + " " + skuperfield.doNotMove() + ". ");
        story.append(bird + " " + bird.lookToSide() + ". ");
        story.append(bird + " " + bird.goAway() + ". ");
        story.append(skuperfield + " " +skuperfield.melt() + " и " + skuperfield.cry() + ". ");

        return story;
    }
}