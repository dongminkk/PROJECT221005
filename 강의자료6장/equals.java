package 강의자료6장;

class Point3 {
	int x, y;

	public Point3(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public boolean equals(Object obj) {
		Point3 p = (Point3) obj;
		if (x == p.x && y == p.y)
			return true;
		else
			return false;
	}
}