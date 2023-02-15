public class SieveOfEratosthenes{

    public static void main(String[] args) {
        int[] primes = sieve(15);
        for(int i=0;i<15;i++){
            System.out.print(primes[i] + " ");
        }
    }

    private static int[] sieve(int num) {
        int[] primes = new int[num];
        for(int i=0;i<num;i++){
            primes[i] = 1;
        }
        primes[0] = primes[1] = 0;
        for(int i=2;i<num;i++){
            if(primes[i] == 1){
                for(int j = i*i ;j<num;j=j+i){
                    primes[j] = 0;
                }
            }
            if((i*i) > num){
                break;
            }
        }
        return primes;
    }
}