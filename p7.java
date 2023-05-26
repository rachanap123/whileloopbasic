//WAP which takes number from users if number is even print number in reverse order or 
//if number is odd print that number in reverse order by difference of two.

class P7{
	public static void main(String[] args){
		int num=7;

		if(num%2==0){
			while(num>=1){
				System.out.println(num);
				num--;
			}
		}else{
			while(num>=1){
				System.out.println(num);
				num=num-2;
			}
		}
	}
}

