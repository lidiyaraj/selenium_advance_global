import GenericUtility.PropertyUtility;

public class propertydemo {
	public static void main(String[] args) {
		PropertyUtility prop=new PropertyUtility();
		String k = prop.readingDataFromPropertyfile("login");
		System.out.println(k);
	}

}
