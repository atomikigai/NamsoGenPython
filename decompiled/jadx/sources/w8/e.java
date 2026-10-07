package w8;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import app.namso_gen.spacehowen.R;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f9743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f9744b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[] f9745c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f9746d;
    public int e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f9747f;

    public e(Context context, AttributeSet attributeSet, int i, int i10) {
        this.f9745c = new int[0];
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.mtrl_progress_track_thickness);
        u8.n.a(context, attributeSet, i, i10);
        int[] iArr = d8.a.f3013b;
        u8.n.b(context, attributeSet, iArr, i, i10, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, i10);
        this.f9743a = android.support.v4.media.session.a.i(context, typedArrayObtainStyledAttributes, 8, dimensionPixelSize);
        this.f9744b = Math.min(android.support.v4.media.session.a.i(context, typedArrayObtainStyledAttributes, 7, 0), this.f9743a / 2);
        this.e = typedArrayObtainStyledAttributes.getInt(4, 0);
        this.f9747f = typedArrayObtainStyledAttributes.getInt(1, 0);
        if (!typedArrayObtainStyledAttributes.hasValue(2)) {
            this.f9745c = new int[]{com.bumptech.glide.c.p(context, R.attr.colorPrimary, -1)};
        } else if (typedArrayObtainStyledAttributes.peekValue(2).type != 1) {
            this.f9745c = new int[]{typedArrayObtainStyledAttributes.getColor(2, -1)};
        } else {
            int[] intArray = context.getResources().getIntArray(typedArrayObtainStyledAttributes.getResourceId(2, -1));
            this.f9745c = intArray;
            if (intArray.length == 0) {
                throw new IllegalArgumentException("indicatorColors cannot be empty when indicatorColor is not used.");
            }
        }
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            this.f9746d = typedArrayObtainStyledAttributes.getColor(6, -1);
        } else {
            this.f9746d = this.f9745c[0];
            TypedArray typedArrayObtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(new int[]{android.R.attr.disabledAlpha});
            float f10 = typedArrayObtainStyledAttributes2.getFloat(0, 0.2f);
            typedArrayObtainStyledAttributes2.recycle();
            this.f9746d = com.bumptech.glide.c.c(this.f9746d, (int) (f10 * 255.0f));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public abstract void a();
}
