package com.example.zhangmengmeng.unity815;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.unity3d.player.UnityPlayerActivity;

public class MainActivity extends UnityPlayerActivity {

    LinearLayout mParent;
//    private UnityPlayer mUnityPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //获取显示Unity视图的父控件
        mParent=(LinearLayout)findViewById(R.id.UnityView);

//        mUnityPlayer = new UnityPlayer(this);


        //上一个
        Button BtnPre=(Button)findViewById(R.id.BtnPre);
        BtnPre.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View arg0)
            {
                //UnityPlayer.UnitySendMessage("GameObject", "ShowPrevious", "");
                //获取Unity视图
                View mView = mUnityPlayer.getView();
                //将Unity视图添加到Android视图中
                mParent.addView(mView);
            }
        });
    }
}
