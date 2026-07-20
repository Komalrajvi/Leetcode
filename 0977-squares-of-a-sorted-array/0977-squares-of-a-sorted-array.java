class Solution {
    public int[] sortedSquares(int[] num) {
        int n = num.length;
        int[] result = new int[n];
        //Two Pointer approch
        int left = 0;
        int right = n-1;

        for(int i = n-1; i >= 0; i--){
            if(Math.abs(num[left]) > Math.abs(num[right])){
                result[i]= num[left]*num[left];
                left++;
            }else{
                result[i] =num[right]*num[right];
                right--;
            }
        }
        
        return result;        
        }  
    }




