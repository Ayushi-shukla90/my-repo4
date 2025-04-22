
class string1 {

    public static void main(String[] args) {
        String palindrome = "racecarjhdgahaha";
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        char[] arr = palindrome.toCharArray();
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            for (char vowel : vowels) {
                if (arr[i] == vowel) {
                    System.out.println("Vowel found: " + arr[i]);
                    count++;
                }
            }
        }

        System.out.println("Total vowels: " + count);
    }
}
