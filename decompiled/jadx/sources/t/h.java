package t;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f8512a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public j f8513b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public k f8514c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f8515d;

    public final void finalize() {
        k kVar;
        j jVar = this.f8513b;
        if (jVar != null) {
            i iVar = jVar.f8518b;
            if (!iVar.isDone()) {
                iVar.j(new e3.b("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f8512a, 2));
            }
        }
        if (this.f8515d || (kVar = this.f8514c) == null) {
            return;
        }
        kVar.i(null);
    }
}
