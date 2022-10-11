/*假設共有10000張高鐵票，有四台售票機
1.請用多執行緒模擬售票情況
2.每台機器一次可買最多四張票(亂數選擇)
3.請印出每台機器總共賣出的票
4.請考慮同步問題
*/
import java.util.*;

class ticketClass implements Runnable{

    static int ticket = 10000;
    Random random = new Random();
    int tHSR = 1 + random.nextInt(4);
    Thread t;

    ticketClass(String name){
        tHSR = 0;
        t = new Thread(this, name);
        t.start();
    }

    public void run(){
        while(ticketHSR() == true){
            tHSR++;
            System.out.println(t.getName()+"目前為止販售"+tHSR+"張票");
        }
        System.out.println(t.getName()+"總共販售"+tHSR+"張票");
    }

    synchronized private static boolean ticketHSR(){
        if(ticket > 0){
            ticket--;
            return true;
        }
        else{
            return false;
        }
    }
}

public class homework_0929{
    public static void main(String[] args) throws Exception{
        ticketClass tA = new ticketClass("機台A ");
        ticketClass tB = new ticketClass("機台B ");
        ticketClass tC = new ticketClass("機台C ");
        ticketClass tD = new ticketClass("機台D ");
        ticketClass tE = new ticketClass("機台E ");
    }

   }

   

    
