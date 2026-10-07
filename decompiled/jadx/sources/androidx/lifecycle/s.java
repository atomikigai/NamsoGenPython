package androidx.lifecycle;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public m f1088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p f1089b;

    public final void a(r rVar, l lVar) {
        m mVarA = lVar.a();
        m mVar = this.f1088a;
        jc.i.e(mVar, "state1");
        if (mVarA.compareTo(mVar) < 0) {
            mVar = mVarA;
        }
        this.f1088a = mVar;
        this.f1089b.a(rVar, lVar);
        this.f1088a = mVarA;
    }
}
