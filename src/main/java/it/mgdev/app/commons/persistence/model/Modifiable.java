package it.mgdev.app.commons.persistence.model;

import java.util.Date;

public interface Modifiable extends Addable {

    String modifiedAt = "modified_at";
    String modifier = "modifier";

    Date getModifiedAt();

    void setModifiedAt(Date modifiedAt);

    String getModifier();

    void setModifier(String modifier);
}
