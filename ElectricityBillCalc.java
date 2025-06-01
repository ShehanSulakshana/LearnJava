import java.util.Scanner;


public class ElectricityBillCalc{
	public static void main(String[] args){
		
		try{
			Scanner scanner = new Scanner(System.in);
			
			System.out.print("Unit count : ");
			int units = scanner.nextInt();
			
			int cost, Tax , TotalBill;
			
			if (units>300){
				cost = units*10 ;
			}else if(units>100){
				cost = units*8 ;
			}else{
				cost = units*5 ;
			}
			
			//Tax on tata cost
			Tax = ((cost/100)*10);
			TotalBill = (cost+Tax);
			
			//Output
			System.out.println("#~COST		 : "+ cost);
			System.out.println("#~TAX 10% 	 : "+ Tax);
			System.out.println("#~TOTAL BILL : "+ TotalBill);
		
		}catch (Exception e){
			System.out.println(" ERR : Invalid input...!");
		}
		
		
	}
	
	
}
