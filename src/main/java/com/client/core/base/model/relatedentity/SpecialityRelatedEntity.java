package com.client.core.base.model.relatedentity;


import com.google.common.collect.Sets;

import java.util.Set;

public enum SpecialityRelatedEntity implements BullhornRelatedEntity  {

    SPECIALITY("id", "dateAdded", "enabled", "name", "parentCategory");

    private final Set<String> standardFields;

    SpecialityRelatedEntity(String... standardFields) {
        this.standardFields = Sets.newHashSet(standardFields);
    }

    @Override
    public Set<String> getDefaultFields() {
        return standardFields;
    }
}
