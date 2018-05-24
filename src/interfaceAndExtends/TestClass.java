package interfaceAndExtends;

public class TestClass {
	public static void main(String[] args) {
		Class2 c2=new Class2();
		System.out.println(c2.a);
		
		System.out.println(new Interface1() {
			
			@Override
			public String getString() {
				// TODO Auto-getStringType1522219662467generated method stub
				return "hhhhh!";
			}
		}.getString());
	}
}
