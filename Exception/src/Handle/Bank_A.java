package Handle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Bank_A {
private static String withdraw;




		public static void deposit(int accountNumber, String accountName, double amount) throws Exception {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root", "root");
		   PreparedStatement preparedStatement = connection.prepareStatement("insert into account(accountNumber,accountName,amount) values(?,?,?)");
		   preparedStatement.setInt(1, accountNumber);
		   preparedStatement.setString(2, accountName);
		   preparedStatement.setDouble(3, amount);
		   preparedStatement.executeUpdate();

		}				
		public static void main(String[] args) throws Exception {


			Bank_A obj = new Bank_A();

				obj.deposit(17, "sejal", 8000);
			System.out.println("Deposit successful");

			
				}

	}

