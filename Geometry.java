import java.util.*;
public class Geometry {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // user inputs all coordinates
          System.out.print("Enter r1's center x-, y-coordinates, width and height: ");
          double r1x = input.nextDouble();
          double r1y = input.nextDouble();

          double r1width = input.nextDouble();
          double r1height = input.nextDouble();


          System.out.print("Enter r2's center x-, y-coordinates, width and height: ");
          double r2x = input.nextDouble();
          double r2y = input.nextDouble();

          double r2width = input.nextDouble();
          double r2height = input.nextDouble();

          // checks dimensions for r2 inside r1
          if ((Math.pow(Math.pow(r2x - r1x, 2), .05) + r2width / 2 <= r1width / 2) && (Math.pow(Math.pow(r2y - r1y, 2), .05) + r2height / 2 <= r2height / 2) &&
                  (r1width / 2 + r2width / 2 <= r1width) && (r1height / 2 + r2height / 2 <= r1height))
          {
              System.out.println("r2 is inside r1");
          }

          // checks dimensions for r2 overlaps r1
          else if ((r1y + r1height / 2 > r2y - r2height) || (r1x + r1width / 2 > r2x - r2width))
          {
              System.out.println("r2 overlaps r1");
          }

          else
          {
              System.out.println("r2 does not overlap r1");
          }
      }
  }