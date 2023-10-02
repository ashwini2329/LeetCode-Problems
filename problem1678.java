public class problem1678 {
    public static void main(String[] args) {
        String command = "(al)G(al)()()G";
        String result = "";

        for (int i = 0; i < command.length(); i++) {
            if (Character.compare('G', command.charAt(i)) == 0) {
                result += "G";
            } else if ((Character.compare('(', command.charAt(i)) == 0)
                    &&
                    (Character.compare(')', command.charAt(i + 1)) == 0)) {
                result += 'o';
                i = i + 1;
            } else {
                result += "al";
                i = i + 3;
            }
            System.out.println("result at " + i + " = " + result);
        }

        System.out.println("result = " + result);
    }
}
