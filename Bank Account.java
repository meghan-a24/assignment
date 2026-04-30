public class BankAccount{
    String accountHolder;
    int balance;
  public BankAccount(String accountHolder,int balance) {
    this.accountHolder=accountHolder;
    this.balance=balance;
  } 
     public static void main(String[]args){
    BankAccount BA1=new BankAccount("meghana",10000);
    BankAccount BA2=new BankAccount("keerthana",5000);
     BankAccount BA3=new BankAccount("dimpu",15000);
     BA2.displaybalance();
     BA2.deposit(2000);
      BA2.withdraw(1000);
       BA2.displaybalance();
      BA1.displaybalance();
    BA3.displaybalance();}
       public void deposit( int amount){
             balance=balance+amount;
            System.out.println("Deposited:"+amount);}
            public void withdraw(int amount){
                if(amount>balance){
                System.out.println("not enough balance");
                }else{
                
                balance=balance-amount;
                System.out.println("withdrawn:"+amount);}}
                
                public void displaybalance(){
                    
                    System.out.println("AccountHolder:"+accountHolder);
                    System.out.println(" total balance:"+balance);

                }
            }
        



  


      
            
        



  

