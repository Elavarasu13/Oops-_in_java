package JavaConcepts;

public class Honda 
{
	static int dealer_id = 123;   //common for all objects //static // but values will change.
	                              //common for this class
	static String Owner_name ="Elavarasu";
	
	int price;  //declaration
	int cc;         //non-static variables
	float discount;      //Data Members
	
	public static void main(String[] args)   //brackets are action
	{
        Honda shine  = new Honda(); // new -> allocates Memory //shine --> Reference of object
        Honda activa = new Honda();
        Honda unicorn = new Honda();
        
        shine.price  = 65000;
        activa.price  =80000;
        unicorn.price =100000;
        
        shine.discount =5.0f;
        activa.discount =10.0f;
        
        System.out.println(shine.price);
        System.out.println(activa.price);
        
         System.out.println(Honda.Owner_name);  //advisable  
         System.out.println(unicorn.Owner_name); //permitted
         System.out.println(Owner_name);
	} 

}
