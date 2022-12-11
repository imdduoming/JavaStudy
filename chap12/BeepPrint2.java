package chap12;

import java.awt.*;

public class BeepPrint2 {
    public static void main(String[] args){
        // 소리가 울리면서 동시에 출력됨
        Runnable beepTask= new BeepTaskn();
        // 아래와 같이 익명 자식 객체를 이용해서 작업 스레드를 만들 수 있음
//        Thread thread = new Thread(
//        @Override
//        public void run() {
//            // 스레드 실행 내용
//            Toolkit toolkit= Toolkit.getDefaultToolkit();
//            for(int i=0;i<5;i++){
//                toolkit.beep();
//                try
//                {
//                    Thread.sleep(500);
//
//                } catch (InterruptedException e) {
//                }
//            }
//        }
//        );
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
