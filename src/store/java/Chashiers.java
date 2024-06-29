package store.java;

public class Chashiers extends Staff  {
         public Chashiers(String name,int id,String phoneNumber){
             super(name, id , phoneNumber);
         }
    public void sellProduct (Products products, Customers customers, int quantity){
             if(products.getQuantity() >= quantity){
                 double totalCost = products.getPrice() * quantity;
                 customers.setBalance(customers.getBalance() - totalCost);
                 products.updateQuantity(quantity);
             }
    }


}
