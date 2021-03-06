public static int pickingNumbers(List<Integer> a) {
 
        Collections.sort(a);
        int currentCount=1, maxCount=0;
        int compare = a.get(0);
        for(int i=1; i<a.size(); i++){
            if(Math.abs(a.get(i)-compare)<=1){
                currentCount++;
            }
            else{
                compare = a.get(i);
                currentCount=1;
            }
            maxCount = Math.max(maxCount, currentCount);
        }
        return maxCount;
    }
