import java.util.Scanner;

public class MarksGrade{
	public static void main(String[] args){
		
		try{
			Scanner scanner = new Scanner(System.in);
			
			System.out.print("Enter your marks : ");
			int marks = scanner.nextInt();
			
			if (marks>=0 && marks<=100){
				
				if (marks >=75){
					System.out.println("Your Grade IS : A");
				}else if (marks >=65){
					System.out.println("Your Grade IS : B");
				}else if (marks >=55){
					System.out.println("Your Grade IS :C");
				}else if (marks >= 45){
					System.out.println("Your Grade IS : S");
				}else{
					System.out.println("Your Grade IS : F");
				}
				
			}else{
				System.out.println("Err : Invalid Input.");
			}
			scanner.close();
			
		}catch (Exception e){
			System.out.println("Err : Invalid Input.");
		}
		
		
		
	}
}