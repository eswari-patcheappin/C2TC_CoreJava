package java.sql;

public interface CallableStatement {

	int executeUpdate();

	void setInt(int i, int id);

	void setString(int i, String name);

	void setDouble(int i, double salary);

	void close();

}
