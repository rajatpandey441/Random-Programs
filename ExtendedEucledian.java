public class ExtendedEucledian {
    public static int GCD(int a,int b){
        if(b==0)
            return a;
        return GCD(b,a%b);
    }
    public class Pair{
        int x;
        int y;
        int gcd;
        public Pair(int x,int y,int gcd){
            this.x = x;
            this.y = y;
            this.gcd = gcd;
        }
        public Pair(){};
    }
    public static void main(String[] args) {
        int a,b,c;
        a=34;
        b=24;
        c=22;
        int d = GCD(34,24);
        System.out.println(d);
        findExtendedEucledian(a,b,d);

    }
    private static Pair findExtendedEucledian(int a, int b) {
        if(b==0){
            return new Pair(1,0,a);
        }
        Pair thePair = findExtendedEucledian(b,a%b,d);
        int x = thePair.y;
        int y = thePair.x - ((a/b) * thePair.y);
        return new Pair(x,y,thePair.gcd);
    }
}
