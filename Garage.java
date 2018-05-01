import java.util.*;
/**
 * The class Garage is used to hold data about a collection of customers. 
 * 
 * @author M250 module team
 * @version 1.0
 */
public class Garage
{
   /* Instance variables */
   private Map <String, Customer> customers;
   
   /**
    * Initial Constructor for objects of class Garage
    */
   //public Garage()
   //{
   //   customers = new HashMap <String, Customer>();
   //   addTestData();
   //}
    
   /**
    * Constructor for objects of class Garage
    */
    public Garage()
   {
      customers = new HashMap <String, Customer>();
      Customer aCustomer = new Customer ("Empty", "Empty", 0);
      customers.put("Empty", aCustomer);
   }
   
   /* Instance methods */
   /**
    * Populates the map with given data.
    * Then it makes sure there are not empty entries created by the constructor.
    * 
    */
   public void addTestData()
   {
      customers.put("123ABC", new Customer("Andrew Smith", "1 The High Street", 1));
      customers.put("456DEF", new Customer("Janet Jones", "145 Main Street", 1));
      customers.put("789GHI", new Customer("Christine Charter", "50 Lake View", 2));
      customers.remove("Empty");
   }
   
   /**
    * Creates an instance of Customer and adds it to the Map with the regNo as the key.
    * Then it makes sure there are not empty entries created by the constructor.
    * 
    * @param regNo, a String to be the new Key for the Map.
    * @param name, a String to be the new instance variable fullName of the class Customer object.
    * @param address, a String to be the new instance variable address of the class Customer object.
    * @param address, an int to be the new instance variable area of the class Customer object.
    * 
    */
   public void addCustomer(String regNo, String name, String address, int area)
   {
      Customer aCustomer = new Customer (name, address, area);
      customers.put(regNo, aCustomer);
      customers.remove("Empty");
   }
   
   /**
    * For each customer held in the collection referenced by customers, 
    * prints out their record.
    *
    */
   public void printCustomers()
   {
     for(String eachKey : customers.keySet())
      {
       //THIS PRODUCES EXPECTED OUTPUT
       System.out.println(customers.get(eachKey));
              
        /*HERE SOME CODE I TRIED IN ORDER TO RE-USE THE toString() METHOD FROM THE CUSTOMER CLASS
        * 
        * TRY1
        * Customer aCustomer;
        * for(String eachKey : customers.keySet())
        * {
        *    aCustomer = customers.get(eachKey);
        *    aCustomer.toString();
        *  }
        * 
        * TRY 2
        * for(String eachKey : customers.keySet())
        * {
        *   Customer aCustomer = new Customer ((customers.get(eachKey)).getName(),(customers.get(eachKey)).getAddress(),(customers.get(eachKey)).getArea());
        *   aCustomer.toString();
        *  }
        * 
        * TRY 3
        *  Customer two = new Customer("","",0);
        *  for(String eachKey : customers.keySet())
        * {
        *   two = customers.get(eachKey);
        *   two.toString();
        *  }
        * 
        * ALL COMPILE BUT NOT SHOW EXPECTED OUTPUT
       */
       }
   }  
   
   /**
    * Checks if a user input exists as a key/registration number in the Map,
    * if so, it returns its correspondent Customer object.
    *
    *@param aRegNo, a String that represents the key/registration number to be searched for.
    *@returns the key's correspondent Customer object if this found, otherwise null.
    *
    */
   public Customer findCustomerWithReg(String aRegNo)
   {
      if(customers.containsKey(aRegNo))
      {
         return customers.get(aRegNo);
      }
      else
      {
         System.out.println("Customer with registration number " + aRegNo + " - Not found.");
         return null;
      }
   }

   /**
    * Checks what customers live in a given area and returns a Set of Strings that represents them.
    *
    *@param anInt, an int that represents the value/area where customers are to be searched for.
    *@returns a Set of Strings conatining the Customer objects found in that area.
    *
    */
   public Set<Customer> findCustomersInArea(int anInt) 
   {
      Set <Customer> customersFoundInArea = new HashSet<Customer>();
      Customer aCustomer;
      for(String eachKey : customers.keySet())
      {
         aCustomer = customers.get(eachKey);
         if(aCustomer.getArea() == anInt)
         {
            customersFoundInArea.add(aCustomer);
         }
      }
      return customersFoundInArea;  
   }
}
