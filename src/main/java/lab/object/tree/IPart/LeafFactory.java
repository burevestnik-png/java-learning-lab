package lab.object.tree.IPart;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LeafFactory implements IPartFactory {
    @Override
    public List<IPart> createParts() {
        Random random = new Random();
        int quantity = random.nextInt(200);

        List<IPart> parts = new ArrayList<>();
        for (int counter = 0; counter < quantity; counter++) {
            parts.add(new LeafPart());
        }

        return parts;
    }
}
