package io.pivotal.pal.tracker;

import java.util.List;

public class InMemoryTimeEntryRepository {
    public TimeEntry create(TimeEntry timeEntry) {
        return timeEntry;
    }

    public TimeEntry find(Long id) {
        return null;
    }

    public List<TimeEntry> list() {
        return null;
    }

    public TimeEntry update(Long id, TimeEntry timeEntry) {
        return null;
    }

    public void delete(Long id) {
        return;
    }
}
