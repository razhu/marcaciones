package agetic.gob.bo.marcacionesrrhh.db.helper;

import android.content.ContentValues;
import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import agetic.gob.bo.marcacionesrrhh.db.model.User;

/**
 * Created by ramiro on 20-07-16.
 */
public class UserDatabaseHelper extends SQLiteOpenHelper {
    //database
    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "Rrhh.db";
    private static final String TABLE_NAME = "users";
    //columns
    private static final String COLUMN_ID = "_id";
    private static final String COLUMN_TOKEN = "token";
    private static final String COLUMN_UID = "uid";
    private static final String COLUMN_PASSWORD = "password";
    private static final String COLUMN_NAME = "name";
    private static final String COLUMN_EMAIL = "email";
    private static final String COLUMN_POSITION = "position";
    //query: create table a (b text, c text);
    // CREATE TABLE users (_id INTEGER PRIMARY KEY AUTOINCREMENT, token TEXT, uid TEXT, password TEXT, name TEXT, email TEXT, position TEXT);
    private static final String CREATE_USER_TABLE_QUERY = "CREATE TABLE " + TABLE_NAME +
            " (" + COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "+
            COLUMN_TOKEN + " TEXT, " +
            COLUMN_UID + " TEXT, " +
            COLUMN_PASSWORD + " TEXT, " +
            COLUMN_NAME + " TEXT, " +
            COLUMN_EMAIL + " TEXT, " +
            COLUMN_POSITION + " TEXT" +
            ");";

    public UserDatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        try {
            db.execSQL(CREATE_USER_TABLE_QUERY);
        } catch (SQLException e) {
            Log.d("LOG CREATE TABLE", e.getMessage());
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {

    }
    // add user to db
    public void addUser(User user){
        SQLiteDatabase db = this. getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(COLUMN_TOKEN, user.get_token());
        values.put(COLUMN_UID, user.get_uid());
        values.put(COLUMN_PASSWORD, user.get_password());
        values.put(COLUMN_NAME, user.get_name());
        values.put(COLUMN_EMAIL, user.get_email());
        values.put(COLUMN_POSITION, user.get_position());

    }
}
