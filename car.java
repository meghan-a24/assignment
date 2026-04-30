public class Car{
    String brand;
    String model;
    int year;

    public static void main(String[]args){
        Car car1=new Car();
        car1.brand="BMW";
        car1.model="3 Series";
        car1.year=2022;

        Car car2=new Car();
        car2.brand="Audi";
        car2.model="A6";
        car2.year=2020;
         
        
        car1.details();

          car2.details();
    }
    public void details(){
       
        System.out.println("Brand:"+brand);
        System.out.println("Model:"+model);
        System.out.println("Year:"+year);
       

        }
    }
