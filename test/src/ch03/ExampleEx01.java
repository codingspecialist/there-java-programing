package ch03;

public class ExampleEx01 {
	
	static double calc(double gasoline, double distance) {
		System.out.println(distance/gasoline);
		int e = (int) (distance/gasoline);
		return e;
	}

	public static void main(String[] args) {
		double gasoline = 8.86;
		double distance = 182.736;
		double efficiency = calc(gasoline, distance);
		System.out.println("¿¬ºñ : "+efficiency+" km/L");
	}

}
