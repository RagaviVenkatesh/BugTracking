package controller;

import java.sql.SQLException;
import java.util.List;

import dao.CategoryDAO;
import dao.DeveloperDAO;
import model.Category;
import model.Developer;

public class BugTrackingController {
	
	private final CategoryDAO categoryDAO;
	private final DeveloperDAO developerDAO;
	
	public BugTrackingController()
	{
		this.categoryDAO = new CategoryDAO();
		this.developerDAO = new DeveloperDAO();
	}
	
	public void addCategory(Category category) throws SQLException
	{
		categoryDAO.addCategory(category);
	}
	
	public void updateCategory(Category category) throws SQLException
	{
		categoryDAO.updateCategory(category);
	}
	
	public List<Category> getAllCategories() throws SQLException
	{
		return categoryDAO.getAllCategories();
	}
	
	public void deleteCategory(int categoryId) throws SQLException
	{
		categoryDAO.deleteCategory(categoryId);
	}
	
	public void addDeveloper(Developer developer) throws SQLException
	{
		developerDAO.addDeveloper(developer);
	}
	
	public void updateDeveloper(Developer developer) throws SQLException
	{
		developerDAO.updateDeveloper(developer);
	}
	
	public List<Developer> getAllDevelopers() throws SQLException
	{
		return developerDAO.getAllDevelopers();
	}
	
	public void deleteDeveloper(int developerId) throws SQLException
	{
		developerDAO.deleteDeveloper(developerId);
	}
}
