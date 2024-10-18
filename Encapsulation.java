
class Human{
    private int age; 
    private String name; 
    
    public int getAge(){
        return age; 
    }
    
    public String getName(){
        return name; 
    }
    
    public void setAge(int age){
        this.age = age; 
    }
    
    public void setName(String name){
        this.name = name; 
    }
    
}

//Encapsulation ---> means combining data and methods altogether

public class HelloWorld {
    public static void main(String[] args){
       Human obj = new Human(); 
       obj.setAge(11); 
       obj.setName("Navin"); 
       System.out.println(obj.getAge()); 
       System.out.println(obj.getName());
    }
}


