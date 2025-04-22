class code{
    public static void main(String[] args){
        int sum = 123;
        int s = 0;
        int e;
        for(int i = 0;i<3;i++){
            e = sum % 10;
            if(e%2 == 0){
                System.out.println("even");
            }
            else{
                System.out.println("odd");
            }
            sum = sum/10;
        }
    }
}