/*
Lina Breunlin
Module 04 Programming Project
Part A

This program demonstrates the use of the abstract subscription superclass and its extended subclasses and thier methods using an array list

Test cases:

testStream1 obj properties: custID: 1, 4 streams

output: 
Customer ID: 1 | Monthly Price: $25.95 |  Number of Streams: 4

testStream2 obj properties: custID: 2, 5 streams

output:
Customer ID: 2 | Monthly Price: $29.94 |  Number of Streams: 5

testDVD1 obj properties: custID: 3, 5 titles, keep for 7 days

output:
Customer ID: 3 | Monthly Price: $7.00 |  Max number of rentals: 5 | Max number of days for rentals: 7

testDVD2 obj properties: custID:4, 10 titles, keep for 14 days

output:
Customer ID: 4 | Monthly Price: $10.48 |  Max number of rentals: 10 | Max number of days for rentals: 14
*/

package demosubscriptions;

import java.util.ArrayList;


public class DemoSubscriptions 
{

    public static void main(String[] args) 
    {
       ArrayList<Subscription> subscripList = new ArrayList<>(); 

       System.out.println("Miguel's Movies Array List Application");
       
       StreamingSubscription testStream1 = new StreamingSubscription (1,4);
       
       subscripList.add(testStream1);
       
       StreamingSubscription testStream2 = new StreamingSubscription (2,5);
       
       subscripList.add(testStream2);
       
       DVDSubscription DVDtest1 = new DVDSubscription (3,5,7);
       
       subscripList.add(DVDtest1);
       
       DVDSubscription DVDtest2 = new DVDSubscription (4,10,14);
       
       subscripList.add(DVDtest2);
       
       //output the current subscription list
       System.out.println("The current subscription list:");
       
        for (int i = 0; i < subscripList.size(); i++)
        {
            System.out.println(subscripList.get(i).toString());
        }

       System.out.println("Thank you for using Miguel's Movies App!");
       
    }
    
}
