import java.lang.Math.*;
import java.util.Scanner;

public class correlationCoefficient {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sigLevel = 0;
        int size = 10;
        String input = ""; 
        double[] xArray = {0,0,0,0,0,0,0,0,0,0};
        double[] yArray = {0,0,0,0,0,0,0,0,0,0};
        double criticalValue = 0;
        double linearCorrelationCoefficient = 0;
        boolean isPositive = true;

        System.out.println("Enter the significance level (.05 or .01) ");
        sigLevel = sc.nextDouble();

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter the value for x and y array: ");
            input = sc.nextLine();
            
        }

        System.out.println("Critical value is equal to: " + criticalValue);
        System.out.println("Linear correlation coefficient is equal to: " + linearCorrelationCoefficient);
        if (isPositive == true) {
            System.out.println("The conclusion is: significant positive linear correlation");
        } else {
            System.out.println("The conclusion is: significant negative linear correlation");
        }
    }
}