package com.cg.pod.service;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

import com.cg.pod.db.DatabaseConnection;
import com.cg.pod.entity.PetEntity;
import com.cg.pod.validation.PetValidation;
public class PetServiceImpl implements PetServiceInterface
{

	ArrayList<PetEntity> arrayList=new ArrayList<PetEntity>();
	
//	public void abc() {
//		
//		Scanner sc=new Scanner(System.in);
//		String s=sc.nextLine();
//		int age = sc.nextInt();
//
//	PetEntity petEntity1=new PetEntity();
//	
//	petEntity1.setOwnerAge(age);
//	petEntity1.setOwnerName(s);
//	//petEntity1.setOwnerPhNo(23498273);
//	
//	arrayList.add(petEntity1);
//	
////	PetEntity petEntity2=new PetEntity();
//
//	petEntity2.setOwnerAge(54);
//	petEntity2.setOwnerName("sfydj");
//	//petEntity2.setOwnerPhNo(564);
//	
//	arrayList.add(petEntity2);
	
	
//	public PetEntity getPetEntity1() {
//		return petEntity1;
//	}
//	
//	public void setPetEntity1() {
//		
//		petEntity1.setOwnerAge(10);
//		petEntity1.setOwnerName("hjasdg");
//		petEntity1.setOwnerPhNo(89789456);
//		
//	}
//	
//	public ArrayList<PetEntity> getArrayList() {
//		return arrayList;
//	}
//	
//	public void setArrayList(ArrayList<PetEntity> arrayList) {
//		this.arrayList = arrayList;
//	}
//	
//	
//	
//		setPetEntity1();
//		System.out.println(getPetEntity1());
//		
//		arrayList.add(petEntity1);
//		
//		
//		
		
		
		
	//}
	
//	public void show1() {
//		for(PetEntity e: arrayList) {
//			System.out.println("age is"+e.getOwnerAge()+"name is "+e.getOwnerName());
//		}
//		
//	}
//	
//	
//	
//	public PetEntity getPetEntity2() {
//		return petEntity2;
//	}
//	
//	PetEntity petEntity2=new PetEntity();
//	PetEntity petEntity3=new PetEntity();
//	
//	
	

	public void delete() {
		// TODO Auto-generated method stub
		
	}

	public void update() {
		// TODO Auto-generated method stub
		
	}

	public void viewAll() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void add()
	{
		PetEntity petEntity=new PetEntity();
		PetServiceImpl petServiceImpl=new PetServiceImpl();
		DatabaseConnection dbc= new  DatabaseConnection();
		PetValidation petValidation=new PetValidation();
		
		try
		{
		Connection cc = dbc.connectInsert();
		Statement st = cc.createStatement();
		PreparedStatement pst= cc.prepareStatement("insert into pet_add values(?,?,?,?,?)");
		
		pst.setString(1,petEntity.getOwnerName());
		pst.setInt(2, petEntity.getOwnerAge());
		pst.setLong(3, petEntity.getOwnerPhNo());
		pst.setString(4, petEntity.getVaccineDate());
		pst.setString(5, petEntity.getPetType());
		pst.executeUpdate();												
		ResultSet rs=st.executeQuery("select * from pet_add");
		
		while(rs.next())
		{
			System.out.println(rs.getString(1)+"\t"+rs.getInt(2)+"\t"+rs.getLong(3)+"\t"+rs.getString(4)+"\t"+rs.getString(5));
			//System.out.println(rs.getString(2));
		}
	}
	catch(SQLException s)
	{
		System.out.println(s);
	}	
	
	
		
	}


}
