import java.util.Arrays; 
public class Ans8  {
 public static void main(String[] args)
 {
    int[] array_nums = {2, 3, 8, 6, 1};
    System.out.println("Original Array: "+Arrays.toString(array_nums)); 
    int maxVal = array_nums[0];
    int minVal = array_nums[0];
    for(int i = 1; i < array_nums.length; i++)
    {
        if(array_nums[i] > maxVal)
            maxVal = array_nums[i];
        else if(array_nums[i] < minVal)
            minVal = array_nums[i];
    }
    System.out.println("Difference between the largest and smallest values of the said array: "+(maxVal-minVal)); 
 }
}

