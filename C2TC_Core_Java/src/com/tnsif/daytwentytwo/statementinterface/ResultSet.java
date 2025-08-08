package com.tnsif.daytwentytwo.statementinterface;

public interface ResultSet {

	boolean next();

	int getInt(int i);

	String getString(int i);

	String getDouble(int i);

	void close();

}
