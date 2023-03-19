package com.scnoh.java.practice4.item17;

import java.util.Comparator;
import java.util.Objects;

// 불변 클래스의 예
// 클래스 자체를 final로 선언하여 상속을 막을 수 있다.
// 정적  팩터리 메서드를 제공하여 인스턴스를 만든다. (이 방식이 최선)
public class Complex {
    private final double re;
    private final double im;

    public static Complex valueOf(double re, double im) {
        return new Complex(re, im);
    }

    public Complex(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public double realPart() { return re; }
    public double imaginarayPart() { return im; }

    public Complex plus(Complex c) {
        return new Complex(re + c.re, im + c.im);
    }

    public Complex minus(Complex c) {
        return new Complex(re - c.re, im - c.im);
    }

    public Complex times(Complex c) {
        return new Complex(re * c.re - im * c.im,
                        re * c.im + im * c.re);
    }

    public Complex divideBy(Complex c) {
        double tmp = c.re * c.re + c.im * c.im;
        return new Complex((re * c.re + im * c.im) / tmp,
                (im * c.re - re * c.im) / tmp);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Complex)) return false;
        Complex complex = (Complex) o;

        // == 대신 compare 사용하는 이유는 float, double 필드는 정적 메서드인
        // Float.compare(float, float), Double.compare(Double, Double)로 비교한다.
        return Double.compare(complex.re, re) == 0 && Double.compare(complex.im, im) == 0;
    }

    @Override
    public int hashCode() {
        return 31 * Double.hashCode(re) + Double.hashCode(im);
    }

    @Override
    public String toString() {
        return "(" + re +" + " + im +"i)";
    }
}
