import java.util.Arrays;
import java.util.*;3

public class NutshellArrays {

    int [] intarray = new int[] {10,5,7,-3};                    /// array of integers
    Arrays.sort(intarray);                                      ///  Sort it in place
    int pos = Arrays.binarySearch(intarray, 12);           /// Value 7 is found at index 2
    pos = Arrays.binarySearch(intarray, 12);                    //  Not found : negative return value


    // Arrays of objects can be sorted and searched too
    String[] strarray = new String[] {"Now", "is,","the", "time"};
    Arrays.sort(strarray);                                      //   {"is", "now", "The", "time"}


    //Arrays.equals() compares all elements of two arrays
    String[] clone = (String[]) strarray.clone();
    boolean b1 = Arrays.equals(strarray.clone); // yes they're equal

    // Arrays.fill() initializes array elements
    byte[] data = new byte[100];         // An empty array; elements set to 0
    Arrays.fill(data, (byte) -1);        // Set them all to -1
    Arrays.fill(data, 5, 10, (byte) -2); // set elements 5,6,7,8,9, to -2
}
