package net.journal.journalApp.controller;

import lombok.Getter;
import net.journal.journalApp.entity.journalEntry;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/journal")
public class JournalEntryController
{
    private Map<Long, journalEntry> journalEnties = new HashMap<>();

    @GetMapping
    public List<journalEntry> getAll()
    {
        return new ArrayList<>(journalEnties.values());
    }

    @PostMapping
    public void createEntry(@RequestBody journalEntry myEntry)
    {
        journalEnties.put(myEntry.getId(), myEntry);
    }

    @GetMapping("id/{myId}")
    public journalEntry getjournalEntryById(@PathVariable Long myId)
    {
        return journalEnties.get(myId);
    }

    @DeleteMapping("id/{myId}")
    public journalEntry deletejournalEntryById(@PathVariable Long myId)
    {
        return journalEnties.remove(myId);
    }

    @PutMapping("id/{Id}")
    public journalEntry deletejournalEntryById(@PathVariable Long Id, @RequestBody journalEntry myEntry)
    {
        return journalEnties.put(Id, myEntry);
    }
}
