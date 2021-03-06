int ans = -1;
        int left=0, right=drives.length-1;
        int i=0,j=0;
        Arrays.sort(keyboards);
        Arrays.sort(drives);
        while(left<=right){
            int temp = drives[left];
            drives[left] = drives[right];
            drives[right] = temp;
            left++;
            right--;
        }
        while(i<keyboards.length && j<drives.length){
            int cost = keyboards[i]+drives[j];
            if(cost<=b){
                ans= Math.max(ans, cost);
                i++;
            }
            else j++;
        }
        return ans;
