import static org.junit.Assert.*;

import org.junit.Test;

public class ReverseCharArrayTest {

	@Test
	public void reverse_odd_number_of_words() {
		final char[] exampleArray = { 'g', 'o', ' ', 't', 'o', ' ', 's', 'c',
				'h', 'o', 'o', 'l' };
		final char[] expectedArray = { 's', 'c', 'h', 'o', 'o', 'l', ' ', 't',
				'o', ' ', 'g', 'o', };
		ReverseCharArray.reverse_words_in_char_array(exampleArray);
		assertArrayEquals(expectedArray, exampleArray);
	}

	@Test
	public void reverse_even_number_of_words() {
		final char[] exampleArray = { 'g', 'o', ' ', 't', 'o', ' ', 's', 't',
				'u', 'd', 'y', ' ', 'h', 'o', 'm', 'e' };
		final char[] expectedArray = { 'h', 'o', 'm', 'e', ' ', 's', 't', 'u',
				'd', 'y', ' ', 't', 'o', ' ', 'g', 'o', };
		ReverseCharArray.reverse_words_in_char_array(exampleArray);
		assertArrayEquals(expectedArray, exampleArray);
	}

	@Test
	public void reverse_empty_array() {
		final char[] exampleArray = {};
		final char[] expectedArray = {};
		ReverseCharArray.reverse_words_in_char_array(exampleArray);
		assertArrayEquals(expectedArray, exampleArray);
	}

	@Test
	public void reverse_even_number_of_words_with_space_in_beggining() {
		final char[] exampleArray = { ' ', 'g', 'o', ' ', 't', 'o', ' ', 's',
				't', 'u', 'd', 'y', ' ', 'h', 'o', 'm', 'e' };
		final char[] expectedArray = { 'h', 'o', 'm', 'e', ' ', 's', 't', 'u',
				'd', 'y', ' ', 't', 'o', ' ', 'g', 'o', ' ' };
		ReverseCharArray.reverse_words_in_char_array(exampleArray);
		assertArrayEquals(expectedArray, exampleArray);
	}

	@Test
	public void reverse_even_number_of_words_with_space_in_the_end() {
		final char[] exampleArray = { 'g', 'o', ' ', 't', 'o', ' ', 's', 't',
				'u', 'd', 'y', ' ', 'h', 'o', 'm', 'e', ' ', ' ' };
		final char[] expectedArray = { ' ', ' ', 'h', 'o', 'm', 'e', ' ', 's',
				't', 'u', 'd', 'y', ' ', 't', 'o', ' ', 'g', 'o' };
		ReverseCharArray.reverse_words_in_char_array(exampleArray);
		assertArrayEquals(expectedArray, exampleArray);
	}
}
