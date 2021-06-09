class Rectangle {
    double length;
    double breadth;
    double area;
void setdata(double len,double bred) {
        length=len;
        breadth=bred;
}

double getArea(){
    
    area=length*breadth;
    return area;
}
    

}
class java_2_Rect
{
public static void main(String args[])
{   double area;
    Rectangle r1=new Rectangle();
    Rectangle r2=new Rectangle();
    Rectangle r3=new Rectangle();
    r1.setdata(12.4,13);
    r2.setdata(10.5,9);
    r3.setdata(13,14);
    area=r1.getArea();
    System.out.println("the area Of reactangle 1 is " +area);
    area=r2.getArea();
    System.out.println("the area Of reactangle 2 is " +area);
    area=r3.getArea();
    System.out.println("the area Of reactangle 3 is " +area);
}
}
