## expressionsMatter1
## 07.10.2022
## [ссылка на задачу](https://www.codewars.com/kata/5ae62fcf252e66d44d00008e) 
# заданные три целых числа a ,b ,c, возвращают наибольшее число, полученное после вставки следующих операторов и скобок: +,*, ()
# пример :
# 1 * (2 + 3) = 5
# 1 * 2 * 3 = 6
# 1 + 2 * 3 = 7
# (1 + 2) * 3 = 9
# Таким образом, максимальное значение, которое можно получить , равно 9.
# реализация 
* public static int expressionsMatter(int a, int b, int c)
*    {
*       int aa=a+b+c;
*       int bb=a+b*c;
*       int cc=a*b*c;
*       int dd=(a+b)*c;
*       int ee=a*(b+c);
*       if(aa<bb){aa=bb;}
*       if(aa<cc){aa=cc;}
*       if(aa<dd){aa=dd;}
*       if(aa<ee){aa=ee;}
*       return aa;
*    }
## Понравившееся решение , автор korsa719
*public class Kata
*{
*    public static int expressionsMatter(int a, int b, int c)
*    {
*      return  Math.max(Math.max(a + b + c, a * b * c),Math.max ((a + b) * c, a * (b + c)));
*    }
*}
