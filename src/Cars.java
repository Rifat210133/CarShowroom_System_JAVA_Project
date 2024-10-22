import java.util.Scanner;

public class Cars extends Showroom implements utility{
    String car_name;
    String car_color;
    String car_fuel_type;
    int car_price;
    String car_type;
    String car_transmission;
    String carshowname;

    @Override
    public void get_details(){
        System.out.println("NAME: "+car_name);
        System.out.println("COLOR: "+car_color);
        System.out.println("FUEL TYPE: "+car_fuel_type);
        System.out.println("PRICE: "+car_price);
        System.out.println("CAR TYPE: "+car_type);
        System.out.println("TRANSMISSION: "+car_transmission);
    }

    //@Override
    public void set_details(String[] existingShowrooms){
        Scanner sc = new Scanner(System.in);
        System.out.println("======================= *** ENTER CAR DETAILS *** =======================");
        System.out.println();
        System.out.println();
        //System.out.println();
        System.out.println("***PLEASE ENTRE YOUR SHOWROOM NAME WHERE YOU WANT TO ADD YOUR CAR***");
        boolean isValidShowroom = false;
        while (!isValidShowroom) {
            System.out.print("SHOWROOM NAME: ");
            showroom_name = sc.nextLine();
            for (String showroom : existingShowrooms) {
                if (showroom.equalsIgnoreCase(showroom_name)) {
                    isValidShowroom = true;
                    break;
                }
            }
            if (!isValidShowroom) {
                System.out.println("Please enter a valid showroom name.");
            }
        }
        System.out.print("CAR NAME: ");
        car_name = sc.nextLine();
        System.out.print(("CAR COLOR: "));
        car_color = sc.nextLine();
        System.out.print("CAR FUEL TYPE(PETROL/DIESEL): ");
        car_fuel_type = sc.nextLine();
        boolean validPrice = false;
        while (!validPrice) {
            try {
                System.out.print("CAR PRICE: ");
                car_price = Integer.parseInt(sc.nextLine());
                validPrice = true;
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid price (a number).");
            }
        }
        System.out.print("CAR TYPE(SEDAN/SUV/HATCHBACK): ");
        car_type = sc.nextLine();
        System.out.print("TRANSMISSION TYPE(AUTOMATIC/MANUAL): ");
        car_transmission = sc.nextLine();
        total_cars_in_stock++;
        addCar(this);
    }
}
