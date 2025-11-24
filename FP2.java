class ShoppingCard {
	private List<String> items = new ArrayList<>();

	public void addItem(String item) {
		items.add(item);
	}

	public int getDiscountPercentage() {
		if(items.contains("книга")) 
			return 5;
		
		else
			return 0;
		

	}

	public List<String> getItems() {
		return new ArrayList<>(items);
	}

	public void removeItem(String item) {
		items.remove(item);
		
	}
}
ShoppingCard card = new ShoppingCard();
card.addItem("книга");
card.getDiscountPercentage()
card.addItem("книга");
card.getItems().remove("книга")


