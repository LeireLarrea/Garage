
/**
 * The class Customer represents customers - with name, address and area in which that address falls.
 * 
 * @author M250 module team 
 * @version v1.0
 */
public class Customer
{

   private String fullName;
   private String address;
   private int area;

   /**
    * Constructor for objects of class Customer
    */
   public Customer(String aName, String anAddress, int anArea)
   {
      // initialise instance variables
      this.fullName = aName;
      this.address = anAddress;
      this.area = anArea;
   }

   public String getName()
   {
      return this.fullName;
   }
   
   public String getAddress()
   {
      return this.address;
   }
   
   public int getArea()
   {
      return this.area;
   }
   
   public String toString()
   {
      return (this.getName() + " " + this.getAddress() + " area: " + this.getArea());
   }
}
