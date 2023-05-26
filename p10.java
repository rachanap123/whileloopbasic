//WAP to program to check whether the number is Palindrome number or not.

class palindrome{
	public static void main(String[] args){
	int n = 2332;
	int temp=n;
	int rev=0;
	int rem=0;

	while(temp!=0){
		rem=temp%10;
		rev=rev*10+rem;
		temp=temp/10;
	}
	if(rev == n){
		System.out.println(n+" is a palindrome number");
	}else{
		System.out.println(n+" is not a palindrome number");
	}
}
}



