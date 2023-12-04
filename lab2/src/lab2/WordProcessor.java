package lab2;

public class WordProcessor implements Counter {
	private String text;
	
//	
	public String gettext() {
		return text;
	}

	public void settext(String text) {
		this.text = text;
		
	}
	
	@Override
	public int countWord(String sentence) {
		if(sentence == null) {
			sentence = text;
		}
		// TODO Auto-generated method stub
		String[] countword = sentence.split(" ");
		return countword.length;
	}

	@Override
	public int countLetters(String sentence) {
		if(sentence == null) {
			sentence = text;
		}
		// TODO Auto-generated method stub
		
		return sentence.replaceAll("[^a-zA-Z]", "").length();
	}

	@Override
	public int getLength(String sentence) {
		if(sentence == null) {
			sentence = text;
		}
		// TODO Auto-generated method stub
		return sentence.length();
	}

}