package com.client.core.scheduledtasks.model.helper.impl;

import com.bullhornsdk.data.model.entity.core.standard.Specialty;
import com.client.core.base.model.relatedentity.BullhornRelatedEntity;
import com.client.core.base.model.relatedentity.SpecialityRelatedEntity;
import com.client.core.scheduledtasks.model.helper.AbstractScheduledTaskHelper;
import com.client.core.scheduledtasks.model.helper.CustomSubscriptionEvent;

import java.util.Map;
import java.util.Set;

public class SpecialityScheduledTaskHelper extends AbstractScheduledTaskHelper<Specialty> {


    public SpecialityScheduledTaskHelper(CustomSubscriptionEvent event, Map<? extends BullhornRelatedEntity, Set<String>> relatedEntityFields) {
        super(event, Specialty.class, SpecialityRelatedEntity.SPECIALITY, relatedEntityFields);
    }

    public Specialty getSpeciality() {
        return getEntity();
    }

}
