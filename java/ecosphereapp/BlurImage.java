package com.example.ecosphereapp;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.widget.ImageView;

public class BlurImage {

    public static void blur(Context context, ImageView imageView) {
        // Get bitmap from ImageView
        Drawable drawable = imageView.getDrawable();
        if (drawable == null) return;

        Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();

        Bitmap blurredBitmap = bitmap.copy(Bitmap.Config.ARGB_8888, true);


        RenderScript rs = RenderScript.create(context);

        Allocation input = Allocation.createFromBitmap(rs, blurredBitmap);
        Allocation output = Allocation.createTyped(rs, input.getType());

        ScriptIntrinsicBlur blurScript = ScriptIntrinsicBlur.create(rs, Element.U8_4(rs));

        blurScript.setRadius(10f);
        blurScript.setInput(input);

        blurScript.forEach(output);

        output.copyTo(blurredBitmap);

        imageView.setImageBitmap(blurredBitmap);

        rs.destroy();
    }
}
