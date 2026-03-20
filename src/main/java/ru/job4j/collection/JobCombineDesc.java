package ru.job4j.collection;

import java.util.Comparator;

public class JobCombineDesc implements Comparator<Job> {
    @Override
    public int compare(Job o1, Job o2) {
        return new JobDescByNameLength()
                .thenComparing(new JobDescByName())
                .thenComparing(new JobDescByPriority())
                .compare(o2, o1);
    }
}
