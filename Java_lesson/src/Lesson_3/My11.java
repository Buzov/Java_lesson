package Lesson_3;
import java.math.*;
class Point
{
int x,y;
//void init(int x0, int y0)
//{x=x0;y=y0;}
Point(int x, int y)
{this.x=x;this.y=y;}

Point()
{this(99,-77);}
double distance(int x, int y)
{int dx=this.x-x;
 int dy=this.y-y;
 return Math.sqrt(dx*dx+dy*dy);
		 }
double distance(Point p)
{//int dx=this.x-x;
 //int dy=this.y-y;
 return distance(p.x, p.y);
		 }


}
class Point3D extends Point
{
	//int x,y, z;
	int z;
	Point3D(int x, int y, int z)
	{
		//this.x=x; this.y=y; this.z=z;
		super(x,y); this.z=z;
	}
	Point3D()
	{
		this(0,0,0);}
		double distance(int x, int y, int z)
		{int dx=this.x-x;
		 int dy=this.y-y;
		 int dz=this.z-z;
		 return Math.sqrt(dx*dx+dy*dy+dz*dz);
		}
		double distance (Point3D p)
		{
			return distance(p.x, p.y, p.z);
		}
}
	


//метод определят расстояние между точками


class My11
	{
	public static void main(String args[])
	{
		Point p1=new Point();
		Point p2=new Point(55,66);
		Point p3=new Point();
		//p1.x=11;
		//p1.y=22;
		//p2.init(55,66);
		p1.x=131;
		p1.y=232;
		System.out.println("p1.x = "+p1.x+" p1.y = "+p1.y );
		System.out.println("p2.x = "+p2.x+" p2.y = "+p2.y );
		System.out.println("p3.x = "+p3.x+" p3.y = "+p3.y );
		System.out.println("distance (0,0)-p2="+p2.distance (0,0));
		System.out.println("distance p1-p2="+p2.distance (p1.x,p1.y));
		System.out.println("distance p1-p2="+p2.distance (p1));
		System.out.println("--------------");
		Point3D p4=new Point3D();
		Point3D p5=new Point3D(25,37,44);
		System.out.println("p4.x = "+p4.x+" p4.y = "+p4.y+" p4.z = "+p4.z);
		System.out.println("p5.x = "+p5.x+" p5.y = "+p5.y+" p5.z = "+p5.z);
		System.out.println("distance (0,0)-p5="+p5.distance (0,0));
		System.out.println("distance (0,0,0)-p5="+p5.distance (0,0,0));
		System.out.println("distance p4-p5="+p5.distance (p4));
	}
	}
	
