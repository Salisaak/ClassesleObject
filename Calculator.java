package quickMafs;

public class Calculator {

    public Calculator(double num1, String operation, double num2){
        if (operation == "+")
        {
            System.out.println("your answer is " + (num1 + num2));
        }
        else if  (operation == "-")
        {
            System.out.println("your answer is " + (num1 - num2));
        }
        else if (operation == "/")
        {
            System.out.println("your answer is " + (num1 / num2));
        }
        else if (operation == "*")
        {
            System.out.println("your answer is " + (num1 * num2));
        }
        else if (operation == "^")
        {
            System.out.println("your answer is " + (Math.pow(num1,num2)));
        }
    }
}
