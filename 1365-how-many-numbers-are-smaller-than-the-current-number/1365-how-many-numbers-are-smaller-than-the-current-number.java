class Solution {
    public int[] smallerNumbersThanCurrent(int[] num) {
        int n = num.length;
        int[] result = new int[n];
        
        for(int i = 0; i < n; i++){
        int count = 0;
        for(int j = 0; j < n; j++){
        if(num[j] < num[i]){
        count = count+1;
        }
        }

        result[i]=count;
        }

      return result;
        
    }
}