package com.example.dome2;

import com.example.dome2.dao.DaoSession;
import com.example.dome2.dao.UserDao;

import java.util.List;

public class Utils {
    public static User queryOne(User user) {
        DaoSession daoSession = MyApplication.getmDaoSession();

        User unique = daoSession.queryBuilder(User.class)
                .where(UserDao.Properties.Titie.eq(user.getTitie()))
                .build()
                .unique();
        return unique;
    }

    public static void insert(User user) {
        DaoSession daoSession = MyApplication.getmDaoSession();

        if (queryOne(user) != null) {
        } else {
            daoSession.insert(user);
        }
    }

    public static List<User> queryAll() {
        DaoSession daoSession = MyApplication.getmDaoSession();
        return daoSession.loadAll(User.class);
    }

}
