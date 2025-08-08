package java.sql;

public interface ResultSet {

	String TYPE_SCROLL_SENSITIVE = null;
	String CONCUR_UPDATABLE = null;

	int getInt(int i);


	void close();


	int getString(int i);

	int getFloat(int i);

	void first();

	void last();

	void next();

	void previous();


	void updateFloat(int i, float salary);


	void updateRow();





}
