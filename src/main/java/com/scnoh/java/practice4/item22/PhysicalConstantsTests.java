package com.scnoh.java.practice4.item22;

// 유틸리티 클래스의 상수를 빈번히 사용한다면 정적 임포트를 하여 클래스 이름은 생략할 수 있다.
import static com.scnoh.java.practice4.item22.PhysicalConstants.*;

public class PhysicalConstantsTests {
    double atoms(double mols) {
        return AVOGADROS_NUMBER * mols;
    }
}
