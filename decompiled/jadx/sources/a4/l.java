package a4;

import android.content.Context;
import java.util.ArrayDeque;
import java.util.LinkedHashMap;
import z7.a1;
import z7.g1;
import z7.z0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l implements y, g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f159a;

    public l(a1 a1Var) {
        com.google.android.gms.common.internal.i0.i(a1Var);
        this.f159a = a1Var;
    }

    public void b(x3.h hVar) {
        ArrayDeque arrayDeque = (ArrayDeque) this.f159a;
        if (arrayDeque.size() < 20) {
            arrayDeque.offer(hVar);
        }
    }

    public void c() {
        z0 z0Var = ((a1) this.f159a).f11008u;
        a1.f(z0Var);
        z0Var.c();
    }

    @Override // a4.y
    public x i(e0 e0Var) {
        return new d((h0) this.f159a, 2);
    }

    @Override // z7.g1
    public z7.i0 zzaA() {
        throw null;
    }

    @Override // z7.g1
    public z0 zzaB() {
        throw null;
    }

    @Override // z7.g1
    public Context zzaw() {
        throw null;
    }

    @Override // z7.g1
    public n7.a zzax() {
        throw null;
    }

    @Override // z7.g1
    public z7.v zzay() {
        throw null;
    }

    public l(int i) {
        switch (i) {
            case 2:
                char[] cArr = p4.n.f7811a;
                this.f159a = new ArrayDeque(20);
                break;
            default:
                this.f159a = new LinkedHashMap();
                break;
        }
    }

    public l(h0 h0Var) {
        this.f159a = h0Var;
    }
}
