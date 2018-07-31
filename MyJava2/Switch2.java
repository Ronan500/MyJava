public class Switch2 {

	public static void main(String[] args) {

    int continent = 5;

    switch(continent){
      case 1: continent = 1; System.out.println("North America Mexico City,Mexico"); 
        break;

      case 2:  continent = 2; System.out.println("South America Sao Paulo, Brazil");
        break;

      case 3:  continent = 3; System.out.println("Europe Mosco, Russia");
        break;

      case 4: continent = 4; System.out.println("Africa Lagos, Nigeria");
        break;

       case 5:continent = 5; System.out.println("Asia: Shanghai, China");
        break;

      case 6: continent = 4; System.out.println("Australia: Sydney, Australia");
        break;

      case 7:  continent = 4; System.out.println("Antartica: McMurdo Station, US");
        break;
     
      default: System.out.println("Undefinded continent");
    }
    
  }
}
//Switch statement correct example project...the case 1: condition statement
//then the output statment followed by the break ...