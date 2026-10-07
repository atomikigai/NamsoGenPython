package w3;

import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f9526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f9527b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i4.a f9528c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p0.d f9529d;
    public final String e;

    public i(Class cls, Class cls2, Class cls3, List list, i4.a aVar, p0.d dVar) {
        this.f9526a = cls;
        this.f9527b = list;
        this.f9528c = aVar;
        this.f9529d = dVar;
        this.e = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    public final x a(int i, int i10, com.bumptech.glide.load.data.g gVar, ea.j jVar, u3.i iVar) {
        x xVarB;
        u3.m mVar;
        int iF;
        boolean z4;
        boolean z10;
        boolean z11;
        Object dVar;
        String str;
        p0.d dVar2 = this.f9529d;
        Object objC = dVar2.c();
        p4.f.c(objC, "Argument must not be null");
        List list = (List) objC;
        try {
            x xVarB2 = b(gVar, i, i10, iVar, list);
            dVar2.b(list);
            h hVar = (h) jVar.f3530b;
            int i11 = jVar.f3529a;
            g gVar2 = hVar.f9512a;
            Class<?> cls = xVarB2.get().getClass();
            u3.l lVarA = null;
            if (i11 != 4) {
                u3.m mVarE = gVar2.e(cls);
                mVar = mVarE;
                xVarB = mVarE.b(hVar.f9518s, xVarB2, hVar.f9522w, hVar.f9523x);
            } else {
                xVarB = xVarB2;
                mVar = null;
            }
            if (!xVarB2.equals(xVarB)) {
                xVarB2.b();
            }
            if (gVar2.f9499c.a().f1869d.a(xVarB.e()) != null) {
                lVarA = gVar2.f9499c.a().f1869d.a(xVarB.e());
                if (lVarA == null) {
                    throw new com.bumptech.glide.g(xVarB.e());
                }
                iF = lVarA.f(hVar.f9525z);
            } else {
                iF = 3;
            }
            u3.l lVar = lVarA;
            u3.f fVar = hVar.F;
            ArrayList arrayListB = gVar2.b();
            int size = arrayListB.size();
            int i12 = 0;
            while (true) {
                if (i12 >= size) {
                    z4 = false;
                    break;
                }
                if (((a4.w) arrayListB.get(i12)).f180a.equals(fVar)) {
                    z4 = true;
                    break;
                }
                i12++;
            }
            switch (hVar.f9524y.f9533a) {
                default:
                    z10 = true;
                    if (((z4 || i11 != 3) && i11 != 1) || iF != 2) {
                    }
                case 0:
                case 1:
                    z10 = false;
                    break;
            }
            if (z10) {
                if (lVar == null) {
                    throw new com.bumptech.glide.g(xVarB.get().getClass());
                }
                int iD = u.e.d(iF);
                if (iD == 0) {
                    z11 = true;
                    dVar = new d(hVar.F, hVar.f9519t);
                } else {
                    if (iD != 1) {
                        if (iF == 1) {
                            str = "SOURCE";
                        } else if (iF != 2) {
                            str = iF != 3 ? "null" : "NONE";
                        } else {
                            str = "TRANSFORMED";
                        }
                        throw new IllegalArgumentException("Unknown strategy: ".concat(str));
                    }
                    z11 = true;
                    dVar = new z(gVar2.f9499c.f1855a, hVar.F, hVar.f9519t, hVar.f9522w, hVar.f9523x, mVar, cls, hVar.f9525z);
                }
                w wVar = (w) w.e.c();
                wVar.f9584d = 0;
                wVar.f9583c = z11;
                wVar.f9582b = xVarB;
                q5.d dVar3 = hVar.f9516f;
                dVar3.f8039a = dVar;
                dVar3.f8040b = lVar;
                dVar3.f8041c = wVar;
                xVarB = wVar;
            }
            return this.f9528c.e(xVarB, iVar);
        } catch (Throwable th) {
            dVar2.b(list);
            throw th;
        }
    }

    public final x b(com.bumptech.glide.load.data.g gVar, int i, int i10, u3.i iVar, List list) throws t {
        List list2 = this.f9527b;
        int size = list2.size();
        x xVarA = null;
        for (int i11 = 0; i11 < size; i11++) {
            u3.k kVar = (u3.k) list2.get(i11);
            try {
                if (kVar.b(gVar.f(), iVar)) {
                    xVarA = kVar.a(gVar.f(), i, i10, iVar);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e) {
                if (Log.isLoggable("DecodePath", 2)) {
                    Log.v("DecodePath", "Failed to decode data for " + kVar, e);
                }
                list.add(e);
            }
            if (xVarA != null) {
                break;
            }
        }
        if (xVarA != null) {
            return xVarA;
        }
        throw new t(this.e, new ArrayList(list));
    }

    public final String toString() {
        return "DecodePath{ dataClass=" + this.f9526a + ", decoders=" + this.f9527b + ", transcoder=" + this.f9528c + '}';
    }
}
