package Task10;

public class Tea {
        // Method to add milk to the basic tea
    public void addMilk() {
       
            System.out.println("Milk added to the tea.");
        
    }

    // Method to add sugar to the basic tea
    public void addSugar() {
        
            System.out.println("Sugar added to the tea.");
        
    }

    // Method to prepare and display the status of the tea
    public void prepareTea() {
         System.out.println("Tea is prepared.");
            
    }
    class BlackTea extends Tea {
        @Override
        public void prepareTea() {
            System.out.println("Preparing Black Tea.");
            System.out.println("Brewing black tea leaves in hot water.");
            
        }
    }

    class GreenTea extends Tea {
        @Override
        public void prepareTea() {
            System.out.println("Preparing Green Tea.");
            System.out.println("Steeping green tea leaves in hot water.");
           
        }
    }

    class HerbalTea extends Tea {
        @Override
        public void prepareTea() {
            System.out.println("Preparing Herbal Tea.");
            System.out.println("Brewing herbal tea blend in hot water.");
           
        }
    }

   

    public static void main(String[] args) {
        // Example usage
        Tea tea = new Tea();
        tea.prepareTea();

        tea.addMilk();
        tea.addSugar();
        tea.prepareTea();
        
        BlackTea blackTea = new BlackTea();
        blackTea.addMilk();
        blackTea.addSugar();
        blackTea.prepareTea();

        GreenTea greenTea = new GreenTea();
        greenTea.addMilk();
        greenTea.addSugar();
        greenTea.prepareTea();

        HerbalTea herbalTea = new HerbalTea();
        herbalTea.addMilk();
        herbalTea.addSugar();
        herbalTea.prepareTea();
    }
}
