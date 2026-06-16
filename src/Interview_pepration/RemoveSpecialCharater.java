package Interview_pepration;

public class RemoveSpecialCharater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str = "Abhay!@#$%^&*()_+ 123";
		String result = "";
		
		for(char ch:str.toCharArray()) {
			// Take each character one by one and store it in ch.
			// ch = 'H' ch = 'e' ch = 'l'
			if(Character.isLetterOrDigit(ch) || ch == ' ') {
				
				result+= ch;
			}
		}
		System.out.println(result);

	}

}
