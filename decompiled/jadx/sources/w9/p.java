package w9;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class p implements com.google.android.gms.common.api.internal.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v f9854a;

    public p(v vVar) {
        this.f9854a = vVar;
    }

    @Override // com.google.android.gms.common.api.internal.b
    public final void a(boolean z4) {
        if (z4) {
            e eVar = (e) this.f9854a.f9864b;
            eVar.f9832c.removeCallbacks(eVar.f9833d);
        }
    }
}
