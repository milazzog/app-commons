package it.mgdev.app.commons.persistence.model;

public interface Identifiable {

    String id = "id";
    String version = "version";

    Long getId();
    int getVersion();
}
