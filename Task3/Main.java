package Task3;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Room room1 = new Room(5, 8, 4);
        Room room2 = new Room(2, 3, 1);
        Room room3 = new Room(8, 12, 5);

        ArrayList<Room> roomCollection = new ArrayList();

        roomCollection.add(room1);
        roomCollection.add(room2);
        roomCollection.add(room3);

        Building building1 = new Building(roomCollection, 2, 1,false);


        System.out.println(countLampsInBuilding(building1));
        isNormal(building1);
    }

    public static int countLampsInBuilding(Building build){
        int sum = 0;

        for(Room r : build.getRooms()) {

            sum+=r.getNumberOfLamps();
        }

        return sum;
    }

    public static boolean isNormal(Building build) {
        if (build.getNumberOfFloors()<build.getRooms().size()) {
            System.out.println( "This is a normal building" );
            return true;
        }
        else{
            System.out.println( "This is an odd building" );
            return false;
        }


    }



}