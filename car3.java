public class car extends vehicle{
    String fueltype;
    car(String brand,int speed,String fueltype){
        Super(brand,speed);
        this.fueltype=fueltype;
    }
    void displaycarinfo(){
        System.out.println("Fueltype:"+fueltype);
    }
}
