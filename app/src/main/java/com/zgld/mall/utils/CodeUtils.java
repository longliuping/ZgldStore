package com.zgld.mall.utils;

import android.content.Context;
import android.graphics.Bitmap;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import com.zgld.mall.UserDataShare;
import com.zgld.mall.beans.YAccount;

import java.util.Hashtable;

/**
 * Created by Am on 2016/5/10.
 */
public class CodeUtils {
    // 生成QR图
    public static Bitmap createImage(Context context,int QR_WIDTH,int QR_HEIGHT) {
        Bitmap bitmap = null;
        YAccount account = new UserDataShare(context).getUserData();
        String text = "我的推荐码："+account.getUserProfile().getUserId()+"";
        try {
            // 需要引入core包
            QRCodeWriter writer = new QRCodeWriter();
            // 把输入的文本转为二维码
            BitMatrix martix = writer.encode(text, BarcodeFormat.QR_CODE,
                    QR_WIDTH, QR_HEIGHT);
            System.out.println("w:" + martix.getWidth() + "h:"
                    + martix.getHeight());
            Hashtable<EncodeHintType, String> hints = new Hashtable<EncodeHintType, String>();
            hints.put(EncodeHintType.CHARACTER_SET, "utf-8");
            BitMatrix bitMatrix = new QRCodeWriter().encode(text,
                    BarcodeFormat.QR_CODE, QR_WIDTH, QR_HEIGHT, hints);
            int[] pixels = new int[QR_WIDTH * QR_HEIGHT];
            for (int y = 0; y < QR_HEIGHT; y++) {
                for (int x = 0; x < QR_WIDTH; x++) {
                    if (bitMatrix.get(x, y)) {
                        pixels[y * QR_WIDTH + x] = 0xff000000;
                    } else {
                        pixels[y * QR_WIDTH + x] = 0xffffffff;
                    }

                }
            }

            bitmap = Bitmap.createBitmap(QR_WIDTH, QR_HEIGHT,
                    Bitmap.Config.ARGB_8888);

            bitmap.setPixels(pixels, 0, QR_WIDTH, 0, 0, QR_WIDTH, QR_HEIGHT);
        } catch (WriterException e) {
            e.printStackTrace();
        }
        return bitmap;
    }
}
