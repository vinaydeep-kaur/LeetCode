class Solution {
    public int percentageLetter(String s, char letter) {
        

        int len = s.length();
        int count = 0;
        for (char c : s.toCharArray()){
            if (letter == c){
                count++;
            }
        }
        return (count*100)/len;
    }
}