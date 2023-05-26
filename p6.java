//WAP to print the sum of all even numbers and multiplication of odd numbers between 1 to 10.

class P6{
	public static void main(String[] args){
		int i=1;
		int sum=0;
		int mul=1;
		while(i<=10){
			if(i%2==0){
				sum=sum+i;
			}else{
				mul=mul*i;
			}
			i++;
		}
		System.out.println("sum of even numbers between 1 to 10 = "+sum);
		System.out.println("multiplication of odd numbers between 1 to 10 = "+mul);
	}
}
