
/**
 *
 * @author Abhishek
 */
  
import java.util.Scanner;
public class HeightWeightConvertor {
    public static void main(String[] arg){
        Scanner sc =new Scanner(System.in);
        System.out.println("Feet");       
        int feet = sc.nextInt();
        System.out.println("Inch");   
	int inch = sc.nextInt();
        System.out.println("Weight");   
        int weight = sc.nextInt();
        
        float heightInCm = (float) ((feet*12+inch)*2.54);
        float  weightInPounds = (float) (weight*2.2);
        System.out.println("Height in cm :"+heightInCm);
	System.out.println("Weight in pounds :"+weightInPounds);
        
        
    }
    
    
}
/*
Feet
5
Inch
11
Weight
60
Height in cm :180.34
Weight in pounds :132.0
BUILD SUCCESSFUL (total time: 35 seconds)
*/