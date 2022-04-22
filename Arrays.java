import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] marks=new int[3];
        marks[0]=98;
        marks[1]=94;
        marks[2]=95;

        System.out.println(marks.length); //property not function
        System.out.println(marks[0]);

        Arrays.sort(marks);
        System.out.println(marks[0]);

        int[] newmarks={22,4,5};

        int [][] finalmarks={{22,21,25},{32,34,35}};
        System.out.println(finalmarks[1][1]);

        //type casting
        double price=100.0;
        double finalprice=18+price;   //double capacity more than int(implicit casting)
        System.out.println(finalprice);

        int p=100;
        int fP=p+(int)18.11;   //int has less capacity than double(explicit casting)
        System.out.println(fP);
    }
}