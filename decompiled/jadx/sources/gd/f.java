package gd;

import bd.o;
import bd.p;
import bd.v;
import bd.x;
import fd.i;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f4535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f4536b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f4537c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final fd.e f4538d;
    public final v e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f4539f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f4540g;
    public final int h;
    public int i;

    public f(i iVar, ArrayList arrayList, int i, fd.e eVar, v vVar, int i10, int i11, int i12) {
        this.f4535a = iVar;
        this.f4536b = arrayList;
        this.f4537c = i;
        this.f4538d = eVar;
        this.e = vVar;
        this.f4539f = i10;
        this.f4540g = i11;
        this.h = i12;
    }

    public static f a(f fVar, int i, fd.e eVar, v vVar, int i10) {
        if ((i10 & 1) != 0) {
            i = fVar.f4537c;
        }
        int i11 = i;
        if ((i10 & 2) != 0) {
            eVar = fVar.f4538d;
        }
        fd.e eVar2 = eVar;
        if ((i10 & 4) != 0) {
            vVar = fVar.e;
        }
        v vVar2 = vVar;
        int i12 = fVar.f4539f;
        int i13 = fVar.f4540g;
        int i14 = fVar.h;
        jc.i.e(vVar2, "request");
        return new f(fVar.f4535a, fVar.f4536b, i11, eVar2, vVar2, i12, i13, i14);
    }

    public final x b(v vVar) {
        jc.i.e(vVar, "request");
        ArrayList arrayList = this.f4536b;
        int size = arrayList.size();
        int i = this.f4537c;
        if (i >= size) {
            throw new IllegalStateException("Check failed.");
        }
        this.i++;
        fd.e eVar = this.f4538d;
        if (eVar != null) {
            if (!((fd.f) eVar.f3913c).b((o) vVar.f1682c)) {
                throw new IllegalStateException(("network interceptor " + arrayList.get(i - 1) + " must retain the same host and port").toString());
            }
            if (this.i != 1) {
                throw new IllegalStateException(("network interceptor " + arrayList.get(i - 1) + " must call proceed() exactly once").toString());
            }
        }
        int i10 = i + 1;
        f fVarA = a(this, i10, null, vVar, 58);
        p pVar = (p) arrayList.get(i);
        x xVarA = pVar.a(fVarA);
        if (xVarA == null) {
            throw new NullPointerException("interceptor " + pVar + " returned null");
        }
        if (eVar != null && i10 < arrayList.size() && fVarA.i != 1) {
            throw new IllegalStateException(("network interceptor " + pVar + " must call proceed() exactly once").toString());
        }
        if (xVarA.f1701r != null) {
            return xVarA;
        }
        throw new IllegalStateException(("interceptor " + pVar + " returned a response with no body").toString());
    }
}
