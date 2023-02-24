package week3.day2;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import java.util.Arrays;

public class RemoveDuplicatesWords {

	public static void main(String[] args) {
		

String sentence="We learn java basics as part of java sessions in java week1";
String result = "";
String allWords[];
allWords = sentence.split(" ");
LinkedHashSet<String> set = new LinkedHashSet<String>( Arrays.asList(allWords) );
for(String word: set) {
	result = result + word + " ";
}

System.out.println("Sentence after removing duplicate words: " + result);


}

}