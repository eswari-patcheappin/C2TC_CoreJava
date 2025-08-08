package java.sql;

import com.tnsif.daytwentytwo.preparedstatmentinterface.PreparedStatement;

public interface Connection {

	Statement createStatement(String typeScrollSensitive, String concurUpdatable);

	CallableStatement prepareCall(String string);

	void close();

	PreparedStatement prepareStatement(String query);

}
