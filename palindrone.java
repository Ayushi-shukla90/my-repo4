
class palindrone {

    public static void main(String[] args) {
        String palindrone = "racecar";
        for (int i = 0; i <= palindrone.length(); i++) {
            for (int j = palindrone.length(); j >= 0; j--) {
                if (i == j) {
                    System.out.println("palindrone");
                } else {
                    System.out.println("not");
                }
            }
        }
    }
}
