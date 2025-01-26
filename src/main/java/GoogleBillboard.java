

public class GoogleBillboard {
	public final static String e = "2.7182818284590452353602874713526624977572470936999595749669676277240766303535475945713821785251664274274663919320030599218174135966290435";  
	double dNum; 
	public static void main(final String[] args) {
		for ( int i = 1 ;  i < e.length() - 11 ; i ++ ) { 
      		dNum = Double.parseDouble(e.substring(i,i+10)) ; 
     		if (isPrime(dNum)){
		println(dNum);
		} 
		} 
	

	//Finish this function
	public boolean isPrime(double num){
		for ( int i = 2 ; i <= Math.sqrt(num); i ++ )  {
		if ( num %i ==0 ) {
 	   	 return false; 
		} 
		}  if ( num <= 1) {
		return false; } 
		return true; 
	}

}

