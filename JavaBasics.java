//types of primitive data types in java
//                  size   Example
//        byte -    1      [-128 to 127]
//        short -   2      small int nos
//        int -     4      1,2,3
//        long -    8      large int nos
//        float -   4      decimal
//        double-   8      large float nos
//        char -    2      a,b
//        boolean - 1      true/false

//non primitive data types are string and array

import java.util.Scanner;       

public class Main {

    public static void printJava(){
        System.out.println("Print java");   //function
    }
    public static void main(String[] args) {

        printJava();                    //function call

        System.out.println("Hello World");

        char a='Z';
        System.out.println(a);

        String x="Akhil";
        String y="Mishra";
        String z=x +" "+ y;  //concat
        System.out.println(z);
        System.out.println(z.length());           //function of string that's why ()
        System.out.println(z.charAt(8));
        String w=z.replace('a', 'b');             //case sensitive
        System.out.println(w);

        String name="Akash and Apurva";
        System.out.println(name.substring(0,5)); //gives output of substring from first index and second index-1

        final float PI=3.14F;                   //constant variable

        System.out.println(Math.random());              //math.random() returns a number from 0-1 ie a small decimal number
        System.out.println((int)(Math.random()*100));   //Mto convert random number to int 

        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter your age");
//        int m=sc.nextInt();
//        System.out.println(m);
//
//        System.out.println("Enter your first name");
//        String f=sc.next();                      //sc.nextInt() takes string upto first space only
//        System.out.println(f);

        System.out.println("Enter your full name");
        String fullname=sc.nextLine();             //sc.nextLine() takes whole string as input including spaces
        System.out.println(fullname);

        //break and continue
        //continue skips current iteration and moves to next iteration
        //break is used to terminate a loop
        
        int i=0;
        while(true){
            if(i==3){
                i=i+1;
                continue;             
            }
            System.out.println(i);
            i=i+1;
            if(i>5){
                break;
            }
        }

        byte age=30;
        int phone=1234567890;
        long phone2=123456789987654321L;
        float pi=3.14F;
        char letter='@';
        boolean isAdult=false;
        
        //type casting which means converting from one datatype to another
        double price=100.0;
        double finalprice=18+price;   //double capacity more than int(implicit casting)
        System.out.println(finalprice);

        int p=100;
        int finalP=p+(int)18.11;   //int has less capacity than double(explicit casting)
        System.out.println(finalP);
    }
}
