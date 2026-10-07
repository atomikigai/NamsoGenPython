package w3;

import h6.o0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f9497a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f9498b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public com.bumptech.glide.e f9499c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f9500d;
    public int e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f9501f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Class f9502g;
    public g7.i h;
    public u3.i i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Map f9503j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Class f9504k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f9505l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f9506m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public u3.f f9507n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public com.bumptech.glide.f f9508o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public j f9509p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f9510q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f9511r;

    public final ArrayList a() {
        boolean z4 = this.f9506m;
        ArrayList arrayList = this.f9498b;
        if (!z4) {
            this.f9506m = true;
            arrayList.clear();
            ArrayList arrayListB = b();
            int size = arrayListB.size();
            for (int i = 0; i < size; i++) {
                a4.w wVar = (a4.w) arrayListB.get(i);
                u3.f fVar = wVar.f180a;
                List list = wVar.f181b;
                if (!arrayList.contains(fVar)) {
                    arrayList.add(wVar.f180a);
                }
                for (int i10 = 0; i10 < list.size(); i10++) {
                    if (!arrayList.contains(list.get(i10))) {
                        arrayList.add(list.get(i10));
                    }
                }
            }
        }
        return arrayList;
    }

    public final ArrayList b() {
        boolean z4 = this.f9505l;
        ArrayList arrayList = this.f9497a;
        if (!z4) {
            this.f9505l = true;
            arrayList.clear();
            List listF = this.f9499c.a().f(this.f9500d);
            int size = listF.size();
            for (int i = 0; i < size; i++) {
                a4.w wVarB = ((a4.x) listF.get(i)).b(this.f9500d, this.e, this.f9501f, this.i);
                if (wVarB != null) {
                    arrayList.add(wVarB);
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final v c(Class cls) {
        v vVar;
        Class cls2;
        Class cls3;
        Class cls4;
        v vVar2;
        ArrayList arrayList;
        ArrayList arrayList2;
        i4.a aVar;
        Class cls5 = cls;
        com.bumptech.glide.h hVarA = this.f9499c.a();
        Class cls6 = this.f9502g;
        Class cls7 = this.f9504k;
        k4.c cVar = hVarA.i;
        p4.l lVar = (p4.l) cVar.f5980b.getAndSet(null);
        if (lVar == null) {
            lVar = new p4.l();
        }
        lVar.f7807a = cls5;
        lVar.f7808b = cls6;
        lVar.f7809c = cls7;
        synchronized (cVar.f5979a) {
            vVar = (v) cVar.f5979a.get(lVar);
        }
        cVar.f5980b.set(lVar);
        hVarA.i.getClass();
        if (k4.c.f5978c.equals(vVar)) {
            return null;
        }
        if (vVar != null) {
            return vVar;
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayListK = hVarA.f1868c.k(cls5, cls6);
        int size = arrayListK.size();
        int i = 0;
        while (i < size) {
            int i10 = i + 1;
            Class<?> cls8 = (Class) arrayListK.get(i);
            ArrayList arrayListB = hVarA.f1870f.b(cls8, cls7);
            int size2 = arrayListB.size();
            int i11 = 0;
            while (i11 < size2) {
                int i12 = i11 + 1;
                Class cls9 = (Class) arrayListB.get(i11);
                o0 o0Var = hVarA.f1868c;
                synchronized (o0Var) {
                    arrayList = new ArrayList();
                    ArrayList arrayList4 = (ArrayList) o0Var.f5061b;
                    int size3 = arrayList4.size();
                    int i13 = 0;
                    while (i13 < size3) {
                        Object obj = arrayList4.get(i13);
                        int i14 = i13 + 1;
                        String str = (String) obj;
                        ArrayList arrayList5 = arrayListB;
                        List list = (List) ((HashMap) o0Var.f5062c).get(str);
                        if (list != null) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                k4.d dVar = (k4.d) it.next();
                                Iterator it2 = it;
                                if (dVar.f5981a.isAssignableFrom(cls5) && cls8.isAssignableFrom(dVar.f5982b)) {
                                    arrayList.add(dVar.f5983c);
                                }
                                it = it2;
                            }
                        }
                        arrayListB = arrayList5;
                        i13 = i14;
                    }
                    arrayList2 = arrayListB;
                }
                i4.c cVar2 = hVarA.f1870f;
                synchronized (cVar2) {
                    if (cls9.isAssignableFrom(cls8)) {
                        aVar = i4.d.f5204b;
                    } else {
                        ArrayList arrayList6 = cVar2.f5203a;
                        int size4 = arrayList6.size();
                        int i15 = 0;
                        while (true) {
                            if (i15 >= size4) {
                                throw new IllegalArgumentException("No transcoder registered to transcode from " + cls8 + " to " + cls9);
                            }
                            Object obj2 = arrayList6.get(i15);
                            i15++;
                            i4.b bVar = (i4.b) obj2;
                            ArrayList arrayList7 = arrayList6;
                            if (bVar.f5200a.isAssignableFrom(cls8) && cls9.isAssignableFrom(bVar.f5201b)) {
                                aVar = bVar.f5202c;
                                break;
                            }
                            cls5 = cls;
                            arrayList6 = arrayList7;
                        }
                    }
                }
                arrayList3.add(new i(cls5, cls8, cls9, arrayList, aVar, hVarA.f1872j));
                cls5 = cls;
                size2 = size2;
                i11 = i12;
                arrayListB = arrayList2;
            }
            cls5 = cls;
            i = i10;
        }
        if (arrayList3.isEmpty()) {
            cls2 = cls;
            cls3 = cls6;
            cls4 = cls7;
            vVar2 = null;
        } else {
            cls2 = cls;
            cls3 = cls6;
            cls4 = cls7;
            vVar2 = new v(cls2, cls3, cls4, arrayList3, hVarA.f1872j);
        }
        k4.c cVar3 = hVarA.i;
        synchronized (cVar3.f5979a) {
            cVar3.f5979a.put(new p4.l(cls2, cls3, cls4), vVar2 != null ? vVar2 : k4.c.f5978c);
        }
        return vVar2;
    }

    public final u3.c d(Object obj) {
        u3.c cVar;
        bd.l lVar = this.f9499c.a().f1867b;
        Class<?> cls = obj.getClass();
        synchronized (lVar) {
            ArrayList arrayList = lVar.f1617a;
            int size = arrayList.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    cVar = null;
                    break;
                }
                Object obj2 = arrayList.get(i);
                i++;
                k4.a aVar = (k4.a) obj2;
                if (aVar.f5975a.isAssignableFrom(cls)) {
                    cVar = aVar.f5976b;
                    break;
                }
            }
        }
        if (cVar != null) {
            return cVar;
        }
        throw new com.bumptech.glide.g("Failed to find source encoder for data class: " + obj.getClass());
    }

    public final u3.m e(Class cls) {
        u3.m mVar = (u3.m) this.f9503j.get(cls);
        if (mVar == null) {
            for (Map.Entry entry : this.f9503j.entrySet()) {
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    mVar = (u3.m) entry.getValue();
                    break;
                }
            }
        }
        if (mVar != null) {
            return mVar;
        }
        if (!this.f9503j.isEmpty() || !this.f9510q) {
            return c4.c.f1773b;
        }
        throw new IllegalArgumentException("Missing transformation for " + cls + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
    }
}
