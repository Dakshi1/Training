
public class Circle {
	
	private double radius=1.0;
	private String color="red";
	public Circle(double radius, String color) {
		super();
		this.radius = radius;
		this.color = color;
	}
	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	public Circle() {
		super();
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public double getArea()
	{
		double area=3.14*radius*radius;
		return area;
	}
	@Override
	public String toString() {
		
		String c=this.color;
		double r=this.radius;
		String s="Circle[radius="+r+", color="+c+"]";
		return s;
	}

}
