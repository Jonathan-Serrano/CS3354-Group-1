public class PyramidPattern {

    public static void main(String[] args) {

            int i, j, rows= 8;

            // prints spaces before each number
            for (i = 1; i <= rows; i++)
            {
                for (int space = 1; space <= rows - i; ++space) {

                    System.out.print("  ");
                }

                //first numbers in row
                for (j = 0; j <= i - 1; j++)
                {
                    double answer = Math.pow(2, j);
                    int data = (int)answer;
                    System.out.print(data + " ");
                }
                //mirror numbers printed
                for (j = i - 1; j >= 1; j--)
                {
                    double answer = Math.pow(2, j-1);
                    int data = (int)answer;
                    System.out.print(data + " ");
                }
                System.out.println();
            }
        }
   }
