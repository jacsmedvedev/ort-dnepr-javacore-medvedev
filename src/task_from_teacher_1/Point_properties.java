package task_from_teacher_1;

public class Point_properties {
	private String name;
	private int x;
	private int y;

	public Point_properties(String PointName, int coordinate_X, int coordinate_Y) {
		setName(PointName);
		setx(coordinate_X);
		sety(coordinate_Y);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getx() {
		return x;
	}

	public void setx(int x) {
		this.x = x;
	}

	public int gety() {
		return y;
	}

	public void sety(int y) {
		this.y = y;
	}
}