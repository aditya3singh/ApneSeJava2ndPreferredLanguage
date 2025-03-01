import java.util.*;

class Solution {
    public int maxArea(int[] height) {
        // int maxWater = 0;
        // for (int i = 0; i < height.length; i++) {
        //     for (int j = i + 1; j < height.length; j++) {
        //         int ht = Math.min(height[i], height[j]);
        //         int wth = j - i;
        //         int currWater = ht * wth;
        //         maxWater = Math.max(maxWater,currWater);
        //     }
        // }
        // return maxWater;

        int maxWater = 0;
        int lp = 0;
        int rp = height.length - 1;

        while(lp < rp){
            int ht = Math.min(height[lp], height[rp]);
            int wth = rp - lp;
            int currWater = ht * wth;
            maxWater = Math.max(currWater, maxWater);

            if(height[lp] < height[rp]){
                lp++;
            }else{
                rp--;
            }
        }
        return maxWater;
    }
}
