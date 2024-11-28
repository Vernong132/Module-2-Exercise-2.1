import java.util.*; 
public class Converter {
    public static void main(String[] args) throws Exception {
    
    // Ask for degree in celsius 
    System.out.println("Please enter the temperature in Celcius: ");
    
    // Instatiate scanner class
    Scanner input = new Scanner(System.in);

    // Retrieve celsius from input
    double temperature = input.nextDouble();

    // Convert celsius to fahrenheight
    double fahrenheight = 9.0 / 5 * temperature + 32;

    // Display results
    System.out.println(temperature + " Celcius is " + fahrenheight
        + " Fahrenheit");
    
    }
}
