static String angryProfessor(int k, int[] a) {
        int count=0;
        String ans;
        for(int i =0; i<a.length; i++){
            if(a[i]<=0){
                count++;
            }
        }
        if(count>=k){
            ans="NO";
        }
        else ans="YES";
        return ans;
    }
