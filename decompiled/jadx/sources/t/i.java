package t;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends g {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ j f8516s;

    public i(j jVar) {
        this.f8516s = jVar;
    }

    @Override // t.g
    public final String g() {
        h hVar = (h) this.f8516s.f8517a.get();
        if (hVar == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return "tag=[" + hVar.f8512a + "]";
    }
}
