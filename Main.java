public class Main {
    public static void main(String[] args) {
        String str = "壱百満";
        try {
            int value = Integer.parseInt(str);
            System.out.println("変換結果: " + value);
        } catch (NumberFormatException e) {
            System.out.println("例外が発生しました: " + e.getMessage());
        }
    }
}
