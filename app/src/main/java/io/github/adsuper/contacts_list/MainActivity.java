package io.github.adsuper.contacts_list;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import io.github.adsuper.contacts_list.cehua_shanchu.SwipeMenuActivity;
import io.github.adsuper.contacts_list.meizu.ContactsActivity;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.btn1)
    Button mBtn1;
    @BindView(R.id.btn2)
    Button mBtn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.btn1, R.id.btn2})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn1:

                startActivity(new Intent(this, ContactsActivity.class));
                break;
            case R.id.btn2:
                break;
        }
    }
}
