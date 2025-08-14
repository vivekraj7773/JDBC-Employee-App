import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        EmployeeDAO dao = new EmployeeDAO();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== Employee Management Menu =====");
            System.out.println("1. Add Employee");
            System.out.println("2. View Employees");
            System.out.println("3. Update Employee");
            System.out.println("4. Delete Employee");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter position: ");
                    String position = sc.nextLine();
                    System.out.print("Enter salary: ");
                    double salary = sc.nextDouble();
                    dao.addEmployee(name, position, salary);
                    break;
                case 2:
                    List<String> employees = dao.viewEmployees();
                    System.out.println("\n--- Employee List ---");
                    for (String emp : employees) {
                        System.out.println(emp);
                    }
                    break;
                case 3:
                    System.out.print("Enter ID to update: ");
                    int upId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter new name: ");
                    String upName = sc.nextLine();
                    System.out.print("Enter new position: ");
                    String upPosition = sc.nextLine();
                    System.out.print("Enter new salary: ");
                    double upSalary = sc.nextDouble();
                    dao.updateEmployee(upId, upName, upPosition, upSalary);
                    break;
                case 4:
                    System.out.print("Enter ID to delete: ");
                    int delId = sc.nextInt();
                    dao.deleteEmployee(delId);
                    break;
                case 5:
                    System.out.println("Exiting... Goodbye!");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}