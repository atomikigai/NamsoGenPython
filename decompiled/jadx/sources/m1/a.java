package m1;

import androidx.lifecycle.r;
import androidx.lifecycle.y;
import androidx.lifecycle.z;
import e7.d;
import ea.e;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends y {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final d f6975l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public r f6976m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public e f6977n;

    public a(d dVar) {
        this.f6975l = dVar;
        if (dVar.f3475a != null) {
            throw new IllegalStateException("There is already a listener registered");
        }
        dVar.f3475a = this;
    }

    @Override // androidx.lifecycle.y
    public final void f() {
        d dVar = this.f6975l;
        dVar.f3476b = true;
        dVar.f3478d = false;
        dVar.f3477c = false;
        dVar.i.drainPermits();
        dVar.a();
        dVar.f3480g = new n1.a(dVar);
        dVar.b();
    }

    @Override // androidx.lifecycle.y
    public final void g() {
        this.f6975l.f3476b = false;
    }

    @Override // androidx.lifecycle.y
    public final void i(z zVar) {
        super.i(zVar);
        this.f6976m = null;
        this.f6977n = null;
    }

    public final void k() {
        r rVar = this.f6976m;
        e eVar = this.f6977n;
        if (rVar == null || eVar == null) {
            return;
        }
        super.i(eVar);
        d(rVar, eVar);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        sb2.append("LoaderInfo{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" #0 : ");
        p3.a.d(sb2, this.f6975l);
        sb2.append("}}");
        return sb2.toString();
    }
}
