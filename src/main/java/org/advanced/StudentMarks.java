package org.advanced;

import java.util.Objects;

public class StudentMarks implements Comparable<StudentMarks> {

    private int physics;
    private int maths;

    public StudentMarks(int physics, int maths) {
        this.physics = physics;
        this.maths = maths;
    }

    public int getPhysics() {
        return physics;
    }

    public int getMaths() {
        return maths;
    }

    @Override
    public String toString() {
        return "StudentMarks{" +
                "physics=" + physics +
                ", maths=" + maths +
                '}';
    }

    @Override
    public int compareTo(StudentMarks o) {
        return o.maths - this.maths;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        StudentMarks that = (StudentMarks) o;
        return physics == that.physics && maths == that.maths;
    }

    @Override
    public int hashCode() {
        return Objects.hash(physics, maths);
    }
}
