class ShoppingCard {
    private List<String> items = new ArrayList<>();
    private boolean bookAdded = false;
    
    public void addItem(String item) {
        items.add(item);
        if(item.equals("Книга")) {
        bookAdded = true;
        }
    }
    
    public int getDiscountPercentage() {
    if(bookAdded) {
        return 5;
    } else {
        return 0;
    }
    }
    
    public List<String> getItems() {
        return items;
    }
}