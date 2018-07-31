class Car
{
//Three private String variables to store object attributes. 
   private String maker;
   private String color;
   private String bodyType;

//A constructor method that initializes all three variables with 
//attribute values.
   public Car(){
     maker = "Porsche";
     color = "Silver";
     bodyType = "Coupe";
     }
//A private method describing behavior.
   private String accelerate(){
     String motion = "Accelerating...";
     return motion;
     }
//A public method to assign passed argument values to each private variable.
   public void setCar(String brand, String paint, String style){
     maker = brand;
     color = paint;
     bodyType = style;
     }
//Another public method to retrieve the private variable values and 
//to call the private method.
   public void getCar(){
     System.out.println(maker + " paint is " + color);
     System.out.println(maker + " style is " + bodyType);
     System.out.println(maker + " is " + accelerate() + "\n");
     }  
}

class Constructor
{
   public static void main(String[]args){

//Insert statements to create an instance of the Car class and retrieve
//the initial default values.
      Car Porsche = new Car();
      Porsche.getCar();

//Create another instance, assigning and retrieving values.
      Car Ferrari = new Car();
      Ferrari.setCar("Ferrari", "Red", "Sport");
      Ferrari.getCar();
      }
}

/*An objects constructor method can be called directly in the object class
  to initialize object variables. This helps to keep the declarations
  and assignments separate, and is concidered to be good programming
  style. 

  Constructor method declarations do not state any return data type. */