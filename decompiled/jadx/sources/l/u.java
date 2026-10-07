package l;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f6427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e7.i f6428b;

    public u(TextView textView) {
        this.f6427a = textView;
        this.f6428b = new e7.i(textView);
    }

    public final void a(AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = this.f6427a.getContext().obtainStyledAttributes(attributeSet, f.a.i, i, 0);
        try {
            boolean z4 = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            c(z4);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void b(boolean z4) {
        ((fa.c1) this.f6428b.f3489b).C(z4);
    }

    public final void c(boolean z4) {
        ((fa.c1) this.f6428b.f3489b).D(z4);
    }
}
