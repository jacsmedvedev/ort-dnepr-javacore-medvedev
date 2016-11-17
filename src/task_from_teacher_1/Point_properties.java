package task_from_teacher_1;

public class Point_properties {
	private String name;
	private int x;
	private int y;
	
	public Point_properties(String PointName, int coordinate_X, int coordinate_Y) {
		setName(PointName);
		getx(coordinate_X);
		gety(coordinate_Y);;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public int getx(int x) {
		return x;
	}
	public void setx(int x) {
		this.x= x;
	}
	public int gety(int y) {
		return y;
	}
	public void sety() {
		this.y= y;
	}
}