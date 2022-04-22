import java.util.Scanner;

public class Main {

    public static void printJava(){
        System.out.println("Print java");   //function
    }
    public static void main(String[] args) {

        printJava();    //function call

        System.out.println("Hello World");

        char a='Z';
        System.out.println(a);

        String x="Akhil";
        String y="Mishra";
        String z=x +" "+ y;  //concat
        System.out.println(z);
        System.out.println(z.length());   //function of string that's why ()
        System.out.println(z.charAt(8));
        String w=z.replace('a', 'b'); //case sensitive
        System.out.println(w);

        String name="Akash and Apurva";
        System.out.println(name.substring(0,5)); //includes up to first index and second index-1

        final float PI=3.14F;  //constant variable

        System.out.println(Math.random());
        System.out.println((int)(Math.random()*100));  //math.random() returns a number from 0-1 ie a small decimal number

        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter your age");
//        int m=sc.nextInt();
//        System.out.println(m);
//
//        System.out.println("Enter your first name");
//        String f=sc.next();
//        System.out.println(f);

        System.out.println("Enter your full name");
        String fullname=sc.nextLine();
        System.out.println(fullname);

        //break and continue
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

//        byte - 1 [-128 to 127]
//        short - 2
//        int - 4 1,2,3
//        long - 8
//        float - 4 decimal
//        double- 8
//        char - 2  a,b
//        boolean - 1 true/false
        byte age=30;
        int phone=1234567890;
        long phone2=123456789987654321L;
        float pi=3.14F;
        char letter='@';
        boolean isAdult=false;
    }
}