import java.util.Scanner;

public class Controller {
    private String name;
    private String id;

    public Controller() {
        setName();
        setId();
    }

    private void setName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("***... Please Create Your Account ...***");
        System.out.print("Enter your name: ");
        this.name = scanner.nextLine();
    }

    private void setId() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your ID Like 1234***: ");
        this.id = scanner.next();
    }

    public void displayControllerInfo() {
        System.out.println("Admin Name: " + name);
        System.out.println("Admin ID: " + id);
    }
}
