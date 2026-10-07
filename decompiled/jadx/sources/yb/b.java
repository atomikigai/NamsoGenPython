package yb;

import ic.p;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10670a;

    public /* synthetic */ b(int i) {
        this.f10670a = i;
    }

    @Override // ic.p
    public final Object invoke(Object obj, Object obj2) {
        c cVar;
        switch (this.f10670a) {
            case 0:
                String str = (String) obj;
                g gVar = (g) obj2;
                jc.i.e(str, "acc");
                jc.i.e(gVar, "element");
                if (str.length() == 0) {
                    return gVar.toString();
                }
                return str + ", " + gVar;
            default:
                i iVar = (i) obj;
                g gVar2 = (g) obj2;
                jc.i.e(iVar, "acc");
                jc.i.e(gVar2, "element");
                i iVarE = iVar.E(gVar2.getKey());
                j jVar = j.f10674a;
                if (iVarE == jVar) {
                    return gVar2;
                }
                e eVar = e.f10673a;
                f fVar = (f) iVarE.H(eVar);
                if (fVar == null) {
                    cVar = new c(gVar2, iVarE);
                } else {
                    i iVarE2 = iVarE.E(eVar);
                    if (iVarE2 == jVar) {
                        return new c(fVar, gVar2);
                    }
                    cVar = new c(fVar, new c(gVar2, iVarE2));
                }
                return cVar;
        }
    }
}
