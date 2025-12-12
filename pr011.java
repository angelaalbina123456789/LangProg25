class NonIntResultException extends Exception {
	int n;
	int d;
	NonIntResultException(int i, int j) {
		n = i;
		d = j;
	}

	public String toString() {
		return "резкльтат " + n + " / " + d + "не является целочисленным";
	}
}
class pr011 {
	public static void main() {
		int [] numbers = {4, 8, 16, 32, 64, 128, 256, 512};
		int [] denom = {2, 0, 4, 4, 0, 8};
		for(int i=0; i<numbers.length; i++) {
			try {
				if((numbers[i]%2) != 0)
						throw new NonIntResultException(numbers[i], denom[i]);
						System.out.println(numbers[i] + " / " + denom[i] + " равнo " + numbers[i]/denom[i]);
			}
			catch (ArithmeticException exc) {
				System.out.println("");
			}
			catch (ArrayIndexOutOfBoundsException exc) {
				System.out.println("");
			}
			catch (NonIntResultException exc) {
				System.out.println(exc);
		}	}
	}
}
		
