import java.util.HashMap;
import java.util.Map;

public class Trie {

    private class TrieNode {
        // fields
        Map<Character, TrieNode> children;
        boolean endOfWord;

        // node constructor
        public TrieNode() {
            children = new HashMap<>();
            endOfWord = false;
        }
    }

    private final TrieNode root;

    // Trie constructor
    public Trie() {
        root = new TrieNode();
    }

    /**
     * Iterative implementation of insert-into-trie
     */

    public void insert(String word) {
        TrieNode current = root;
        for (int i =0; i < word.length(); i++) {
            char ch = word.charAt(i);
            // is this character in the current node's map?
            TrieNode node = current.children.get(ch);
            // if it isn't, we make it a new empty node, and put the character and the node into the
            // current node's map
            if ( node == null ){
                node = new TrieNode();
                current.children.put(ch, node);

            }
            // now we need to move to the node we just created as we
            // continue to iterate through the characters in the string
            current = node;
        }
        // when all the characters have been added we need to mark the final node
        // as end-of-word
        current.endOfWord = true;
    }

    /**
     * A Recursive implementation of insert-into-trie
     */

    public void insertRecursive(String word) {
        insertRecursive(root, word, 0);
    }

    private void insertRecursive(TrieNode current, String word, int index) {
        if (index == word.length()) {
            current.endOfWord = true;
            return;
        }
        char ch = word.charAt(index);
        TrieNode node = current.children.get(ch);
        if (node == null ) {
            node = new TrieNode();
            current.children.put(ch, node);
        }
        index ++;
        insertRecursive(node, word, index);
    }
    /**
     * Iterative implementation of search
     */

    public boolean search(String word ){
        TrieNode current = root;
        for (int i =0 ; i < word.length(); i++ ) {
            char ch = word.charAt(i);
            // is this character in the current node's map?
            TrieNode node = current.children.get(ch);
            // if it isn't, we want to return false
            if ( node == null ) {
                return false;
            }
            // if it is we want to increment the current node
            current = node;
        }
        // if we get all the way through the for loop, then we return the current node
        // end-of-word value
        return current.endOfWord;

    }
    /**
     * A Recursive implementation of search
     */

    public boolean searchRecursive(String word) {
        return searchRecursive(root, word, 0);
    }

    private boolean searchRecursive(TrieNode current, String word, int index) {
        // take care of the end case to exit loop
        if (index == word.length()) {
            return current.endOfWord;
        }
        char ch = word.charAt(index);
        TrieNode node = current.children.get(ch);
        // no character in the children map returns false
        if (node == null ) {
            return false;
        }
        // the character is in the map, so lets move to the next node in the Tree,
        current = node;
        // increment the character index,
        index ++;
        // and perform the search on that node
        return searchRecursive(current, word, index);

    }

}
