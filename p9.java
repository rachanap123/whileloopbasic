//WAP to reverse the given number.

class reverse{
	public static void main(String[] args){
		int n = 942111423;
		int rev=0;
		int temp=n;
		int rem=0;
		while(temp!=0){
			 rem = temp%10; //last digit
			rev=rev*10+rem;
			temp=temp/10;
		}
		System.out.println(rev);
	}
}
			
