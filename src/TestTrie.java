
public class TestTrie {
    public static void main(String args[]){
        Trie testTrie = new Trie();
        testTrie.insert("Josh");
        testTrie.insert("Dawn");
        testTrie.insert("Jam");
        testTrie.insert("Door");
        System.out.println("should be false: " + String.valueOf(testTrie.search("Da")));
        System.out.println("should be true: " + String.valueOf(testTrie.search("Dawn")));
        System.out.println("should be false: " + String.valueOf(testTrie.delete("john")));
        testTrie.delete("josh");
        testTrie.delete("Josh");
        System.out.println("should be false: " + testTrie.search("Josh"));
        System.out.println("should be false: " + testTrie.delete("Jos"));
        System.out.println("should be true: " + testTrie.search("Jam"));
    }
}
