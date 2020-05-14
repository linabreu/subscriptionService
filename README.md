# subscriptionService
Program utilizes an abstract superclass called subscription which extends two concrete subclasses, DVDSubscription and StreamingSubscription

How It Works:

This program is for a fictitious movie shop that offers monthly memberships and would like to start offering streaming service as a separate service. 

The program contains an abstract Subscription class, which extends the subclasses DVDSubscription and StreamingSubscription.

The Subscription class includes the customer ID and the monthly price, get methods, and an overriden toString() that includes both fields. A constructor for Subscription requires the customer ID. Subscription includes the abstract method setPrice() which does not include any parameters.

The streaming subscription class stores the maximum number of simultaneous streams included in the service, and a constructor that takes this number along with a customer ID. The constructor inclueds a call to the Subscription constructor and setPrice(). Price from this service--calculated in a setPrice() method--is $9.99 for the first stream plus $3.99 for each additional simultaneous stream. A toString() override returns all data.

The DVD subscription class includes the maximum number of rentals allowed at once (5 or 10), as well as the number of days the customer can keep a title (7 or 14 days). The base price for the 5-title plan is $7.00 and the 10-title plan is $8.99. Customers who wish to keep their rentals for up to 14 days also pay an additional $1.49 per month. A constructor accepts all fields and include calls to the Subscription constructor and setPrice(), which calculates the correct price for the subscription. 
