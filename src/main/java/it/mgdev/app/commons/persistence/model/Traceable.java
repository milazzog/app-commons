package it.mgdev.app.commons.persistence.model;

import java.util.Date;

public interface Traceable extends Identifiable {

    String added_at = "added_at";
    String adder = "adder";
    String modifiedAt = "modified_at";
    String modifier = "modifier";

    Date getAddedAt();

    void setAddedAt(Date addedAt);

    String getAdder();

    void setAdder(String adder);

    Date getModifiedAt();

    void setModifiedAt(Date modifiedAt);

    String getModifier();

    void setModifier(String modifier);
}
