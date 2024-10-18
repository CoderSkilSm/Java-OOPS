class Mobile{
    String brand; 
    int price; 
    static String name;
    
    public void show(){ //instance method --> show
        System.out.println(brand + " : " + price + " : " + name); 
    }
    
    public static void show1(Mobile obj){
        System.out.println(obj.brand + " : " + obj.price + " : " + name); 
    }
}

public class HelloWorld {
    public static void main(String[] args) {
        Mobile obj1 = new Mobile(); 
        obj1.brand = "Apple"; 
        obj1.price = 1500; 
        Mobile.name = "SmartPhone"; 
        
        // Mobile obj2 = new Mobile(); 
        // obj2.brand = "Samsung"; 
        // obj2.price = 1700; 
        // Mobile.name = "SmartPhone"; 
        
        // obj1.name = "Phone"; 
        
        // obj1.show(); 
        // obj2.show(); 
        //Mobile.show();// non-static method show() cannot be referenced from a static context. 
        Mobile.show1(obj1);//in static method
    }
}

//Static keyword is shared among all the objects
//For static keyword, prefer not to use object, instead try to use 
// the class name. 

//static variables can be used in the static method but we cannot use the non-static variables inside in the static method,
//but if we have the referenced object then there will be no issues.
//the reason of not accessing the non-static variable with the static variable is that it will creates the ambiguity of instance members of variables.

//the point of execution of java program is main method or it is the point from where we will builds the objects, thus the main method will be static always. 
//means to call main we don't need the object of HelloWorld
