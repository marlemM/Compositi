public class Pudim extends MenuComponent
{
   public Pudim(){        
   }
    
   public String getName(){
       return "Pudim";
   }
    
   public String getDescription(){
       return "de leite";
   }
    
   public double getPrice(){
       return 5;
   }
        
   public String toString(){
       return "#  "+getName()+(isVegetarian()?"(v)":"")+", "+getPrice()+"     --  "+getDescription();
   }
    
   public void print(){
       System.out.print("#  "+getName());
       if(isVegetarian()){
           System.out.print("(v)");
       }
       
       System.out.print(", "+getPrice());
       System.out.print("     --  "+getDescription());
   }
}
