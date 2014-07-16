/*

	This program converts inches to meters for a number of inch values

*/

class InchToMetTable {
  public static void main(String args[]) {
	int inch, feet;  // holds the number of gallons
	double meters;   // holds the number of liters
	
	inch=0;
	feet=0;
	meters=0;

        for ( feet = 0; feet < 13; feet++) {

  	  for ( inch = 0; inch < 13; inch++) { 

	    if ( inch == 0 && feet > 0 ) {
		meters = (feet * 12) * 0.0254; // 2.54 cm per inch or 0.0254
	    	System.out.println (feet + " feet " + inch + " inches is " + meters + " meters. ");
	    } 

	    if ( inch != 0 ) {
	    	meters = inch * 0.0254;	
	    	System.out.println (feet + " feet " + inch + " inches is " + meters + " meters. ");
	    }

	    if ( inch == 0 ) {
		System.out.println ();
  	    }
	  }
	}
  }
}
