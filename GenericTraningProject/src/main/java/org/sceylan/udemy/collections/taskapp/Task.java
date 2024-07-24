package org.sceylan.udemy.collections.taskapp;

import java.util.Comparator;
import java.util.Objects;

public class Task implements Comparable<Task> {
    private String assignee;
    private String projectName;
    private String description;
    private Status status = Status.NOT_ASSIGNED;
    private Priority priority;

    public Task(String projectName, String description) {
        this.projectName = projectName;
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return Objects.equals(projectName, task.projectName) && Objects.equals(description, task.description);
    }

    @Override
    public int hashCode() {
        return 33 * Objects.hash(projectName, description);
    }
    @Override
    public int compareTo(Task other)
    {
        int res = (projectName+description).compareTo(other.projectName+other.description);

        return 1;
    }
}
