import java.util.Scanner;
public class EmplyeeSalary {
    /*
     * EmploySalary
     * This is a multi-line comment.
     * The program reads Employ's name, age, and Salary,
     * calculates the Total, and prints a formatted sentence.
     */
    String name;
    int age;
    double basicSalary;
    double  bouns;
    static void main() {
        //create a Scanner to read input from the keyboard
    Scanner input = new Scanner(System.in);
        System.out.println("Enter the Name : ");
        String name = input.nextLine();
        System.out.println("Enter the Age : ");
        int Age = input.nextInt();
        System.out.println("Enter The Basic Salary : ");
        double Salary = input.nextDouble();
        System.out.println("Enter The Bouns : ");
        double Bouns = input.nextDouble();
        //Final constant: the number of transport never changes
        final int TRANSPORT = 500;
        double total = Salary;
        total += Bouns;
        System.out.printf(" %s is %d years old %n Total Salarymanar %.2f.%n",
                name, Age, Salary);
    }
}
