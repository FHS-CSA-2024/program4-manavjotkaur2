//Youre on your own!
//Jk ask for help if you need it (but also look at previous programs!!)
import java.util.Scanner;
public class Program4{
    public static void main(String[] args){
        int numberOne = 0;
        int numberTwo = 0;
        int numberThree = 0;
        int numberFour = 0;
        int sum = 0;
        double average = 0;
        Scanner numScanner = new Scanner(System.in);
        System.out.println("Enter numberOne: ");
        numberOne = numScanner.nextInt();
        System.out.println("Enter numberTwo: ");
        numberTwo = numScanner.nextInt();
        System.out.println("Enter numberThree: ");
        numberThree = numScanner.nextInt();
        System.out.println("Enter numberFour: ");
        numberFour = numScanner.nextInt();
        sum = numberOne + numberTwo + numberThree + numberFour;
        average = sum/4.0;
        System.out.println("The sum of the four numbers is " + sum);
        System.out.println();
        System.out.println("The average of the four numbers is " + average);
    }
}


//Paste console output below:
/*
Enter numberOne: 
475
Enter numberTwo: 
821
Enter numberThree: 
369
Enter numberFour: 
562
The sum of the four numbers is 2227

The average of the four numbers is 556.75

*/
