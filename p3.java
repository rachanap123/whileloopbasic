//WAP to count the digits of given number.

class P3{
	public static void main(String[] args){
		int num=942111423;
		int count=0;
		while(num!=0){
			num=num/10;
			count++;
		}
		System.out.println("Count of digits = "+count);
	}
}
