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

}
