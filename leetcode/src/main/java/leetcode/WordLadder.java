/**
Given two words (beginWord and endWord), and a dictionary's word list, find the length of shortest transformation sequence from beginWord to endWord, such that:

Only one letter can be changed at a time.
Each transformed word must exist in the word list. Note that beginWord is not a transformed word.
Note:

Return 0 if there is no such transformation sequence.
All words have the same length.
All words contain only lowercase alphabetic characters.
You may assume no duplicates in the word list.
You may assume beginWord and endWord are non-empty and are not the same.



Example 1:

Input:
beginWord = "hit",
endWord = "cog",
wordList = ["hot","dot","dog","lot","log","cog"]

Output: 5

Explanation: As one shortest transformation is "hit" -> "hot" -> "dot" -> "dog" -> "cog",
return its length 5.
Example 2:

Input:
beginWord = "hit"
endWord = "cog"
wordList = ["hot","dot","dog","lot","log"]

Output: 0

Explanation: The endWord "cog" is not in wordList, therefore no possible transformation.
*/
package leetcode;
import java.util.*;

public class WordLadder {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        if (wordList == null || !wordList.contains(endWord))
            return 0;
        Queue<String> queue = new LinkedList<>();
        queue.offer(beginWord);

        Set<String> words = new HashSet<>(wordList);

        int count = 1;
        while (!queue.isEmpty()) {
            int size = queue.size();
            count++;
            for (int i = 0; i < size; i++) {
                String word = queue.poll();
                List<String> candidates = findCandidates(words, word);
                for (String candidate: candidates) {
                    if (endWord.equals(candidate))
                        return count;
                    queue.offer(candidate);
                }
            }
        }
         return 0;
    }

    private List<String> findCandidates(Set<String> words, String word){
        List<String> candidates = new ArrayList<>();
        StringBuilder sb = new StringBuilder(word);
        for (int i=0; i< sb.length(); i++) {
            char temp = sb.charAt(i);
            for(char c = 'a'; c <= 'z'; c++) {
                if (temp == c)
                    continue;
                sb.setCharAt(i, c);
                String newWord = sb.toString();
                if (words.remove(newWord))
                    candidates.add(newWord);
            }
            sb.setCharAt(i, temp);
        }
        return candidates;
    }
}
