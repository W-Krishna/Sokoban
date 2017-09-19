import java.util.List;

/**
 * Created by vara.sheela on 9/19/2017.
 */
public class Node {
    public Node node;
    public List<Location> boxes;
    Location player;

    public Node(Node node, Location player, List<Location> boxes) {
        this.node = node;
        this.player = player;
        this.boxes = boxes;
    }

    public Node getNode() {
        return node;
    }

    public void setNode(Node node) {
        this.node = node;
    }

    public List<Location> getBoxes() {
        return boxes;
    }

    public void setBoxes(List<Location> boxes) {
        this.boxes = boxes;
    }

    public Location getPlayer() {
        return player;
    }

    public void setPlayer(Location player) {
        this.player = player;
    }
}
