public class Client {
    public static void main(String[] args) {
        UserInfoDTO user = new UserInfoDTO();
        Caretaker c = new Caretaker();

        user.setAccount("ZhangSan");
        user.setPassword("123456");
        user.setTelNo("130000000000");
        System.out.println("状态一：");
        user.show();
        c.setMemento(user.saveMemento());
        System.out.println("----------------------");

        user.setPassword("1111111");
        user.setTelNo("13100001111");
        System.out.println("状态二：");
        user.show();
        System.out.println("----------------------");

        user.restoreMemento(c.getMemento());
        System.out.println("回到状态一：");
        user.show();
        System.out.println("----------------------");
    }
}
