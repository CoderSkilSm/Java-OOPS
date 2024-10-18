class A{
    public A(){
        System.out.println("object created"); 
    }
    public void show(){
        System.out.println("in A show"); 
    }
}

public class HelloWorld {
    public static void main(String[] args){
    //   A obj; //---> reference variable
    //   obj = new A(); //--->creating the object
    //   obj.show(); 
    
       new A(); // --> in this also the object is created; the output is: object created
       new A(); // anonymous object(because this type of object don't have the name)
           // for anonymous object, there would be no reference
           // we cannot reuse the anaonymous object.
       new A().show() // object created
                     // in A show
    }
}



