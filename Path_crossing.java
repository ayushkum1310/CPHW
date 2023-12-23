package CPHW;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Path_crossing {

	public static void main(String[] args) {
		String path="NEWS";
		Set<String> se=new HashSet();
		int x=0;
		int y=0;
		se.add(x+","+y);
		
		for (char c : path.toCharArray()) {
			if (c=='N') {
				y++;
			}
			else if (c=='S') {
				y--;
			}
			else if (c=='E') {
				x++;
			}
			else if (c=='W') {
				x--;
			}
			String corr=x+","+y;
			if(se.contains(corr)) {
				System.out.println(true);
				break;
			}
		}
		System.out.println(false);

	}

}
