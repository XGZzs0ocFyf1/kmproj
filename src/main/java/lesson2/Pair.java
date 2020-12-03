package lesson2;

import java.util.Objects;

public class Pair {

    private final int MAX;
    private final int MIN;

    public Pair(int min, int max) {
        this.MAX = max;
        this.MIN = min;
    }

    public int getMAX() {
        return MAX;
    }

    public int getMIN() {
        return MIN;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pair pair = (Pair) o;
        return MAX == pair.MAX &&
                MIN == pair.MIN;
    }

    @Override
    public int hashCode() {
        return Objects.hash(MAX, MIN);
    }

    @Override
    public String toString() {
        return "Pair{" +
                "MAX=" + MAX +
                ", MIN=" + MIN +
                '}';
    }




}
