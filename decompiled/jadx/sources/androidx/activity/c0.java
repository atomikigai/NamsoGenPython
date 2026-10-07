package androidx.activity;

import android.content.res.Resources;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 extends jc.j implements ic.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c0 f345a = new c0(1);

    @Override // ic.l
    public final Object invoke(Object obj) {
        Resources resources = (Resources) obj;
        jc.i.e(resources, "resources");
        return Boolean.valueOf((resources.getConfiguration().uiMode & 48) == 32);
    }
}
