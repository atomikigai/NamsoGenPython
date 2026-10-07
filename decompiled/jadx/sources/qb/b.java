package qb;

import android.content.Context;
import android.content.res.TypedArray;
import app.namso_gen.spacehowen.R;
import e0.k;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f8053b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f8054c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f8055d;
    public final int e;

    public b(Context context, TypedArray typedArray) {
        int resourceId = typedArray.getResourceId(11, -1);
        this.f8054c = resourceId <= 0 ? null : Integer.valueOf(resourceId);
        this.f8055d = typedArray.getDimension(10, Float.MAX_VALUE);
        this.f8052a = typedArray.getColor(5, k.getColor(context, R.color.cnb_default_badge_color));
        this.f8053b = typedArray.getColor(12, k.getColor(context, R.color.cnb_default_unselected_color));
        this.e = (int) typedArray.getDimension(6, context.getResources().getDimension(R.dimen.cnb_icon_size));
    }
}
