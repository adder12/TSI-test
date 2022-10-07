
import java.util.Scanner;
import java.lang.Math;


public class Main {
    public static void main(String[] args) {

       final int paintCanVol = 1000;
       final int paintVolNeeded = 100;
        Scanner scan = new Scanner(System.in);


        System.out.println("please enter the number of walls");
        int wallCount = scan.nextInt();

        double[] lengthArray = new double[wallCount];
        double[] heightArray = new double[wallCount];
        double[] wallArea = new double[wallCount];
        double totalArea = 0;

        int wallNumber = 0;
        for(int i = 0;i < wallCount;i++){
            wallNumber++;
            System.out.println("Please enter the length of wall number: " + wallNumber );
            lengthArray[i] = scan.nextDouble();
            System.out.println("Please enter the height of wall number: " + wallNumber);
            heightArray[i] = scan.nextDouble();
            wallArea[i] = lengthArray[i] * heightArray[i];
            totalArea += wallArea[i];
        }

        double paintNeeded = totalArea * paintVolNeeded;

        int cansNeeded = (int) Math.ceil(paintNeeded/paintCanVol);
        System.out.println("In total to paint all " + wallNumber + " walls, you will need " + paintNeeded + "mls of paint! Assuming a can size of " + paintCanVol + "ml, you will need " + cansNeeded + " cans of paint");
        
        }




/*
        System.out.println("Enter the length of the wall in meters");
        double wallLength = scan.nextDouble();
        System.out.println("Enter the height of the wall in meters");
        double wallHeight = scan.nextDouble();
        double wallArea = wallHeight * wallLength;
        double totalPaint = wallArea * paintVolNeeded;
        System.out.println("The total paint you need to paint this wall is " + totalPaint + "ml");

*/
/*
        int numberOfWalls = 4;

        float wallLength = 3.1f;

        float wallHeight = 2.5f;

        float wallArea = wallHeight * wallLength;

        float totalPaint = wallArea * numberOfWalls * paintVolNeeded;

        System.out.println("The total volume of paint needed for this wall is " + totalPaint + "ml");
*/

/*
        System.out.println("Enter the surface area of your walls in meters squared");
        double wallArea = scan.nextDouble();
        System.out.println("Enter the surface area of your ceiling in meters squared");
        double ceilArea = scan.nextDouble();

        double wallPaintNeeded = wallArea * paintVolNeeded;
        double ceilPaintNeeded = ceilArea * paintVolNeeded;
        double totalPaint = ceilPaintNeeded + wallPaintNeeded;

        System.out.println("The total number of paint that you require is " + totalPaint + "ml");

*/
    }
