package homework3;

public class Iteration {
    public static void main(String[] args) {
        int number = 5;
        long x = 1;
        for(int i = 1; i <= number; i++)
        {
            x = x * i;
        }
        System.out.println("Factorial of "+number+" is: "+x);
    }
}
