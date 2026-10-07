package vc;

import jc.t;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final yb.d[] f9317a = new yb.d[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i6.e f9318b = new i6.e("NULL", 3);

    public static final Object a(yb.i iVar, Object obj, Object obj2, ic.p pVar, yb.d dVar) {
        Object objM = wc.a.m(iVar, obj2);
        try {
            p pVar2 = new p(dVar, iVar);
            t.a(2, pVar);
            Object objInvoke = pVar.invoke(obj, pVar2);
            wc.a.g(iVar, objM);
            if (objInvoke == zb.a.f11555a) {
                jc.i.e(dVar, "frame");
            }
            return objInvoke;
        } catch (Throwable th) {
            wc.a.g(iVar, objM);
            throw th;
        }
    }
}
