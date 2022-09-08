package design.designpattern.singleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

// "인스턴스를 오직 하나"만 제공하는 클래스
// 싱글톤 패턴을 통해 최적화를 하지 않으면 불필요한 인스턴스들이 생성되어 gc가 자주 호출될 가능성이 있다.
// ex) 애플리케이션의 설정 값 등
public class Singleton {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Settings settings1 = Settings.getInstance();

        Constructor<Settings> constructor = Settings.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        Settings settings12 = constructor.newInstance();

        System.out.println(settings12 == settings1);
    }
}
