package task_from_teacher_1;

/**
 * 
 * @author Jakob Medvedevv
 * 
 *         Задача от преподавателя(Жени) №1.
 * 
 *         Дан массив точек. Каждая точка характеризуется координатами х, у и
 *         названием точки. Сортировать точки в массиве по возрастанию удаления
 *         расстояния точки от начала координат и вывести их на экран
 *
 */

public class Points {

	/**
	 * Создаем массив точек и инициализируем их.
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		final int pointsCount = 6;
		PointProperties[] points = new PointProperties[pointsCount];
		points[0] = new PointProperties("A", 7, -3);
		points[1] = new PointProperties("B", 1, 1);
		points[2] = new PointProperties("C", 8, 3);
		points[3] = new PointProperties("D", -5, -4);
		points[4] = new PointProperties("E", 6, 4);
		points[5] = new PointProperties("X", 0, 0);

		bubbleSortx(points);
		printpoints(points);
	}

	/**
	 * В этом методе отдельно проводится расчет расстояния от точки до начала
	 * координат по формуле.
	 * 
	 * @param getX
	 * @param getY
	 * @return
	 */

	public static double distanceToZero(int getX, int getY) {
		return Math.sqrt((Math.pow(getX, 2)) + (Math.pow(getY, 2)));
	}

	/**
	 * Здесь сравниваются расстояния двух точек до начала координат и проводится
	 * "пузырьковая" сортировка.
	 * 
	 * @param points
	 */

	public static void bubbleSortx(PointProperties[] points) {
		for (int i = points.length - 1; i > 0; --i) {
			for (int j = 0; j < i; ++j) {
				double a = distanceToZero(points[j].getX(), points[j].getY());
				double b = distanceToZero(points[j + 1].getX(), points[j + 1].getY());
				if (a > b) {
					PointProperties temp = points[j];
					points[j] = points[j + 1];
					points[j + 1] = temp;
				}
			}
		}
	}

	/**
	 * Вывод результатов.
	 * 
	 * @param points
	 */

	private static void printpoints(PointProperties[] points) {
		for (int i = 0; i < points.length; ++i) {
			PointProperties poin = points[i];
			String employeeInSt = PointsToString(poin);
			System.out.printf("%d. %s%n", i + 1, employeeInSt);
		}
	}

	/**
	 * Создание строки для чтения результатов.
	 * 
	 * @param points
	 * @return
	 */

	private static String PointsToString(PointProperties points) {
		StringBuilder sb = new StringBuilder();
		sb.append(points.getName())
		  .append(" - (")
		  .append(points.getX())
		  .append(" , ")
	      .append(points.getY())
		  .append(")");
		return sb.toString();
	}
}
