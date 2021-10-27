public class Exercise2 {
    public static  int toInt (String string){
        int a=string.length()-1;
        int number=   Character.getNumericValue(string.charAt(a));
        System.out.println(number);

        for (int j=10,i=a-1;i>=0;i--,j=j*10){
            System.out.println("i"+i);
            System.out.println("J"+j);
            System.out.println("number"+number);
            number=number+ Character.getNumericValue(string.charAt(i))*j;
            System.out.println(number);

        }
        return number;
    }
    public  static int toIntWithParse(String word){
        int i=0;
        try {
            i = Integer.parseInt(word);
            System.out.println("i=" + i);
        }catch (NumberFormatException e){
            System.err.println("неправильный ввод");
        }
        return i;
    }
    public static  double toDouble (String string){
        System.out.println("method double----");
        int a=string.length()-1;

        double number=   Character.getNumericValue(string.charAt(a))*0.01;
        System.out.println(number);
        double j=0.1;
        for (int i=a-1;i>=0;i--,j=j*10){
            System.out.println("cycle");
            System.out.println("i"+i);
            System.out.println("J"+j);
            System.out.println("number"+number);
            if (string.charAt(i)=='.'){
                j/=10;
                continue;}
            number=number+ Character.getNumericValue(string.charAt(i))*j;
            System.out.println(number);

        }
        return number;
    }
    public static  double toDouble2 (String string){
        System.out.println("method double 2----");

        int a=string.length()-1;
       double afterPoint= Character.getNumericValue(string.charAt(a))*0.01;


        System.out.println("afterPoint"+afterPoint);
        double j=0.1;
        for (int i=a-1;i>string.length()-3;i--,j=j*10){
            System.out.println("cycle");
            System.out.println("i"+i);
            System.out.println("J"+j);
            System.out.println("number"+afterPoint);

            afterPoint=afterPoint+ Character.getNumericValue(string.charAt(i))*j;
            System.out.println(afterPoint);

        }
        System.out.println("cycle2------");

        int beforePoint= Character.getNumericValue(string.charAt(string.length()-4));
        for (int k=10,i=string.length()-5;i>=0;i--,k=k*10){

            System.out.println("i"+i);
            System.out.println("K"+k);
            System.out.println("num"+beforePoint);

            beforePoint=beforePoint+ Character.getNumericValue(string.charAt(i))*k;
            System.out.println("beforePoint"+beforePoint);

        }
       double number=(double) beforePoint+afterPoint;
        System.out.println("beforePoint"+beforePoint);
        System.out.println("afterPoint"+afterPoint);
        return number;
    }

    public static void main(String[] args) {
        System.out.println("result="+ toInt("1234"));
        System.out.println(toIntWithParse("12345"));
        System.out.println("double = "+toDouble("1234.12"));
        System.out.println("double2 = "+toDouble2("123456789.12"));
    }
}
