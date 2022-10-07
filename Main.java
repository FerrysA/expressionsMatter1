
import java.util.Scanner;// библ для ввода с клавиатуры


public class Main {
    public static int expressionsMatter(int a, int b, int c)
    {
        int aa=a+b+c;
        int bb=a+b*c;
        int cc=a*b*c;
        int dd=(a+b)*c;
        int ee=a*(b+c);
        if(aa<bb){aa=bb;}
        if(aa<cc){aa=cc;}
        if(aa<dd){aa=dd;}
        if(aa<ee){aa=ee;}
        return aa;
    }
    private static Scanner inn = new Scanner(System.in);// метод для ввода с клавиатуры

    public static <string> void main(String[] args) {


        System.out.println(expressionsMatter(1,1,1));

    }
}
