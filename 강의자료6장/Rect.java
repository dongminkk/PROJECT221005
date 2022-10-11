package 강의자료6장;

class Rect {
	int width;
	int height;

	public Rect(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public boolean equals1(Object obj) {
		Rect p = (Rect) obj;
		if (width * height == p.width * p.height)
			return true;
		else
			return false;
	}
}