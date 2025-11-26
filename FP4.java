import java.util.List;
import java.util.ArrayList;

class TCalc {
    private List<String> names = new ArrayList<>();
    private int tPercentage = 0;
    
    public List<String> addPerson(List<String> names, String name) {
	    List<String> updated = new ArrayList<>(names);
	    updated.add(name);
	    return updated;
    }
    
 /*   public int getDiscountPercentage(List<String> items1) {
	    if(items1.contains("Книга")) 
		    return 5;
	    else 
		    return 0;
    }
   */

    public List<String> getNames() {
        return names;
    }

    public int getTPercentage(List<String> names) {
	if(names.size() > 5) {
		return 20;
	}
	else if (names.size() > 0) {
		return 10;
	}
    	return 0;
    }	    
}


