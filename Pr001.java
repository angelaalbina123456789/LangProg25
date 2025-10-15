class Gen<T> {
	T ob;
	Gen(T o) {
		ob = j;
	}

	T get() {
		return ob;
	}

	void showType() {
		System.out.println("Тип T: " + ob,getClass().getName());
	}

}
class Pr001 {
	public static void main(String[] args) {
		Gen<Integer> iOb;
		iOb = new Gen<Integer>(88);
		iOb.showType();
		int v = iOb.getOb();
		System.out.println("Значение: " + v);
	}
}
