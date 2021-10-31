package leetcode.bfs;

import java.util.ArrayList;
import java.util.Queue;
import java.util.List;
import java.util.LinkedList;
import java.util.Set;
import java.util.HashSet;

public class WordLadder {
    // find shortest path to chain words via bfs ;-)
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
                List<String> nextWords = findNextWords(words, word);
                for (String next: nextWords) {
                    if (endWord.equals(next))
                        return count;
                    queue.offer(next);
                }
            }
        }
         return 0;
    }

    private List<String> findNextWords(Set<String> words, String word){
        List<String> nextWords = new ArrayList<>();
        StringBuilder sb = new StringBuilder(word);
        for (int i=0; i< sb.length(); i++) {
            char temp = sb.charAt(i);
            for(char c = 'a'; c <= 'z'; c++) {
                if (temp == c)
                    continue;
                sb.setCharAt(i, c);
                String newWord = sb.toString();
                if (words.remove(newWord))
                nextWords.add(newWord);
            }
            sb.setCharAt(i, temp);
        }
        return nextWords;
    }
}
