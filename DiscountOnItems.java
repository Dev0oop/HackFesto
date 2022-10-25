/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Stallion
 */
public class Items {
    String Name;
   int Price;
   public void isNameValid(){
       
   }
     public void isPriceValid(){
       
   }
    
}
class FixedPriceItems extends Items{
     String Name;
   int Price;
     @Override
   public void isNameValid(){
       
   }
     @Override
     public void isPriceValid(){
       
   }
}
class DiscountApplicableItems extends Items{
   int OriginalPrice;
   int DiscountedPrice;
    String Name;
    void OriginalPrice(){
        
    }
    void DiscountedPrice(){
        
    }
   @Override
     public void isNameValid(){
       
   }
}
class Discount extends DiscountApplicableItems{
    int dPrice;
    String dItem;
    void dPrice(){
    
}
    void dItem(){
    
}
}
class NewCustomer extends Discount{
    String Name;
    String ID;
    void isValidName(){
    
}
    void isValidID(){
    
}
}
class LoyalCustomer extends Discount{
    String Name;
    String ID;
    void isValidName(){
    
}
    void isValidID(){
    
}
}
class LimitDiscount extends Discount{
    String Name;
    String ID;
    int Limit;
    void isValidName(){
    
}
    void isValidID(){
    
}
    void isValidLimit(){
    
}
}