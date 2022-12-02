package chap12;

import java.awt.*;

public class BeepThread extends Thread{
    // Thread 하위 클래스로부터 작업 스레드 생성
    @Override
    public void run() {
        Toolkit toolkit = Toolkit.getDefaultToolkit();

        for(int i = 0; i < 5; ++i) {
            toolkit.beep();

            try {
                Thread.sleep(500L);
            } catch (InterruptedException var4) {
            }
        }
    }
}
