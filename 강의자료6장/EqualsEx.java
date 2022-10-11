package 강의자료6장;

public class EqualsEx {
	public static void main(String[] args) {
		Point3 a = new Point3(2, 3);
		Point3 b = new Point3(2, 3);
		Point3 c = new Point3(3, 4);
		if (a == b)
			System.out.println("a==b");
		if (a.equals(b)) 
			System.out.println("a is equal to b");
		if (a.equals(c)) 
			System.out.println("a is equal to c");
	}
}