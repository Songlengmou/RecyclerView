package com.anningtex.recyclerview.activity.twelve.progressindicator.indicator;


import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.animation.LinearInterpolator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Song
 */
public class BallZigZagDeflectIndicator extends BallZigZagIndicator {
    @Override
    public List<Animator> createAnimation() {
        List<Animator> animators = new ArrayList<>();
        float startX = getWidth() / 6;
        float startY = getWidth() / 6;
        for (int i = 0; i < 2; i++) {
            final int index = i;
            ValueAnimator translateXAnim = ValueAnimator.ofFloat(startX, getWidth() - startX, startX, getWidth() - startX, startX);
            if (i == 1) {
                translateXAnim = ValueAnimator.ofFloat(getWidth() - startX, startX, getWidth() - startX, startX, getWidth() - startX);
            }
            ValueAnimator translateYAnim = ValueAnimator.ofFloat(startY, startY, getHeight() - startY, getHeight() - startY, startY);
            if (i == 1) {
                translateYAnim = ValueAnimator.ofFloat(getHeight() - startY, getHeight() - startY, startY, startY, getHeight() - startY);
            }

            translateXAnim.setDuration(2000);
            translateXAnim.setInterpolator(new LinearInterpolator());
            translateXAnim.setRepeatCount(-1);
            translateXAnim.addUpdateListener(animation -> {
                translateX[index] = (float) animation.getAnimatedValue();
                postInvalidate();
            });
            translateXAnim.start();

            translateYAnim.setDuration(2000);
            translateYAnim.setInterpolator(new LinearInterpolator());
            translateYAnim.setRepeatCount(-1);
            translateYAnim.addUpdateListener(animation -> {
                translateY[index] = (float) animation.getAnimatedValue();
                postInvalidate();
            });
            translateYAnim.start();

            animators.add(translateXAnim);
            animators.add(translateYAnim);
        }
        return animators;
    }
}