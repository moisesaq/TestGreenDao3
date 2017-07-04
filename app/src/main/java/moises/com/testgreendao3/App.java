package moises.com.testgreendao3;

import android.app.Application;

import org.greenrobot.greendao.database.Database;

import moises.com.testgreendao3.database.DaoMaster;
import moises.com.testgreendao3.database.DaoSession;

public class App extends Application{

    public static final boolean ENCRYPTED = false;

    private static DaoSession daoSession;

    @Override
    public void onCreate() {
        super.onCreate();
        generateGreendao();
    }

    private void generateGreendao(){
        DaoMaster.DevOpenHelper helper = new DaoMaster.DevOpenHelper(this, ENCRYPTED ? "notes-db-encrypted" : "notes-db");
        Database db = ENCRYPTED ? helper.getEncryptedWritableDb("super-secret") : helper.getWritableDb();
        daoSession = new DaoMaster(db).newSession();
    }

    public static DaoSession getDaoSession(){
        return daoSession;
    }
}
