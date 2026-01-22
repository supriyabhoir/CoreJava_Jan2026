package stringdemo;

public class StringEx1 {

	//P8945Mobile
	public static int[] StringEvenOdd(String str){
		char ch = str.charAt(0);
		int productId = Integer.parseInt(str.substring(1, 5));
				
		String productName = str.substring(5, str.length());
				
		int[] arr = { productId , productName.length() };
				
		return(arr);		
	}
}