package com.example.dome2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.dome2.contract.Contract;
import com.example.dome2.presenter.Presenter;

import java.util.ArrayList;
import java.util.List;

//郝博渊
public class MainActivity extends AppCompatActivity implements Contract.View {

    private RecyclerView mXcl;
    private MyAdapter mMyAdapter;
    private ArrayList<User> mUsers;
    private Presenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        for (int i = 0; i < 20; i++) {
            User user = new User();
            user.setTitie("张三在第"+i+"山头");
            Utils.insert(user);
        }
        initView();

        initMvp();
    }

    private void initMvp() {
        mPresenter = new Presenter(this);
        mPresenter.getData();
    }

    private void initView() {
        mXcl = (RecyclerView) findViewById(R.id.xcl);
        mMyAdapter = new MyAdapter(this);
        mXcl.setAdapter(mMyAdapter);
        mXcl.setLayoutManager(new LinearLayoutManager(this));
        mXcl.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL));
        mUsers = new ArrayList<>();
    }

    @Override
    public void getData(List<User> users) {
        mUsers.addAll(users);
        mMyAdapter.addUI(mUsers);
    }
}
