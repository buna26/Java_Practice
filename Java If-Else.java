class Solution{
    public static void main(String [] args){
        int N;
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        if(N%2!=0){
            System.out.println("Weird");
        }
        else{
            if(N>=2 && N<=5){
                System.out.println("Not Weird");
            }
            if(N>=6 && N<=20){
                System.out.println("Weird");
            }
            if(N>20){
                System.out.println("Not Weird");
            }
        }
    }
}
