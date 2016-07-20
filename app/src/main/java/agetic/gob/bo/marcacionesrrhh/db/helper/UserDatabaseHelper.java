package agetic.gob.bo.marcacionesrrhh.db.helper;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by ramiro on 20-07-16.
 */
public class UserDatabaseHelper extends SQLiteOpenHelper {
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
