package com.anningtex.recyclerview.common;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.anningtex.recyclerview.R;
import com.anningtex.recyclerview.activity.eight.EightActivity;
import com.anningtex.recyclerview.activity.eleven.ElevenActivity;
import com.anningtex.recyclerview.activity.five.FiveActivity;
import com.anningtex.recyclerview.activity.four.FourActivity;
import com.anningtex.recyclerview.activity.nine.NineActivity;
import com.anningtex.recyclerview.activity.one.OneActivity;
import com.anningtex.recyclerview.activity.seven.ContainerActivity;
import com.anningtex.recyclerview.activity.six.SixActivity;
import com.anningtex.recyclerview.activity.ten.TenActivity;
import com.anningtex.recyclerview.activity.three.ThreeActivity;
import com.anningtex.recyclerview.activity.twelve.launch.TwelveActivity;
import com.anningtex.recyclerview.activity.two.TwoActivity;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * @author Administrator
 * desc:  RecyclerView展示
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.tv_one, R.id.tv_two, R.id.tv_three, R.id.tv_four, R.id.tv_five, R.id.tv_six,
            R.id.tv_seven, R.id.tv_eight, R.id.tv_nine, R.id.tv_ten, R.id.tv_eleven, R.id.tv_twelve})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.tv_one:
                startActivity(new Intent(MainActivity.this, OneActivity.class));
                break;
            case R.id.tv_two:
                startActivity(new Intent(MainActivity.this, TwoActivity.class));
                break;
            case R.id.tv_three:
                startActivity(new Intent(MainActivity.this, ThreeActivity.class));
                break;
            case R.id.tv_four:
                startActivity(new Intent(MainActivity.this, FourActivity.class));
                break;
            case R.id.tv_five:
                startActivity(new Intent(MainActivity.this, FiveActivity.class));
                break;
            case R.id.tv_six:
                startActivity(new Intent(MainActivity.this, SixActivity.class));
                break;
            case R.id.tv_seven:
                startActivity(new Intent(MainActivity.this, ContainerActivity.class));
                break;
            case R.id.tv_eight:
                startActivity(new Intent(MainActivity.this, EightActivity.class));
                break;
            case R.id.tv_nine:
                startActivity(new Intent(MainActivity.this, NineActivity.class));
                break;
            case R.id.tv_ten:
                startActivity(new Intent(MainActivity.this, TenActivity.class));
                break;
            case R.id.tv_eleven:
                startActivity(new Intent(MainActivity.this, ElevenActivity.class));
                break;
            case R.id.tv_twelve:
                startActivity(new Intent(MainActivity.this, TwelveActivity.class));
                break;
            default:
                break;
        }
    }
}
