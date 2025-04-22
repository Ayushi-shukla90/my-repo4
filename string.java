class string{
    public static void main(String[] args){
String str ="Hello";
String str1="Hiiii";
for(int i=0;i<=str.length();i++){
    for(int j=0;j<=str1.length();j++){
      if ( str.charAt(i)==str1.charAt(j)){
        System.out.println("equal");
      }
      else{
        System.out.println("not");
      }
    }
}
    }
}