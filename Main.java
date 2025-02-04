import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    String[] test = {"Poop", "Toilet", "Noob"};
    System.out.println(countLength(test, 4));
    double[] test1 = {0.2, 0.4, 0.6};
    System.out.println(indexOf(test1, 0.2));
    System.out.println(indexOf(test1, 0.9));
    int[] test3 = {3, 4, 5, 3};
    int[] test4 = {3, 4, 5};
    System.out.println(hasDuplicates(test3));
    System.out.println(hasDuplicates(test4));
    String[] test5 = {"Bob", "Bily", "Bob", "Billy", "Bob"};
    System.out.println("Mode: " + findMode(test5));
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
    
    for(int i = 0; i < arr.length; i++) {
      int element = arr[i];
      for(int j = i + 1; j < arr.length; j++) {
        if(arr[j] == element) {
          return true;
        }
      }
    }
    return false;
  }

  public static String findMode(String[] arr)
  {
    int counter = 0; // max
    String mode = null;
    for(int i = 0; i < arr.length; i++) {
        int currentCount = 0; // reset every iteration...
        for(int j = 0; j < arr.length; j++) {
            if(arr[i].equals(arr[j])) {
                currentCount++;
            }
        }
        System.out.println(currentCount);
        if(currentCount > counter) {
            counter = currentCount;
            mode = arr[i];
        }
    }
    return mode;
  }
}
