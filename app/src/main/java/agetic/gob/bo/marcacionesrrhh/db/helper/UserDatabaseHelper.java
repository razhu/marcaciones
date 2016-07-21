package agetic.gob.bo.marcacionesrrhh.db.helper;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

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
    private static final String COLUMN_EMAILl = "email";
    private static final String COLUMN_POSITION = "position";
    //query: create table a (b text, c text);
    private static final String CREATE_USER_TABLE_QUERY = "create table a (b text, c text);";


/*    private int _id;
    private String _token;
    private String _uid;
    private String _password;
    private String _name;
    private String _email;
    private String _position;*/
    
    public UserDatabaseHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
