package looping;
import java.util.Scanner;
public class ArmstrongNo {
	public static void main(String[] args) {
        int number, originalNumber, remainder, result = 0;
        Scanner sn=new Scanner (System.in);
        System.out.println("enter the nummber");
        number=sn.nextInt();
        originalNumber = number;
        while (originalNumber != 0)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }
        if(result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
    }
}
