class Solution {
    public int minPartitions(String n) {
        char[] arr = n.toCharArray();

        int max=0;
        for (char c : arr){
            int i = Character.getNumericValue(c);
            if(max < i){
                max= i;
            }
        }

        return max;
    }
}