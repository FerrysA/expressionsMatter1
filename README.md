# expressionsMatter1
# 07.10.2022
# заданные три целых числа a ,b ,c, возвращают наибольшее число, полученное после вставки следующих операторов и скобок: +,*, ()
# пример :
# 1 * (2 + 3) = 5
# 1 * 2 * 3 = 6
# 1 + 2 * 3 = 7
# (1 + 2) * 3 = 9
# Таким образом, максимальное значение, которое можно получить , равно 9.
# реализация 
# public static int expressionsMatter(int a, int b, int c)
#    {
#        int aa=a+b+c;
#        int bb=a+b*c;
#        int cc=a*b*c;
#        int dd=(a+b)*c;
 #       int ee=a*(b+c);
 #       if(aa<bb){aa=bb;}
#        if(aa<cc){aa=cc;}
#        if(aa<dd){aa=dd;}
 #       if(aa<ee){aa=ee;}
#        return aa;
#    }
