package com.tachfour.solarloadcalculator;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQueryBuilder;

import com.readystatesoftware.sqliteasset.SQLiteAssetHelper;
import com.tachfour.solarloadcalculator.model.ListApplianceItem;

import java.util.ArrayList;
import java.util.List;

public class DatabaseOpenHelper extends SQLiteAssetHelper {

    private static final String DATABASE_NAME="table_six.db";
    private static final int DATABASE_VERSION=1;

    public DatabaseOpenHelper(Context context){

        super(context,DATABASE_NAME,null,DATABASE_VERSION);

    }
//fun to get all appliance  table item
    public List<ListApplianceItem>getApplianceitem(){

        SQLiteDatabase db=getReadableDatabase();
        SQLiteQueryBuilder qb=new SQLiteQueryBuilder();

        String[]sqlselect={"Lighting and small Appliances","Wattage"};
        String tableName="tbl_six";
        qb.setTables(tableName);
        Cursor cursor=qb.query(db,sqlselect,null,null,null,null,null);
        List<ListApplianceItem>result=new ArrayList<>();
        if (cursor.moveToFirst()){
            do {

                ListApplianceItem listApplianceItem=new ListApplianceItem();
                listApplianceItem.setSmallappliance(cursor.getString(cursor.getColumnIndex("Lighting and small Appliances")));
                listApplianceItem.setWattage(cursor.getInt(cursor.getColumnIndex("Wattage")));

                result.add(listApplianceItem);

            }while (cursor.moveToNext());

        }
        return result;
    }

    //fun to get appliance item name
    public List<String> getAppliancename(){

        SQLiteDatabase db=getReadableDatabase();
        SQLiteQueryBuilder qb=new SQLiteQueryBuilder();

        String[]sqlselect={"Lighting and small Appliances"};
        String tableName="tbl_six";
        qb.setTables(tableName);
        Cursor cursor=qb.query(db,sqlselect,null,null,null,null,null);
        List<String>result=new ArrayList<>();
        if (cursor.moveToFirst()){
            do {



                result.add(cursor.getString(cursor.getColumnIndex("Lighting and small Appliances")));

            }while (cursor.moveToNext());

        }
        return result;
    }

    //fun to get Lighting and small Appliances by item name

    public List<ListApplianceItem>getApplianceByName(String name){

        SQLiteDatabase db=getReadableDatabase();
        SQLiteQueryBuilder qb=new SQLiteQueryBuilder();

        String[]sqlselect={"Lighting and small Appliances","Wattage"};
        String tableName="tbl_six";
        qb.setTables(tableName);

        //this will like query :select * from Appliance where appliance name like.

        Cursor cursor=qb.query(db,sqlselect,"Name Like?",new String[]{"%"+name+"%"},null,null,null);
        List<ListApplianceItem>result=new ArrayList<>();
        if (cursor.moveToFirst()){
            do {

                ListApplianceItem listApplianceItem=new ListApplianceItem();
                listApplianceItem.setSmallappliance(cursor.getString(cursor.getColumnIndex("Lighting and small Appliances")));
                listApplianceItem.setWattage(cursor.getInt(cursor.getColumnIndex("Wattage")));

                result.add(listApplianceItem);

            }while (cursor.moveToNext());

        }
        return result;

    }
}
