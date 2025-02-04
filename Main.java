import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    // Create some arrays here to test your methods
    String[] test = {"Poop", "Toilet", "Noob"};
    System.out.println(countLength(test, 4));
    double[] test1 = {0.2, 0.4, 0.6};
    System.out.println(indexOf(test1, 0.2));
    System.out.println(indexOf(test1, 0.9));
    int[] test2 = {1, 2, 3, 4, 5, 1};
  }

  public static int countLength(String[] arr, int targetLength)
  {
    int elements = 0;
    for(int i = 0; i < arr.length; i++) {
      if(arr[i].length() == targetLength) {
          elements++;
      }
    }
    return elements;
  }

  public static int indexOf(double[] arr, double target)
  {
    for(int i = 0; i < arr.length; i++) {
        if(arr[i] == target) {
          return i;
        }
    }
    return -1;
  }

  public static boolean hasDuplicates(int[] arr)
  {
    // replace with your code
    
    for(int i = 0; i < arr.length; I++) {
      int element = arr[i];
      for(int j = i + 1;) j < arr.length; j++) {
        
      }
    }
    return false;
  }

  public static String findMode(String[] arr)
  {
    // replace with your code
    return null;
  }
}
