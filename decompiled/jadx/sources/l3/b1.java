package l3;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n3.c f6523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile int f6524b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile long f6525c;

    public b1(n3.c cVar) {
        jc.i.e(cVar, "e");
        this.f6523a = cVar;
    }

    public final String a() {
        StringBuilder sb2 = new StringBuilder();
        n3.c cVar = this.f6523a;
        sb2.append(cVar.f7247b);
        sb2.append(':');
        sb2.append(cVar.f7248c);
        sb2.append(':');
        sb2.append(cVar.f7249d);
        return sb2.toString();
    }
}
