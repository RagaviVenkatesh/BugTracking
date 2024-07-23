import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.util.List;

import controller.BugTrackingController;
import model.Category;
import model.Developer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException, SQLException {
		
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		BugTrackingController controller = new
				BugTrackingController();
		
		while(true)
		{
			System.out.println("Bug Tracking System");
			System.out.println("1.Add Category");
			System.out.println("2.Update Category");
			System.out.println("3.List All Categories");
			System.out.println("4.Delete Category");
			System.out.println("5.Add Developer");
			System.out.println("6.Update Developer");
			System.out.println("7.List All CaDeveloper");
			System.out.println("8.Delete Developer");
			System.out.println("10.Exit");
			
			
			int choice = Integer.parseInt(br.readLine());
			
			switch(choice)
			{
			case 1:System.out.println("Enter category name: ");
					String name = br.readLine();
					controller.addCategory(new Category(0,name));
					break;
					
			case 2:System.out.println("Enter Category ID");
					int updateCategoryId = Integer.parseInt(br.readLine());
					System.out.println("Enter New Category Name");
					String Updatename = br.readLine();
					controller.updateCategory(new Category(updateCategoryId,Updatename));
					break;
					
			case 3: List<Category> categories = controller.getAllCategories();
					for(Category category: categories)
					{
						System.out.println
						("ID: "+category.getCategoryId()+" Name: "
						+category.getCategoryName());
					}
					break;
					
			case 4:System.out.println("Enter Category ID to be Deleted");
					int deleteCategoryId = Integer.parseInt(br.readLine());
					controller.deleteCategory(deleteCategoryId);
					break;
			
			case 5:System.out.println("Enter developer name: ");
				   String developerName = br.readLine();
				   System.out.println("Enter developer email: ");
				   String email = br.readLine();
				   controller.addDeveloper(new Developer(0,developerName,email));
			break;
			
			case 6:System.out.println("Enter Developer ID");
				int updateDeveloperId = Integer.parseInt(br.readLine());
				System.out.println("Enter New Developer Name");
				String UpdateDevelopername = br.readLine();
				System.out.println("Enter New Developer Email");
				String UpdateDeveloperEmail = br.readLine();
				controller.updateDeveloper(new Developer(updateDeveloperId,UpdateDevelopername,UpdateDeveloperEmail));
				break;
			
			case 7: List<Developer> developers = controller.getAllDevelopers();
					for(Developer Developer: developers)
					{
						System.out.println
						("ID: "+Developer.getDeveloperId()+" Name: "
						+Developer.getName() +
						"Email: "+Developer.getEmail());
					}
					break;
			
			case 8:System.out.println("Enter Developer ID to be Deleted");
					int deleteDeveloperId = Integer.parseInt(br.readLine());
					controller.deleteDeveloper(deleteDeveloperId);
					break;
					
			case 10: System.out.println("Exiting.....");
					return;
					
			}
			
		}
		
		

	}

}
