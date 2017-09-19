import java.util.List;

/**
 * Created by vara.sheela on 9/14/2017.
 */
public class HeuristicSearch {
    String robot;
    String wall;
    String box;
    String storage;
    String input;
    List<Location> wallList;
    Location robotList;
    List<Location> boxList;
    List<Location> spaceList;
    List<Location> storageList;




    public HeuristicSearch(String robot, String wall, String box, String storage, List<Location> wallList,Location robotList,List<Location> boxList,List<Location> spaceList,List<Location> storageList) {
        this.robot = robot;
        this.wall = wall;
        this.box = box;
        this.storage = storage;
        this.wallList = wallList;
        this.robotList = robotList;
        this.boxList = boxList;
        this.spaceList = spaceList;
        this.storageList = storageList;
        algo();
    }

    public String algo(){
  //
        return "";
    }
}
