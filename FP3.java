class ShoppingCard {
    private List<String> items = new ArrayList<>();
    
    public void addItem(String item) {
        items.add(item);
    }
    
    public int getDiscountPercentage(List<String> items1) {
	    if(items1.contains("Книга")) 
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

class FP3 {
	public static void main(String args[]) {
		//
		ShoppingCard card = new ShoppingCard();
		card.addItem("Флешка");
		card.addItem("Диск");
		card.addItem("Сматрфон");
		card.addItem();
		card.addItem.remove("Смартфон");
		card.addItem();
		card.getDiscountPercentage(card.getItems());
		ShoppingCard card2 = new ShoppingCard();
		card2.addItem("Книга");
		System.out.println("Скидка для " + card.getDiscountPercentage(card.getItem()));
		card2.removeItem("Книга");
		card.getDiscountPercentage(card2.getItems());
		System.out.println("Скидка для " + card2.getDiscountPercentage(card2.getItem()));
	}
}

