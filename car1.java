public class Car{
    String brand;
    String model;
    int year;

    public Car(String brand,String model,int  year){
         this.brand=brand;
         this.model=model;
         this.year=year;
    }
    public static void main(String[]args){
        Car car1=new Car("BMW","3 Series",2022);
        Car car2=new Car("Audi","A6",2020);
        car1.details();
        car2.details();
    }
    public void details(){
        System.out.println("Brand:"+brand);
        System.out.println("Model:"+model);
        System.out.println("Year:"+year);
        }
    }
