public class ReverseCharArray {

	public static void reverse_words_in_char_array(char[] words) {
		
		int begginigOfTheWord = 0;
		int endOfTheWord = 0;
		boolean isBegginingSet = false;

		reverseWholeArray(words);

		for (int i = 0; i < words.length; i++) {
			
			if (words[i] != ' ' && isBegginingSet == false) {
				begginigOfTheWord = i;
				isBegginingSet = true;	
			} else if (words[i] == ' ' && isBegginingSet == true) {
				endOfTheWord = i;
				reverseWordInArray(words, begginigOfTheWord, endOfTheWord);
				isBegginingSet = false;

			} else if(isBegginingSet == true && i == words.length - 1){
				endOfTheWord = i + 1;
				reverseWordInArray(words, begginigOfTheWord, endOfTheWord);
			}
			
		}
	}

	private static void reverseWordInArray(char[] words, int begginigOfTheWord,
			int endOfTheWord) {
		for (int j = 0; j < ((endOfTheWord - begginigOfTheWord) / 2) ; j++) {
			char temp = words[begginigOfTheWord + j];
			words[begginigOfTheWord + j] = words[endOfTheWord - j - 1];
			words[endOfTheWord - j - 1] = temp;
		}
	}

	private static void reverseWholeArray(char[] words) {
		for (int i = 0; i < words.length / 2; i++) {
			char temp = words[i];
			words[i] = words[words.length - i - 1];
			words[words.length - i - 1] = temp;
		}
	}
}
