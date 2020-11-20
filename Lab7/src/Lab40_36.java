import java.util.Scanner;
import java.lang.Math;

public class Lab40_36 
{
    public static void main (String[] args)
    {
        final double GALLON_AMMOUNT = 350.0;
      
        Scanner scanner = new Scanner(System.in);
        double wallHeight;
        double wallWidth;
        double wallArea;
        
        System.out.println("Enter wall height (feet):");
        wallHeight = scanner.nextDouble();
        System.out.println("Enter wall width (feet):");
        wallWidth = scanner.nextDouble();
        
        scanner.close();

        //Calculate Wall Area
        wallArea = wallHeight * wallWidth;
        System.out.println("Wall area: " + wallArea + " square feet");
        
        //Calculate Gallons Of Paint Needed
        double gallonsNeeded = wallArea / GALLON_AMMOUNT;
        
        System.out.println("Paint needed: " + gallonsNeeded + " gallons");
        
        //Print Out Rounded Gallons Needed In Form Of Cans
        System.out.println("Cans needed: " + (int)Math.ceil(gallonsNeeded) + " can(s)");
    }
}
