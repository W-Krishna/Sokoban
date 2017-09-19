import java.util.*;

/**
 * Created by vara.sheela on 9/19/2017.
 */
public class BreadthFirstSearch {

    String robot;
    String wall;
    String box;
    String storage;
    String input;

    ArrayList<Location> boxLocation;
    Location robotLocation;
    Location robotInitialLocation;
    ArrayList<Location> wallLocation;
    ArrayList<Location> spaceLocation;
    ArrayList<Location> storageLocation;

    public BreadthFirstSearch(String robot, String wall, String box, String storage, String input, ArrayList<Location> boxLocation, Location robotLocation, ArrayList<Location> wallLocation, ArrayList<Location> spaceLocation, ArrayList<Location> storageLocation) {
        this.robot = robot;
        this.wall = wall;
        this.box = box;
        this.storage = storage;
        this.input = input;
        this.boxLocation = boxLocation;
        this.robotLocation = robotLocation;
        this.robotInitialLocation = robotLocation;
        this.wallLocation = wallLocation;
        this.spaceLocation = spaceLocation;
        this.storageLocation = storageLocation;
    }

    public boolean goalTest(){
        for(Location location : boxLocation){
            if(storageLocation.contains(location)){
                return true;
            }
        }
        return false;
    }

    public String bfs(Location robotInitialLocation, List<Location> boxes, List<Location> walls, List<Location> goals){
        HashSet<Location> explored = new HashSet<>();
        Queue<Node> frontier = new LinkedList<>();
        Node node = new Node(null, robotInitialLocation, null);
        Node child;
        frontier.add(node);
        ArrayList<String> moves;

        while(!frontier.isEmpty()){
            node = frontier.poll();
            explored.add(node.getPlayer());
            moves = getMoves(boxLocation,robotLocation);
            for(String str :moves){

            }
        }

        return "";
    }

    public ArrayList<String> getMoves(List<Location> locations, Location playerLocation){
        ArrayList<String> actions = new ArrayList<>();
        Location newRobotLocation;
        Location newBoxLocation;
        int row = playerLocation.row;
        int column = playerLocation.column;
        newRobotLocation = new Location(row -1, column);

        return actions;
    }
}
