package exercises;
import java.util.Scanner;
public class AreaOfCircle {



        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("What is the length of the rectangle?: ");
            int lengthOut = input.nextInt();
            System.out.println("length: " + lengthOut);

            System.out.println("What is the Width of the rectangle?: ");
            int widthOut = input.nextInt();
            System.out.println("Width: " + widthOut);

            System.out.println("Area is: " + lengthOut * widthOut);


        }


    }
