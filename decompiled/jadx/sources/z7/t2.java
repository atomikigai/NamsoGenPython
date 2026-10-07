package z7;

import android.os.Looper;
import com.google.android.gms.internal.measurement.zzby;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class t2 extends m0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public zzby f11369c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f11370d;
    public final ta.c e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final s2 f11371f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final s5.j f11372r;

    public t2(a1 a1Var) {
        super(a1Var);
        this.f11370d = true;
        this.e = new ta.c(this);
        this.f11371f = new s2(this);
        this.f11372r = new s5.j(this, 24);
    }

    @Override // z7.m0
    public final boolean f() {
        return false;
    }

    public final void g() {
        c();
        if (this.f11369c == null) {
            this.f11369c = new zzby(Looper.getMainLooper());
        }
    }
}
