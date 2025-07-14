public class QS2_c {

	public static void main(String[] shah) {

		int count;
		int maxDivisors = 1;
		int numwithmax = 1;

		for (count = 2; count <= 10000; count++) 
                {
			int divisorCount = 0;
                                    for (int i = 1; i <= count; i++) {
				if (count % i == 0)
					divisorCount++;
                                                                    }

			if (divisorCount > maxDivisors) {
				maxDivisors = divisorCount;
				numwithmax = count;
			}
		}
		System.out.println("The largest number of divisors are " + maxDivisors);
		System.out.println("The number is " + numwithmax);
	}
}