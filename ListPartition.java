import java.util.*;

public class ListPartition {

    public static void main(String[] args) {

        // takes inputted list and stores it
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a list: ");
        int size = input.nextInt();

        int[] list = new int[size];
        for (int i = 0; i < size; i++)
        {
            list[i] = input.nextInt();
        }

        // calls partition function and outputs partitioned list
        System.out.print("After the partition, the list is ");
        partition(list);
        for (int i = 0; i < size; i++)
        {
            System.out.print(list[i] + " ");
        }
    }

    public static int partition(int[] list) {

        // stores variables for low, high, and pivot values
        int low = 1;
        int high = list.length - 1;
        int pivot = list[0];

        while (high > low)
        {
            // increases low value as value is lower than pivot
            while (low <= high && list[low] <= pivot) {
                low++;
            }

            // decreases high value as value is higher than pivot
            while (low <= high && list[high] > pivot) {
                high--;
            }

            // switches middle values if one is higher/lower than the other
            if (high > low)
            {
                int temp = list[high];
                list[high] = list[low];
                list[low] = temp;
            }
        }

        while (high >= low && list[high] >= pivot) high--;
        {
            if (high > 0)
            {
                int temp = list[high];
                list[high] = list[0];
                list[0] = temp;
                return high;
            }
            else
            {
                return 0;
            }
        }
    }
}


