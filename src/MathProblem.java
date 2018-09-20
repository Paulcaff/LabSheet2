public class MathProblem {
    public static void main(String[] args) {
        doCalc();
    }

    public static void doCalc(){
        float a = 1;
        float b = 6;
        float c = -16;

        float ans,ans2 ;

      ans=(float) (-(b)-(Math.sqrt(Math.pow(b,2))-(4*(a*c))))/2*a ;
      ans2=(float) (-(b)+(Math.sqrt(Math.pow(b,2))-(4*(a*c))))/2*a ;

        System.out.println(ans);
        System.out.println(ans2);
    }
}
