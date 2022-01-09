package homework1;
import java.util.Scanner;
public class StudentId {
    public static void main(String[] args) {
        String name;
        System.out.println("What is your name");
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        System.out.println("Name is: " + name);

        String id;
        System.out.println("What is your student id");
        Scanner obj = new Scanner(System.in);
        id = obj.nextLine();
        System.out.println("Student ID is: " + id);
    }

}
