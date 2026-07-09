// Last updated: 09/07/2026, 09:30:50
class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxWords = 0;

        for (String sentence : sentences) {
            // Split the sentence by spaces to get an array of words
            String[] words = sentence.split(" ");
            
            // Get the number of words in the current sentence
            int currentWords = words.length;

            // Update maxWords if the current sentence has more words
            if (currentWords > maxWords) {
                maxWords = currentWords;
            }
        }
        
        return maxWords;
    }
}