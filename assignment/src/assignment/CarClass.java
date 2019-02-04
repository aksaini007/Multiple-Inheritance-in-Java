/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

/**
 *
 * @author AnujSaini
 */
public class CarClass  {
    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Car is a light vehicle.");
    }    
}
        class car implements interfaceCar {
            String brand = "Maruti";
            String model = "WagonR";
            Boolean power = false;
            Boolean startBtn = false;
            int gear = 0;
            
            public void CarBreak(){
                System.out.println("Break applied... Car speed is decreasing...");
                System.out.println("Car stops...");
            }
                        
            //OnUsingKey Method
            public void OnUsingKey(){
            System.out.println("Your "+ model +" " + brand + "car is ready to ride");
            System.out.println("Key inserted and switching the car ON.");
            this.power = true;
            System.out.println("Car is ready to start.");
            }
            
            //start method
            public void start(){
                this.startBtn = true;
                System.out.println("Starting car... ready to fly... enjoy!");
            }
            
            //gear method
            public void gear(){
                    if(gear==0){
                        System.out.println("Car is nutural.");
                        gear = gear + 1;
                    }
                    if(gear==1){
                        System.out.println("Car is running slowly at 1st gear.");
                        gear = gear + 1;
                    }
                    if(gear==2){
                        System.out.println("Car is running little fast at 2nd gear.");
                        gear = gear + 1;
                    }
                    if(gear==3){
                        System.out.println("Car is running faster at 3rd gear.");
                        gear = gear + 1;
                    }
                    if(gear==4){
                        System.out.println("Be careful! Car is running very fast at top gear.");
                    }
            }
            
    }
