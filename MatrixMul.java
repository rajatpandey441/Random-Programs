public class MatrixMul{

    public static int[][] identity(){
        int[][] identityArray = {{1,0},{0,1}};
        return identityArray;
    }

    public static int[][] multiply(int[][] a,int[][] b){
        int[][] c = new int[2][2];
        for(int i=0;i<a.length;i++){
            
            for(int j=0;j<a[0].length;j++){
                int sum = 0;
                for(int k=0;k<a[0].length;k++){
                    sum = sum + (a[i][k]*b[k][j]);
                    c[i][j] = sum;
                }
                
            }
        }
        return c;
    }

    public static int[][] raisePow(int[][] ipMatrix,int pow){

        if(pow == 0){
            return identity();
        }

        int[][] squareOfMat = raisePow(ipMatrix,pow/2);
        if(pow%2 != 0){
            return multiply(multiply(squareOfMat, squareOfMat),ipMatrix);
        }
        else{
            return multiply(squareOfMat, squareOfMat);
        }

    }
    public static void main(String[] args) {
        int[][] theArray = {{1,2},{3,4}};
        
        for(int i=0;i<theArray.length;i++){
            for(int j=0;j<theArray[0].length;j++){
                System.out.print(theArray[i][j]+" ");
            }
            System.out.println("");
        }

        int[][] c = raisePow(theArray,3);
        for(int i=0;i<theArray.length;i++){
            for(int j=0;j<theArray[0].length;j++){
                System.out.print(c[i][j]+" ");
            }
            System.out.println("");
        }

    }

    
}