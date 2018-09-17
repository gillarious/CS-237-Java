import java.lang.Math.*;
import java.util.Scanner;

public class correlationCoefficient {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sigLevel = 0;
        int size = 10;
        double[] xArray = {0,0,0,0,0,0,0,0,0,0};
        double[] yArray = {0,0,0,0,0,0,0,0,0,0};
        double criticalValue = 0;
        double linearCorrelationCoefficient = 0;

        System.out.println("Enter the significance level (.05 or .01) ");
        sigLevel = sc.nextDouble();

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter the value for x and y array: ");
        }

        System.out.println("Critical value is equal to: " + criticalValue);
        System.out.println("Linear correlation coefficient is equal to: " + linearCorrelationCoefficient);
        
    }
}