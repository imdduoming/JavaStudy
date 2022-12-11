// 느린 synchronized 의 성능 개선을 위해 더블 체크 도입
public class Singleton {
    // 단 1개만 존재해야 하는 객체의 인스턴스, static 으로 선언
    private static Singleton instance;

    // private 생성자로 외부에서 객체 생성을 막음
    private Singleton() {}

    // 외부에서는 getInstance() 로 instance 를 반환해서 이것으로만 인스턴스에 접근이 가능하게함
    // 멀티스레드 환경에서 getinstance() 함수 호출시에 발생할 숫 있는 동시성 문제 해결 가능
    public static Singleton getInstance() {
        // 먼저 인스턴스가 널인지 확인
        if(instance == null) {
            // null 이면 synchronized 를 적용하여 스레드 동기화하고 한번더 인스턴스가 널인지 체크
            // 처음부터 synchronized 적용하는 것이 아니라 느리게 , 게으르게 synchronized 적용해서 한번 더 체크
            synchronized(Singleton.class) {
                if(instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }
}