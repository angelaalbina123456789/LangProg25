//обобщенные типы ограничиваются только теми классами которые расширяют класс Number
class NumFns<T extends Number> {
	T num;
	NumFns(T n) {
		num = n;
	}
	//получение обратной величины num
	double inverse() {
		return 1/num.doubleValue();
	}
	//получение целой части num
	double whole() {
		return num.intValue();
	}
	//получение дробной части num
	double dr() {
		return num.doubleValue() - num.intValue();
	}
}
class pr002 {
	public static void main(String args[]) {
		NumFns<Integer> iOb = new NumFns<Integer>(5);

		System.out.println("обратная величина iOb - " + iOb.inverse());
		System.out.println("целвая часть iOb - " + iOb.whole());
		System.out.println("дробная часть iOb - " + iOb.dr());

		NumFns<Double> dOb = new NumFns<Double>(10.14);

		System.out.println("обраьтная величина dOb - " + dOb.inverse());
		System.out.println("целая часть dOb - " + dOb.whole());
		System.out.println("дробная часть dOb - " + iOb.dr());

		//NumFns<String> strOb = new NumFns<String>("5555");
		//String не является классом, совместимым с Number


	}
}
