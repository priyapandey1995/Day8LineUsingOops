package demo;

public class CalculateDistance {

	public static void main(String[] args) {
			int x1=2;
			int x2=8;
			int y1=8;
			int y2=2;
			//formula:sqrt(x2-x1)^2 + (y2-y1)^2
			//double distance=Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
			double distance=Math.floor(Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2)));
			System.out.println(distance);

	}

}
