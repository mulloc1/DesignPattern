package design.designpattern.singleton;

// 외부에서 new를 통해 해당 클래스의 인스턴스를 생성하지 못하도록 기본 생성자를 private으로 설정한다.
public class Settings {

    private static Settings instance = new Settings();

    private Settings() {}

//    public static Settings getInstance() {
//        // 멀티 스레딩에서는 해당 조건문에서 경쟁이 발생하여 여러 인스턴스가 생길 여지가 있다.
//        if (instance == null)
//            instance = new Settings();
//        return instance;
//    }

    public static synchronized Settings getInstance() {
        if (instance == null)
            instance = new Settings();
        return instance;
    }
}
