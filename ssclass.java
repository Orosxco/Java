class superclass{
	int number = 56;
}

class subclass extends superclass {
	int number = 96;
	void printnumber() {
		System.out.println(number);
	}
}
public class ssclass {

	public static void main(String[] args) {
		subclass sub = new subclass();
		sub.printnumber();
	}

}
