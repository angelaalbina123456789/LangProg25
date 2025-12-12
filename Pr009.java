//Использование инструкции throws
class ThrowsDemo {
	public static char prompt(String str) throws java.io.IOException {
		System.out.print(str + ": ");
		return (char) System.in.read();
	}
}
class Pr009 {
	public static void main(String[] args) {
		char ch;
		try {
			ch = ThrowsDemo.prompt("Введите символ");
		}
		catch(java.io.IOException exc) {
			System.out.println("Исключительная ситуация при операции ввода");
			ch = (char) 0;
		}
		System.out.println("Был введён символ " + ch);
	}
}
