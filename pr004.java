class pr004 {
	public static void main(String args[]) {
		int number[] = {4, 8, 16, 32, 64, 128};
		int denom[] = {2, 0, 4, 4, 0, 8};

		try { //внешний блок
		      for (int i=0; i<number.length; i++) {
			      try { //внутрений блок
				    System.out.println(number[i] + " / " + denom[i] + " равно  " + number[i]/denom[i]);
			      }
			      catch (ArithmeticException exc) {
				      System.out.println("недопустимая арифметическая операция");
				       }
			}
		}
		catch (ArrayIndexOutOfBoundsException exc) {
			System.out.println("");
			System.out.println("");
		}
	}

}


			
