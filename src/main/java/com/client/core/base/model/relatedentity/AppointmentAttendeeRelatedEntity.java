package com.client.core.base.model.relatedentity;

import com.google.common.collect.Sets;

import java.util.Set;

public enum AppointmentAttendeeRelatedEntity implements BullhornRelatedEntity {

    APPOINTMENT_ATTENDEE("id", "appointment(id)", "attendee(id)"),
    CANDIDATE("id", "name", "email", "phone", "owner(id,name)"),
    CLIENT_CONTACT("id", "name", "email", "phone", "clientCorporation(id,name)"),
    CORPORATE_USER("id", "name");

    private final Set<String> standardFields;

    AppointmentAttendeeRelatedEntity(String... standardFields) {
        this.standardFields = Sets.newHashSet(standardFields);
    }

    @Override
    public Set<String> getDefaultFields() {
        return standardFields;
    }
}
