import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.ArrayList;
public class Showroom implements utility{
    String showroom_name;
    String showroom_address;
    int total_employees;
    int total_cars_in_stock = 0;
    String manager_name;

    ArrayList<Employees> employeesList = new ArrayList<>();
    ArrayList<Cars> carsList = new ArrayList<>();

    @Override
    public void get_details() {
        System.out.println("Showroom Name: "+showroom_name);
        System.out.println("Showroom Address: "+showroom_address);
        System.out.println("Manager Name: "+manager_name);
        System.out.println("Total Employees: "+getTotalEmployees());
        System.out.println("Total Cars In Stock: "+getTotalCars());

    }
    @Override
    public void set_details(){
        Scanner sc = new Scanner(System.in);
        System.out.println("======================= *** ENTER SHOWROOM DETAILS *** =======================");
        System.out.println();
        System.out.print("SHOWROOM NAME: ");
        showroom_name = sc.nextLine();
        System.out.print(("SHOWROOM ADDRESS: "));
        showroom_address = sc.nextLine();
        System.out.print("MANAGER NAME: ");
        manager_name = sc.nextLine();
        boolean validemnumber = false;
        /*while (!validemnumber) {
            try {
                System.out.print("TOTAL NO OF EMPLOYEES: ");
                total_employees = Integer.parseInt(sc.nextLine());
                validemnumber = true;
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid employee number (a number).");
            }
        }
        boolean validcarnumber = false;
        while (!validcarnumber) {
            try {
                System.out.print("TOTAL CARS IN STOCK: ");
                total_cars_in_stock = Integer.parseInt(sc.nextLine());
                validcarnumber = true;
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid total car number (a number).");
            }
        }*/

    }
    public void addEmployee(Employees employee) {
        employeesList.add(employee);
    }

    public void addCar(Cars car) {
        carsList.add(car);
    }

    public int getTotalEmployees() {
        return employeesList.size();
    }

    public int getTotalCars() {
        return carsList.size();
    }
}
