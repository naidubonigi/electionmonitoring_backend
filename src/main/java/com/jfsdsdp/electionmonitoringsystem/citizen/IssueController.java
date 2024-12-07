package com.jfsdsdp.electionmonitoringsystem.citizen;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/issues")
public class IssueController {

    private final IssueService issueService;

    @Autowired
    public IssueController(IssueService issueService) {
        this.issueService = issueService;
    }

    @PostMapping
    public ResponseEntity<Issue> reportIssue(@RequestBody Issue issue) {
        Issue savedIssue = issueService.reportIssue(issue);
        return ResponseEntity.ok(savedIssue);
    }

    @GetMapping
    public ResponseEntity<List<Issue>> getAllIssues() {
        List<Issue> issues = issueService.getAllIssues();
        return ResponseEntity.ok(issues);
    }
}
