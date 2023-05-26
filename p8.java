//WAP to print countddown of days to submit the assignment.

class P8{
	public static void main(String[] args){
		int i=7;
		while(i!=0){
			System.out.println(i+ " days remaining");
			i--;
		}
		if(i==0){
			System.out.println("0 days Assignment is Overdue");
		}
	}
}


