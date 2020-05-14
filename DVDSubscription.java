/*
Lina Breunlin
Module 04 Programming Project
Part A

This is a subclass file for DemoSubscription. It contains the template to create
objects of the DVDSubscription subclass which extends Subscription
 */

package demosubscriptions;


public class DVDSubscription extends Subscription
{
  private int maxRentals; //can only be 5 or 10
  private int maxDays; // can only be 7 or 14

    /**sets the max number of rental titles
    * @param rentalsMax
    */   
    public void setMaxRentals (int rentalsMax)
    {
     //declare variables
     final int RENT_OPT1 = 5;
     final int RENT_OPT2 = 10;
            
        if (rentalsMax <= RENT_OPT1) //if you try to pass in a value less than 5 for the number of days just default to lesser number of titles
        {
            this.maxRentals = RENT_OPT1;
        }
        else if (rentalsMax > RENT_OPT1) //if you pass in a value greater than 5 just default to greater number of titles
        {
           this.maxRentals = RENT_OPT2;          
        }
        else
        {
            this.maxRentals = rentalsMax;
        }

    }

    /**set the max number of days the rental can be kept
    * @param daysMax
    */
    public void setMaxDays (int daysMax)
    {
     //declare variables
     final int DAYS_OPT1 = 7;
     final int DAYS_OPT2 = 14;
            
        if (daysMax <= DAYS_OPT1) //if you try to pass in a value less than 7 for the number of days just default to shorter rental option
        {
            this.maxRentals = DAYS_OPT1;
        }
        else if (daysMax > DAYS_OPT1) //if you pass in a value greater than 5 just default to longer rental option
        {
           this.maxRentals = DAYS_OPT2;          
        }  
        else
        {
            this.maxDays = daysMax;
        }
    }
  
    /**
    *gets current value of max number of rentals
    *@return maxRentals
    */
    public int getMaxRentals()
    {
        return this.maxRentals;
    }
    
    /**
    *gets current value of max number of days title can be kept
    *@return maxDays
    */
    public int getMaxDays()
    {
        return this.maxDays;
    }  
  
    @Override
    public void setPrice()
    {
        final double BASE_PRICE_RENTAL_OPT1 = 7.00; //base price for 5 title plan
        final double BASE_RPICE_RENTAL_OPT2 = 8.99; //base price for 10 title plan
        final double PRICE_14_DAYS = 1.49; //additional charge for keeping 14 days
        final int RENTAL_OPT1 = 5; //5 titles
        final int RENTAL_OPT2 = 10; //10 titles
        final int DAYS_OPT1 = 7; //keep for 7 days
        final int DAYS_OPT2 = 14; //keep for 14 days
        
        if (this.maxRentals == RENTAL_OPT1 && this.maxDays == DAYS_OPT1)
        {
           this.monthlyPrice = BASE_PRICE_RENTAL_OPT1; 
        }
        else if (this.maxRentals == RENTAL_OPT1 && this.maxDays == DAYS_OPT2)
        {
            this.monthlyPrice = BASE_PRICE_RENTAL_OPT1 + PRICE_14_DAYS;
        }
        else if (this.maxRentals == RENTAL_OPT2 && this.maxDays == DAYS_OPT1)
        {
            this.monthlyPrice = BASE_RPICE_RENTAL_OPT2;
        }
        else if (this.maxRentals == RENTAL_OPT2 && this.maxDays == DAYS_OPT2)
        {
            this.monthlyPrice = BASE_RPICE_RENTAL_OPT2 + PRICE_14_DAYS;
        }
    }    
       
   @Override
   public String toString()
    {
       String DVDInfo;
       
       DVDInfo = super.toString() + " " + "Max number of rentals: " + this.maxRentals + " | " + "Max number of days for rentals: " + this.maxDays;
       return DVDInfo;
    }
   
   public DVDSubscription (int ID, int rentalsMax, int daysMax) //constructor should accept all fields
   {
     super(ID);
     this.maxRentals = rentalsMax;
     this.maxDays = daysMax;
     this.setPrice();
   }
    
}
  
    
    
    

  
  
  
  
  
  
  
  

