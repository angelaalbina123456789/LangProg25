//повторная генераци исключений
class Rethrow {
	public static void genException() {
		int number[] = {4, 8, 16, 32, 64, 128, 256, 512};
		int denom[] = {2, 0, 4, 4, 0, 8};

		for (int i=0; i<number.length; i++) {
			try { //
				System.out.println(number[i] + " / " + denom[i] + " равно " + number[i]/denom[i]);

			}
			catch (ArithmeticException exc) {
				//перехват первого исключения
				System.out.println("недопустимая арифметическая операция");
			}
			catch (ArrayIndexOutOfBoundsException exc) {
				//перехват исключения связанного с выходом за границы массива
				System.out.println("сообщение из метода gen Exception Выход за границы массива");
				throw exc; //повторная генерация исключения

			}
		}
	}
}

class pr006 {
	public static void main(String args[]) {
		try {
			Rethrow.genException();
		}
		catch (ArrayIndexOutOfBoundsException exc) {
			//повторный перезват исключения
			System.out.println("сообщение из метода main() :выход за границы массива");
			System.out.println("аварийное завершения программы");
		}
	}
}
	

