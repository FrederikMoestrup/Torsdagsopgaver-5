package Task1;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList();


        Customer c1 = new Customer("Kim", "John", "Vildnisse");
        Customer c2 = new Customer("Joe", "Hansen", "VolvoGamer");
        Customer c3 = new Customer("Fido", "Hund", "Vov");

        customers.add(c1);
        customers.add(c2);
        customers.add(c3);

        printCustomers(customers);

    }
    static void printCustomers(ArrayList<Customer> customers){
        for(Customer c : customers) {
            System.out.println(c);
        }

    }

}