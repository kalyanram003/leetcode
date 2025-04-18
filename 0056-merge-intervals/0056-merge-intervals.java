class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        int[] prev=intervals[0];
        List<int[]> merge=new ArrayList<>();
        for(int i=1;i<intervals.length;i++){
            int[] check=intervals[i];
            if(check[0]<=prev[1]){
                prev[1]=Math.max(prev[1],check[1]);
            }
            else{
                merge.add(prev);
                prev=check;
            }
        }
        merge.add(prev);
        return merge.toArray(new int[merge.size()][]);
    }
}