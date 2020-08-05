package chapter04;

public class Exercise04_03 {
	public static void main(String[] args) {

		double x1 = 33.753746;
		double y1 = -84.386330;

		double x2 = 28.538336;
		double y2 = -81.379234;
		
		double x3 = 32.076176;
		double y3 = -81.088371;
		
		double x4 = 35.227085;
		double y4 =  -80.843124;

		final double RADIUS = 6371.01;
		double d12 = RADIUS * Math
				.acos(Math.sin(Math.toRadians(x1)) * Math.sin(Math.toRadians(x2)) + Math.cos(Math.toRadians(x1)) * Math.cos(Math.toRadians(x2)) * Math.cos(Math.toRadians(y1 - y2)));
		
		double d23 = RADIUS * Math
				.acos(Math.sin(Math.toRadians(x3)) * Math.sin(Math.toRadians(x2)) + Math.cos(Math.toRadians(x3)) * Math.cos(Math.toRadians(x2)) * Math.cos(Math.toRadians(y3 - y2)));

		double d34 = RADIUS * Math
				.acos(Math.sin(Math.toRadians(x3)) * Math.sin(Math.toRadians(x4)) + Math.cos(Math.toRadians(x3)) * Math.cos(Math.toRadians(x4)) * Math.cos(Math.toRadians(y3 - y4)));
		
		double d41 = RADIUS * Math
				.acos(Math.sin(Math.toRadians(x1)) * Math.sin(Math.toRadians(x4)) + Math.cos(Math.toRadians(x1)) * Math.cos(Math.toRadians(x4)) * Math.cos(Math.toRadians(y1 - y4)));
		
		double d24 = RADIUS * Math
				.acos(Math.sin(Math.toRadians(x2)) * Math.sin(Math.toRadians(x4)) + Math.cos(Math.toRadians(x2)) * Math.cos(Math.toRadians(x4)) * Math.cos(Math.toRadians(y2 - y4)));
		
		double s1 = (d41 + d12 + d24) / 2;
		double s2 = (d34 + d24 + d23) / 2;
		double area1 = Math.pow(s1 * (s1 - d41) * (s1 - d12) * (s1 - d24), 0.5);
		double area2 = Math.pow(s2 * (s2 - d34) * (s2 - d24) * (s2 - d23), 0.5);
		System.out.println(area1 + area2);
	}

}