// 자바에서 가장 많이 사용되는 LazyHoler 를 사용한 디자인 패턴
public class Singleton {

    private Singleton() {}

    // private static inner class 인 LazyHolder
    private static class LazyHolder() {
        // LazyHolder 클래스 초기화 과정에서 JVM 이 Thread-Safe 하게 instance 를 생성
        private static final Singleton instance = new Singleton();
    }

    // LazyHolder 의 instance 에 접근하여 반환
    public static Singleton getInstance() {
        return LazyHolder.instance;
    }

}