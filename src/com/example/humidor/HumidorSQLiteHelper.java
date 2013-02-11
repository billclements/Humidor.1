package com.example.humidor;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class HumidorSQLiteHelper extends SQLiteOpenHelper {
    // variables needed in the sql statements ant to create the db
	static final String dbName = "HUMIDOR_DB";
	static final String tableName = "HUMIDOR";
	static final String colId = "_id";
	static final String colBrand = "EmployeeName";
	static final String colType = "Age";
	static final String colVitola = "Dept";
	static final String colWrapper = "wrapper";
	static final String colQuantity = "quantity";
	static final int dbVersion = 1;

	//Constructor
	public HumidorSQLiteHelper(Context context) {
		super(context,dbName, null, dbVersion);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		// TODO Auto-generated method stub
		
		db.execSQL("CREATE TABLE "+tableName+" ("+colId+ " INTEGER PRIMARY KEY , "+
			    colBrand+ " TEXT , "+colType+ " TEXT , " +colVitola+ " TEXT ,"+
				colWrapper+ " TEXT , "	+colQuantity+ " INTEGER)");
			  
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub

	}

}
