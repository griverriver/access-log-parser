public class ConditionalStatements {
    public static void main(String[] args) {
        System.out.println(abs(8));
        System.out.println(safeDiv(12,0));
        System.out.println(max(4,8));
        System.out.println(makeDecision(9,9));
        System.out.println(max3(4,7,9));
        System.out.println(sum3(2,5,7));
        System.out.println(sum2(5,5));
        System.out.println(is35(5));
        System.out.println(magic6(1,6));
        System.out.println(age(24));
        System.out.println(day(5));
        printDays("среда");
    }


    public static int abs(int x){
        if (x < 0) return -x;
        return x;
    }

    public static int safeDiv(int x, int y){
        if (y == 0) return 0;
        return x/y;
    }

    public static int max(int x, int y){
        if (x > y) return x;
        return y;
    }

    public static String makeDecision(int x, int y){
        if (x>y) return x + ">" + y;
        if (x<y) return x + "<" + y;
        return x + "==" + y;
    }

    public static int max3(int x, int y, int z){
        if ((x>=y)&&(x>=z)) return x;
        if ((y>=x)&&(y>=z)) return y;
        return z;
    }

    public static boolean sum3(int x, int y, int z){
        return ((x+y==z)||(y+z==x)||(x+z==y));
    }

    public static int sum2(int x, int y){
        if (((x+y)>=10)&&((x+y)<=19)) return 20;
        return x+y;
    }

    public static boolean is35(int x){
        return !(((x%3==0)&&(x%5==0))||((x%3!=0)&&(x%5!=0)));
    }

    public static boolean magic6(int x, int y){
        return ((x==6)||(y==6)||(x+y==6)||(x-y==6)||(y-x==6));
    }

    public static String age(int x){
        if ((x%10==1)&&(x%100!=11)) return x + " год";
        if (((x%10==2)&&(x%100!=12))||((x%10==3)&&(x%100!=13))||((x%10==4)&&(x%100!=14))) return x + " года";
        return x + " лет";
    }

    public static String day(int x){
        String strDay;
        switch (x){
            case 1: strDay = "понедельник"; break;
            case 2: strDay = "вторник"; break;
            case 3: strDay = "среда"; break;
            case 4: strDay = "четверг"; break;
            case 5: strDay = "пятница"; break;
            case 6: strDay = "суббота"; break;
            case 7: strDay = "воскресенье"; break;
            default: strDay = "это не день недели";
        }
        return strDay;
    }

    public static void printDays(String x){
        switch (x){
            case "понедельник":
                System.out.println("понедельник");
            case "вторник":
                System.out.println("вторник");
            case "среда":
                System.out.println("среда");
            case "четверг":
                System.out.println("четверг");
            case "пятница":
                System.out.println("пятница");
            case "суббота":
                System.out.println("суббота");
            case "воскресенье":
                System.out.println("воскресенье"); break;
            default:
                System.out.println("это не день недели");
        }
    }

}
