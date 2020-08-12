package search;

import java.io.IOException;

/**
 * Test program for the Search class.
 */
public class SearchTest {
    private static final String files[] = {
        "tiny.txt", "small.txt", "medium.txt", "large.txt"
    };
    
    /**
     * Test program for the Search class.
     * Put whatever tests you like in the body of the method.
     * @param args the command line arguments
     * @throws java.io.IOException of error reading the input
     */
    public static void main(String[] args) throws IOException {
        // Don't change this line
        final Search search = new Search();
        final String method = args[0];
        
        for (String file : files) {
            final StringList strings = new StringList("data/" + file);
            System.out.println("Testing on " + file + ":");

         // add your tests here

            String longestWord = search.longestWord(strings);
			
			System.out.println("Longest word in "+file+" is :- "+longestWord);
			
			
			
			int count = search.countUnique(strings);
			
			System.out.println("Number of unique words in "+file+" is :- "+count);
			
			
			
			String mostCommon = search.mostCommon(strings);
			
			
			System.out.println("Most common word in "+file+"  is :- "+mostCommon);
			
			
			String k = "what";
			
			int position = search.findEqual(strings, k);
			
			System.out.println("Search found at "+position);
			
			
			
			int countLess = search.countLess(strings, k);
			
			System.out.println("Count Less "+countLess);
			
			
            int countLessOrEqual = search.countLessOrEqual(strings, k);
			
			System.out.println("Count Less or Equal "+countLessOrEqual);
			
			
			String k1 = "a";
			
			String k2 = "after";
			
			int countBetween = search.countBetween(strings, k1, k2);
				
			System.out.println("Word countBetween "+countBetween);
				
			
			int numberOfMatches = search.countMatches(strings, "wh", "at");
			
			System.out.println("Number of Matches in "+file+" is :- "+numberOfMatches);
			
            System.out.println();
        }
    }
    
}
