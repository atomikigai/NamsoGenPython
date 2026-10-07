package e3;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f3262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m9.a f3263b;

    public f(k kVar, m9.a aVar) {
        this.f3262a = kVar;
        this.f3263b = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f3262a.f3270a != this) {
            return;
        }
        if (i.f3268f.i(this.f3262a, this, i.e(this.f3263b))) {
            i.b(this.f3262a);
        }
    }
}
