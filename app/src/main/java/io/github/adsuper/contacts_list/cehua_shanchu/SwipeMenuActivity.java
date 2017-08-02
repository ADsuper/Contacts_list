package io.github.adsuper.contacts_list.cehua_shanchu;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

import io.github.adsuper.contacts_list.R;
import io.github.adsuper.contacts_list.meizu.BaseActivity;

public class SwipeMenuActivity extends BaseActivity {
    private List<QQPointBean> list;

    @Override
    public void setContentView() {
        setContentView(R.layout.activity_swipe_recycleview);
    }

    @Override
    public void initViews() {
        initDatas();
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        initToolBar(toolbar, "滑动菜单", true, false);
        SwipeRecycleView swipe_recycleview = (SwipeRecycleView) findViewById(R.id.swipe_recycleview);
        swipe_recycleview.setLayoutManager(new LinearLayoutManager(this));
        swipe_recycleview.addItemDecoration(new MyDividerDecoration());
        SwipeAdapter swipeAdapter = new SwipeAdapter(this,list);
        swipe_recycleview.setAdapter(swipeAdapter);
    }

    private void initDatas() {
        list = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            QQPointBean bean = new QQPointBean((i + 1) * 2);
            list.add(bean);
        }
    }

}
