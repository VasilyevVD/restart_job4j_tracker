package ru.job4j.collection;

import org.junit.jupiter.api.Test;
import java.util.Comparator;
import static org.assertj.core.api.Assertions.assertThat;

public class JobTest {

    @Test
    public void whenComparatorByNameAndPriority() {
        Comparator<Job> cmpNamePriority = new JobDescByName().thenComparing(new JobDescByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Impl task", 1)
        );
        assertThat(rsl).isEqualTo(1);
    }

    @Test
    public void whenComparatorByNameAsc() {
        Comparator<Job> cmpNameAsc = new JobAscByName();
        int rsl = cmpNameAsc.compare(
                new Job("Ivan", 0),
                new Job("Viktor", 1)
        );
        assertThat(rsl).isLessThan(0);
    }

    @Test
    public void whenComparatorByPriorityAsc() {
        Comparator<Job> cmpPriorityAsc = new JobAscByPriority();
        int rsl = cmpPriorityAsc.compare(
                new Job("Ivan", 0),
                new Job("Viktor", 1)
        );
        assertThat(rsl).isLessThan(0);
    }

    @Test
    public void whenComparatorByNameDesc() {
        Comparator<Job> cmpNameDesc = new JobDescByName();
        int rsl = cmpNameDesc.compare(
                new Job("Ivan", 0),
                new Job("Viktor", 1)
        );
        assertThat(rsl).isGreaterThan(1);
    }

    @Test
    public void whenComparatorByPriorityDesc() {
        Comparator<Job> cmpPriorityDesc = new JobDescByPriority();
        int rsl = cmpPriorityDesc.compare(
                new Job("Ivan", 0),
                new Job("Viktor", 1)
        );
        assertThat(rsl).isGreaterThan(0);
    }

    @Test
    public void whenComparatorCombine() {
        Comparator<Job> cmpCombine = new JobCombineDesc();
        int rsl = cmpCombine.compare(
                new Job("Arina", 0),
                new Job("Artem", 1)
        );
        assertThat(rsl).isLessThan(0);
    }
}