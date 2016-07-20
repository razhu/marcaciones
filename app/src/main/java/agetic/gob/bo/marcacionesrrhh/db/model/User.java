package agetic.gob.bo.marcacionesrrhh.db.model;

/**
 * Created by ramiro on 20-07-16.
 */
public class User {
    private String _token;
    private String _uid;
    private String _password;
    private String _name;
    private String _email;
    private String _position;

    public User(String _token, String _position, String _email, String _name, String _password, String _uid) {
        this._token = _token;
        this._position = _position;
        this._email = _email;
        this._name = _name;
        this._password = _password;
        this._uid = _uid;
    }

    public String get_token() {
        return _token;
    }

    public void set_token(String _token) {
        this._token = _token;
    }

    public String get_position() {
        return _position;
    }

    public void set_position(String _position) {
        this._position = _position;
    }

    public String get_email() {
        return _email;
    }

    public void set_email(String _email) {
        this._email = _email;
    }

    public String get_name() {
        return _name;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    public String get_password() {
        return _password;
    }

    public void set_password(String _password) {
        this._password = _password;
    }

    public String get_uid() {
        return _uid;
    }

    public void set_uid(String _uid) {
        this._uid = _uid;
    }
}
