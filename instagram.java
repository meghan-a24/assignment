ppublic class instagram{
    static String idname="_meghana.2_";
     static int password=2442;
     static int followers=270;
public static void greet(){
    System.out.println("welcome to instagram,"+idname+"!");
}
public static void checkpassword(int enteredpassword){
    if(enteredpassword==password){
        System.out.println("password is correct.Access granted.");}
        else{
            System.out.println("password is incorrect.Access denied.");
                    }}
                   public static void addfollower(int follower){
followers=followers+follower;
System.out.println("added successful.New follower:"+followers);
                   }
                   public static void removefollower(int follower){
                  followers=followers-follower;
                  System.out.println("removed successful.newfollower:"+followers);
                   }  
                   public static void setnewpassword(int newpassword){
                    password=newpassword;
                    System.out.println("password changed successfully."+"newpassword:"+password);
                   }
 public static void main(String[] args){
                    greet();
                    checkpassword(2442);
                    addfollower(4);
                    removefollower(2);
                    setnewpassword(423);
                    
                   
                   
    }
}