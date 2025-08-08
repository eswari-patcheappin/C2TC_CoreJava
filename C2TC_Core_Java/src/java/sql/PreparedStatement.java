package java.sql;

public interface PreparedStatement {

	void setInt(int i, int empId);

	void setString(int i, String empName);

	void setDouble(int i, double empSalary);

	int executeUpdate();

	void close();

}
