
package javaapplication10;


public class JavaApplication10 {

   
    public static void main(String[] args) {
        
        // Variables
        Cat myCat = new Cat();
        
        myCat.name = "Bob";
        
        myCat.age = 4;
        
        myCat.breed = "Taby";
        
        myCat.favoritFood = "Micky Mouse";
        
        // Methods
        
        String action1 = myCat.GetBehavior1();
        String action2 = myCat.GetBehavior2();
        String action3 = myCat.GetBehavior3();
        String action4 = myCat.GetBehavior4();
        String action5 = myCat.GetBehavior5();
         
        
        System.out.println("My Cat named "+myCat.name+" likes to "+ action1);
        System.out.println(myCat.name+" also likes to "+ action2);
        System.out.println(myCat.name+" before bed likes to "+ action3);
        System.out.println(myCat.name+" likes to "+ action4+" "+myCat.favoritFood+ " for breakfast");
        System.out.println(myCat.name+" untill lunch likes to "+ action5
                +" because he is a "+ myCat.age+" year old "+myCat.breed);
        
    }
    
    
}


   