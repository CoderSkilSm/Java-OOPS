class Mobile{
    String brand; 
    int price; 
    static String name;
    
    static{
        name = "Phone"; 
    }
    //static block will be called only once irrespective of the number of objects.
    public Mobile(){
        brand = ""; 
        price = 200; 
    }
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
        Mobile.show1(obj1);//in static method
    }
}

// class loads and objects are instantiated ---> 
// the class loads only once with the help of class loader (class loader resides in the JVM) 
// class loads then the static block loads then the objects instantiation takes place.
