package day5_abstraction;

public abstract class Shape {
	private String color = "red";
	
	public String getcolor()
	{
		return color;
	}
	public abstract void draw();
	
}
