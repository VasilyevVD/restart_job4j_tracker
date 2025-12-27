package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.*;

class PointTest {

    @Test
    void whenPoints00And20Then2() {
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        a.distance(b);
        double expected = 2.0;
        double value = 0.01f;
        assertThat(a.distance(b)).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenPointsMinus1Minus1And1And1Then2Dot83() {
        Point a = new Point(-1, -1);
        Point b = new Point(1, 1);
        a.distance(b);
        double expected = 2.83;
        double value = 0.01f;
        assertThat(a.distance(b)).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenPointsMinus2Minus2And2And2Then5Dot66() {
        Point a = new Point(-2, -2);
        Point b = new Point(2, 2);
        a.distance(b);
        double expected = 5.66;
        double value = 0.01f;
        assertThat(a.distance(b)).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenPoints223And444Then3() {
        Point c = new Point(2, 2, 3);
        Point d = new Point(4, 4, 4);
        c.distance3d(d);
        double expected = 3;
        double value = 0.01f;
        assertThat(c.distance3d(d)).isEqualTo(expected, withPrecision(0.01));
    }
}
