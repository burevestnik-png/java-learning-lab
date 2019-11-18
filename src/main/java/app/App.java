package app;

import lab.StoryTeller;
import lab.object.tree.IPart.Creator;
import lab.object.tree.IPart.LeafFactory;

public class App {
    public static void main(String[] args) {
        Creator creator = new Creator(new LeafFactory());
        StoryTeller storyTeller = new StoryTeller(creator);

        System.out.println(storyTeller.tellStory());

    }
}