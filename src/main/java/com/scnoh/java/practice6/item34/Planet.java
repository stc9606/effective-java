package com.scnoh.java.practice6.item34;

public enum Planet {
    MERCURY(),
    VENUS(),
    EARTH(),
    MARS(),
    JUPITER(),
    SATURN(),
    URANUS(),
    NEPTUNE();

    private final double mass;
    private final double radius;
    private final double surfaceGravity;

    // 중력상수 (단위: m^3 / kg s^2)
    private static final double G = 6.67300E-11;

    Planet(double mass, double radius) {
        this.mass = mass;
        this.radius = radius;
        this.surfaceGravity = G * mass / (radius * radius);
    }

    public double mass() {
        return mass;
    }

    public double radius() {
        return radius;
    }

    public double surfaceGravity() {
        return surfaceGravity;
    }

    public double surfaceWeight(double mass) {
        return mass * surfaceGravity;
    }
}
