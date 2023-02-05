package com.scnoh.java.practice1.item3;

import java.util.Objects;

public class PhoneNumber {
    private final short areaCode, prefix, lineNum;

    public PhoneNumber(int areaCode, int prefix, int lineNum) {
        this.areaCode = rangeCheck(areaCode, 999, "지역코드");
        this.prefix = rangeCheck(prefix, 999, "프리픽스");
        this.lineNum = rangeCheck(lineNum, 9999, "가입자 번호");
    }

    private static short rangeCheck(int val, int max, String arg) {
        if (val < 0 || val > max) {
            throw new IllegalArgumentException(arg + ": " + val);
        }
        return (short) val;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PhoneNumber)) return false;
        PhoneNumber that = (PhoneNumber) o;
        return areaCode == that.areaCode &&
                prefix == that.prefix &&
                lineNum == that.lineNum;
    }

    @Override
    public int hashCode() {
        int result = Short.hashCode(areaCode);
        result = 31 * Short.hashCode(prefix);
        result = 31 * Short.hashCode(lineNum);

        return result;
    }

    public static void main(String[] args) {
        PhoneNumber phoneNumber = new PhoneNumber(10, 11, 12);
        PhoneNumber phoneNumber2 = new PhoneNumber(10, 11, 12);

        System.out.println("hash code : " + phoneNumber.hashCode());
        System.out.println("hash code 2 : " + phoneNumber2.hashCode());
    }
}
