//Arrays are non primitive data types used to store elements of same data type in contiguous memory allocation
//Syntax to declare array- datatype[] arrayname=new datatype[size]

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] marks=new int[3];     //declared an array of int type with size as 3
        marks[0]=98;
        marks[1]=94;
        marks[2]=95;

        System.out.println(marks.length);    //marks.length is a property not a function
        System.out.println(marks[0]);

        Arrays.sort(marks);                //function to sort array elements
        System.out.println(marks[0]);

        int[] newmarks={22,4,5};

        int [][] finalmarks={{22,21,25},{32,34,35}};  //2-D array also called matrix.It stores data in rows and columns
        System.out.println(finalmarks[1][1]);

        
    }
}
