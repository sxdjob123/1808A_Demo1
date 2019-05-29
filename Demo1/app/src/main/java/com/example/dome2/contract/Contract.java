package com.example.dome2.contract;

import com.example.dome2.User;

import java.util.List;

public interface Contract {
    interface Model {
        void getData(CallBack callBack);
    }

    interface View {
        void getData(List<User> users);
    }

    interface Presenter {
        void getData();
    }
    interface CallBack {
        void getData(List<User> users);
    }
}
