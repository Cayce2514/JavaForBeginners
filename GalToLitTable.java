/*

	This program converts gallons to liters for a number of gallon values

*/

class GalToLitTable {
  public static void main(String args[]) {
	int gallons;  // holds the number of gallons
	double liters;   // holds the number of liters
	
	gallons=0;
	liters=0;

	for ( gallons = 0; gallons < 101; gallons++) { 

	    liters = gallons * 3.7854;
	    System.out.println (gallons + " gallons is " + liters + " liters. ");

	    if ( (gallons % 10) == 0 ) {
		System.out.println ();
  	    }
	}
  }
}
