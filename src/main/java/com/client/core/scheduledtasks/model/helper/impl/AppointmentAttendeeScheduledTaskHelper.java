package com.client.core.scheduledtasks.model.helper.impl;

import com.bullhornsdk.data.model.entity.core.standard.AppointmentAttendee;
import com.bullhornsdk.data.model.entity.core.standard.Candidate;
import com.bullhornsdk.data.model.entity.core.standard.ClientContact;
import com.bullhornsdk.data.model.entity.core.standard.CorporateUser;
import com.client.core.base.model.relatedentity.AppointmentAttendeeRelatedEntity;
import com.client.core.base.model.relatedentity.BullhornRelatedEntity;
import com.client.core.scheduledtasks.model.helper.AbstractScheduledTaskHelper;
import com.client.core.scheduledtasks.model.helper.CustomSubscriptionEvent;

import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class AppointmentAttendeeScheduledTaskHelper extends AbstractScheduledTaskHelper<AppointmentAttendee> {

    private CorporateUser corporateUser;
    private Candidate candidate;
    private ClientContact clientContact;

    public AppointmentAttendeeScheduledTaskHelper(CustomSubscriptionEvent event, Map<? extends BullhornRelatedEntity, Set<String>> relatedEntityFields) {
        super(event, AppointmentAttendee.class, AppointmentAttendeeRelatedEntity.APPOINTMENT_ATTENDEE, relatedEntityFields);
    }

    public AppointmentAttendee getAppointmentAttendee() {
        return getEntity();
    }

    public Optional<CorporateUser> getCorporateUser() {
        if (corporateUser == null && isPopulated(getAppointmentAttendee().getAttendee())) {
            this.corporateUser = findCorporateUser(getAppointmentAttendee().getId(), AppointmentAttendeeRelatedEntity.CORPORATE_USER);
        }
        return Optional.ofNullable(corporateUser);
    }

    public Optional<Candidate> getCandidate() {
        if (candidate == null && isPopulated(getAppointmentAttendee().getAttendee())) {
            this.candidate = findCandidate(getAppointmentAttendee().getId(), AppointmentAttendeeRelatedEntity.CANDIDATE);
        }
        return Optional.ofNullable(candidate);
    }

    public Optional<ClientContact> getClientContact() {
        if (clientContact == null && isPopulated(getAppointmentAttendee().getAttendee())) {
            this.clientContact = findClientContact(getAppointmentAttendee().getId(), AppointmentAttendeeRelatedEntity.CLIENT_CONTACT);
        }
        return Optional.ofNullable(clientContact);
    }

}
