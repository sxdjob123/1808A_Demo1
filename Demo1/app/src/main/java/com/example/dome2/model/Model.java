package com.example.dome2.model;

import com.example.dome2.User;
import com.example.dome2.Utils;
import com.example.dome2.contract.Contract;

import java.util.List;

public class Model implements Contract.Model {
    private static final String TAG = "Model";
    @Override
    public void getData(Contract.CallBack callBack) {
        List<User> users = Utils.queryAll();
        callBack.getData(users);
    }
}
