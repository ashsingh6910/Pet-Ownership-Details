package com.cg.pod.client;

import java.util.Scanner;

import com.cg.pod.entity.PetEntity;
import com.cg.pod.service.PetServiceImpl;

public class PetMain 
{
	public static void main(String[] args)
	{
		PetEntity petEntity=new PetEntity();
		PetServiceImpl petServiceImpl=new PetServiceImpl();
		System.out.println("\t\tPet Ownership Details\n=======================================================");
		System.out.println("Menu:-> 'What operation do you want to perform'\n");
		System.out.println("1.Add details of pet owners");
		System.out.println("2.Remove details of existing pet owners");
		System.out.println("3.Update details");
		System.out.println("4.View all pet owner details");
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		switch(choice)
		{
			case 1:
					System.out.println("Enter pet owner name: ");
					String str=sc.next();
					petEntity.setOwnerName(str);
					petServiceImpl.add1(petEntity.getOwnerName());
					
					break;
			case 2:
			
					break;
			case 3:
				
					break;
			case 4:
					
					break;
		
//		
//		System.out.println("Enter the owner name: ");
//		Scanner sc=new Scanner(System.in);
//		String str=sc.next();
//		petEntity.setOwnerName(str);
//		}
		
	}
	sc.close();
}
}
