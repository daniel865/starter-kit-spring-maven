package com.client.core.scheduledtasks.model.helper.impl;

import com.bullhornsdk.data.model.entity.core.standard.Category;
import com.bullhornsdk.data.model.entity.core.standard.Skill;
import com.bullhornsdk.data.model.entity.core.standard.Specialty;
import com.client.core.base.model.relatedentity.BullhornRelatedEntity;
import com.client.core.base.model.relatedentity.CategoryRelatedEntity;
import com.client.core.scheduledtasks.model.helper.AbstractScheduledTaskHelper;
import com.client.core.scheduledtasks.model.helper.CustomSubscriptionEvent;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class CategoryScheduledTaskHelper extends AbstractScheduledTaskHelper<Category> {

    private List<Skill> skills;
    private List<Specialty> specialties;

    public CategoryScheduledTaskHelper(CustomSubscriptionEvent event, Map<? extends BullhornRelatedEntity, Set<String>> relatedEntityFields) {
        super(event, Category.class, CategoryRelatedEntity.CATEGORY, relatedEntityFields);
    }

    public Category getCategory() {
        return getEntity();
    }

    public List<Skill> getSkills() {
        if (skills == null) {
            this.skills = getSkills(getCategory().getId());
        }
        return skills;
    }

    public List<Specialty> getSpecialties() {
        if (specialties == null) {
            this.specialties = getSpecialities(getCategory().getId());
        }
        return specialties;
    }

}
