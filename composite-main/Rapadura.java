public class Rapadura extends MenuComponent
{
   public Rapadura(){        
   }
    
   public String getName(){
       return "Rapadura";
   }
    
   public String getDescription(){
       return "rapadura doce";
   }
    
   public double getPrice(){
       return 8;
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
