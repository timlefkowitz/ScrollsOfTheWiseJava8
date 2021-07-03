import java.util.Arrays;
import java.util.*;

public class NutshellArrays {


    char[] text = "Now is the time".toCharArray();
    char[] copy = new char[100];
    // Copy 10 chracters from element 4 of text intro copy, starting at copy[0]
    System.arraycopy(text, 4, copy, 0, 10);


    // Move some of the text to later elemnts, making room for insetions
    System.arraycopy(copy, 3, copy, 6, 7);




    /// {}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}



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


}// end of array

class type = 0.getClass();
if(type.isArray()) {
    Class elementType = type.getComponentType();
        }
