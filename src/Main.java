import java.util.*;
import java.lang.*;

interface utility{
    public void get_details();
    public void set_details();
}

public class Main {

    static boolean showroomEntered = false;


    static void main_menu(){
        System.out.println();
        System.out.println("======================= *** WELCOME TO SHOWROOM MANAGEMENT SYSTEM *** =======================");
        System.out.println();
        System.out.println("=============================== *** ENTER YOUR CHOICE *** ===============================");
        System.out.println();
        System.out.println("1].ADD SHOWROOMS \t\t\t 2].ADD EMPLOYEES \t\t\t 3].ADD CARS \t\t\t 4].GIVE FEEDBACK");
        System.out.println();
        System.out.println("5].GET SHOWROOMS \t\t\t 6].GET EMPLOYEES \t\t\t 7].GET CARS \t\t\t 8].GET FEEDBACK");
        System.out.println();
        System.out.println("=============================== *** ENTER 0 TO EXIT *** ===============================");

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Controller controller = new Controller();
        controller.displayControllerInfo();


        Showroom showroom[] = new Showroom[5];
        Employees employee[] = new Employees[5];
        UserFeedback user_feedback[] = new UserFeedback[5];
        Cars car[] = new Cars[5];
        int car_counter = 0;
        int showroom_counter = 0;
        int employees_counter = 0;
        int user_feedback_counter = 0;
        int choice = -1;
        while(choice!=0){

            main_menu();
            choice = sc.nextInt();
            if (!showroomEntered && choice != 1 && choice != 0) {
                System.out.println("Please enter showroom details first!");
                continue;
            }
            Boolean isWhileBroken = false;
            while(choice!=9 && choice!=0 && !isWhileBroken){
                switch (choice) {
                    case 1:
                        showroom[showroom_counter] = new Showroom();
                        showroom[showroom_counter].set_details();
                        showroom_counter++;
                        showroomEntered = true;
                        System.out.println();
                        System.out.println("1].ADD NEW SHOWROOM");
                        System.out.println("9].GO BACK TO MAIN MENU");
                        choice = sc.nextInt();
                        break;
                    case 2:
                        employee[employees_counter] = new Employees();
                        employee[employees_counter].set_details(getExistingShowroomNames(showroom, showroom_counter));
                        showroom[showroom_counter - 1].addEmployee(employee[employees_counter]);
                        employees_counter++;
                        System.out.println();
                        System.out.println("2].ADD NEW EMPLOYEE");
                        System.out.println("9].GO BACK TO MAIN MENU");
                        choice = sc.nextInt();
                        break;
                    case 3:
                        car[car_counter] = new Cars();
                        car[car_counter].set_details(getExistingShowroomNames(showroom, showroom_counter));
                        showroom[showroom_counter - 1].addCar(car[car_counter]);
                        car_counter++;
                        System.out.println();
                        System.out.println("3].ADD NEW CAR");
                        System.out.println("9].GO BACK TO MAIN MENU");
                        choice = sc.nextInt();
                        break;
                    case 4:
                        user_feedback[user_feedback_counter] = new UserFeedback();
                        user_feedback[user_feedback_counter].set_details(getExistingShowroomNames(showroom, showroom_counter));
                        user_feedback_counter++;
                        System.out.println();
                        System.out.println("9].GO BACK TO MAIN MENU");
                        System.out.println("0].EXIT");

                        choice = sc.nextInt();
                        break;
                    case 5:
                        for (int i = 0; i < showroom_counter; i++) {
                            showroom[i].get_details();

                            System.out.println();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("9].GO BACK TO MAIN MENU");
                        System.out.println("0].EXIT");
                        choice = sc.nextInt();
                        break;
                    case 6:
                        for (int i = 0; i < employees_counter; i++) {
                            employee[i].get_details();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("9].GO BACK TO MAIN MENU");
                        System.out.println("0].EXIT");
                        choice = sc.nextInt();
                        break;
                    case 7:
                        for (int i = 0; i < car_counter; i++) {
                            car[i].get_details();
                            System.out.println();
                            System.out.println();
                        }

                        System.out.println();
                        System.out.println("9].GO BACK TO MAIN MENU");
                        System.out.println("0].EXIT");
                        choice = sc.nextInt();
                        break;

                    case 8:
                        boolean flag = false;
                        for (int i = 0; i < user_feedback_counter; i++) {
                            user_feedback[i].get_details();
                            flag = true;
                            System.out.println();
                            System.out.println();
                        }

                        if(flag == false){
                            System.out.println("We have not given any FEEDBACK today");
                            System.out.println("\t\t***Thank You***");
                        }

                        System.out.println();
                        System.out.println("9].GO BACK TO MAIN MENU");
                        System.out.println("0].EXIT");
                        choice = sc.nextInt();
                        break;
                    default:
                        System.out.println("PLEASE ENTER VALID CHOICE: ");
                        isWhileBroken = true;
                        break;
                }
            }
        }

    }
    public static String[] getExistingShowroomNames(Showroom[] showrooms, int counter) {
        String[] existingShowrooms = new String[counter];
        for (int i = 0; i < counter; i++) {
            existingShowrooms[i] = showrooms[i].showroom_name;
        }
        return existingShowrooms;
    }
}
