import java.util.Scanner;
class vehicle{
int cost =0;
int mileage=0;

     public vehicle(int c, int m){
    cost =c;
    mileage=m;
    }

    public void show_vehicle_details(){
        System.out.println("I am a vechicle");
        System.out.println("The cost of the vehicle is "+cost);
        System.out.println("The mileage of the vehicle is "+mileage);
    }
}
class car extends vehicle{
    String color ;
    int tyres = 4;
    public car(int c, int m, String col, int yt){
        super(c,m);
        color = col;
        tyres = yt;

    }
    
    public void show_car_details(){
        System.out.println("I am a car");
        System.out.println("The color of the car is "+color);
        System.out.println("The number of types are "+ tyres);
    }
}



public class inheritance {
    public static void main(String[] args) {
        
       
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter color of car");
        String car_color = scan.nextLine();
        System.out.println("Enter cost of vechicle");
        int vehicle_cost = scan.nextInt();

        System.out.println("Enter mileage of vechicle");
        int vehicle_mileage = scan.nextInt();
        System.out.println("Enter number of tyres in car");
        int car_tyres = scan.nextInt();


       

        car obj = new car(vehicle_cost ,vehicle_mileage,car_color,car_tyres);
        obj.show_car_details();
        obj.show_vehicle_details();
    }
   
}
