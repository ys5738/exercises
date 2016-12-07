package practice;

public class StaticTest {
{
	System.out.println("aaaaa");
}
public StaticTest(){
	System.out.println("construct");
}
{
	System.out.println("bbbb");
}
	public static void main(String[] args) {
		//new StaticTest();
		StringBuilder a = new StringBuilder("aaa");
		System.out.println(a);
		int [] ns = new int[2];
		ns.clone();
		//数组可以使用克隆.
		Integer b = 2;
		
	}
	
	@Override
	public Object clone(){
		return null;
	}
}
