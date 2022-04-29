//Here a random number is generated in the program and the user has to find what that random number is by guessing

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int myNumber=(int)(Math.random()*100); //math.random() returns a number from 0-1 ie a small decimal number
        int userNumber=0;

        do{
            System.out.println("Guess my number in range 1-100");
            userNumber=sc.nextInt();

            if(userNumber==myNumber){
                System.out.println("Correct number");
            }
            else if(userNumber>myNumber){
                System.out.println("Your number is large");
            }
            else{
                System.out.println("Your number is small");
            }

        }
        while(userNumber>=0);
        System.out.println("My number was : ");
        System.out.println(myNumber);
    }
}
