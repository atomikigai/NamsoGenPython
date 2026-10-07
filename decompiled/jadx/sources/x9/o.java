package x9;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class o implements ya.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final s5.e f10345c = new s5.e(11);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final jb.i f10346d = new jb.i(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ya.a f10347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile ya.b f10348b;

    public o(s5.e eVar, ya.b bVar) {
        this.f10347a = eVar;
        this.f10348b = bVar;
    }

    public final void a(ya.a aVar) {
        ya.b bVar;
        ya.b bVar2;
        ya.b bVar3 = this.f10348b;
        jb.i iVar = f10346d;
        if (bVar3 != iVar) {
            aVar.b(bVar3);
            return;
        }
        synchronized (this) {
            bVar = this.f10348b;
            if (bVar != iVar) {
                bVar2 = bVar;
            } else {
                this.f10347a = new e5.c(27, this.f10347a, aVar);
                bVar2 = null;
            }
        }
        if (bVar2 != null) {
            aVar.b(bVar);
        }
    }

    @Override // ya.b
    public final Object get() {
        return this.f10348b.get();
    }
}
