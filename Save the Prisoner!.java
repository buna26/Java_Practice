static int saveThePrisoner(int n, int m, int s) {
        int ans = 0;
        while(m > 0){
            ans = s%n;
            s++;
            m--;
        }
        return ans <= 0 ? n : ans;
    }
