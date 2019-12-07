
public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1 t1=new Test1();
		Test2 t2=new Test2();
		Test3 t3=new Test3();
		Test4 t4=new Test4();
		Test5 t5=new Test5();

		t1.add(3, 4);
		t1.sub(10,5);
		t1.mul(15, 10);
		t2.leftshift(1,3);
		t2.rightshift(4, 5);
		t2.remainder(10,20);
		t3.andop(true,false);
		t3.orop( false,true);
		t3.notop(true, false);
		t4.bitand(5, 8);
		t4.bitor(5,8);
		t4.small(6, 4);
		t5.greater(4,5);
		t5.even(77);
	}
public void greater(int a,int b)
{
	if(a>b)
		 System.out.println("a is greater");
	else if (a<b)
		 System.out.println("b is greater");
	else 
		System.out.println("Both are equal");
}
public void even(int a)
{
	if(a%2==0)
		System.out.println("a is even");
	else
		System.out.println("a is odd");
}
}

