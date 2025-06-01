public class MultiTable{
	public static void main(String[] args){
		
		int m=2;
		int mul;
		int n=1;
		
		while (m < 15){
			System.out.println("#### MULTIPLICATION OF "+m+" #####");
			
			while(n <= 5){
				mul = m*n ;
				System.out.println(">> "+m+"*"+n+" = "+mul);
				n++;
			}
			n =1;
			m++;
		}
		
		
		
	}
}