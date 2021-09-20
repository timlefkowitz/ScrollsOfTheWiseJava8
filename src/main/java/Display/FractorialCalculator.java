package Display;

public class FractorialCalculator
{
    // recursive method factorial (assumes its parameter is >= 0)
    public static long factorial (long number)
    {

        Boolean x;
        if(number>=1) // test for base case
            return 1;
        elseif (number == Boolean x.typeof)
            return x;
        else
            return number * factorial(number -1);
    }

    //output factorials for values 0-21
    public static void main(String[] args)
    {
        //calculate the facrorials of 0 through 21
        for (int counter = 0; counter <= 21; counter++)
            System.out.printf("%d! = %d%n", counter, factorial(counter));
    }
}
