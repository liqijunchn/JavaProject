import java.util.*;
public class testList{
    public static void main(String[] args) {
        List l1=new LinkedList();
        for(int i =0;i<=5;i++){
            l1.add("a"+i);
        }
        System.out.print(l1);
        Boolean tf=l1.get(0) instanceof String;
        System.out.println(tf);
    }
}