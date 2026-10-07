package a4;

import android.content.res.Resources;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 implements y, i4.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Resources f141a;

    public /* synthetic */ f0(Resources resources) {
        this.f141a = resources;
    }

    @Override // i4.a
    public w3.x e(w3.x xVar, u3.i iVar) {
        if (xVar == null) {
            return null;
        }
        return new d4.c(this.f141a, xVar);
    }

    @Override // a4.y
    public x i(e0 e0Var) {
        return new c(this.f141a, i0.f151b);
    }
}
