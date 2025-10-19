class arrays{
    public static void main (String args[]){
       //1d array
       int []nums={1,2,3,4};
       for(int n:nums){
        System.out.println(n+" ");
       }
    //2d array
       int [][] arr={{1,2},{3,4}};
       for(int i=0;i<2;i++){
         for(int j=0;j<2;j++){
        System.out.println(arr[i][j]+" ");
        System.out.println();
       }
       }
    }
}