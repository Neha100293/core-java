package com.corejava.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class MysqlDemoPro {

	public static void main(String[] args) throws SQLException {

		String url = "jdbc:mysql://localhost:3306/MysqlDemoProDB";
		String username = "root";
		String password = "root";

		Connection con = DriverManager.getConnection(url, username, password);

		Statement stmt = con.createStatement();
		ResultSet rs;
		PreparedStatement st;

		String qry = "";

		Scanner in = new Scanner(System.in);
		Scanner str = new Scanner(System.in);
		int id, age, choice;
		String name, city;

		while (true) {
			System.out.println("MySQL Java CRUD Operation");
			System.out.println("1. Insert");
			System.out.println("2. Update");
			System.out.println("3. Delete");
			System.out.println("4. Select");
			System.out.println("5. Exit");
			System.out.print("Enter a choice: ");
			choice = in.nextInt();
			System.out.println("-----------------------------------------");

			switch (choice) {
			case 1:
				System.out.println("1. Insert New Data");

				System.out.println("Enter Name : ");
				name = str.nextLine();
				System.out.println("Enter Age : ");
				age = in.nextInt();
				System.out.println("Enter City : ");
				city = str.nextLine();
				qry = "insert into user (NAME,AGE,CITY) values(?,?,?)";
				st = con.prepareStatement(qry);
				st.setString(1, name);
				st.setInt(2, age);
				st.setString(3, city);
				st.executeUpdate();
				System.out.println("Data insert suessesfully");

				break;
			case 2:
				System.out.println("2.Updating Data");

				System.out.println("Emter Id :");
				id = in.nextInt();
				System.out.println("Enter Name : ");
				name = str.nextLine();
				System.out.println("Enter Age : ");
				age = in.nextInt();
				System.out.println("Enter City : ");
				city = str.nextLine();

				qry = "Update user set NAME=?,AGE=?,CITY=? where ID=?";

				st = con.prepareStatement(qry);
				st.setString(1, name);
				st.setInt(2, age);
				st.setString(3, city);
				st.setInt(4, id);
				st.executeUpdate();
				System.out.println("Data update suessfully");

				break;

			case 3:
				System.out.println("3. Deleting a Data");
				System.out.println("Enter ID :");
				id = in.nextInt();
				qry = "delete from user where id=?";
				st = con.prepareStatement(qry);
				st.setInt(1, id);
				st.executeUpdate();
				System.out.println("Data deleted");

				break;
			case 4:
				System.out.println("4. Print all Records");
				System.out.println("Enter Id:");
				id = in.nextInt();
				System.out.println("Enter Name :");
				name = str.nextLine();
				System.out.println("Enter Age :");
				age = in.nextInt();
				System.out.println("Enter City :");

				qry = "select * from user ";
				rs = stmt.executeQuery(qry);
				while (rs.next()) {
					id = rs.getInt("ID");
					name = rs.getString("Name:");
					age = rs.getInt("Age :");
					city = rs.getString("City");
					System.out.print(id + " ");
					System.out.print(name + " ");
					System.out.print(age + " ");
					System.out.println(city + " ");

				}

				break;

			case 5:
				System.out.println("Thank You");
				System.exit(0);
				break;

			default:
				System.out.println("Invalid Selection");
				break;
			}
			
			System.out.println("-------------------------");
		}
	}

}
