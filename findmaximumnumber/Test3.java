package findmaximumnumber;

import org.junit.Test;

class Test3 {

	@Test
	public static Integer findMax(Integer x, Integer y, Integer z) {
		Integer max = z;
		if (y.compareTo(max) > 0) {
			max = y;
		}
		if (z.compareTo(max) > 0) {
			max = z;
		}
		return max;
	}

	public static void main(String[] args) {
		System.out.println("Maximum Number:" + findMax(78, 34, 56));
	}
}
