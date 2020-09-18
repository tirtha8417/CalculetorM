import java.util.Scanner;
public class CalculetorM{
	public static void main(String args[]){
	int a,b,c,select;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter two nunmber:");
	a=sc.nextInt();
	b=sc.nextInt();
	
	
	System.out.println("Select your choice :");
	System.out.println("1.Addition");
	System.out.println("2.Subtraction");
	System.out.println("3.Multiplecation");
	System.out.println("4.Division");
	select=sc.nextInt();
	while(select>4){
	System.out.println("Your choice is invalid:");
	select=sc.nextInt();
	}
	Cal st=new Cal();
	
		
	if(select==1){
		c=st.add(a,b);
		System.out.println("Addition operation : "+c);
	}else if(select==2){
		c=st.sub(a,b);
		System.out.println("Substraction operation : "+c);
	}else if(select==3){
		c=st.mul(a,b);
		System.out.println("Multiplection operation : "+c);
	}else if(select==4){
		c=st.div(a,b);
		System.out.println("Division operation : "+c);
	}


	}
}

class Cal{
	public int add(int x,int y){
		int z;
		z=x+y;
		return z;
	}
	public int sub(int x,int y){
		int z;
		z=x-y;
		return z;
}

	public int mul(int x,int y){
		int z;
		z=x*y;
		return z;
}
	public int div(int x,int y){
		int z;
		z=x/y;
		return z;
}
}


	
	
