package yb;

import ic.p;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class c implements i, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f10671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f10672b;

    public c(g gVar, i iVar) {
        jc.i.e(iVar, "left");
        jc.i.e(gVar, "element");
        this.f10671a = iVar;
        this.f10672b = gVar;
    }

    @Override // yb.i
    public final i B(i iVar) {
        jc.i.e(iVar, "context");
        return iVar == j.f10674a ? this : (i) iVar.G(this, new b(1));
    }

    @Override // yb.i
    public final i E(h hVar) {
        jc.i.e(hVar, "key");
        g gVar = this.f10672b;
        g gVarH = gVar.H(hVar);
        i iVar = this.f10671a;
        if (gVarH != null) {
            return iVar;
        }
        i iVarE = iVar.E(hVar);
        if (iVarE == iVar) {
            return this;
        }
        return iVarE == j.f10674a ? gVar : new c(gVar, iVarE);
    }

    @Override // yb.i
    public final Object G(Object obj, p pVar) {
        return pVar.invoke(this.f10671a.G(obj, pVar), this.f10672b);
    }

    @Override // yb.i
    public final g H(h hVar) {
        jc.i.e(hVar, "key");
        c cVar = this;
        while (true) {
            g gVarH = cVar.f10672b.H(hVar);
            if (gVarH != null) {
                return gVarH;
            }
            i iVar = cVar.f10671a;
            if (!(iVar instanceof c)) {
                return iVar.H(hVar);
            }
            cVar = (c) iVar;
        }
    }

    public final boolean equals(Object obj) {
        boolean zA;
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            int i = 2;
            c cVar2 = cVar;
            int i10 = 2;
            while (true) {
                i iVar = cVar2.f10671a;
                cVar2 = iVar instanceof c ? (c) iVar : null;
                if (cVar2 == null) {
                    break;
                }
                i10++;
            }
            c cVar3 = this;
            while (true) {
                i iVar2 = cVar3.f10671a;
                cVar3 = iVar2 instanceof c ? (c) iVar2 : null;
                if (cVar3 == null) {
                    break;
                }
                i++;
            }
            if (i10 == i) {
                c cVar4 = this;
                while (true) {
                    g gVar = cVar4.f10672b;
                    if (!jc.i.a(cVar.H(gVar.getKey()), gVar)) {
                        zA = false;
                        break;
                    }
                    i iVar3 = cVar4.f10671a;
                    if (!(iVar3 instanceof c)) {
                        jc.i.c(iVar3, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                        g gVar2 = (g) iVar3;
                        zA = jc.i.a(cVar.H(gVar2.getKey()), gVar2);
                        break;
                    }
                    cVar4 = (c) iVar3;
                }
                if (zA) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f10672b.hashCode() + this.f10671a.hashCode();
    }

    public final String toString() {
        return "[" + ((String) G("", new b(0))) + ']';
    }
}
