package java.sql;

import com.tnsif.daytwentytwo.statementinterface.ResultSet;

public interface Statement {

	int executeUpdate(String sql);

	ResultSet executeQuery(String query);

	void close();


}
