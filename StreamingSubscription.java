/*
Lina Breunlin
Module 04 Programming Project
Part A

This is a subclass file for DemoSubscription. It contains the template to create
objects of the StreamingSubscription subclass which extends Subscription
 */
package demosubscriptions;


public class StreamingSubscription extends Subscription 
{
  private int numStreams;
  
    /**sets the number of streams
    * @param streamNum
    */   
    public void setNumStreams (int streamNum)
    {
        this.numStreams = streamNum;
    }
    
    /**
    gets current value of numStreams
    @return numStreams
    */
    public int getNumStreams()
    {
        return this.numStreams;
    }
    
    /**
     *
     */
    @Override
    public void setPrice()
    {
      final double BASE_PRICE = 9.99;
      final double ADD_STREAM = 3.99;
        
      this.monthlyPrice =  BASE_PRICE + (ADD_STREAM * this.numStreams);
    }
 
   @Override
   public String toString()
   {
       String streamingInfo;
   
       streamingInfo = super.toString() + " " + "Number of Streams: " + this.numStreams;
       return streamingInfo;

   }
   
      public StreamingSubscription(int ID, int numberOfStreams)
   {
       super(ID);
       this.numStreams = numberOfStreams;
       this.setPrice();
   }
     
  
}
