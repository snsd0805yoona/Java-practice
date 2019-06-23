import java.util.*;

class ArrayStack implements stack
{
	int top=-1;
	int stack[]=new int [100];
	public boolean empt()
	{
		if(top<0)
		{
			return true;
		}
		return false;
	}
	public void push(int x)
	{
		top++;
		stack[top]=x;
	}
	public int pop()
	{
		int x;
		x=stack[top];
		stack[top]=0;
		top--;
		return x;
	}
	public int peek()
	{
		return stack[top];
	}
}

public class DEMO {

	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		ArrayStack t=new ArrayStack();
		String s=input.next();
		int x=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='(')
			{
				t.push(i);
			}
			if(s.charAt(i)==')')
			{
				if(t.empt()==false)
				{
					System.out.println("("+t.pop()+","+i+")");
				}
				else
				{
					x=-1;
					System.out.println("(?,"+i+")");
				}
			}
		}
		if(t.empt()==false)
		{
			for(int h=0;h<=t.top;h++)
			{
				System.out.println("("+t.pop()+",?)");
			}
			x=-1;
		}
		if(x==-1)
		{
			System.out.println("unmatched");
		}
		else
		{
			System.out.println("matched");
		}
		

	}

}