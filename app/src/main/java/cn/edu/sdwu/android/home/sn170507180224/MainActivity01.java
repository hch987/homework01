package cn.edu.sdwu.android.home.sn170507180224;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity01 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main01);


        //获取按钮
        Button button1=(Button) findViewById(R.id.homework_btn1);

        Button button2=(Button) findViewById(R.id.homework_btn2);

    }

	//homework1跳转
    public void startmain(View view){
        //界面跳转
        Intent intent=new Intent(this,homeworkActivity1.class);
        startActivity(intent);
    }



    //homework2跳转
    public void startmain2(View view){
        Intent intent=new Intent(this,homeworkActivity2.class);
        startActivity(intent);
    }
}
