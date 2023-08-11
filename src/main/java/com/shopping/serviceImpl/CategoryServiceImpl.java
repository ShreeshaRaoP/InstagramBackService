package com.shopping.serviceImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.shopping.model.Category;
import com.shopping.service.CategoryService;
import com.shopping.utils.DButil;

@Service
public class CategoryServiceImpl implements CategoryService {
	
	static List<Category> categoryList=new ArrayList();
	
	Connection connection;


	public CategoryServiceImpl() throws ClassNotFoundException {
	
		connection=DButil.getConnection();
		System.out.println();
	}

	
	public List<Category> viewAllCategorys() {
		categoryList.clear();
		System.out.println("Inside viewAllCategory");
		String getCategoryQuery="SELECT * FROM posts";
		
		try {
			PreparedStatement stmt = connection.prepareStatement(getCategoryQuery);
			ResultSet rs=stmt.executeQuery();
			while(rs.next()) {
				
				Category cat=new Category();
				cat.setShortcode(rs.getString(1));
				cat.setLikes(rs.getInt(2));
				cat.setComment(rs.getInt(3));
				cat.setTimestamp(rs.getInt(4));
				
				categoryList.add((Category) cat);
			}
		} 
		catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
		return categoryList;
	
		
	}
	

}