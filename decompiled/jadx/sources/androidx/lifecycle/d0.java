package androidx.lifecycle;

import android.os.Handler;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 implements r {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final d0 f1038t = new d0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1040b;
    public Handler e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f1041c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f1042d = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f1043f = new t(this);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final androidx.activity.d f1044r = new androidx.activity.d(this, 4);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e7.i f1045s = new e7.i(this, 8);

    public final void a() {
        int i = this.f1040b + 1;
        this.f1040b = i;
        if (i == 1) {
            if (this.f1041c) {
                this.f1043f.d(l.ON_RESUME);
                this.f1041c = false;
            } else {
                Handler handler = this.e;
                jc.i.b(handler);
                handler.removeCallbacks(this.f1044r);
            }
        }
    }

    @Override // androidx.lifecycle.r
    public final t l() {
        return this.f1043f;
    }
}
