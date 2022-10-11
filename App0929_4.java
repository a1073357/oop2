import java.util.*;

class goldClass implements Runnable{

    static int gold = 100;
    int tGold;
    Thread t;

    goldClass(String name){
        tGold = 0;
        t = new Thread(this, name);
        t.start();
    }

    public void run(){

        while(grabGold() == true){
            tGold++;
            System.out.println(t.getName()+"偷到"+tGold+"個金幣");
        }
        System.out.println(t.getName()+"總共偷到"+tGold+"個金幣");
    }
    synchronized private static boolean grabGold(){
        if(gold > 0){
            gold--;
            return true;
        }
        else{
            return false;
        }
    }
}

public class App0929_4{
    public static void main(String[] args) throws Exception{
        goldClass tA = new goldClass("小偷A");
        goldClass tB = new goldClass("小偷B");
        goldClass tC = new goldClass("小偷C");
    }

   }

   

    
