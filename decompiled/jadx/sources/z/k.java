package z;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f10832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f10833b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f10834c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f10835d;

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, q.f10858g);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 1) {
                this.f10834c = typedArrayObtainStyledAttributes.getFloat(index, this.f10834c);
            } else if (index == 0) {
                int i10 = typedArrayObtainStyledAttributes.getInt(index, this.f10832a);
                this.f10832a = i10;
                this.f10832a = m.f10847d[i10];
            } else if (index == 4) {
                this.f10833b = typedArrayObtainStyledAttributes.getInt(index, this.f10833b);
            } else if (index == 3) {
                this.f10835d = typedArrayObtainStyledAttributes.getFloat(index, this.f10835d);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
