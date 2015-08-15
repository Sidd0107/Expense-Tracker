import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DatabaseConnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection c = null;
		Statement stmt = null;
		try {
			Class.forName("org.sqlite.JDBC");
			c = DriverManager
					.getConnection("jdbc:sqlite:/Users/siddharthgautam/Documents/ExpensetrackingsoftwareVersion3/src/expense.db");
			System.out.println("Opened database successfully");

			stmt = c.createStatement();
			stmt.executeUpdate("Create Table Expenses(Store string, Amount integer Not NULL, Date string NOT NULL, Method string NOT NULL, BillNo string, Who string NOT NULL, Description string);");
			stmt.close();
			c.close();
		} catch (Exception e) {
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
			System.exit(0);
		}
		System.out.println("Table created successfully");
	}

	public static String AllExpenseQuery(String result) {
		try {
			Class.forName("org.sqlite.JDBC");
			Connection c = DriverManager
					.getConnection("jdbc:sqlite:/Users/siddharthgautam/Documents/ExpensetrackingsoftwareVersion3/src/expense.db");
			System.out.println("Opened database successfully");

			Statement stmt = c.createStatement();

			ResultSet rs = stmt.executeQuery("Select * From Expenses;");
			int counter = 0;
			while (rs.next()) {
				counter++;
				String store = rs.getString("Store");
				int amount = rs.getInt("Amount");
				String date = rs.getString("Date");
				String method = rs.getString("Method");
				String billno = rs.getString("BillNo");
				String who = rs.getString("Who");
				String description = rs.getString("Description");
				result = (result + counter + ".\n " + "Store= " + store + "\n"
						+ " Amount= " + amount + "\n" + " Date= " + date + "\n"
						+ " Method= " + method + "\n" + " Bill Number= "
						+ billno + "\n" + " Payer= " + who + "\n"
						+ " Description= " + description + "\n\n");
				System.out.println(result);
				System.out.println("Passed loop");
			}
			rs.close();
			stmt.close();
			c.close();
		} catch (Exception e) {
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
			System.exit(0);
		}
		return result;

	}

	public static void AddExpenseQuery(String Store, int Amount, String Date,
			String method, String billno, String who, String description) {
		try {
			
			Class.forName("org.sqlite.JDBC");
			Connection c = DriverManager
					.getConnection("jdbc:sqlite:/Users/siddharthgautam/Documents/ExpensetrackingsoftwareVersion3/src/expense.db");
			System.out.println("Opened database successfully");

			Statement stmt = c.createStatement();
			System.out.println(Store + Amount + Date + method + billno + who
					+ description);
			stmt.executeUpdate("INSERT INTO Expenses (Store,Amount,Date,Method,BillNo,Who,Description) VALUES ("
					+ "'"
					+ Store
					+ "'"
					+ ","
					+ +Amount
					+ ","
					+ "'"
					+ Date
					+ "'"
					+ ","
					+ "'"
					+ method
					+ "'"
					+ ","
					+ "'"
					+ billno
					+ "'"
					+ ","
					+ "'" + who + "'" + "," + "'" + description + "'" + ");");
			stmt.close();
			c.close();
	
		} catch (Exception e) {
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
			
			
		}
	}
}
