package e2;

import a2.w;
import a2.y;
import ac.i;
import ic.l;
import ic.p;
import ub.k;
import y1.a0;
import y1.b0;
import y1.v;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends i implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a0 f3219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3220b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f3221c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f3222d;
    public final /* synthetic */ boolean e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ v f3223f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ l f3224r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(l lVar, v vVar, yb.d dVar, boolean z4, boolean z10) {
        super(2, dVar);
        this.f3222d = z4;
        this.e = z10;
        this.f3223f = vVar;
        this.f3224r = lVar;
    }

    @Override // ac.a
    public final yb.d create(Object obj, yb.d dVar) {
        c cVar = new c(this.f3224r, this.f3223f, dVar, this.f3222d, this.e);
        cVar.f3221c = obj;
        return cVar;
    }

    @Override // ic.p
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((b0) obj, (yb.d) obj2)).invokeSuspend(k.f9073a);
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00b5 A[DONT_INVERT, PHI: r1 r12
      0x00b5: PHI (r1v11 y1.b0) = (r1v8 y1.b0), (r1v17 y1.b0) binds: [B:42:0x00b2, B:11:0x0027] A[DONT_GENERATE, DONT_INLINE]
      0x00b5: PHI (r12v20 java.lang.Object) = (r12v18 java.lang.Object), (r12v0 java.lang.Object) binds: [B:42:0x00b2, B:11:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:45:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:51:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:53:0x00da A[RETURN] */
    @Override // ac.a
    public final Object invokeSuspend(Object obj) {
        a0 a0Var;
        b0 b0Var;
        a0 a0Var2;
        b0 b0Var2;
        Object objF;
        b0 b0Var3;
        Object objC;
        Object obj2;
        zb.a aVar = zb.a.f11555a;
        int i = this.f3220b;
        l lVar = this.f3224r;
        v vVar = this.f3223f;
        boolean z4 = this.e;
        if (i == 0) {
            r7.g.G(obj);
            b0 b0Var4 = (b0) this.f3221c;
            if (!this.f3222d) {
                jc.i.c(b0Var4, "null cannot be cast to non-null type androidx.room.coroutines.RawConnectionAccessor");
                return lVar.invoke(((w) b0Var4).d());
            }
            a0Var = z4 ? a0.f10413a : a0.f10414b;
            if (z4) {
                a0 a0Var3 = a0Var;
                b0Var = b0Var4;
                a0Var2 = a0Var3;
                y yVar = new y((yb.d) null, lVar);
                this.f3221c = b0Var;
                this.f3219a = null;
                this.f3220b = 3;
                obj = b0Var.a(a0Var2, yVar, this);
                if (obj != aVar) {
                    if (z4) {
                        return obj;
                    }
                    this.f3221c = obj;
                    this.f3220b = 4;
                    objC = b0Var.c(this);
                    if (objC != aVar) {
                        obj2 = obj;
                        obj = objC;
                        if (!((Boolean) obj).booleanValue()) {
                            y1.i iVarH = vVar.h();
                            iVarH.f10451b.e(iVarH.e, iVarH.f10454f);
                        }
                        return obj2;
                    }
                }
            } else {
                this.f3221c = b0Var4;
                this.f3219a = a0Var;
                this.f3220b = 1;
                Object objC2 = b0Var4.c(this);
                if (objC2 != aVar) {
                    b0Var2 = b0Var4;
                    obj = objC2;
                }
            }
            return aVar;
        }
        if (i == 1) {
            a0Var = this.f3219a;
            b0Var2 = (b0) this.f3221c;
            r7.g.G(obj);
        } else {
            if (i == 2) {
                a0Var = this.f3219a;
                b0Var3 = (b0) this.f3221c;
                r7.g.G(obj);
                a0Var2 = a0Var;
                b0Var = b0Var3;
                y yVar2 = new y((yb.d) null, lVar);
                this.f3221c = b0Var;
                this.f3219a = null;
                this.f3220b = 3;
                obj = b0Var.a(a0Var2, yVar2, this);
                if (obj != aVar) {
                    if (z4) {
                        return obj;
                    }
                    this.f3221c = obj;
                    this.f3220b = 4;
                    objC = b0Var.c(this);
                    if (objC != aVar) {
                        obj2 = obj;
                        obj = objC;
                    }
                }
                return aVar;
            }
            if (i == 3) {
                b0Var = (b0) this.f3221c;
                r7.g.G(obj);
                if (z4) {
                    return obj;
                }
                this.f3221c = obj;
                this.f3220b = 4;
                objC = b0Var.c(this);
                if (objC != aVar) {
                    obj2 = obj;
                    obj = objC;
                }
                return aVar;
            }
            if (i != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            obj2 = this.f3221c;
            r7.g.G(obj);
        }
        if (!((Boolean) obj).booleanValue()) {
            y1.i iVarH2 = vVar.h();
            iVarH2.f10451b.e(iVarH2.e, iVarH2.f10454f);
        }
        return obj2;
        if (((Boolean) obj).booleanValue()) {
            a0Var2 = a0Var;
            b0Var = b0Var2;
            y yVar3 = new y((yb.d) null, lVar);
            this.f3221c = b0Var;
            this.f3219a = null;
            this.f3220b = 3;
            obj = b0Var.a(a0Var2, yVar3, this);
            if (obj != aVar) {
                if (z4) {
                    return obj;
                }
                this.f3221c = obj;
                this.f3220b = 4;
                objC = b0Var.c(this);
                if (objC != aVar) {
                    obj2 = obj;
                    obj = objC;
                    if (!((Boolean) obj).booleanValue()) {
                        y1.i iVarH3 = vVar.h();
                        iVarH3.f10451b.e(iVarH3.e, iVarH3.f10454f);
                    }
                    return obj2;
                }
            }
        } else {
            y1.i iVarH4 = vVar.h();
            this.f3221c = b0Var2;
            this.f3219a = a0Var;
            this.f3220b = 2;
            v vVar2 = iVarH4.f10450a;
            if ((vVar2.l() && !vVar2.p()) || (objF = iVarH4.f10451b.f(this)) != aVar) {
                objF = k.f9073a;
            }
            if (objF != aVar) {
                b0Var3 = b0Var2;
                a0Var2 = a0Var;
                b0Var = b0Var3;
                y yVar4 = new y((yb.d) null, lVar);
                this.f3221c = b0Var;
                this.f3219a = null;
                this.f3220b = 3;
                obj = b0Var.a(a0Var2, yVar4, this);
                if (obj != aVar) {
                    if (z4) {
                        return obj;
                    }
                    this.f3221c = obj;
                    this.f3220b = 4;
                    objC = b0Var.c(this);
                    if (objC != aVar) {
                        obj2 = obj;
                        obj = objC;
                        if (!((Boolean) obj).booleanValue()) {
                            y1.i iVarH5 = vVar.h();
                            iVarH5.f10451b.e(iVarH5.e, iVarH5.f10454f);
                        }
                        return obj2;
                    }
                }
            }
        }
        return aVar;
    }
}
