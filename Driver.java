import java.util.HashMap;

public class Driver {
	public static void main(String[] args) {
		Algorithms a = new Algorithms();
		String[] sample1 = new String[]{"top", "pot"};
		String[] sample2 = new String[]{"thot", "hotte"};
		String[] sample3 = new String[]{"dear", "read"};
		String[] sample4 = new String[]{"code", "core"};
		String[] sample5 = new String[]{"god", "dog"};
		
		System.out.println(a.areStringsPermutation(sample1[0], sample1[1]));
		System.out.println(a.areStringsPermutation(sample2[0], sample2[1]));
		System.out.println(a.areStringsPermutation(sample3[0], sample3[1]));
		System.out.println(a.areStringsPermutation(sample4[0], sample4[1]));
		System.out.println(a.areStringsPermutation(sample5[0], sample5[1]));
	}
}

