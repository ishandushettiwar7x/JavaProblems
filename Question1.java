import java.util.*;
import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			
			String str = scanner.nextLine();    
			HashMap<Character, Integer> map = new HashMap<>();
			char[] character = str.toCharArray();
			
			for (char c : character ) {
				if (map.containsKey(c)) {
					map.put(c, map.get(c) + 1);
				} else {  
			         map.put(c, 1);  
			     }  
			}
			
			  System.out.println(map);
		}

	}

}
