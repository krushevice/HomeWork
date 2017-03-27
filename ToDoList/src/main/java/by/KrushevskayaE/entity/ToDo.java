package by.KrushevskayaE.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table
public class ToDo implements Serializable{
	
	 @Id
	 @GeneratedValue
	 private Long id;

	 @Column
	 private String plan;

	 public ToDo() {
	 }
	 
	 public ToDo(String plan) {
		 this.plan = plan;
	 }
	 
	 public Long getId() {
	      return id;
	 }

	 public void setId(Long id) {
	      this.id = id;
	 }

	 public String getPlan() {
	      return plan;
	 }

	 public void setPlan(String plan) {
	      this.plan = plan;
	 }

	public void setText(String string) {
		// TODO Auto-generated method stub
		
	}

}
