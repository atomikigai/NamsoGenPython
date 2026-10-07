package t8;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends i {
    public final /* synthetic */ int e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l f8632f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(l lVar, int i) {
        super(lVar);
        this.e = i;
        this.f8632f = lVar;
    }

    @Override // t8.i
    public final float a() {
        float f10;
        float f11;
        switch (this.e) {
            case 0:
                l lVar = this.f8632f;
                f10 = lVar.h;
                f11 = lVar.i;
                break;
            case 1:
                l lVar2 = this.f8632f;
                f10 = lVar2.h;
                f11 = lVar2.f8644j;
                break;
            default:
                return this.f8632f.h;
        }
        return f10 + f11;
    }
}
