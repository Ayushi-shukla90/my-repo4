class code{
    public static void main(String[] args){
int[] arr = {1,2,3,4,5,6,7,8,9,10};
  for(int i =0;i<arr.length;i++){
    int digit  = arr[i];
    boolean flag = true;
    for(int j=2;j<arr[i]/2;j++){
        if(digit % j == 0){
            flag = false;
            break;
        }
    }
if(flag){
    System.out.println("not prime");
}
  }
    }
}