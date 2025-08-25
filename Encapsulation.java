public class Encapsulation {
  private String name;
  public String getName(){
    return name;
  }
  public void setName(String newName){
    name=newName;
  }


public static void main(String[] args) {
  Encapsulation en = new Encapsulation();
  en.setName("Lodu");
  System.out.println(en.getName());
}}
  
  

