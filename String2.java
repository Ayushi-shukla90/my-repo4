class String2{
    public static void main(String[] args){
String str = "hhllohyeeeee";
String newStr = "";
int count = 0;
for(int i = 0;i<str.length();i++){
    char c = str.charAt(i);
    if(newStr.indexOf(c) == -1){
        newStr = newStr + c;
        count ++;
    }
}
System.out.println(newStr+"  "+ count);
    }
}