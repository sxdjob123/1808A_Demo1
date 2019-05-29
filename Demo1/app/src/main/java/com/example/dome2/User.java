package com.example.dome2;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;
import org.greenrobot.greendao.annotation.Generated;

@Entity
public class User {

    @Id(autoincrement = true)
    @Property(nameInDb = "lid")
    private Long lid;
    private String titie;
    @Generated(hash = 859270779)
    public User(Long lid, String titie) {
        this.lid = lid;
        this.titie = titie;
    }
    @Generated(hash = 586692638)
    public User() {
    }
    public Long getLid() {
        return this.lid;
    }
    public void setLid(Long lid) {
        this.lid = lid;
    }
    public String getTitie() {
        return this.titie;
    }
    public void setTitie(String titie) {
        this.titie = titie;
    }

}
