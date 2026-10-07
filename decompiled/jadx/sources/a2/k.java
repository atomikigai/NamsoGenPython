package a2;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements uc.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f39b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f40c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ub.a f41d;

    public k(jc.o oVar, uc.c cVar, y yVar) {
        this.f40c = oVar;
        this.f39b = cVar;
        this.f41d = yVar;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002e  */
    /* JADX WARN: Code duplicated, block: B:36:0x008d  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:63:? A[RETURN, SYNTHETIC] */
    @Override // uc.c
    public final Object c(Object obj, yb.d dVar) {
        j jVar;
        uc.c cVar;
        uc.e eVar;
        k kVar;
        uc.c cVar2;
        switch (this.f38a) {
            case 0:
                if (dVar instanceof j) {
                    jVar = (j) dVar;
                    int i = jVar.f35b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        jVar.f35b = i - Integer.MIN_VALUE;
                    } else {
                        jVar = new j(this, dVar);
                    }
                } else {
                    jVar = new j(this, dVar);
                }
                Object obj2 = jVar.f34a;
                zb.a aVar = zb.a.f11555a;
                int i10 = jVar.f35b;
                if (i10 != 0) {
                    if (i10 == 1) {
                        cVar = jVar.f36c;
                        r7.g.G(obj2);
                    } else {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        r7.g.G(obj2);
                    }
                    return ub.k.f9073a;
                }
                r7.g.G(obj2);
                uc.c cVar3 = (uc.c) this.f39b;
                y1.v vVar = (y1.v) this.f40c;
                ic.l lVar = (ic.l) this.f41d;
                jVar.f36c = cVar3;
                jVar.f35b = 1;
                Object objW = n9.b.w(lVar, vVar, jVar, true, false);
                if (objW == aVar) {
                    return aVar;
                }
                obj2 = objW;
                cVar = cVar3;
                jVar.f36c = null;
                jVar.f35b = 2;
                if (cVar.c(obj2, jVar) == aVar) {
                    return aVar;
                }
                return ub.k.f9073a;
            case 1:
                if (dVar instanceof uc.e) {
                    eVar = (uc.e) dVar;
                    int i11 = eVar.e;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        eVar.e = i11 - Integer.MIN_VALUE;
                    } else {
                        eVar = new uc.e(this, dVar);
                    }
                } else {
                    eVar = new uc.e(this, dVar);
                }
                Object objInvoke = eVar.f9087c;
                zb.a aVar2 = zb.a.f11555a;
                int i12 = eVar.e;
                ub.k kVar2 = ub.k.f9073a;
                if (i12 != 0) {
                    if (i12 != 1) {
                        if (i12 == 2) {
                            obj = eVar.f9086b;
                            kVar = eVar.f9085a;
                            r7.g.G(objInvoke);
                            if (!((Boolean) objInvoke).booleanValue()) {
                                ((jc.o) kVar.f40c).f5774a = true;
                                cVar2 = (uc.c) kVar.f39b;
                                eVar.f9085a = null;
                                eVar.f9086b = null;
                                eVar.e = 3;
                                if (cVar2.c(obj, eVar) == aVar2) {
                                    return aVar2;
                                }
                            }
                        } else if (i12 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    }
                    r7.g.G(objInvoke);
                } else {
                    r7.g.G(objInvoke);
                    if (((jc.o) this.f40c).f5774a) {
                        uc.c cVar4 = (uc.c) this.f39b;
                        eVar.e = 1;
                        if (cVar4.c(obj, eVar) == aVar2) {
                            return aVar2;
                        }
                    } else {
                        y yVar = (y) this.f41d;
                        eVar.f9085a = this;
                        eVar.f9086b = obj;
                        eVar.e = 2;
                        objInvoke = yVar.invoke(obj, eVar);
                        if (objInvoke == aVar2) {
                            return aVar2;
                        }
                        kVar = this;
                        if (!((Boolean) objInvoke).booleanValue()) {
                            ((jc.o) kVar.f40c).f5774a = true;
                            cVar2 = (uc.c) kVar.f39b;
                            eVar.f9085a = null;
                            eVar.f9086b = null;
                            eVar.e = 3;
                            if (cVar2.c(obj, eVar) == aVar2) {
                                return aVar2;
                            }
                        }
                    }
                }
                return kVar2;
            default:
                Object objA = vc.c.a((yb.i) this.f39b, obj, this.f40c, (g) this.f41d, dVar);
                return objA == zb.a.f11555a ? objA : ub.k.f9073a;
        }
    }

    public k(uc.c cVar, y1.v vVar, ic.l lVar) {
        this.f39b = cVar;
        this.f40c = vVar;
        this.f41d = lVar;
    }

    public k(uc.c cVar, yb.i iVar) {
        this.f39b = iVar;
        this.f40c = wc.a.l(iVar);
        this.f41d = new g(cVar, (yb.d) null, 23);
    }
}
