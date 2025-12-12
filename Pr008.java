class UseFinally {
	public static void genException(int what) {
		int t;
		int[] nums = new int[2];
		System.out.println("Получено: " + what);
		try {
			switch (what) {
				case 0:
					t = 10/what; //деление на ноль
					break;
				case 1:
					nums[4] = 10; //выход за границы массива
					break;
				case 2: 
					return; //выход из блока try
			}
		}
		catch (ArithmeticException exc) {
			System.out.println("Ошибочная арифметическая операция");
			return;
		}
		catch (ArrayIndexOutOfBoundsException exc) {
			System.out.println("Не найден элемент массива");
		}
		finally {
			System.out.println("Выход из блоков try/catch");
		}
	}
}
class Pr008 {
	public static void main(String args[]) {
		for(int i=0; i<3; i++) {
			UseFinally.genException(i);
			System.out.println();
		}
	}
}
