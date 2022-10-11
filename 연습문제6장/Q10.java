package 연습문제6장;

import java.util.Random;
import java.util.Scanner;

class Person {
	String name;
	int r1, r2, r3;
	Scanner sc;

	public Person(String name) {
		this.name = name;
		sc = new Scanner(System.in);
	}

	public boolean run() {
		System.out.print("[" + name + "]:<Enter>");
		String enter = sc.nextLine();
		Random r = new Random();
		r.setSeed(System.currentTimeMillis());
		r1 = r.nextInt(3) + 1;
		r2 = r.nextInt(3) + 1;
		r3 = r.nextInt(3) + 1;

		System.out.print("\t" + r1 + "\t" + r2 + "\t" + r3 + "\t");
		if (r1 == r2 && r2 == r3) {
			System.out.println(name + "님이 이겼습니다!");
			return true;
		} else {
			System.out.println("아쉽군요!");
			return false;
		}
	}
}

public class Q10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("1번째 선수 이름>>");
		String n = sc.next();
		Person a = new Person(n);
		System.out.print("2번째 선수 이름>>");
		n = sc.next();
		Person b = new Person(n);
		while (true) {
			if (a.run())
				break;
			if (b.run())
				break;

		}
	}
}