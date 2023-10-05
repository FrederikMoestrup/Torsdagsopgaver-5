package Task2;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Cafe {
    private ArrayList<String> coffeeMenu = new ArrayList();


    public void loadMenuData(){
        File file = new File("src/Task2/coffees.txt");

        try{
            Scanner scan = new Scanner(file); //System.in

            String drinks;

            while(scan.hasNextLine()) {
                drinks=scan.nextLine();
                coffeeMenu.add(drinks);
            }

        }catch (FileNotFoundException e){

            System.out.println("Filen blev ikke fundet");
        }


    }

    public ArrayList<String> getCoffeeMenu() {
        return coffeeMenu;
    }

}
