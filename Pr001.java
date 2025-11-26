class Gen<T> {
	//Объявление переменной обобщённого типа
	T ob;
	//Определение конструктора, в качестве параметра указываем объект обобщённого типа
	Gen(T o) {
		ob = o;
	}
	//Метод, возвращающий объект
	T getOb() {
		return ob;
	}
	//Метод, получающий информацию об имени типа
	void showType() {
		System.out.println("Тип T: " + ob.getClass().getName());
	}
}
class TwoGen<T,V> { 
	//Объявление переменных обобщённых типов
	T ob1;
	V ob2;
	//Определение конструктора, в качестве параметров указываем объекты обобщённых типов
	TwoGen(T o1, V o2) {
		ob1 = o1;
		ob2 = o2;
	}
	//Методы, возвращающие соответствующие объекты
	T getOb1() {
		return ob1;
	}
	V getOb2() {
		return ob2;
	}
	//Методы, получающие информацию об имени типов
	void showTypes() {
		System.out.println("Тип T: " + ob1.getClass().getName());
		System.out.println("Тип V: " + ob2.getClass().getName());
	}
}

class Pr001 {
	public static void main(String[] args) {
		Gen<String> strOb = new Gen<String>("Один обобщённый тип");
		String str = strOb.getOb();
		System.out.println("Значение обобщённого типа с одним параметром: "  + str);
		//Создаём ссылочную переменную на объекты Integer и String
		TwoGen<Integer, String> tgOb;
		//Присваиваем ссыку на новые объекты
		tgOb = new TwoGen<Integer, String>(88, "Обобщения");
		//Выводим информацию о типе объектов
		tgOb.showTypes();
		//Присваиваем целой переменной значение, хранящееся в первом объекте
		int v = tgOb.getOb1();
		System.out.println("Значение: " + v);

		System.out.println();
		//Присваиваем строковой переменной значение, хранящееся во втором объекте
		str = tgOb.getOb2();
		System.out.println("Значение в переменной str: " + str);
	}
}
