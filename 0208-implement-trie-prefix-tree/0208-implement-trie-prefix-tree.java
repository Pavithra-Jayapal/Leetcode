class TrieNode{
    TrieNode children[]=new TrieNode[26];
    boolean isEnd=false;
   // int precnt=0;
}
class Trie {
    private TrieNode root;
    public Trie() {
         root=new TrieNode();
    }
    
    public void insert(String word) {
        TrieNode node=root;
        for(char ch:word.toCharArray()){
            int i=ch-'a';
            if(node.children[i]==null){
                node.children[i]=new TrieNode();
            }
            node=node.children[i];
           // precnt++;
        }
       // wordcnt++;
        node.isEnd=true;
    }
    
    public boolean search(String word) {
        TrieNode node=find(word);
        return node==null?false:(node.isEnd);
    }
    
    public boolean startsWith(String prefix) {
        TrieNode node=find(prefix);
        return node==null? false:true;
    }
    public TrieNode find(String word){
        TrieNode node=root;
        for(char ch:word.toCharArray()){
            int i=ch-'a';
            if(node.children[i]==null){
                return null;
            }
            node=node.children[i];
        }
        return node;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */