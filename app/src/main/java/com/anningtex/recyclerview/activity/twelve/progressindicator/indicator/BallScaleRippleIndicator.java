package com.anningtex.recyclerview.activity.twelve.progressindicator.indicator;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.animation.LinearInterpolator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Song
 */
public class BallScaleRippleIndicator extends BallScaleIndicator {
    @Override
    public void draw(Canvas canvas, Paint paint) {
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(3);
        super.draw(canvas, paint);
    }

    @Override
    public List<Animator> createAnimation() {
        List<Animator> animators = new ArrayList<>();
        ValueAnimator scaleAnim = ValueAnimator.ofFloat(0, 1);
        scaleAnim.setInterpolator(new LinearInterpolator());
        scaleAnim.setDuration(1000);
        scaleAnim.setRepeatCount(-1);
        scaleAnim.addUpdateListener(animation -> {
            scale = (float) animation.getAnimatedValue();
            postInvalidate();
        });
        scaleAnim.start();

        ValueAnimator alphaAnim = ValueAnimator.ofInt(0, 255);
        alphaAnim.setInterpolator(new LinearInterpolator());
        alphaAnim.setDuration(1000);
        alphaAnim.setRepeatCount(-1);
        alphaAnim.addUpdateListener(animation -> {
            alpha = (int) animation.getAnimatedValue();
            postInvalidate();
        });
        alphaAnim.start();

        animators.add(scaleAnim);
        animators.add(alphaAnim);
        return animators;
    }
}