package 강의자료6장;

class Point1 {
	int x, y;

	public Point1(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class ObjectPropertyEx {
	public static void print(Object obj) {
		System.out.println(obj.getClass().getName());
		System.out.println(obj.hashCode());
		System.out.println(obj.toString());
		System.out.println(obj);
	}

	public static void main(String[] args) {
		Point1 p = new Point1(2, 3);
		print(p);
	}
}