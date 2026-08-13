class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int cap=1;
        int i=0;
        int count=candies;
        int arr[]=new int[num_people];
        while(count>0){
            if(i==arr.length && count!=0){
                i=0;
            }

            if(count>cap){
                arr[i]+= cap;
                count=count-cap;
            }
            else if(cap>count){
                arr[i]+=count;
                count=0;
            }else if(count==cap){
                arr[i]+=cap;
                count=0;
            }

            i++;
            cap++;

        
        }

        return arr;
    }
}