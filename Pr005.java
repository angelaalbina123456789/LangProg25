class Pr005 {
	public static void main(String args[]) {
		try { //Генерация исключения "вручную"
		      System.out.println("До оператора throw");
		      throw new ArithmeticException();
		}
		catch (ArithmeticException exc) {
			System.out.println("Перехват исключения класса ArithmeticException");
		}

		System.out.println("После catch");
	}
}
