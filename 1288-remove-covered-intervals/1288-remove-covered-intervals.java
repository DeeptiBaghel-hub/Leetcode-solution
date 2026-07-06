class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->
            a[0]==b[0]?b[1]-a[1]:a[0]-b[0]
        );
        int c=0;
        int maxEnd=0;
        for(int[] i:intervals){
            if(i[1]>maxEnd){
                c++;
                maxEnd=i[1];
            }
        }
        return c;
    }
}