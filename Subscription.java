/*
Lina Breunlin
Module 04 Programming Project
Part A

This is a the abstract class file for DemoSubscription. It contains the information
needed to create objects that extend the abstract subscription superclass
 */
package demosubscriptions;


public abstract class Subscription 
{
   protected int custID;
   protected double monthlyPrice;
   public abstract void setPrice();
   
   /*
   gets current customer ID
   @return custID
   */
   public int getCustID()
   {
       return this.custID;
   }
   
   /*
   gets current monthly price
   @return monthlyPrice
   */
   public double getMonthlyPrice()
   {
       return this.monthlyPrice;
   }
   
   @Override
   public String toString()
   {
       String info;
       
       info = "Customer ID: " + this.custID + " | " + "Monthly Price: $" + String.format("%.2f",this.monthlyPrice) + " | " ;
       return info;
   }
   
   public Subscription(int ID)
   {
       this.custID = ID;
       this.monthlyPrice = this.getMonthlyPrice();
   }
  
}





