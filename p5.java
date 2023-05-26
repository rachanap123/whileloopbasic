//WAP to print square of even digit of given number.

class P5{
	public static void main(String[] args){
		int num=942111423;
		while(num!=0){
			int r=num%10;
			if(r%2==0){
				int sq=r*r;
				System.out.println(sq);
			}
			num=num/10;

		}
	}
}



