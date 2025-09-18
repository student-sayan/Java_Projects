import java.util.Scanner;

class Square{
    double side;
    
    public Square(double side){
        this.side = side;
    }

    double getVolume(){
        double volume = side*side*side;
        System.out.println("Volume of Square = " + volume);
        return volume;
    }
}

class Cylinder extends Square{
    double height;

    public Cylinder( double square,double height){
        super(square);
        this.height = height;
    }

    double getVolume(){
        double volume = 3.14 * (side*side) * height;
        System.out.println("Volume of Cylinder: " + volume);
        return volume;
    }
}

public class Calculation{
    public static void main(String[] args){
        Square square = new Square(4);
        square.getVolume();
        Cylinder cylinder = new Cylinder(3,5);
        cylinder.getVolume();
    }
}