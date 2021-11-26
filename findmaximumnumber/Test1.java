package findmaximumnumber;

import org.junit.Test;

class Test1 {

	@Test
	public static Integer findMax(Integer x, Integer y, Integer z) {
		Integer max = x;
		if (y.compareTo(max) > 0) {
			max = y;
		}
		if (z.compareTo(max) > 0) {
			max = z;
		}
		return max;
	}

	public static void main(String[] args) {
		System.out.println("Maximum Number:" + findMax(23, 20, 21));
	}
}
