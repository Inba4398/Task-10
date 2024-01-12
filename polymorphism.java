package Task10;

public class polymorphism {
	public class Tea {
	    protected boolean hotWater;
	    protected boolean teaLeaves;
	    protected boolean milk;
	    protected boolean sugar;

	    // Constructor to initialize Tea with hot water and tea leaves
	    public Tea() {
	        hotWater = true;
	        teaLeaves = true;
	        milk = false;
	        sugar = false;
	    }

	    // Method to add milk to the basic tea
	    public void addMilk() {
	        if (hotWater && teaLeaves) {
	            milk = true;
	            System.out.println("Milk added to the tea.");
	        } else {
	            System.out.println("Cannot add milk without hot water and tea leaves.");
	        }
	    }

	    // Method to add sugar to the basic tea
	    public void addSugar() {
	        if (hotWater && teaLeaves) {
	            sugar = true;
	            System.out.println("Sugar added to the tea.");
	        } else {
	            System.out.println("Cannot add sugar without hot water and tea leaves.");
	        }
	    }

	    // Method to prepare and display the status of the tea
	    public void prepareTea() {
	        if (hotWater && teaLeaves) {
	            System.out.println("Tea is prepared.");
	            if (milk) {
	                System.out.println("Tea with milk.");
	            }
	            if (sugar) {
	                System.out.println("Tea with sugar.");
	            }
	        } else {
	            System.out.println("Tea preparation incomplete. Ensure hot water and tea leaves are present.");
	        }
	    }
	}

	class BlackTea extends Tea {
	    @Override
	    public void prepareTea() {
	        System.out.println("Preparing Black Tea.");
	        System.out.println("Brewing black tea leaves in hot water.");
	        if (milk) {
	            System.out.println("Adding milk to black tea.");
	        }
	        if (sugar) {
	            System.out.println("Adding sugar to black tea.");
	        }
	    }
	}

	class GreenTea extends Tea {
	    @Override
	    public void prepareTea() {
	        System.out.println("Preparing Green Tea.");
	        System.out.println("Steeping green tea leaves in hot water.");
	        if (milk) {
	            System.out.println("Adding a small amount of milk to green tea (optional).");
	        }
	        if (sugar) {
	            System.out.println("Adding honey or sugar to green tea (optional).");
	        }
	    }
	}

	class HerbalTea extends Tea {
	    @Override
	    public void prepareTea() {
	        System.out.println("Preparing Herbal Tea.");
	        System.out.println("Brewing herbal tea blend in hot water.");
	        if (milk) {
	            System.out.println("Adding milk or cream to herbal tea (optional).");
	        }
	        if (sugar) {
	            System.out.println("Adding sweeteners like honey or sugar to herbal tea (optional).");
	        }
	    }
	}

	class Main {
	    public static void main(String[] args) {
	        // Creating an array of Tea objects (including instances of subclasses)
	        Tea[] teas = new Tea[3];
	        teas[0] = new BlackTea();
	        teas[1] = new GreenTea();
	        teas[2] = new HerbalTea();

	        // Using polymorphism to call the prepareTea() method on each object
	        for (Tea tea : teas) {
	            tea.addMilk();
	            tea.addSugar();
	            tea.prepareTea();
	            System.out.println(); // Adding a line break for better output separation
	        }
	    }
	}

}
