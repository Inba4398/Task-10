package Task10;

	public class Circle {
		//private attribute ‘radius’ created for this class
		  private double radius;
		  // A constructor that initializes this attribute with the value passed as an argument

		  public Circle(double radius) {
		    this.radius = radius;
		  }
//getter and setter methods to access and modify this attribute
		  public double getRadius() {
		    return radius;
		  }

		  public void setRadius(double radius) {
		    this.radius = radius;
		  }

		  public double getCircumference() {
		    return 2 * Math.PI * radius;
		  }
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r = 5;
	    Circle circle = new Circle(r);
	    System.out.println("Radius of the circle is " + r);
	    //modify the radius using the setter method
	    System.out.println("The circumference of the circle is " + circle.getCircumference());
	    //circumference of circle is printed
	    
	  }
	
	}

