package androidx.fragment.app;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class h0 implements g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f873b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i0 f874c;

    public h0(i0 i0Var, int i, int i10) {
        this.f874c = i0Var;
        this.f872a = i;
        this.f873b = i10;
    }

    @Override // androidx.fragment.app.g0
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        i0 i0Var = this.f874c;
        s sVar = i0Var.f890q;
        int i = this.f872a;
        if (sVar == null || i >= 0 || !sVar.q().L()) {
            return i0Var.M(arrayList, arrayList2, i, this.f873b);
        }
        return false;
    }
}
