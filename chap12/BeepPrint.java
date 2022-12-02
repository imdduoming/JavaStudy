package chap12;

public class BeepPrint {
    public static void main(String[] args){
        Runnable beepTask= new BeepTask();
        Thread thread = new Thread(beepTask); // 작업스레드 1 실행
        thread.start();

        for(int i=0;i<5;i++){
            System.out.println("띵");
            try
            {
                Thread.sleep(500);

            } catch (InterruptedException e) {
            }
        }

    }
}
