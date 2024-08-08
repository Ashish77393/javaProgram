public class StringFirstCharacter {
    public static void main(String[] args) {
        String name = "Ashish kumar singh";
        String temp = "";
        for (int i = 0; i < name.length(); i++) {
            if (i == ' ') {
                temp = temp + (i + 1);
            }
        }
        System.out.println(temp);
    }
}
