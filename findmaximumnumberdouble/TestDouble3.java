package findmaximumnumberdouble;

import org.junit.Test;

class TestDouble3 {

	@Test
	public static Double findMax(Double x, Double y, Double z) {
		Double max = z;
		if (y.compareTo(max) > 0) {
			max = y;
		}
		if (z.compareTo(max) > 0) {
			max = z;
		}

		return max;
	}

	public static void main(String[] args) {
		System.out.println("Maximum Number:" + findMax(223.34, 520.67, 421.01));

	}
}
