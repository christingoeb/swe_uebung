import java.util.List;

public class InteractionManager {
    private static InteractionManager instance;
    private List<SimpsonPerson> npcs;

    public static InteractionManager getInstance() {
        return instance;
    }

    public void addNPC(SimpsonPerson npc) {
        npcs.add(npc);
    }

    public void interactWithAll() {
        System.out.println("Interacting with all NPCs...");
    }
}
