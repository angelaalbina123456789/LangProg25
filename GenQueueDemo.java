class GenQueueDemo {
	public static void main(String[] args) {
		//создаем очередь из integer
		Integer[] iArray = new Integer[4];
		GenQueue<Integer> q = new GenQueue<Integer>(iArray);
		Integer iVal;
		System.out.println("");
		try {
			for(int i=0; i<5; i++) {
				System.out.println("добавляем" + i + "в очередь q");
				q.put(i);
			}
		}
		catch (QueueFullException exc) {
			System.out.println(exc);
		}
		System.out.println();
		try {
			for (int i=0; i<5; i++) {
				System.out.println("извлечение элемента integer из й");
				iVal = q.get();
				System.out.println(iVal);
			}
		}
		catch (QueueEmptyException exc) {
			System.out.println(exc);
		}
		System.out.println();

		//создаем фиксированную очередь 
		Integer[] iArray1 = new Integer[4];
		GenCircQueue<Integer> q2 = new GenircQueue<Integer>(iArray1);
		System.out.println("");
		try {
			for(int i=0; i<5; i++) {
				System.out.println("");
				sVal = q1.get();
				System.out.println(sVal);
			}
		}
		catch (QueueEmptyException exc) {
			System.out.println(exc);
		}
		System.out.println();
		try {
			for (int i=0; i<4; i++) {
				System.out.println("");
				iVal = q2.get();
				System.out.println(iVal);
			}
		}
		catch (QueueFullException exc) {
			System.out.println(exc);
		}
		System.out.println();

		//создаем кольцевую очередь из integer



	}
}
