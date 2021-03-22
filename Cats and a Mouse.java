static String catAndMouse(int x, int y, int z) {
        String ans = "";
        int m = Math.abs(x-z);
        int n = Math.abs(y-z);
        if(m<n){
            ans = "Cat A";
        }
        else if (m>n){
            ans = "Cat B";
        }
        else if (m==n){
            ans = "Mouse C";
        }
        return ans;
    }
