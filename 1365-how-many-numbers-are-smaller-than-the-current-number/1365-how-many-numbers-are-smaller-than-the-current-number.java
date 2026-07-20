class Solution {
    public int[] smallerNumbersThanCurrent(int[] num) {
        int n = num.length;
        //copy arr
        int[] arr = num.clone();
         Arrays.sort(arr);

            //hashmap
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int j = 0; j < n; j++){


            if(!map.containsKey(arr[j])){
             map.put(arr[j],j);
               
            }
            }
            int[] result = new int[n];
            for(int i = 0; i < n; i++){
                result[i] = map.get(num[i]);
            }
            return result;

        }
    }

       