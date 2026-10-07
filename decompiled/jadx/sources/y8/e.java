package y8;

import android.content.res.Configuration;
import android.graphics.Typeface;
import android.os.Build;
import com.google.android.gms.internal.ads.zzbbs;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {
    public static Typeface a(Configuration configuration, Typeface typeface) {
        int i;
        if (Build.VERSION.SDK_INT < 31 || (i = configuration.fontWeightAdjustment) == Integer.MAX_VALUE || i == 0 || typeface == null) {
            return null;
        }
        return Typeface.create(typeface, com.bumptech.glide.d.b(typeface.getWeight() + configuration.fontWeightAdjustment, 1, zzbbs.zzq.zzf), typeface.isItalic());
    }
}
