package com.astuetz;

import android.graphics.Paint;
import android.graphics.Rect;
import android.widget.TextView;

/**
 * Created by Lanace on 2017. 2. 8..
 */

public class TextViewWidthUtil {
  private static final String TAG = TextViewWidthUtil.class.getSimpleName();

  public static int getTextWidth(TextView textView) {
    String text = textView.getText().toString();

    Rect bounds = new Rect();
    Paint textPaint = textView.getPaint();
    textPaint.getTextBounds(text, 0, text.length(), bounds);

    return bounds.width();
  }
}
