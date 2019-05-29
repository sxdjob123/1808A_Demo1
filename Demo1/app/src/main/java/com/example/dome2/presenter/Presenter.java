package com.example.dome2.presenter;

import com.example.dome2.User;
import com.example.dome2.contract.Contract;
import com.example.dome2.model.Model;

import java.util.List;

public class Presenter implements Contract.Presenter {
    Contract.View mView;
    Contract.Model mModel;
    public Presenter( Contract.View mView) {
        this.mView = mView;
        mModel = new Model();
    }

    @Override
    public void getData() {
        if (mModel!=null){
            mModel.getData(new Contract.CallBack() {
                @Override
                public void getData(List<User> users) {
                    mView.getData(users);
                }
            });
        }
    }
}
