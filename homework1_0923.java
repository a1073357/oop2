import java.util.*;

public class homework1_0923 {
    public static void main(String[] args) throws Exception{
        var textC = new TreeSet<>();
        var textI = new TreeSet<>();
        int n ;
        while(true) {
            n = (int)(Math.random()*(100))+1;
            textC.add(n);
            if(textC.contains(n)==false){
                textC.remove(n);
            }
            System.out.println("第"+textC.size()+"個號碼："+n);
            if(textC.size()>=10){
            break;
            }
            if(n<=70&&n>=30){
                textI.add(n);
            }
            
        }
        System.out.println("物件內元素個數為："+(textC.size()));
        System.out.println("物件內元素的內容："+textC);
        System.out.println("第一個元素內容為："+textC.first());
        System.out.println("最後一個元素內容："+textC.last());
        System.out.println("內容介於30~70者："+textI);
       
    }
                

        
    }
   

    
