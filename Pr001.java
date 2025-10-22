class Gen<T> {
	//объявление переменной обобщенного типа
	T ob;
	//определение конструктора, в качестве параметра указываем объект обобщенного типа
	Gen(T o) {
		ob = o;
	}
	//метод возвращающий объект

	T getOb() {
		return ob;
	}
	//метод получающий информацию об имени типа
	void showType() {
		System.out.println("Тип T: " + ob.getClass().getName());
	}

}
class Pr001 {
	public static void main(String[] args) {
		//создаем  ссылочную переменную на объект типа Integer
		Gen<Integer> iOb;
		//присваиваем ссылку на новый объект
		iOb = new Gen<Integer>(88);
		//выводим информацию о типе объекта
		iOb.showType();
		//присваиваем целой переменной значение, хранящееся в объекте
		int v = iOb.getOb();
		System.out.println("Значение: " + v);

		System.out.println();
		//создаем ссылочную переменную на объект типа String и присваиваем ссылку на новый объект 
		Gen<String> strOb = new Gen<String>("Строка обобщеного класса");
		//выводим информацию о типе объекта
		strOb.showType();
		//присваиваем строковые переменные значения хранящееся в объекте
		String str = strOb.getOb();
		System.out.println("Значение в переменной str: " + str);
	}
}
