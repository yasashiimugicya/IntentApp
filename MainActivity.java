package com.example.intentapp01;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity implements OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //送信ボタンのオブジェクトの取得とイベントリスナ登録
        Button b = (Button)findViewById(R.id.button1);
        b.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        //送信ボタンでなければ何も処理をしない
        if (v.getId() != R.id.button1) {
            return;
        }

        //テキストボックスに入力された文字列を取得
        EditText e = (EditText)findViewById(R.id.editText1);
        String s = e.getText().toString();

        //インテントのオブジェクトを生成
        Intent intent = new Intent(this, NextActivity.class);

        //入力した文字列をインテントに設定
        intent.putExtra("MOJI", s);

        //インテントの実行（画面切替）
        startActivity(intent);
    }

}
