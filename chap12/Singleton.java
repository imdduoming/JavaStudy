public class Singleton {
    // 단 1개만 존재해야 하는 객체의 인스턴스, static 으로 선언
    private static Singleton instance;

    // private 생성자로 외부에서 객체 생성을 막음
    private Singleton() {}

    // 외부에서는 getInstance() 로 instance 를 반환해서 이것으로만 인스턴스에 접근이 가능하게함
    public static Singleton getInstance() {
        // getinstance() 가 최초로 호출될 때 , instance 가 null 일 때만 생성
        if (instance == null){
            instance = new Singleton();
        }
        // 그 이후에는 생성해놨던 인쓰턴스 반환
        return instance;
    }
}