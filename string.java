
public class string {

	public static void main(String[] args) {
	String message=" Good evening ";
	//1
	int number=message.length();
	System.out.println(number);
	//2
	System.out.println(message.charAt(message.length()-2));
	//3
	System.out.println(message.toUpperCase());
	//4
	System.out.println(message.equalsIgnoreCase("Good evening"));
	//5
	System.out.println(message.contentEquals(" Good evening "));
	//6
	message=message.replace("Good", "Bad");
	System.out.println(message);
	//7
	System.out.println(message.trim());
	}

}
