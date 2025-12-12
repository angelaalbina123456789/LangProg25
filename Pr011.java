class NonIntResultException extends Exception {
	int n;
	int d;
	NonIntResultException(int i, int j) {
		n = i;
		d = j;
	}

	public String toString() {
		return "Результат " + n + " / " + d + " не является целочисленным";
	}
}
class Pr011 {
	public static void main(String args[]) {
		int [] numbers = {4, 8, 15, 32, 64, 127, 256, 512};
		int [] denom = {2, 0, 4, 4, 0, 8};
		for(int i=0; i<numbers.length; i++) {
			try {
				if((numbers[i]%2) != 0)
						throw new NonIntResultException(numbers[i], denom[i]);
				System.out.println(numbers[i] + " / " + denom[i] + " равно " + numbers[i]/denom[i]);
			}
			catch (ArithmeticException exc) {
				System.out.println("Недопустимая арифметическая операция");
			}
			catch (ArrayIndexOutOfBoundsException exc) {
				System.out.println("Выход за границы массива");
			}
			catch (NonIntResultException exc) {
				System.out.println(exc);
			}
		}
	}
}
