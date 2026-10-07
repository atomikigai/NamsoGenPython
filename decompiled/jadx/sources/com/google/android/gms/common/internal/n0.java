package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class n0 extends c0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ f f2231g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(f fVar, int i) {
        super(fVar, i, null);
        this.f2231g = fVar;
    }

    @Override // com.google.android.gms.common.internal.c0
    public final void a(g7.b bVar) {
        f fVar = this.f2231g;
        if (fVar.enableLocalFallback() && f.zzo(fVar)) {
            f.zzk(fVar, 16);
        } else {
            fVar.zzc.b(bVar);
            fVar.onConnectionFailed(bVar);
        }
    }

    @Override // com.google.android.gms.common.internal.c0
    public final boolean b() {
        this.f2231g.zzc.b(g7.b.e);
        return true;
    }
}
