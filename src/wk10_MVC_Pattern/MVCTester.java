package wk10_MVC_Pattern;

public class MVCTester {
	public static void main(String[] args) {
		EmployeeModel model = new EmployeeModel();
		model.setName("John Cenna");
		model.setId("1");
		
		EmployeeView view = new  EmployeeView();
		view.showDetails(model.getName(), model.getId());
		 
		EmployeeController controller = new EmployeeController(model,view);
		controller.updateView();
		
		controller.setEmployyeName("John Canna The second");
		controller.updateView();
		
		controller.showDetails();
	}
}
