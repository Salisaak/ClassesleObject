package quickMafs;

public class Triangle {

    public Triangle(double base, double height,double sideA,double sideC) {
        double area = (base * height)*.5;
        double perimeter = base + sideA +sideC;
        //output  A=wl= 2 * 10 =20
        System.out.println("The area of the Triangle is " + area);
        System.out.println("The perimeter of the Triangle is " + perimeter);
    }
}
