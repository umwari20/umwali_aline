package question_five;

public class Test {
	
	    public static void main(String[] args) {
	       
	        Car myCar = new Car("FERARY", 2016);
	        System.out.println("car: " + myCar.getMake() + " " + myCar.getYearModel());

	        
	        CellPhone myPhone = new CellPhone("SAMSUNG", "A_30", 200000);
	        System.out.println("phone: " + myPhone.getManufacturer() + " " + myPhone.getModel() + " PRICE" + myPhone.getRetailPrice());
	    }
	}




