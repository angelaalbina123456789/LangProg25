class ExcTest {
	//
	static void genException() {
		int nums[] = new int[4];
		System.out.println("до исключительной ситуации");
		nums[8]= 10;
		System.out.println("строка после исключительной ситуации внутри блока");
	}
}

//получение подробной информации об исключении при помощи методов класса Throwable
class pr007 {
	public static void main(String args[]) {
		int nums[] = new int[4];
		//блок, в котром может возникнуть исключительная ситуация
		//
		int number[] = {4, 8, 16, 32, 64, 128};
		int denom[] = {2, 0, 4, 4, 0, 8};
		for(int i=0; i<number.length; i++) {
			try {
			/*
			System.out.println("до исключитлеьной ситуации");
			nums[8] = 10;
			System.out.println("строка после инсключительной ситуации внутри брока");
			*/
			//генерация исключительной ситуации при вызове статического метода genException
			//ExcTest.genException();
			System.out.println(number[i] + " / " + denom[i] + " равно " + number[i]/denom[i]);		
		
		}
		//ext - переменная содержающая ссылку на объект исключения 
		//ArrayIndexOutOfBoundsException -класс исключинительной ситуации
		//catch {...} блок перехваат исключения
		
			catch(ArrayIndexOutOfBoundsException exc) {
				System.out.println("исключительная ситуация выход из границы массива");
				System.out.println(exc);
				System.out.println("\n   трасиовка стека: ");
				exc.printStackTrace();
			}
			//обработка событий классса arithmeticException
			/*	
			catch(ArithmeticException exc2) {
				System.out.println("исключительная ситуация неверная арифметическая операция");
			}
			System.out.println("после оператора catch");
			*/

			catch (Throwable exc) {
				System.out.println("исключения для которог не написан специфическтй обработчик");
			}
		}
		
	}
}
