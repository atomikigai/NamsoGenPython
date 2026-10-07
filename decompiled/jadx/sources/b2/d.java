package b2;

import a2.w;
import ac.i;
import androidx.datastore.preferences.protobuf.d1;
import ic.l;
import ic.p;
import y1.a0;
import y1.b0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements b0, w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f1355a;

    public d(a aVar) {
        this.f1355a = aVar;
    }

    @Override // y1.b0
    public final Object a(a0 a0Var, p pVar, i iVar) {
        return e(a0Var, pVar, iVar);
    }

    @Override // y1.o
    public final Object b(String str, l lVar, ac.c cVar) {
        g gVarR = this.f1355a.R(str);
        try {
            Object objInvoke = lVar.invoke(gVarR);
            a.a.b(gVarR, null);
            return objInvoke;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                a.a.b(gVarR, th);
                throw th2;
            }
        }
    }

    @Override // y1.b0
    public final Object c(i iVar) {
        return Boolean.valueOf(this.f1355a.f1349a.M());
    }

    @Override // a2.w
    public final g2.a d() {
        return this.f1355a;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0090  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(a0 a0Var, p pVar, ac.c cVar) throws Throwable {
        c cVar2;
        Throwable th;
        h2.b bVar;
        d dVar;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i = cVar2.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                cVar2.e = i - Integer.MIN_VALUE;
            } else {
                cVar2 = new c(this, cVar);
            }
        } else {
            cVar2 = new c(this, cVar);
        }
        Object obj = cVar2.f1353c;
        Object obj2 = zb.a.f11555a;
        int i10 = cVar2.e;
        if (i10 == 0) {
            r7.g.G(obj);
            h2.b bVar2 = this.f1355a.f1349a;
            bVar2.M();
            int iOrdinal = a0Var.ordinal();
            if (iOrdinal == 0) {
                bVar2.m();
            } else if (iOrdinal == 1) {
                bVar2.v();
            } else {
                if (iOrdinal != 2) {
                    throw new d1();
                }
                bVar2.e();
            }
            try {
                Object pVar2 = new a2.p(this, 1);
                cVar2.f1351a = this;
                cVar2.f1352b = bVar2;
                cVar2.e = 1;
                Object objInvoke = pVar.invoke(pVar2, cVar2);
                if (objInvoke == obj2) {
                    return obj2;
                }
                obj = objInvoke;
                bVar = bVar2;
                dVar = this;
            } catch (Throwable th2) {
                th = th2;
                bVar = bVar2;
                dVar = this;
                bVar.C();
                if (!bVar.M()) {
                    dVar.getClass();
                }
                throw th;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bVar = cVar2.f1352b;
            dVar = cVar2.f1351a;
            try {
                r7.g.G(obj);
            } catch (Throwable th3) {
                th = th3;
                bVar.C();
                if (!bVar.M()) {
                    dVar.getClass();
                }
                throw th;
            }
        }
        bVar.u();
        bVar.C();
        if (!bVar.M()) {
            dVar.getClass();
        }
        return obj;
    }
}
