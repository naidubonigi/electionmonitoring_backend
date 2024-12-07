package com.jfsdsdp.electionmonitoringsystem.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/settings")
@CrossOrigin(origins = "http://localhost:3000", allowCredentials = "true")
public class SystemSettingsController {

    @Autowired
    private SystemSettingsService settingsService;

    @GetMapping
    public SystemSettings getSettings() {
        return settingsService.getSettings();
    }

    @PostMapping
    public SystemSettings updateSettings(@RequestBody SystemSettings settings) {
        return settingsService.saveSettings(settings);
    }
}
