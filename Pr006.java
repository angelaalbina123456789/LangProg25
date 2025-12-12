//Повторная генерация исключений
class Rethrow {
	public static void genException() {
		int number[] = {4,8,16,32,64,128,256,512};
		int denom[] = {2,0,4,4,0,8};

		for (int i=0; i<number.length; i++) {
			try { 
				System.out.println(number[i] + " / " + denom[i] + " равно " + number[i]/denom[i]);
			}
			catch (ArithmeticException exc) {
				//Перехват первого исключения
				System.out.println("Недопустимая арифметическая операция");
			}
			catch (ArrayIndexOutOfBoundsException exc) {
				//Перехват исключения, связанного с выходом за границы массива
				System.out.println("Сообщение из метода genException(): Выход за границы массива");
				throw exc; //Повторная генерация исключения
			}
		}
	}
}

class Pr006 {
	public static void main(String args[]) {
		try {
			Rethrow.genException();
		}
		catch (ArrayIndexOutOfBoundsException exc) {
			//Повторный перехват исключения
			System.out.println("Сообщение из метода main(): Выход за границы массива");
			System.out.println("Аварийное завершение программы");
		}
	}
}
