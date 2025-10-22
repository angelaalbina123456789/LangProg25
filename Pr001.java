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
class TwoGen<T,V> {
	//
	T ob1;
	V ob2;
	//
	TwoGen(T o1, V o2) {
		ob1 = o1;
		ob2 = o2;
	}
	//
	T getOb1() {
		return ob1;
	}
	V getOb2() {
		return ob2;
	}
	//методы получающее информацию об имени типов
	void showTypes() {
		System.out.println("Тип T: " + ob1.getClass().getName());
		System.out.println("Тип V: " + ob2.getClass().getName());
	}
}



class Pr001 {
	public static void main(String[] args) {
		Gen<String> strOb = new Gen<String>("один обобщеный тип");
		String str = strOb.getOb();
		System.out.println("значение обобщеного типа с одним параметром" + str);
		//создаем  ссылочную переменную на объект типа Integer
		TwoGen<Integer, String> tgOb;
		//присваиваем ссылку на новый объект
		tgOb = new TwoGen<Integer, String>(88, "обобщение");
		//выводим информацию о типе объекта
		tgOb.showTypes();
		//присваиваем целой переменной значение, хранящееся в объекте
		int v = tgOb.getOb1();
		System.out.println("Значение: " + v);

		System.out.println();
		//присваиваем строковой переменной значение хранящее во втром объекте
		str = tgOb.getOb2();
		System.out.println("Значение в переменной str: " + str);
	}
}
