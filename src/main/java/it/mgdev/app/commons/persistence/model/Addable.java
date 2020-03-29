package it.mgdev.app.commons.persistence.model;

import java.util.Date;

public interface Addable {

    String added_at = "added_at";
    String adder = "adder";

    Date getAddedAt();

    void setAddedAt(Date addedAt);

    String getAdder();

    void setAdder(String adder);
}
