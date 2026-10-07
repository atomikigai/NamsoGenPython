package k9;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class z extends w {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f6124r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f6125s;

    public /* synthetic */ z(Object obj, int i) {
        this.f6124r = i;
        this.f6125s = obj;
    }

    @Override // k9.w
    public final void b() {
        switch (this.f6124r) {
            case 0:
                synchronized (((c) this.f6125s).f6102f) {
                    try {
                        if (((c) this.f6125s).f6106l.get() > 0 && ((c) this.f6125s).f6106l.decrementAndGet() > 0) {
                            ((c) this.f6125s).f6099b.b("Leaving the connection open for other ongoing calls.", new Object[0]);
                            return;
                        }
                        c cVar = (c) this.f6125s;
                        if (cVar.f6108n != null) {
                            cVar.f6099b.b("Unbind from service.", new Object[0]);
                            c cVar2 = (c) this.f6125s;
                            cVar2.f6098a.unbindService(cVar2.f6107m);
                            c cVar3 = (c) this.f6125s;
                            cVar3.f6103g = false;
                            cVar3.f6108n = null;
                            cVar3.f6107m = null;
                        }
                        ((c) this.f6125s).d();
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            default:
                c cVar4 = (c) ((b) this.f6125s).f6094b;
                cVar4.f6099b.b("unlinkToDeath", new Object[0]);
                cVar4.f6108n.asBinder().unlinkToDeath(cVar4.f6105k, 0);
                cVar4.f6108n = null;
                cVar4.f6103g = false;
                return;
        }
    }
}
