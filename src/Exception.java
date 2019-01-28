import java.util.*;
public class Exception{
	public static void main(String args[]){
	try{
	int i,q,w;
	System.out.print("enter the values of a and b");
	Scanner S=new Scanner(System.in);
	q=S.nextInt();
	w=S.nextInt();
	i=q/w;
	System.out.print(+i);
}catch(ArithmeticException e){System.out.print(e);
	}
	}
}

