package Class;

class Date {
	private String name;
	private Test score;
	
	class Test{
		private int english;
		private int math;
		
		public Test(int eng, int m) {
			english = eng;
			math = m;
		}
		public double avg() {
			return (english + math)/2;
		}
	}
	public Date(String na, int eng, int m) {
		name = na;
		score = new Test(eng,m);
	}
	public void show() {
		System.out.println("name:"+name);
		System.out.println("avg=")
	}
	
}
public class Class03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
