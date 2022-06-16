package shape;
class Area
{
	double circle, rectangle,cuboid; 
	Area(int r)
	{
		circle=3.14*r*r;
		System.out.println("area of circle="+circle);
	}
	Area(int l,int b)
	{
		rectangle=l*b;
		System.out.println("area of Rectangle="+rectangle);
	}
	Area(int l,int b,int h)
	{
	cuboid=l*b*h;
	System.out.println("area of Cuboid="+cuboid);
	}	
}
public class ShapeArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Area obj1=new Area(2);
		Area obj2=new Area(2,3);
		Area obj3=new Area(2,3,4);
	}

}
