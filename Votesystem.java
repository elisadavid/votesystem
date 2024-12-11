import java.util.*;

public class voting{
	private int n,ch,Acount=0,Bcount=0;
	int[] age = new int[10];
	String[] name=new String[10];
	Scanner sc = new Scanner(System.in);

	public void voters(){
		System.out.println("Enter the number of voters");
		n=sc.nextInt();
		for(int i=1;i<=n;i++){
			System.out.println("Enter name of voter : ");
			name[i]=sc.next();
			System.out.println("Enter age of voter : ");
			age[i]= sc.nextInt();
			if(age[i] <18){
				System.out.println("Not eligible for voting");
				continue;
			}
		}
			for(int i=1;i<=n;i++){
				if(age[i]>=18){
					System.out.println("1.A\n2.B\n Choose a Candidate  ");
					ch = sc.nextInt();
					switch(ch){
						case 1 :
							System.out.println("A is selected");
							Acount++;
							break;
						case 2 :
							System.out.println("B is selected");
							Bcount++;
							break;
						default:
							System.out.println("Invalid");
							break;
					}
				}
			}
		}
		
	public void count(){
		System.out.println("Num of votes of candidate A : "+Acount);
		System.out.println("Num of votes of candidate B : "+Bcount);
		if(Acount>Bcount){
			System.out.println("Candidate A WINS");
		}
		else if(Acount<Bcount){
			System.out.println("Candidate B WINS");
		}
		else{
			System.out.println("EQUAL NUM OF VOTES");
		}
	}
}

public class Votesystem{
	public static void main(String[] args){
		voting obj = new voting();
		obj.voters();
		obj.count();
	}
}