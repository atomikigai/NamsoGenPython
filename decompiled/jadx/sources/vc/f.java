package vc;

import java.util.ArrayList;
import rc.b0;
import rc.u;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class f implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yb.i f9323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f9324b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f9325c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final uc.b f9326d;

    public f(uc.b bVar, yb.i iVar, int i, int i10) {
        this.f9323a = iVar;
        this.f9324b = i;
        this.f9325c = i10;
        this.f9326d = bVar;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0014  */
    @Override // vc.h
    public final uc.b a(yb.i iVar, int i, int i10) {
        yb.i iVar2 = this.f9323a;
        yb.i iVarB = iVar.B(iVar2);
        int i11 = this.f9325c;
        int i12 = this.f9324b;
        if (i10 == 1) {
            if (i12 != -3) {
                if (i == -3) {
                    i = i12;
                } else if (i12 != -2) {
                    if (i == -2) {
                        i = i12;
                    } else {
                        i += i12;
                        if (i < 0) {
                            i = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
                        }
                    }
                }
            }
            i10 = i11;
        }
        return (jc.i.a(iVarB, iVar2) && i == i12 && i10 == i11) ? this : new f(this.f9326d, iVarB, i, i10);
    }

    public final String b() {
        String str;
        ArrayList arrayList = new ArrayList(4);
        yb.j jVar = yb.j.f10674a;
        yb.i iVar = this.f9323a;
        if (iVar != jVar) {
            arrayList.add("context=" + iVar);
        }
        int i = this.f9324b;
        if (i != -3) {
            arrayList.add("capacity=" + i);
        }
        int i10 = this.f9325c;
        if (i10 != 1) {
            if (i10 == 1) {
                str = "SUSPEND";
            } else if (i10 != 2) {
                str = i10 != 3 ? "null" : "DROP_LATEST";
            } else {
                str = "DROP_OLDEST";
            }
            arrayList.add("onBufferOverflow=".concat(str));
        }
        return getClass().getSimpleName() + '[' + vb.i.e0(arrayList, ", ", null, null, null, 62) + ']';
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0073  */
    /* JADX WARN: Code duplicated, block: B:31:0x0084  */
    /* JADX WARN: Code duplicated, block: B:34:0x008a A[RETURN] */
    @Override // uc.b
    public final Object d(uc.c cVar, yb.d dVar) {
        Object objG;
        int i = this.f9324b;
        ub.k kVar = ub.k.f9073a;
        if (i == -3) {
            yb.i context = dVar.getContext();
            Boolean bool = Boolean.FALSE;
            u uVar = u.f8323c;
            yb.i iVar = this.f9323a;
            yb.i iVarB = !((Boolean) iVar.G(bool, uVar)).booleanValue() ? context.B(iVar) : b0.i(context, iVar, false);
            if (jc.i.a(iVarB, context)) {
                Object objD = this.f9326d.d(cVar, dVar);
                zb.a aVar = zb.a.f11555a;
                if (objD != aVar) {
                    objD = kVar;
                }
                if (objD == aVar) {
                    return objD;
                }
            } else {
                yb.e eVar = yb.e.f10673a;
                if (jc.i.a(iVarB.H(eVar), context.H(eVar))) {
                    yb.i context2 = dVar.getContext();
                    if (!(cVar instanceof o)) {
                        cVar = new a2.k(cVar, context2);
                    }
                    Object objA = c.a(iVarB, cVar, wc.a.l(iVarB), new e(this, null, 1), dVar);
                    zb.a aVar2 = zb.a.f11555a;
                    if (objA != aVar2) {
                        objA = kVar;
                    }
                    if (objA == aVar2) {
                        return objA;
                    }
                } else {
                    objG = b0.g(new a2.e(cVar, this, null, 10), dVar);
                    if (objG != zb.a.f11555a) {
                        objG = ub.k.f9073a;
                    }
                    if (objG == zb.a.f11555a) {
                        return objG;
                    }
                }
            }
        } else {
            objG = b0.g(new a2.e(cVar, this, null, 10), dVar);
            if (objG != zb.a.f11555a) {
                objG = ub.k.f9073a;
            }
            if (objG == zb.a.f11555a) {
                return objG;
            }
        }
        return kVar;
    }

    public final String toString() {
        return this.f9326d + " -> " + b();
    }
}
