//Number of Primes in a specified range: 
class numberofprimes{
    public static void main(String[] args) {
        int start =5;
        int end = 50;
        int primecount=0;
        for(int i=start;i<=end;i++){
            int count =0;
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count==2){
                primecount++;
            }
        }
        System.out.println(primecount);
    }    
}