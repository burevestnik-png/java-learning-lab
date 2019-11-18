package lab;

import lab.object.Food;
import lab.object.Ground;
import lab.subject.Tree;
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
        Rush rush = creator.createRush();

        StringBuilder story = new StringBuilder();
        story.append(WindAdj.CUTE + " и " + WindAdj.WARM + " ").append(wind).append(" ").append(wind.gust(rush)).append(" и ").append(wind.stirLeaves()).append(". ");
        story.append(skuperfield + " " + skuperfield.seem() + ", " + tree + " " + tree.waveLeaves() + " и " + tree.speak() + ". ");
        story.append("На " + ground + " " + Colors.BLUE + " и " + Colors.PINK +" " +flower + " " + flower.dazzle() + ". ");
        story.append(skuperfield + " " + skuperfield.doNotKnow(flower) + ". ");
        story.append(skuperfield + " " + skuperfield.lookAtObject(flower) + ". ");
        story.append(BirdAdj.RED + " и " + BirdAdj.SMALL + " " + bird + " " + bird.fly(tree) + ". ");
        story.append(bird + " " + TweetAdj.FUNNY + " " +bird.tweet() + ". ");
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

        return story;
    }
}