package task_from_teacher_1;



public class Points {

	public static void main(String[] args) {
		final int pointsCount = 6;
		Point_properties[] points = new Point_properties[pointsCount];
		points[0] = new Point_properties("A", 7, -3);
		points[1] = new Point_properties("B", 1, 1);
		points[2] = new Point_properties("C", 1, 3);
		points[3] = new Point_properties("D", -5, -4);
		points[4] = new Point_properties("E", 6, 4);
		points[5] = new Point_properties("X", 0, 0);

		bubbleSortx(points);
		//bubbleSorty(points);
		printpoints(points);
	}

	public static void bubbleSortx(Point_properties[] points) {
		for (int i = points.length - 1; i > 0; --i) {
			for (int j = 0; j < i; ++j) {
				if ((Math.abs(points[j].getx()) > Math.abs(points[j + 1].getx())
						|| (Math.abs(points[j].gety()) > Math.abs(points[j + 1].gety())))) {

					Point_properties temp = points[j];
					points[j] = points[j + 1];
					points[j + 1] = temp;
				}
			}
		}
	}

	private static void printpoints(Point_properties[] points) {
		for(int i = 0; i < points.length; ++i) {
			Point_properties poin = points[i];
			String employeeInSt = PointsToString(poin);
			System.out.printf("%d. %s%n", i + 1,
					employeeInSt);
	}
}

	private static String PointsToString(Point_properties points) {
		StringBuilder sb = new StringBuilder();
		sb.append(points.getName())
		  .append(" - (")
		  .append(points.getx())
		  .append(" , ")
		  .append(points.gety())
		  .append(")");
		return sb.toString();
	}
}
