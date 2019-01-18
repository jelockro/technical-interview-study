
public class TestAlgorithms {
    public static void main(String args[]){
        Trie testTrie = new Trie();
        testTrie.insert("Josh");
        testTrie.insert("Dawn");
        testTrie.insert("Jam");
        testTrie.insert("Door");
        System.out.println(testTrie.search("Da"));
        System.out.println(testTrie.search("Dawn"));
    }
}
