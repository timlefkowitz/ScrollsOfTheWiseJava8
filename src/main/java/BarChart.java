import org.springframework.http.server.DelegatingServerHttpResponse;

public class BarChart {
    // Many Programs present data to users in a graphical manner. Numbers are often displayed as bars in a bar chart


    public static void main(String[] args) {


        int[] array = {0, 0, 0, 0, 0, 0, 0, 1, 2, 3, 4, 5, 6};

        System.out.println("Grade distribution:");


        for (int counter = 0 ; counter < array.length; counter++)
        {
            if (counter == 10)
                System.out.printf("%5d: ", 100);
              else
                System.out.printf("%02d-%02d: ",
                        counter * 10, counter * 10 + 9);


                //print bar of astterisk
                for (int stars = 0; stars < array[counter]; stars++)
                    System.out.printf("*");

                System.out.println();

        }
    }
}
