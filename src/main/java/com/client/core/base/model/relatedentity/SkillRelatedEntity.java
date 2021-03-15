package com.client.core.base.model.relatedentity;

import com.google.common.collect.Sets;

import java.util.Set;

public enum SkillRelatedEntity implements BullhornRelatedEntity {
    SKILL("id", "enabled", "categories(id, name)", "name"),
    CATEGORY("id", "name", "enabled", "description", "type");

    private final Set<String> standardFields;

    SkillRelatedEntity(String... standardFields) {
        this.standardFields = Sets.newHashSet(standardFields);
    }

    @Override
    public Set<String> getDefaultFields() {
        return standardFields;
    }
}
