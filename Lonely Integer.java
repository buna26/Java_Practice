static int lonelyinteger(int[] a) {
        int ans=0;
        for(int val : a){
            ans ^= val;
        }
        return ans;
    }
