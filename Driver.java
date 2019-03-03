import java.util.HashMap;

public class Driver {
	public static void main(String[] args) {
		Algorithms a = new Algorithms();
		String sample1 = "roses",
			   sample2 = "red",
			   sample3 = "teen",
			   sample4 = "rocket",
			   sample5 = "moon";
		
		System.out.println(a.isStringUnique2(sample1));
		System.out.println(a.isStringUnique2(sample2));
		System.out.println(a.isStringUnique2(sample3));
		System.out.println(a.isStringUnique2(sample4));
		System.out.println(a.isStringUnique2(sample5));
	}
}

