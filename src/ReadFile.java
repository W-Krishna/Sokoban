import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by vara.sheela on 9/15/2017.
 */

public class ReadFile {
    File file = new File("C:\\Users\\vara.sheela\\Desktop\\AI\\src\\testcases\\vara.txt");
    List<Location> wallList = new ArrayList<>();
    Location robotLocation;
    List<Location> boxList = new ArrayList<>();
    List<Location> spaceList = new ArrayList<>();
    List<Location> storageList = new ArrayList<>();
    InputData id = new InputData();
    public boolean loadFile(){
        try
        {
            Scanner scanFile = new Scanner(file);
            int row = Integer.valueOf(scanFile.nextLine());
            int column = Integer.valueOf(scanFile.nextLine());
            for(int i=0;i<row;i++){
               String nextLine = scanFile.nextLine();
                for(int j=0;j<column;j++){
                    char c = nextLine.charAt(j);
                    switch(c){
                        case 'O':{
                            Location wallLocs = new Location(i,j);
                            wallList.add(wallLocs);
                            break;
                         }
                        case 'R':{
                            robotLocation = new Location(i,j);
                            break;
                        }
                        case 'B':{
                            Location boxLocs = new Location(i,j);
                            boxList.add(boxLocs);
                            break;
                        }
                        case 'S':{
                            Location storageLocs = new Location(i,j);
                            storageList.add(storageLocs);
                            break;
                        }
                        case ' ':{
                            Location emptyLocs = new Location(i,j);
                            spaceList.add(emptyLocs);
                            break;
                        }
                    }
                }
            }
            initializeAlgo();
            return true;

        }
        catch (Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }
    public void printing(List<Location> list, String type)  {
        System.out.println(type);
        for (int i = 0; i<list.size(); i++) {
            Location l = list.get(i);
            System.out.println(l.getRow()+ ","+ l.getColumn());

        }

    }

    public void initializeAlgo(){
        HeuristicSearch hs = new HeuristicSearch(id.getRobot(),id.getWall(), id.getBox(), id.getStorage(), wallList, robotLocation, boxList, spaceList, storageList);
        BreadthFirstSearch bfs = new BreadthFirstSearch(id.getRobot(),id.getWall(), id.getBox(), id.getStorage(), wallList, robotLocation, boxList, spaceList, storageList);
    }
}
