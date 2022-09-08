package design.designpattern.singleton;

// "인스턴스를 오직 하나"만 제공하는 클래스
// 싱글톤 패턴을 통해 최적화를 하지 않으면 불필요한 인스턴스들이 생성되어 gc가 자주 호출될 가능성이 있다.
// ex) 애플리케이션의 설정 값 등
public class Singleton {
    public static void main(String[] args) {
        Settings settings1 = Settings.getInstance();
        Settings settings2 = Settings.getInstance();

        System.out.println(settings2 == settings1);
    }
}
