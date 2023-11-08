package wk10_MVC_Pattern;

import java.awt.event.*;
import javax.swing.JButton;

public class EmployeeController {
	private EmployeeModel model;
	private EmployeeView view;
	
	public EmployeeController(EmployeeModel model, EmployeeView view) {
		this.model = model;
		this.view = view;
	}
	
	public EmployeeModel getModel() {
		return model;
	}
	public void setModel(EmployeeModel model) {
		this.model = model;
	}
	public EmployeeView getView() {
		return view;
	}
	public void setView(EmployeeView view) {
		this.view = view;
	}
	
	public void updateView() {
		view.printEmployeeDetails(model.getName(), model.getId());
	}
	
	public void showDetails() {
		view.showDetails(model.getName(), model.getId());
	}
	
	public void setEmployyeName(String name) {
		model.setName(name);
	}
}
