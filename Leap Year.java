        int ans;
        if(((N % 4 == 0) && (N % 100!= 0)) || (N%400 == 0)){
            ans = 1;
        }
        else ans = 0;
        return ans;
