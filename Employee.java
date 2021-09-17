package quickMafs;

import java.awt.*;

public class Employee {


    public Employee(String empName, Integer hoursWorked, double hourlyPay){
        overallPay = hourlyPay*hoursWorked;
        this.empName=empName;
        this.hourlyPay=hourlyPay;
        this.hoursWorked=hoursWorked;
    }
    public String empName;
    public double overallPay;
    public Integer hoursWorked;
    public double hourlyPay;

    @Override
    public String
    toString() {
        return "Employee{" +
                "empName='" + empName + '\'' +
                ", overallPay=" + overallPay +
                ", hoursWorked=" + hoursWorked +
                ", hourlyPay=" + hourlyPay +
                '}';
    }
}
