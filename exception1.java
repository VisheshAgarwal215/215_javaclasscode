public class exception1 {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.println(4);
        System.out.println(5);
        System.out.println(6);
        System.out.println(100/2);
            try {
                System.out.println(100/0);
            } catch (Exception e) {
                System.out.println(e);
            }
        System.out.println(9);
    }
}
