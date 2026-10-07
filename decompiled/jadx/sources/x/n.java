package x;

import da.v;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f9998f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f9999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f10000b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f10001c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList f10002d;
    public int e;

    public final void a(ArrayList arrayList) {
        int size = this.f9999a.size();
        if (this.e != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                n nVar = (n) arrayList.get(i);
                if (this.e == nVar.f10000b) {
                    c(this.f10001c, nVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public final int b(u.c cVar, int i) {
        int iN;
        int iN2;
        ArrayList arrayList = this.f9999a;
        if (arrayList.size() == 0) {
            return 0;
        }
        w.e eVar = (w.e) ((w.d) arrayList.get(0)).T;
        cVar.t();
        eVar.b(cVar, false);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((w.d) arrayList.get(i10)).b(cVar, false);
        }
        if (i == 0 && eVar.f9412z0 > 0) {
            w.j.a(eVar, cVar, arrayList, 0);
        }
        if (i == 1 && eVar.A0 > 0) {
            w.j.a(eVar, cVar, arrayList, 1);
        }
        try {
            cVar.p();
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.f10002d = new ArrayList();
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            w.d dVar = (w.d) arrayList.get(i11);
            r7.i iVar = new r7.i();
            new WeakReference(dVar);
            u.c.n(dVar.I);
            u.c.n(dVar.J);
            u.c.n(dVar.K);
            u.c.n(dVar.L);
            u.c.n(dVar.M);
            this.f10002d.add(iVar);
        }
        if (i == 0) {
            iN = u.c.n(eVar.I);
            iN2 = u.c.n(eVar.K);
            cVar.t();
        } else {
            iN = u.c.n(eVar.J);
            iN2 = u.c.n(eVar.L);
            cVar.t();
        }
        return iN2 - iN;
    }

    public final void c(int i, n nVar) {
        int i10 = nVar.f10000b;
        ArrayList arrayList = this.f9999a;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            w.d dVar = (w.d) obj;
            ArrayList arrayList2 = nVar.f9999a;
            if (!arrayList2.contains(dVar)) {
                arrayList2.add(dVar);
            }
            if (i == 0) {
                dVar.f9388n0 = i10;
            } else {
                dVar.f9390o0 = i10;
            }
        }
        this.e = i10;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        int i = this.f10001c;
        if (i == 0) {
            str = "Horizontal";
        } else if (i == 1) {
            str = "Vertical";
        } else {
            str = i == 2 ? "Both" : "Unknown";
        }
        sb2.append(str);
        sb2.append(" [");
        String strC = u3.b.c(sb2, this.f10000b, "] <");
        ArrayList arrayList = this.f9999a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            StringBuilder sbC = u.e.c(strC, " ");
            sbC.append(((w.d) obj).f9378h0);
            strC = sbC.toString();
        }
        return v.h(strC, " >");
    }
}
