package Class;

class Cal_area {
	private double pi=3.14159;
	private double radius = 10 ;
	private int length = 4;
	private int width = 5;
	private int height = 6;
	
	public void ball() {
		System.out.println("半徑 = "+radius);
		System.out.println("球形體積 = "+(4*pi*radius*radius*radius/3));
	}
	public void cube() {
		System.out.println("長 = "+length+",寬 = "+width+",高 = "+height);
		System.out.println("立方體表面積 = "+((length*width*2)+(length*height*2)+(width*height*2)));
	}
}
public class Class01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cal_area obj = new Cal_area();
		obj.ball();
		obj.cube();
	}

}
