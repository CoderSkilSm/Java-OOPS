class Mobile{
    String brand; // brand, price are the instance variables
    int price; 
    static String name;
    
    public void show(){
        System.out.println(brand + " : " + price + " : " + name); 
    }
}

public class HelloWorld {
    public static void main(String[] args) {
        Mobile obj1 = new Mobile(); 
        obj1.brand = "Apple"; 
        obj1.price = 1500; 
        Mobile.name = "SmartPhone"; 
        
        Mobile obj2 = new Mobile(); 
        obj2.brand = "Samsung"; 
        obj2.price = 1700; 
        Mobile.name = "SmartPhone"; 
        
        obj1.name = "Phone"; 
        
        obj1.show(); 
        obj2.show(); 
    }
}

//Static keyword is shared among all the objects
//For static keyword, prefer not to use object, instead try to use 
// the class name. 
