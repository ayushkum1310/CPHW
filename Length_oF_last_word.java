package CPHW;

public class Length_oF_last_word {

	public static void main(String[] args) {
		String s="   fly me   to   the moon  ";
		s=s.strip();
		int len=0;
		for (int i = s.length()-1; i>=0; i--) {
			if(s.charAt(i)!=' ') {
				len++;
			}
			else {
				break;
			}
		}
		System.out.println(len);
			

	}

}
