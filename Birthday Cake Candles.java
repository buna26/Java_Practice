public static int birthdayCakeCandles(List<Integer> candles) {
    int maxHeight = Collections.max(candles);
    int count = 0;
    for(int i=0; i<candles.size(); i++){
        if(maxHeight == candles.get(i)){
            count++;
        }
    }
    return count;
    }
