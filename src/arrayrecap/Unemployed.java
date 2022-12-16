package arrayrecap;

public class Unemployed extends Person {

   private  String name;

   public Unemployed(String name){
       this.name = name;
   }

   @Override
    public String toString(){
       return "Unemployed " + "name = '"
               + name + "\'";
   }

   public String getName(){
   return name;
   }

    public void setName(String name){
       this.name = name;
    }
}
