package io.pivotal.pal.tracker;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InMemoryTimeEntryRepository implements TimeEntryRepository {
    private long counter = 1;
    private Map<Long,TimeEntry> timeentries = new HashMap<>();

    public TimeEntry create(TimeEntry timeEntry) {
        long id = counter;
        timeEntry.setId(id);
        counter = counter + 1;
        timeentries.put(id,timeEntry);
        return timeEntry;
    }

    public TimeEntry find(long id) {
        return timeentries.get(id);
    }

    public List<TimeEntry> list() {
        List<TimeEntry> timeEntryList = new ArrayList<>();
        for (TimeEntry t:timeentries.values() ){
            timeEntryList.add(t);
        }
        return timeEntryList;
    }

    public TimeEntry update(long id, TimeEntry timeEntry) {
        if (timeentries.get(id) == null) {
            return null;
        }

        TimeEntry newTimeEntry = timeentries.get(id);
        newTimeEntry.setDate(timeEntry.getDate());
        newTimeEntry.setHours(timeEntry.getHours());
        newTimeEntry.setProjectId(timeEntry.getProjectId());
        newTimeEntry.setUserId(timeEntry.getUserId());
        timeentries.put(id, newTimeEntry);
        return newTimeEntry;
    }

    public void delete(long id) {
        timeentries.remove(id);
    }
}
