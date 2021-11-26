package findmaximumnumberdouble;

import org.junit.Test;

class TestDouble2 {

	@Test
	public static Double findMax(Double x, Double y, Double z) {
		Double max = y;
		if (y.compareTo(max) > 0) {
			max = y;
		}
		if (z.compareTo(max) > 0) {
			max = z;
		}
		return max;
	}

	public static void main(String[] args) {
		System.out.println("Maximum Number:" + findMax(34.34, 123.67,121.01));
	}
}
