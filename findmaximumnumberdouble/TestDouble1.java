package findmaximumnumberdouble;

import org.junit.Test;

class TestDouble1 {

	@Test
	public static Double findMax(Double x, Double y, Double z) {
		Double max = x;
		if (y.compareTo(max) > 0) {
			max = y;
		}
		if (z.compareTo(max) > 0) {
			max = z;
		}
		return max;
	}

	public static void main(String[] args) {
		System.out.println("Maximum Number:" + findMax(23.34, 20.67, 21.01));
	}
}
