package demo;

public class CalculateDistance {

	public static void main(String[] args) {
		int x1=8;
		int x2=8;
		int y1=7;
		int y2=7;
		int x3=6;
		int x4=6;
		int y3=7;
		int y4=7;
		
		double distanceOfLine1 = (Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2)));
		double distanceOfLine2 = (Math.sqrt(Math.pow(x4-x3,2)+Math.pow(y4-y3,2)));
		System.out.println("The length of First Line i.e (x2-x1)+(y2-y1) = " + distanceOfLine1);
		System.out.println("The Length of Second Line i.e (x4-x3) +(y4-y3) = " + distanceOfLine2);
		 Integer obj1 = new Integer((int)distanceOfLine1); 
		 Integer obj2 = new Integer((int)distanceOfLine2);
		  System.out.println("these lines are equal:" + " " +obj1.equals(obj2));
				 

	}

}
