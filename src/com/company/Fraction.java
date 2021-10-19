package com.company;

public class Fraction{
    public static void main(String[] args){
        getFraction fraction=new getFraction();

        int num1 = 1, den1 = 2,
                num2 = 1, den2 = 2;

        fraction.addFraction(num1, den1, num2, den2);
        System.out.printf("%d/%d + %d/%d is equal to %d/%d\n",
                num1, den1, num2, den2, getFraction.num3, getFraction.den3);
    }

}
class getFraction{
    static int den3,num3;
    static int gcd(int a,int b){
        if (a==0){
            return b;
        }
        return  gcd(b%2,a);
    }
    static void lowest(){
        int CF=gcd(num3,den3);
        den3=den3/CF;
        num3=num3/CF;

    }
    void addFraction(int num1,int num2,int den1,int den2){
        den3=gcd(den1,den2);
        den3=(den1*den2)/den3;
        num3=(num1)*(den3/den1)+(num2)*(den3/den2);
        lowest();
    }


}