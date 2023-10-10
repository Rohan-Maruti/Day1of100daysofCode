import java.util.*;

public class calculator {

    public static void main(String args[]){
      // creating a calculator with the help of switch statment
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter value of a :");
      int a = sc.nextInt();
      System.out.println("Enter the value of b :");
      int b = sc.nextInt();
      System.out.println("Enter which operation you want to perform :");
      char opp = sc.next().charAt(0);
            
    switch(opp){
        case '+':System.out.println(a+ " + " + b+ " = " +(a+b));
                 break;
        case '-':System.out.println(a+ " - " + b+ " = " +(a-b));
                 break;
        case '*':System.out.println(a+ " * " + b+ " = " +(a*b));
                 break;
        case '/':System.out.println(a+ " - " + b+ " = " +(a/b));
                 break;
         case '%':System.out.println(a+ " % " + b+ " = " +(a%b));
                 break;
    }
    }
}