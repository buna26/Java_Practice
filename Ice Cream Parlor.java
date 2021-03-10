static int[] icecreamParlor(int m, int[] arr) {
        Map<Integer,Integer> map = new HashMap<>();
        int[] ans = new int[2];
        for(int i=0; i<arr.length; i++){
            if(map.containsKey(m-arr[i])){
               ans[0]=map.get(m-arr[i]);
               ans[1]=i+1;
            }
            else  map.put(arr[i],i+1);
        }
        return ans;
    }
