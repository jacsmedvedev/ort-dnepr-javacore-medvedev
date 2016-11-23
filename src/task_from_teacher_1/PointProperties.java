package task_from_teacher_1;

public class PointProperties {
	private String name;
	private int x;
	private int y;

	public PointProperties(String PointName, int coordinate_X, int coordinate_Y) {
		setName(PointName);
		setX(coordinate_X);
		setY(coordinate_Y);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
}