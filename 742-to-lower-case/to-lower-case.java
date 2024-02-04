class Solution {
    public String toLowerCase(String s) {
        //return s.toLowerCase();
        char arr[] = s.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(Integer.valueOf(arr[i]) <=90 && Integer.valueOf(arr[i])>=65){
                arr[i]+=32;
            }
        }   
       // System.out.println(Arrays.toString(arr));
        String res = new String(arr);
        return res;
    }
}