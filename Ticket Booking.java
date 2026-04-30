public class movieTicket{
    String movieName;
    int seatNumber;
    int price;
     public movieTicket(String movieName,int seatNumber,int price){
       this.movieName=movieName;
       this.seatNumber=seatNumber;
         this.price=price;
     }public static void main(String[]args){
        movieTicket Ticket1=new movieTicket("couple Friendly",23,350);
        movieTicket Ticket2=new movieTicket("Youth",12,250);
        movieTicket Ticket3=new movieTicket("dacoit",10,400);

        Ticket1.printTicket();
        Ticket2.printTicket();
        Ticket3.printTicket();
     }
     public void printTicket(){
     System.out.println("-----------Ticket---------");
     System.out.println(" movie name:"+movieName);
     System.out.println(" seat number:"+seatNumber);
     System.out.println(" price:"+price);
     }
 }
