import java.util.Scanner;

public class UserFeedback extends Showroom implements utility {
    String showRoomName;
    String carName;
    String carModel;
    String buyingDate;
    String problemDescription;
    String carOwner;
    String status;

    @Override
    public void get_details() {
        System.out.println("======================= *** PROBLEM DETAILS. *** =======================");
        System.out.println("Customar Name: "+carOwner);
        System.out.println("Show Room Name: " + showRoomName);
        System.out.println("Car Name: " + carName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Buying Date: " + buyingDate);
        System.out.println("Problem Description: " + problemDescription);
        //System.out.println("Benefits Received: " + benefitsReceived);
        System.out.println("Problem Status: "+status);
    }
    public void set_details(String[] existingShowrooms) {
        Scanner sc = new Scanner(System.in);
        System.out.println("======================= *** PROBLEM DETAILS. *** =======================");
        System.out.println("Please provide your details: ");
        System.out.print("Customar Name: ");
        carOwner=sc.nextLine();
        boolean isValidShowroom = false;
        while (!isValidShowroom) {
            System.out.print("SHOWROOM NAME: ");
            showRoomName = sc.nextLine();
            for (String showroom : existingShowrooms) {
                if (showroom.equalsIgnoreCase(showRoomName)) {
                    isValidShowroom = true;
                    break;
                }
            }
            if (!isValidShowroom) {
                System.out.println("Please enter a valid showroom name.");
            }
        }
        System.out.print("Car Name: ");
        carName = sc.nextLine();
        System.out.print("Car Model: ");
        carModel = sc.nextLine();
        System.out.print("Buying Date: ");
        buyingDate = sc.nextLine();
        System.out.print("Problem Description: ");
        problemDescription = sc.nextLine();
        System.out.print("Problem status(SOLVED, UNSOLVED): ");
        status = sc.nextLine();

    }
}
