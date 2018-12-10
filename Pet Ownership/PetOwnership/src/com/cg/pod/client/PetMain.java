package com.cg.pod.client;

import java.sql.SQLException;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//import java.util.ArrayList;
import java.util.Scanner;

import com.cg.pod.db.DatabaseConnection;
import com.cg.pod.entity.PetEntity;
import com.cg.pod.service.PetServiceImpl;
import com.cg.pod.validation.PetValidation;

public class PetMain
{
	public static void main(String[] args) throws SQLException
	{
		PetEntity petEntity=new PetEntity();
		PetServiceImpl petServiceImpl=new PetServiceImpl();
		DatabaseConnection dbc= new  DatabaseConnection();
		PetValidation petValidation=new PetValidation();
		
		System.out.println("\t\tPet Ownership Details\n=======================================================");
		System.out.println("Menu:-> 'What operation do you want to perform'\n");
		System.out.println("1.Add details of pet owners");
		System.out.println("2.Update details");
		System.out.println("3.Remove details of existing pet owners");
		System.out.println("4.View all pet owner details");
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		
		
		
//		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
//		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@10.219.34.3:1521:orcl","trg708","training708");
//		Statement st=con.createStatement();
		System.out.println("Enter pet owner name: ");
		String str=sc.next();
		petEntity.setOwnerName(str);
		petValidation.validateOwnerName(str);
		
		
		System.out.println("Enter pet owner age: ");
		int x=sc.nextInt();
		petEntity.setOwnerAge(x);
		System.out.println("Enter ownerPhNo: ");
		long x1=sc.nextLong();
		petEntity.setOwnerPhNo(x1);
		System.out.println("Enter the last date when pet was Vaccinated: ");
		String str1=sc.next();
		petEntity.setVaccineDate(str1);
		
		System.out.println("Enter the Pet Type like Cat/Dog/Parrot: ");
		String str2=sc.next();
		petEntity.setPetType(str2);
		switch(choice)
		{
			case 1:
//					System.out.println("Enter pet owner name: ");
//					String str=sc.next();
//					petEntity.setOwnerName(str);
//					petValidation.validateOwnerName(str);
//					
//					
//					System.out.println("Enter pet owner age: ");
//					int x=sc.nextInt();
//					petEntity.setOwnerAge(x);
//					System.out.println("Enter ownerPhNo: ");
//					long x1=sc.nextLong();
//					petEntity.setOwnerPhNo(x1);
//					System.out.println("Enter the last date when pet was Vaccinated: ");
//					String str1=sc.next();
//					petEntity.setVaccineDate(str1);
//					
//					System.out.println("Enter the Pet Type like Cat/Dog/Parrot: ");
//					String str2=sc.next();
//					petEntity.setPetType(str2);
					
//				try
//					{
//					Connection cc = dbc.connectInsert();
//					Statement st = cc.createStatement();
//					PreparedStatement pst= cc.prepareStatement("insert into pet_add values(?,?,?,?,?)");
//					
//					pst.setString(1,petEntity.getOwnerName());
//					pst.setInt(2, petEntity.getOwnerAge());
//					pst.setLong(3, petEntity.getOwnerPhNo());
//					pst.setString(4, petEntity.getVaccineDate());
//					pst.setString(5, petEntity.getPetType());
//					pst.executeUpdate();												
//					ResultSet rs=st.executeQuery("select * from pet_add");
//					
//					while(rs.next())
//					{
//						System.out.println(rs.getString(1)+"\t"+rs.getInt(2)+"\t"+rs.getLong(3)+"\t"+rs.getString(4)+"\t"+rs.getString(5));
//						//System.out.println(rs.getString(2));
//					}
//				}
//				catch(SQLException s)
//				{
//					System.out.println(s);
//				}	
				petServiceImpl.add();
			
			
			case 2:
					//petServiceImpl.show1();
				
					break;
			case 3:
					//petServiceImpl.show1();
				
					break;
			case 4:
					
					break;
			default:
					break;
		}
		
		
//		
//		System.out.println("Enter the owner name: ");
//		Scanner sc=new Scanner(System.in);
//		String str=sc.next();
//		petEntity.setOwnerName(str);
//		}

	}
	//sc.close();

}
