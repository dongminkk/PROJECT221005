package 강의자료6장;

public class EqualsEx1 {
	public static void main(String[] args) {
		Rect a = new Rect(2, 3);
		Rect b = new Rect(3, 2);
		Rect c = new Rect(3, 4);
		if (a.equals1(b))
			System.out.println("a is equal to b");
		if (a.equals1(c))
			System.out.println("a is equal to c");
		if (b.equals1(c))
			System.out.println("b is equal to c");
	}
}