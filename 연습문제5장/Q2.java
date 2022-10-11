package 연습문제5장;

class TV {
	private int size;

	public TV(int size) {
		this.size = size;
	}

	protected int getSize() {
		return size;
	}
}

class ColorTV extends TV {
	private int numColor;

	public ColorTV(int size, int numColor) {
		super(size);
		this.numColor = numColor;
	}

	public void printProperty() {
		System.out.println(getSize() + "인치 " + numColor + "컬러");
	}

	public int getColor() {
		return numColor;
	}
}

public class Q2 {

	public static void main(String[] args) {
		IPTV iptv = new IPTV("192.1.1.2", 32, 2048);

		iptv.printProperty();
	}
}

class IPTV extends ColorTV {
	private String IP;

	public IPTV(String IP, int size, int numColor) {
		super(size, numColor);
		this.IP = IP;
	}
	@Override
	public void printProperty() {
		System.out.println("나의 IPTV는 " + IP + " 주소의 " + getSize() + "인치 " + getColor() + "컬러");
	}
}
