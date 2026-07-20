class Solution {
    public int removeDuplicates(int[] arr) {
        int n = arr.length;
        int i = 0; 
        for(int j = 1; j < n; j++){
            if(arr[j] != arr[i]){
            i++;
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=arr[i];
            }

            
        }

            return i+1;

      
    }
}