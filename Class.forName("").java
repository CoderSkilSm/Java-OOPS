class Mobile{
    String brand; 
    int price; 
    static String name;
    
    static{
        name = "Phone"; 
        System.out.println("Inside the static block");
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
    public static void main(String[] args) throws ClassNotFoundException{
        Class.forName("Mobile");//forName is the method--->which helps to load the class. 
        // Mobile obj1 = new Mobile(); 
        // obj1.brand = "Apple"; 
        // obj1.price = 1500; 
        // Mobile.name = "SmartPhone"; 
        // Mobile.show1(obj1);//in static method
    }
}


//so when we are not creating the object with the help of constructor then class loading is also not possible then static loading will also not occurs as seen in the output.
//so what if we want to load the class if we not creating the object---> so for that we use special class know as Class.forName(<class name>); 
