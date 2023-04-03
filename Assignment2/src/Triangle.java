public class Triangle extends GeoObj{
    double side1 = 1.0;
    double side2 = 1.0;
    double side3 = 1.0;
    public Triangle(){}
    public Triangle(double side1, double side2, double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getArea(){
        double pr = side1 + side2 + side3;
        double spr = pr/2;
        double area = java.lang.Math.sqrt(spr*(spr - side1)*(spr - side2)*(spr - side3));
        return area;
    }

    public double getPerimeter(){
        double pr = side1 + side2 + side3;
        return  pr;
    }


}
