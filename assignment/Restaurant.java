
package Restaurant;
import java.util.ArrayList;
import java.util.Scanner;
public class Restaurant {
private ArrayList<String>items = new Arraylist<>();
private ArrayList<Double>prices;
private double totalPrice =0.0;
public Resturant(){
    price = new ArrayList<>();
    
    
    
    public void addItem(String item,double price){
        items.add (item);
        prices.add (price);
        system.out.println(item + "added to menu for ksh" + price);
        
        
        
       public void listMenu(){
           System.out.println("menu:");
           for (int i=0 ;i<items.size();i++){
               
           }
       }        
        
       public void orderFood (){
           Scanner Scanner=new Scanner (System.in);
           System.out.println("What food would you like to order?(enter menu number)");
           Int choice=Scanner.next int ();
           if (choice <1|| choice > item.size()){
               System.out.println ("invalid choice");
               return;
           }
           
           
           
          System.out.println("You ordered"+items.get(choice-1)+"for ksh"+prices.get(choice-1));
          totalPrice+=prices.get(choice-1);
       }
       
       
      public void orderDrink(){
          Scanner Scanner = new Scanner (System.in);
          System.out.println("what drink would you like to order?(enter menu number)");
          int choice=Scanner.nextInt();
          if(choice<1 || choice>items.size()){
              System.out.println("invalid choice");
                      return;
          }
          
          System.out.println("You ordered"+items.get(choice-1)+"for ksh"+prices.get(choice-1));
          totalPrice+=prices.get(choice-1);

          }
      public void displayTotal (){
          System.out.println("your total bill in ksh"+totalPrice);
          
      }
  public void payViaMobileMoney(){
      Scanner Scanner = new Scanner (System.in);
       System.out.println("Please enter your mobile money number:");
       String mobileMoneyNumber=Scanner.nextLine();
       System.out.println("Please enter amount to pay:");
       double amount=Scanner.nextDouble();
      System.out.println("Payment of ksh"+amount+"Succesfully made to"+mobileMoneyNumber);
      totalPrice =0.0;
  }
  public static void main (String[]args){
      Restaurant menu= new restaurant ();
      // add items to menu
      System.out.println("foods");
      menu.addItem(chicken, 800);
      menu.addItem (Rice, 150.0);
      menu.addItem(Burger, 650.0);
      // add items to menu 
      System.out.println("drinks");
       menu.addItem(Fanta, 80.0);
      menu.addItem (Sprite, 75.0);
      menu.addItem(CocaCola, 65.0);
      //Display menu
      menu.listMenu ();
      //order food and drink 
      menu.orderDrink();
      menu.orderFood();
      //display total bill
      menu.displayTotal();
      //pay via mobile money
      menu.payViaMobileMoney();
  }
}

       
        
        
     
    

