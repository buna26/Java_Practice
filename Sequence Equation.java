static int[] permutationEquation(int[] p) {
        int[] y = new int[p.length];
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<p.length;i++){
            map.put(p[i],i+1);
        }
        for(int i=0;i<p.length;i++){
            y[i] = map.get(map.get(i+1));
        }
        return y;
    }
