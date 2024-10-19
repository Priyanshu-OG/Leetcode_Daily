import java.util.*;
class Solution {
    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);
        int i=0;
        int j=skill.length-1;
        long ans=0;
        int pair=0;
        int sum=skill[i]+skill[j];
        while(i<j){
             pair=skill[i]*skill[j];
             if(skill[i]+skill[j]!=sum){
                return -1;
             }
             
             ans=ans+pair;
            i++;
            j--;
        }
        return ans;
        
    }
}