static int hurdleRace(int k, int[] height) {
        int max = height[0];
        int doses=0;
        for(int i=0; i<height.length; i++){
            if (height[i] > max) 
                max = height[i];
                doses= max-k;
                if(doses<0){
                    doses=0;
                }
        }
        return doses;
    }
