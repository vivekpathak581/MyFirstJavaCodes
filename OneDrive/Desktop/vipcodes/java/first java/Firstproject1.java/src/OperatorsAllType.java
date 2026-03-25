public class OperatorsAllType {
    public static void main(String[] args){
        int a=6;
        int b=3;
        System.out.println(a==b);
        int c=a+b;
        int d=a-b;
        int e=a*b;
        double f=(double)a/b;
        double g=a%b;
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(a-=b); //Assignment operator
        // == < > <= >= != relational opertor
        // && || ! logical operator
        // -(bitwiseComplement) <<(leftShift) >>(rightShift) >>>(unsignedRightShift) &(bitwiseAnd)
        boolean in=false;
        boolean jin=true;
        System.out.println(in&&jin);
        System.out.println(in||jin);
        // increment and decrement operator ++ --.
        int aloo=123;
        aloo++;
        aloo++;
        System.out.println(aloo);
        aloo--;
        System.out.println(aloo);

    }
}
