import java.lang.Math.*;
import java.util.Scanner;

public class standardDeviation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      	int size = 10;
      	double[] xnum = {0,0,0,0,0,0,0,0,0,0};
      	double x1 = 0;
      	double x2 = 0;
      	double z1 = 0;
      	double z2 = 0;
      	double totalxnum = 0;
      	double meanxnum = 0;
      	double variance = 0;
        double vartotal = 0;
      	double standardDev = 0;
        double stdtotal = 0;
      	double zscorex1 = 0;
      	double zscorex2 = 0;
      	double zscorez1 = 0;
      	double zscorez2 = 0;
      	double midrange = 0;
      
        System.out.println("Measures of Relative Standing");
        
      	for (int i = 0; i < size; i++) {
            System.out.print("Enter the numbers of calories per serving ");
          	double x = sc.nextDouble();
          	xnum[i] = x;
          	totalxnum = totalxnum + xnum[i];
        }
        
        double sized = (double)size;
        meanxnum = totalxnum / sized;
        
        for (int j = 0; j < size; j++) {
            vartotal = vartotal + Math.sqrt(xnum[j] - meanxnum, 2);
        }

        variance = vartotal / (size - 1);

        for (int k = 0; k < size; k++) {
            stdtotal = stdtotal + Math.sqrt(xnum[k] - meanxnum);
        }

        standardDev = Math.sqrt(stdtotal);
        
        System.out.print("Enter the value for x1 ");
        x1 = sc.nextDouble();
        System.out.print("Enter the value for x2 ");
        x2 = sc.nextDouble();
        
        zscorex1 = (x1 - meanxnum) / standardDev;
        zscorex2 = (x2 - meanxnum) / standardDev;
        
        System.out.print("Enter the value of the z1 ");
        z1 = sc.nextDouble();
        System.out.print("Enter the value of the z1 ");
        z2 = sc.nextDouble();
        
        zscorez1 = z1 + zscorex1 * standardDev;
        zscorez2 = z2 + zscorex2 * standardDev;

        midrange = (xnum[0] + xnum[size-1]) / 2;
      
      	System.out.println(" ");
      	System.out.println("The mean = " + meanxnum);
      	System.out.println("The variance = " + variance);
      	System.out.println("The standard deviation = " + standardDev);
      	System.out.println("The midrange = " + midrange);
      	System.out.println("The z - score for x1 = " + zscorex1);
      	System.out.println("The z - score for x2 = " + zscorex2);
      	System.out.println("Number of calories for a menu item if the z score is " + z1 + " is " + zscorez1);
      	System.out.println("Number of calories for a menu item if the z score is " + z2 + " is " + zscorez2);
    }
}