package conditionastastements;

public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int math=40;
		int phy=20;
		int chem=36;
		if(math >=35 && phy>=35) {
			System.out.println("pass");
			}
		else if(chem>=35 && phy>=35) {
			System.out.println("pass");
		}
		else if(math>=35 && chem>=35) {
			System.out.println("pass");
			
		}
		else {
			System.out.println("fail");
		}

	}

}
