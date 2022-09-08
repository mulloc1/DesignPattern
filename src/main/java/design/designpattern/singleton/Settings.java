package design.designpattern.singleton;

import java.io.Serializable;

public class Settings {

    private Settings() {}

    private static class SettingsHolder {
        public static final Settings instance = new Settings();
    }

    public static Settings getInstance() {
        return SettingsHolder.instance;
    }
}

/*
싱글톤을 구현하는 방법
1. static 멤버 변수와 static 메소드로 구현하기
2. inner class로 구현하기
3. static final 멤버 변수로 구현하기
4. Enum으로 구현하기

싱글톤을 파홰하는 방법
1. 리플렉션을 사용한다.
2. 직렬화 역직렬화를 수행한다.
 */
