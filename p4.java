//WAP to count odd digits of given number.

class P4{
	public static void main(String[] args){
		int num = 942111423;
		int count = 0;
		while(num!=0){
			num=num/10;
			if(num%2!=0)
				count++;
		}
		System.out.println("Count of odd digits = "+count);
	}
}
