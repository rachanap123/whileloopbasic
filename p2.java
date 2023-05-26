//WAP to calculate factorial of given number.


class P2{
	public static void main(String[] args){
		int num=5;
		int fact=1;
		int i=1;
		while(num>=i){
			fact=fact*num;
			num--;
		}
		System.out.println(fact);
	
	}
}
