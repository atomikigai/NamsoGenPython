package a9;

import android.graphics.Paint;
import android.graphics.Path;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static final int[] i = new int[3];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final float[] f247j = {0.0f, 0.5f, 1.0f};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int[] f248k = new int[4];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final float[] f249l = {0.0f, 0.0f, 0.5f, 1.0f};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f251b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Paint f252c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f253d;
    public int e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f254f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Path f255g = new Path();
    public final Paint h;

    public a() {
        Paint paint = new Paint();
        this.h = paint;
        this.f250a = new Paint();
        this.f253d = h0.a.d(-16777216, 68);
        this.e = h0.a.d(-16777216, 20);
        this.f254f = h0.a.d(-16777216, 0);
        this.f250a.setColor(this.f253d);
        paint.setColor(0);
        Paint paint2 = new Paint(4);
        this.f251b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.f252c = new Paint(paint2);
    }
}
