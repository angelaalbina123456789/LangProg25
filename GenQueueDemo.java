class GenQueueDemo {
	public static void main(String[] args) {

		//Создаём фиксированную очередь из Integer
		Integer[] iArray = new Integer[4];
		GenQueue<Integer> q = new GenQueue<Integer>(iArray);
		Integer iVal;
		System.out.println("Операции с очередью из Integer");
		try {
			for(int i=0; i < 6; i++) {
				System.out.println("Добавляем " + i + " в очередь q");
				q.put(i); 
			}
		}
		catch (QueueFullException exc) {
			System.out.println(exc);
		}
		System.out.println();
		try {
			for (int i = 0; i < 5; i++) {
				System.out.print("Извлечение элемента Integer из q: ");
				iVal = q.get();
				System.out.println(iVal);
			}
		}
		catch (QueueEmptyException exc) {
			System.out.println(exc);
		}
		System.out.println();

		//Создаём фиксированную очередь из String
		String[] sArray = new String[10];
		GenQueue<String> q1 = new GenQueue<String>(sArray);
		String sVal;
		System.out.println("Операции с очередью из String");
		try {
			for(int i=0; i < 5; i++) {
				System.out.println("Добавляем строку " + i + " в очередь q1");
				q1.put("Строка " + i);
			}
		}
		catch (QueueFullException exc) {
			System.out.println(exc);
		}
		System.out.println();
		try {
			for (int i=0; i<5; i++) {
				System.out.print("Извлечение строки из q1: ");
				sVal = q1.get();
				System.out.println(sVal);
			}
		}
		catch (QueueEmptyException exc) {
			System.out.println(exc);
		}
		System.out.println();

		//Создаём кольцевую очередь из Integer
		Integer[] iArray1 = new Integer[4];
		GenCircQueue<Integer> q2 = new GenCircQueue<Integer>(iArray1);
		System.out.println("Операции с кольцевой очередью из Integer");
		try {
			for(int i=0; i < 3; i++) {
				System.out.println("Добавляем " + i + " в очередь q2");
				q2.put(i); 
			}
		}
		catch (QueueFullException exc) {
			System.out.println(exc);
		}
		System.out.println();
		try {
			for (int i = 0; i < 3; i++) {
				System.out.print("Извлечение элемента Integer из q2: ");
				iVal = q2.get();
				System.out.println(iVal);
			}
		}
		catch (QueueEmptyException exc) {
			System.out.println(exc);
		}
		System.out.println();
		try {
			for(int i=3; i < 7; i++) {
				System.out.println("Повторно добавляем " + i + " в очередь q2");
				q2.put(i); 
			}
		}
		catch (QueueFullException exc) {
			System.out.println(exc);
		}
		System.out.println();
	}
}
