package app;

import lab.StoryTeller;
import lab.Creator;

public class App {
    public static void main(String[] args) {
        Creator creator = new Creator();
        StoryTeller storyTeller = new StoryTeller(creator);
        System.out.println(storyTeller.tellStory());
    }
}