
class Solution {

    public int maxArea(int[] heights) {
        int i = 0;
        int j = heights.length-1;


        int maxWater = (j - i) * Math.min(heights[i], heights[j]);


        while (j>i){

            int water = (j - i) * Math.min(heights[i], heights[j]);
            if (water>maxWater) maxWater = water;
            if(heights[i]< heights[j]){
                i++;
            }else{
                j--;
            }


        }    
        return maxWater;


        
    }
}
