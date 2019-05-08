package cn.haps42;

import java.util.concurrent.TimeUnit;

/**
 * @ProjectName: java-concurrency-programming
 * @Package: cn.haps42
 * @ClassName: TryConcurrency
 * @Author: hasp42
 * @Description: ${description}
 * @Date: 2019/5/8 17:48
 * @Version: 1.0
 */
public class TryConcurrency {
    /*
    public static void main(String[] args) {
        browseNews();
        enjoyMusic();
    }
*/

    public static void main(String[] args) {
        new Thread(){
            @Override
            public void run(){
                enjoyMusic();
            }
        }.start();
        browseNews();
    }


    private static void sleep(int seconds){
        try{
            TimeUnit.SECONDS.sleep(seconds);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    private static void browseNews(){
        for (;;) {
            System.out.println("Uh-huh,the good news.");
            sleep(1);
        }
    }

    private static void enjoyMusic(){
        for(;;){
            System.out.println("Uh-huh,the nice music.");
            sleep(1);
        }
    }
}
