package quickMafs;

public class Square {
    public Square() {
    }

    public Square(int width, int length) {
        int area = length * width;
        //output  A=wl= 2 * 10 =20
        int perimeter =  (length*2) + (width*2);
        System.out.println("The area of this Square is " + area);
        System.out.println("The perimeter of the Square is " + perimeter);
    }

    public int width;
    public int length;
}


