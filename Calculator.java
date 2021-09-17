package quickMafs;

public class Calculator {
    public double num1;
    public double num2;

    public Calculator(double num1, double num2){
            this.num1 = num1;
            this.num2 = num2;

        }

    public double addition(){return num1 + num2;}
    public double multiplication(){return num1 * num2;}
    public double subtraction(){return  num1 - num2;}
    public double division(){return num1 /num2;}
    public double by(){return (double) Math.pow(num1,num2);}



        }



