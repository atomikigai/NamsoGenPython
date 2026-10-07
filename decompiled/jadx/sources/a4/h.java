package a4;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements y, k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f145a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f146b;

    public /* synthetic */ h(Context context, int i) {
        this.f145a = i;
        this.f146b = context;
    }

    @Override // a4.k
    public Class a() {
        return Drawable.class;
    }

    @Override // a4.k
    public Object b(Resources resources, int i, Resources.Theme theme) {
        Context context = this.f146b;
        return p3.a.l(context, context, i, theme);
    }

    @Override // a4.k
    public /* bridge */ /* synthetic */ void d(Object obj) {
    }

    @Override // a4.y
    public final x i(e0 e0Var) {
        switch (this.f145a) {
            case 0:
                return new c(this.f146b, this);
            case 1:
                return new c(this.f146b, e0Var.a(Integer.class, AssetFileDescriptor.class));
            default:
                return new t(this.f146b, 1);
        }
    }
}
