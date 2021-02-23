List<Integer> ans = new ArrayList<Integer>();
        for(int val:grades){
            if(val<38 || val%5<3){
                ans.add(val);
            }
            else if(val%5>2){
                val += 5-(val%5);
                ans.add(val);
            }
        }
        return ans;
