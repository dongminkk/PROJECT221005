package 연습문제6장;
class Circle1{
	private int x,y,r;
	public Circle1(int x,int y,int r) {
		this.x=x;
		this.y=y;
		this.r=r;
	}
	public String toString() {
		return "Circle("+x+","+y+")반지름"+r;
	}
	public boolean equals(Circle1 a) {
		return x==a.x&&y==a.y&&r==a.y;
	}
	
}
 
public class Q2 {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle1 a= new Circle1(2, 3, 5);
		Circle1 b= new Circle1(2, 3, 30);
		System.out.println("원 a : "+a);
		System.out.println("원 b : "+b);
		if(a.equals(b)) {
			System.out.println("같은 원");
		}
		else {
			System.out.println("다른 원");
		}
	}
 
}