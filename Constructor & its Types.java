
class Human{
    private int age; 
    private String name; 
    
    public int getAge(){//getter
        return age; 
    }
    
    public String getName(){//getter
        return name; 
    }
    
    public void setAge(int age){//setter
        this.age = age; 
    }
    
    public void setName(String name){//setter
        this.name = name; 
    }
    
    public Human(){ //Default Constructor
        this.age = 11; 
        this.name = "Babu"; 
        System.out.println("Inside Default Constructor"); 
    }
    
    public Human(int age,String name){//Parameterized Constructor
        this.age = age; 
        this.name = name; 
        System.out.println("Inside Parameterized Constructor"); 
    }
    
    public void show(){
        System.out.println("The age is: " + this.age + " and the name is: " + this.name); 
    }
    
}

//Encapsulation ---> means combining data and methods altogether

public class HelloWorld {
    public static void main(String[] args){
       Human obj1 = new Human(); 
       Human obj2 = new Human(12,"Navin");
       obj1.show();
       obj2.show(); 
    }
}


