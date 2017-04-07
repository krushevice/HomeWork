package by.KrushevskayaE.ui;

import javafx.beans.property.SimpleStringProperty;

public class Plan {
	
	public SimpleStringProperty plan;
	
	public Plan(String newPlan) {
		this.plan = (new SimpleStringProperty(newPlan));
	}
	
	public void setPlan(String newPlan) {
		plan.set(newPlan);
	}

	public String getPlan() {
		return plan.get();
	}

}