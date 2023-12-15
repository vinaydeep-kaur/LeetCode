class Solution {
    public boolean contains(String word,char x){
        for(char c : word.toCharArray()){
            if  (c==x){
                return true;
            }
        }

        return false;
    }

    public List<Integer> findWordsContaining(String[] words, char x) {
        List < Integer> list = new ArrayList<Integer>();
        for (int i =0; i<words.length; i++){
            if (contains(words[i],x)){
                list.add(i);
            }
        }
        return list;
    }
}