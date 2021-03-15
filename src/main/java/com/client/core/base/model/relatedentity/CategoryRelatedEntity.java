package com.client.core.base.model.relatedentity;

import com.google.common.collect.Sets;

import java.util.Set;

public enum CategoryRelatedEntity implements BullhornRelatedEntity {
    CATEGORY("id", "dateAdded", "name", "enabled", "description", "occupation","type", "skills(id, name)", "specialities(id, name)"),
    SKILL("id", "enabled", "name"),
    SPECIALITY("id", "dateAdded", "enabled", "name");

    CategoryRelatedEntity(String... standardFields) {
        this.standardFields = Sets.newHashSet(standardFields);
    }

    private final Set<String> standardFields;

    @Override
    public Set<String> getDefaultFields() {
        return standardFields;
    }
}
