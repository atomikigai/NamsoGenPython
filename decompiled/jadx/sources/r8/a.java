package r8;

import android.content.Context;
import app.namso_gen.spacehowen.R;
import com.bumptech.glide.c;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f8214f = (int) Math.round(5.1000000000000005d);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f8215a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f8216b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f8217c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f8218d;
    public final float e;

    public a(Context context) {
        boolean zM = a.a.m(context, R.attr.elevationOverlayEnabled, false);
        int iP = c.p(context, R.attr.elevationOverlayColor, 0);
        int iP2 = c.p(context, R.attr.elevationOverlayAccentColor, 0);
        int iP3 = c.p(context, R.attr.colorSurface, 0);
        float f10 = context.getResources().getDisplayMetrics().density;
        this.f8215a = zM;
        this.f8216b = iP;
        this.f8217c = iP2;
        this.f8218d = iP3;
        this.e = f10;
    }
}
