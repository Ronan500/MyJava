class Car
{
//Declare three private String variables to store object attributes.
   private String maker;
   private String color;
   private String bodyType;

//Add a private method describing a behavior.
   private String accelerate(){
     String motion = "Accelerating...";
     return motion;
    }
//Public method to assign passed argument values to each private variable.
   public void setCar(String brand, String paint, String style){
     maker = brand;
     color = paint;
     bodyType = style;
     }
//Another public method to retrieve the private variable values and to 
//call the private method.
   public void getCar(){
     System.out.println(maker + " paint is " + color);
     System.out.println(maker + " style is " + bodyType); 
     System.out.println(maker + " is " + accelerate() + "\n");
     }
}

class SafeInstance
{
   public static void main(String[]args){
//Insert a statement to create an instance of the Car class.
     Car Porsche = new Car();

//A statement that calls a public method of the Car class to assign values
//to its private variables.
     Porsche.setCar("Porsche", "Red", "Coupe");

//A statement to call the other public method of the Car class to retrieve
//the stored attribute value and call the private behavior method.
     Porsche.getCar();

//Create another instance, assigning and retrieving values.     
     Car Bentley = new Car();
     Bentley.setCar("Bentley", "Green", "Saloon");
     Bentley.getCar();
     }
}

/*The private keyword can be used when declaring object variables and 
  methods to protect them from manipulation by external program code.
  The object should then include public methods to retrieve the values
  and call the methods. This technique neatly encapsulates the variables
  and the methods within the object structure.
  
  An uninitialized String variable has a null value - so calling 
  the getCar() method before setCar() will return a null from each
  variable. */