import java.util.Arrays;

public class NutshellArrays {

    int [] intarray = new int[] {10,5,7,-3};                    /// array of integers
    Arrays.sort(intarray);                                      ///  Sort it in place
    int pos = Arrays.binarySearch(intarray, 12);           /// Value 7 is found at index 2
    pos = Arrays.binarySearch(intarray, 12);                    //  Not found : negative return value


    // Arrays of objects can be sorted and searched too
    String[] strarray = new String[] {"Now", "is,","the", "time"};
    Arrays.sort(strarray);                                      //   {"is", "now", "The", "time"}
}
