package moises.com.testgreendao3.database;


import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;

@Entity(nameInDb = "person")
public class Person {
    protected String email;

    @Generated(hash = 208501037)
    public Person(String email) {
        this.email = email;
    }

    @Generated(hash = 1024547259)
    public Person() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
