package com.jfsdsdp.electionmonitoringsystem.admin;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class SystemSettings {

    @Id
    private Long id; // Singleton pattern (one record only)

    private String appTitle;
    private String notificationEmail;
    private String electionReminder;
    private String timeZone;
    private String defaultLanguage;

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAppTitle() {
        return appTitle;
    }

    public void setAppTitle(String appTitle) {
        this.appTitle = appTitle;
    }

    public String getNotificationEmail() {
        return notificationEmail;
    }

    public void setNotificationEmail(String notificationEmail) {
        this.notificationEmail = notificationEmail;
    }

    public String getElectionReminder() {
        return electionReminder;
    }

    public void setElectionReminder(String electionReminder) {
        this.electionReminder = electionReminder;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public String getDefaultLanguage() {
        return defaultLanguage;
    }

    public void setDefaultLanguage(String defaultLanguage) {
        this.defaultLanguage = defaultLanguage;
    }
}