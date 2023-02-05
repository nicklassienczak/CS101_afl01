public class BrainPuzzle {
    public static boolean alphabeticOrder(String str) {
            for (int i = 0; i < str.length() - 1; i++) {
                char firstChar = str.charAt(i);
                char secondChar = str.charAt(i + 1);
                if (secondChar - firstChar == 1) {
                    return true;
                }
            }

        return false;
    }

        public static void main(String[] args) {
            System.out.println(alphabeticOrder("hello"));
            System.out.println(alphabeticOrder("nope"));

        }
    }
