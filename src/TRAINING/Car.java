
package TRAINING;

/**
 *
 * @author JBR TCH SOLUTIONS GH
 */
public class Car {
    // Attributes
    private String brand;
    private String model;
    private int year;
    
  //Contructor
    public Car(String brand, String model, int year){
        this.brand=brand;
        this.model=model;
        this.year=year;
        
    }

    // Getter methods
    public String getbrand(){
        return brand;
    }
    public String getModel(){
        return model;
    }
    public Integer getYear(){
        return year;
    }
    
    public void displaycarinfo(){
        
        System.out.println(
                "Brand: " + brand +
                ", Model: " + model+
                ", year: " + year
        );
       
    }
    
    public static void main(String[] args){
        Car mycar =  new Car("Toyota", "camry", 2020);
        mycar.displaycarinfo();
    }
    
   
    
}
