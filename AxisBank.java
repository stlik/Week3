package week3.day1;

public class AxisBank extends Bankinfo {
	
	

		public void deposit() {
			
			double dep=5000;
			System.out.println("Deposit Amount:"+dep);

		}
		public static void main(String[] args) {
			Bankinfo inf = new AxisBank();
			System.out.println("Overridden Value");
			inf.deposit();
		}
	}


