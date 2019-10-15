package io.pivotal.pal.tracker;

import java.time.LocalDate;

public class TimeEntry {
    private long projectId;
    private long userId;
    private LocalDate parse;
    private int hours;
    private long timeEntryId;

    public TimeEntry(long projectId, long userId, LocalDate parse, int hours) {

        this.projectId = projectId;
        this.userId = userId;
        this.parse = parse;
        this.hours = hours;
    }

    public TimeEntry(long timeEntryId, long projectId, long userId, LocalDate parse, int hours) {

        this.timeEntryId = timeEntryId;
        this.projectId = projectId;
        this.userId = userId;
        this.parse = parse;
        this.hours = hours;
    }

    public TimeEntry() {

    }

    public Long getId() {
        return timeEntryId;
    }
}
