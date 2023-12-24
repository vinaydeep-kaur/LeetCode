class Solution {
    public int theMaximumAchievableX(int num, int t) {
        int size = num + t;
        for(int i = 0; i < t; i++) size++;
        return size;
    }
}