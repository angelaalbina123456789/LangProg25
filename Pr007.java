class ExcTest {
	//Генерация исключительной ситуации
	static void genException() {
		int nums[] = new int[4];
		System.out.println("До исключительной ситуации");
		nums[8] = 10;
		System.out.println("Строка после исключительной ситуации внутри блока try");
	}
}
//Получение подробной информации об исключении при помощи методов класса Throwable
class Pr007 {
	public static void main(String args[]) {
		int nums[] = new int[4];
		//Блок, в котором может возникнуть исключительная ситуация

		int number[] = {4, 8, 16, 32, 64, 128, 256, 512};
		int denom[] = {2, 0, 4, 4, 0, 8};
		for(int i=0; i<number.length; i++) {
			try {
				/* Генерация исключительной ситуации внутри метода main()
				System.out.println("До исключительной ситуации");
				nums[8] = 10;
				System.out.println("Строка после исключительной ситуации внутри блока try");
				*/
				//Генерация исключительной ситуации при вызове статического метода genException()
				System.out.println(number[i] + " / " + denom[i] + " равно " + number[i]/denom[i]);
				//ExcTest.genException();
			}

		//exc - переменная, содержащая ссылку на объект исключения
		//ArrayIndexOutOfBoundsException - класс исключительной ситуации
		//catch {...} = блок перехвата исключения
		
			catch(ArrayIndexOutOfBoundsException exc) {
				System.out.println("Исключительная ситуация: выход за границы массива");
				System.out.println(exc);
				System.out.println("\nТрассировка стека: ");
				exc.printStackTrace();
				System.out.println("Информация об исключении, представляемая методом toString():");
				System.out.println(exc.toString());
			}
		
		//Обработка событий класса ArithmeticException
		/*
			catch(ArithmeticException exc2) {
				System.out.println("Исключительная ситуация: неверная арифметическая операция");
			}
			System.out.println("После оператора catch");
		*/
		//Использование класса Throwable для обработки всех видов исключений
			catch (Throwable exc) {
				System.out.println("Исключение, для которого не написан специфический обработчик");
			}
		}
	}
}
