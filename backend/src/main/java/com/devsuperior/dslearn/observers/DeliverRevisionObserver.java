package com.devsuperior.dslearn.observers;

import com.devsuperior.dslearn.entities.Deliver;

public interface DeliverRevisionObserver {

	void onSaveRevision(Deliver deliver);
	
}
