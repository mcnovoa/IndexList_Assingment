import java.util.Scanner;

public class Main {

	public static void main(String[] args){

		boolean flag = true;
		String instr;
		Scanner stdin = new Scanner(System.in);
		MyArrayList arr = new MyArrayList();

		System.out.println("Please enter a instruction: ");
		instr = stdin.nextLine();

		
		
		int N = Integer.parseInt(instr.charAt(0) + "");
	


		while( N < 1 || N > 4 || Character.isAlphabetic(N)){
			System.out.println("Incorrect instruction, please enter the correct one");
			instr = stdin.next();
		}

		while(flag){
			if(N == 1){
				String ns = instr.substring(2);
				int n = Integer.parseInt(ns);
				arr.add(n);
				for (int i = 0; i < arr.size(); i++) {
					System.out.println(arr.get(i));
				}	
			}
			else if(N == 2){
				String ns = instr.substring(2);
				int n = Integer.parseInt(ns);
				arr.removeAllKey(n);
				for (int i = 0; i < arr.size(); i++) {
					System.out.println(arr.get(i));
				}	
			}

			else if(N == 3){
				arr.printSize();
			}
			else if (N == 4){
				stdin.close();
				break;
				
			}

			System.out.println("Please enter another instruction: ");
			instr = stdin.nextLine();	
			N = Integer.parseInt(instr.charAt(0) + "");
		}
	}

}
