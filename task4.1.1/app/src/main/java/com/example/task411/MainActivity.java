package com.example.task411;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GestureDetectorCompat;

import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements GestureDetector.OnGestureListener,
        GestureDetector.OnDoubleTapListener {
    GestureDetectorCompat mDetector;
    TextView tvOutput ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvOutput  = findViewById(R.id.tv);
        mDetector = new GestureDetectorCompat(this,this);
        mDetector.setOnDoubleTapListener(this);

    }
    public boolean onTouchEvent(MotionEvent event){
        this.mDetector.onTouchEvent(event);
        // Be sure to call the superclass implementation
        return super.onTouchEvent(event);
    }

    @Override
    public boolean onSingleTapConfirmed(@NonNull MotionEvent e) {
        tvOutput.setText(String.format("onSingleTapConfirmed: %s", e));
        return true;
    }

    @Override
    public boolean onDoubleTap(@NonNull MotionEvent e) {
        tvOutput.setText(String.format("onDoubleTap: %s", e));
        return true;
    }

    @Override
    public boolean onDoubleTapEvent(@NonNull MotionEvent e) {
        tvOutput.setText(String.format("onDoubleTapEvent: %s", e));
        return true;
    }

    @Override
    public boolean onDown(@NonNull MotionEvent e) {
        tvOutput.setText(String.format("onDown: %s", e));
        return false;
    }

    @Override
    public void onShowPress(@NonNull MotionEvent e) {
        tvOutput.setText(String.format("onShowPress: %s", e));
    }

    @Override
    public boolean onSingleTapUp(@NonNull MotionEvent e) {
        tvOutput.setText(String.format("onSingleTapUp: %s", e));
        return true;
    }

    @Override
    public boolean onScroll(@Nullable MotionEvent e1, @NonNull MotionEvent e2, float distanceX, float distanceY) {
        tvOutput.setText(String.format("onScroll: %s%s", e1.toString(), e2));
        return true;
    }

    @Override
    public void onLongPress(@NonNull MotionEvent e) {
        tvOutput.setText(String.format("onLongPress: %s", e));
    }

    @Override
    public boolean onFling(@Nullable MotionEvent e1, @NonNull MotionEvent e2, float velocityX, float velocityY) {
        tvOutput.setText(String.format("onFling: %s%s", e1.toString(), e2));
        return true;
    }
}