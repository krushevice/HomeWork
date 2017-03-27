package by.KrushevskayaE.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Column;
import java.io.Serializable;
import javafx.beans.property.LongProperty;
import javafx.beans.property.SimpleLongProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class ToDoWithProperties implements Serializable {

    private LongProperty id = new SimpleLongProperty();

    @Column(unique = true)
    private StringProperty plan = new SimpleStringProperty();
	
    public ToDoWithProperties() {
    }

    public ToDoWithProperties(Long id, String plan) {
        setId(id);
        setPlan(plan);
    }

    @Id
    @GeneratedValue
    public Long getId() {
        return id.get();
    }

    public LongProperty idProperty() {
        return id;
    }

    public void setId(Long id) {
        this.id.set(id);
    }

    public String getPlan() {
        return plan.get();
    }

    public StringProperty planProperty() {
        return plan;
    }

    public void setPlan(String plan) {
        this.plan.set(plan);
    }
}
