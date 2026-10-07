package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import i0.d;
import i0.f;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final PorterDuff.Mode f584k = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f586b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f587c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Parcelable f588d;
    public int e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f589f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ColorStateList f590g;
    public PorterDuff.Mode h;
    public String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f591j;

    public IconCompat() {
        this.f585a = -1;
        this.f587c = null;
        this.f588d = null;
        this.e = 0;
        this.f589f = 0;
        this.f590g = null;
        this.h = f584k;
        this.i = null;
    }

    public static Bitmap a(Bitmap bitmap, boolean z4) {
        int iMin = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMin, iMin, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint(3);
        float f10 = iMin;
        float f11 = 0.5f * f10;
        float f12 = 0.9166667f * f11;
        if (z4) {
            float f13 = 0.010416667f * f10;
            paint.setColor(0);
            paint.setShadowLayer(f13, 0.0f, f10 * 0.020833334f, 1023410176);
            canvas.drawCircle(f11, f11, f12, paint);
            paint.setShadowLayer(f13, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f11, f11, f12, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - iMin)) / 2.0f, (-(bitmap.getHeight() - iMin)) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f11, f11, f12, paint);
        canvas.setBitmap(null);
        return bitmapCreateBitmap;
    }

    public static IconCompat b(int i) {
        if (i == 0) {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
        IconCompat iconCompat = new IconCompat(2);
        iconCompat.e = i;
        iconCompat.f586b = "";
        iconCompat.f591j = "";
        return iconCompat;
    }

    public final int c() {
        int i = this.f585a;
        if (i != -1) {
            if (i == 2) {
                return this.e;
            }
            throw new IllegalStateException("called getResId() on " + this);
        }
        int i10 = Build.VERSION.SDK_INT;
        Object obj = this.f586b;
        if (i10 >= 28) {
            return f.a(obj);
        }
        try {
            return ((Integer) obj.getClass().getMethod("getResId", null).invoke(obj, null)).intValue();
        } catch (IllegalAccessException e) {
            Log.e("IconCompat", "Unable to get icon resource", e);
            return 0;
        } catch (NoSuchMethodException e4) {
            Log.e("IconCompat", "Unable to get icon resource", e4);
            return 0;
        } catch (InvocationTargetException e10) {
            Log.e("IconCompat", "Unable to get icon resource", e10);
            return 0;
        }
    }

    public final int d() {
        int i = this.f585a;
        if (i != -1) {
            return i;
        }
        int i10 = Build.VERSION.SDK_INT;
        Object obj = this.f586b;
        if (i10 >= 28) {
            return f.c(obj);
        }
        try {
            return ((Integer) obj.getClass().getMethod("getType", null).invoke(obj, null)).intValue();
        } catch (IllegalAccessException e) {
            Log.e("IconCompat", "Unable to get icon type " + obj, e);
            return -1;
        } catch (NoSuchMethodException e4) {
            Log.e("IconCompat", "Unable to get icon type " + obj, e4);
            return -1;
        } catch (InvocationTargetException e10) {
            Log.e("IconCompat", "Unable to get icon type " + obj, e10);
            return -1;
        }
    }

    public final Uri e() {
        int i = this.f585a;
        if (i == -1) {
            return d.a(this.f586b);
        }
        if (i == 4 || i == 6) {
            return Uri.parse((String) this.f586b);
        }
        throw new IllegalStateException("called getUri() on " + this);
    }

    public final String toString() {
        String str;
        if (this.f585a == -1) {
            return String.valueOf(this.f586b);
        }
        StringBuilder sb2 = new StringBuilder("Icon(typ=");
        switch (this.f585a) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case 3:
                str = "DATA";
                break;
            case 4:
                str = "URI";
                break;
            case 5:
                str = "BITMAP_MASKABLE";
                break;
            case 6:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb2.append(str);
        switch (this.f585a) {
            case 1:
            case 5:
                sb2.append(" size=");
                sb2.append(((Bitmap) this.f586b).getWidth());
                sb2.append("x");
                sb2.append(((Bitmap) this.f586b).getHeight());
                break;
            case 2:
                sb2.append(" pkg=");
                sb2.append(this.f591j);
                sb2.append(" id=");
                sb2.append(String.format("0x%08x", Integer.valueOf(c())));
                break;
            case 3:
                sb2.append(" len=");
                sb2.append(this.e);
                if (this.f589f != 0) {
                    sb2.append(" off=");
                    sb2.append(this.f589f);
                }
                break;
            case 4:
            case 6:
                sb2.append(" uri=");
                sb2.append(this.f586b);
                break;
        }
        if (this.f590g != null) {
            sb2.append(" tint=");
            sb2.append(this.f590g);
        }
        if (this.h != f584k) {
            sb2.append(" mode=");
            sb2.append(this.h);
        }
        sb2.append(")");
        return sb2.toString();
    }

    public IconCompat(int i) {
        this.f587c = null;
        this.f588d = null;
        this.e = 0;
        this.f589f = 0;
        this.f590g = null;
        this.h = f584k;
        this.i = null;
        this.f585a = i;
    }
}
