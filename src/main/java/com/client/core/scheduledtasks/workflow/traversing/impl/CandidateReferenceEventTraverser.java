package com.client.core.scheduledtasks.workflow.traversing.impl;

import com.client.core.soap.model.SubscriptionEvent;
import com.client.core.scheduledtasks.workflow.traversing.AbstractScheduledTasksTraverser;
import com.client.core.scheduledtasks.tools.enumeration.EventType;
import com.client.core.scheduledtasks.model.helper.impl.CandidateReferenceScheduledTaskHelper;

/**
 * A Traverser is passed through a Node work flow and it's instance variables are set for future Event handling.
 * 
 * @author magnus.palm
 * 
 */

public class CandidateReferenceEventTraverser extends AbstractScheduledTasksTraverser<CandidateReferenceScheduledTaskHelper> {

	public CandidateReferenceEventTraverser(SubscriptionEvent event) {
		super(new CandidateReferenceScheduledTaskHelper(event),EventType.getType(event.getEventType()));
	
	}

}