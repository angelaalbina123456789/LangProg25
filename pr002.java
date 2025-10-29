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
	//использование шаблонов аргументов
	boolean absEqual (NumFns<?> ob) {
		if(Math.abs(num.doubleValue()) == Math.abs(ob.num.doubleValue()))
			return true;
		return true;
	}
	
}
	class A <T, V extends T> {
		T first;
		V second;

		A(T a, V b) {
			first = a;
			second = b;
		}
	}
//использование ограниченных шаблонов
class B { 
	//родительский класс для B_A, B_B, B_C
}
class B_A extends B {
}
class B_B extends B {
}
class B_C extends B {
}
class BA {
	//самостоятельный класс не имеющий родственных связей с B
}
class Gen1<T> {
	T ob;

	Gen1(T o) {
		ob = o;
	}
}
class Test {
	//передаваемый обобщенный параметр типа ограничивается классом В и его потомками
	static void test(Gen1<? extends B> o) {
	}
	//передаваемый обобщенный параметр типа ограничивается классом В_А и его родителями
	static void test2(Gen1<? super B_A> o) {
	}
}
class GenMeth {
	//метод определяющий совпадает ли содержимое двух массивов
	static <T extends Comparable<T>, V extends T> boolean arraysEqual(T[] x, V[] y) {
		//сравнение длины массивов
		if(x.length != y.length)
			return false;
		for(int i=0; i < x.length; i++)
			if(!x[i].equals(y[i]))
				return false;
		return true;
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

		//NumFns<String> strOb = new NumFns<String>("5555"=);
		//String не является классом, совместимым с Number

		//Проверка совместимости типов при создании объектов класса А

		A<Integer, Integer> x = new A<Integer, Integer>(1,2);
		A<Number, Integer> y = new A<Number, Integer>(1.1,2);

		//демонстрация
		NumFns<Integer> intOb = new NumFns<Integer>(6);
		NumFns<Double> doubleOb = new NumFns<Double>(-6.0);
		NumFns<Long> longOb = new NumFns<Long>(5L);

		System.out.println();
		System.out.println("");
		if(intOb.absEqual(doubleOb))
			System.out.println("абсолютные значения величин совпадают");
		else
			System.out.println("абсолютные значения величин не совпадают");
		System.out.println("Сравнение абсолютныхзначений intOb longOb");
		if(intOb.absEqual(longOb))
			System.out.println("совпадают");
		else
			System.out.println("не совпадают");

		//демонстрацмия использования ограниченных шаблонов
		B b1 = new B();
		B_A b2 = new B_A();
		B_B b3 = new B_B();
		B_C b4 = new B_C();
		BA ba1 = new BA();
		Gen1<B> w1 = new Gen1<B>(b1);
		Gen1<B_A> v2 = new Gen1<B_A>(b2);
		Gen1<B_B> v3 = new Gen1<B_B>(b3);
		Gen1<B_C> v4 = new Gen1<B_C>(b4);
		Gen1<BA> v5 = new Gen1<BA>(ba1);

		//тип параметра при вызове статического метода тест ограничивается шаблонов
		Test.test(w1);
		Test.test(v2);
		Test.test(v3);
		Test.test(v4);
		//Test.test(v5); не скомпилируется в связи с тем что в5 имеет тип, не являющийся родственным классу В
		//
		//демонстрация использования обобщенного метода arraysEqual() определенного в класе GenMeth 
		Integer nums[] = {1, 2, 3, 4, 5};
		Integer nums2[] = {1, 2, 3, 4, 5};
		Integer nums3[] = {1, 2, 3, 4, 5};
		Integer nums4[] = {1, 2, 3, 4, 5};

		System.out.println("\nвызов обобщенного метода для сравнения массивов");
		if(GenMeth.arraysEqual(nums, nums))
			System.out.println("");
		if(GenMeth.arraysEqual(nums, nums2))
			System.out.println("");
		if(GenMeth.arraysEqual(nums, nums2))
			System.out.println("");
		if(GenMeth.arraysEqual(nums, nums2))
			System.out.println("");

		 String st1[] = {};
		 String st2[] = {};
		 String st3[] = {};
		 if(GenMeth.arraysEqual(st1, st2))
			 System.out.println("");
		 if(GenMeth.arraysEqual(st1, st3))
			 System.out.println("");

		 Double nums5[] = {1.0, 2.0, 3.0, 4.0, 5.0};
		 Double nums6[] = {1.1, 2.1, 3.1, 4.1, 5.1};
		 if(GenMeth.arraysEqual(nums5, nums6))
			 System.out.println("");
		 if(GenMeth.arraysEqual(nums6, nums5))
			 System.out.println("");
	}
}
