package Task2;

public class Main {
    public static void main(String[] args) {

        Cafe myCafe = new Cafe();

        myCafe.loadMenuData();


        for(String str : myCafe.getCoffeeMenu()) {
            System.out.println(str);
        }




    }
}