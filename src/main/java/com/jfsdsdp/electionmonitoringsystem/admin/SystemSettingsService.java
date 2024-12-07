package com.jfsdsdp.electionmonitoringsystem.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SystemSettingsService {

    @Autowired
    private SystemSettingsRepository settingsRepository;

    public SystemSettings getSettings() {
        return settingsRepository.findById(1L).orElse(new SystemSettings());
    }

    public SystemSettings saveSettings(SystemSettings settings) {
        settings.setId(1L); // Ensure only one record exists
        return settingsRepository.save(settings);
    }
}