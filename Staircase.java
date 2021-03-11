static void staircase(int n) {
        for (int i=0; i<n; i++){
            for (int j=(n-2)-i; j>=0; j--){
                System.out.print(" ");
            } 
            for (int j=0; j<=i; j++){
                System.out.print("#");
            }
            System.out.println();
        }       
    }
