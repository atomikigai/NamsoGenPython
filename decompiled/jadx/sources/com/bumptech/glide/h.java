package com.bumptech.glide;

import a4.b0;
import a4.d0;
import a4.e0;
import a4.x;
import a4.y;
import a4.z;
import h6.o0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f1866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bd.l f1867b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o0 f1868c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i4.c f1869d;
    public final com.bumptech.glide.load.data.i e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i4.c f1870f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final k4.b f1871g;
    public final o0 h = new o0(2);
    public final k4.c i = new k4.c();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final a2.l f1872j;

    public h() {
        a2.l lVar = new a2.l(new p0.f(20), new b9.e(28), new wa.d());
        this.f1872j = lVar;
        this.f1866a = new b0(lVar);
        this.f1867b = new bd.l(1);
        this.f1868c = new o0(3);
        this.f1869d = new i4.c(1);
        this.e = new com.bumptech.glide.load.data.i();
        this.f1870f = new i4.c(0);
        this.f1871g = new k4.b();
        List listAsList = Arrays.asList("Animation", "Bitmap", "BitmapDrawable");
        ArrayList arrayList = new ArrayList(listAsList.size());
        arrayList.add("legacy_prepend_all");
        Iterator it = listAsList.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        arrayList.add("legacy_append");
        o0 o0Var = this.f1868c;
        synchronized (o0Var) {
            try {
                ArrayList arrayList2 = new ArrayList((ArrayList) o0Var.f5061b);
                ((ArrayList) o0Var.f5061b).clear();
                int size = arrayList.size();
                int i = 0;
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((ArrayList) o0Var.f5061b).add((String) obj);
                }
                int size2 = arrayList2.size();
                while (i < size2) {
                    Object obj2 = arrayList2.get(i);
                    i++;
                    String str = (String) obj2;
                    if (!arrayList.contains(str)) {
                        ((ArrayList) o0Var.f5061b).add(str);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a(Class cls, Class cls2, y yVar) {
        b0 b0Var = this.f1866a;
        synchronized (b0Var) {
            e0 e0Var = b0Var.f114a;
            synchronized (e0Var) {
                try {
                    d0 d0Var = new d0(cls, cls2, yVar);
                    ArrayList arrayList = e0Var.f133a;
                    arrayList.add(arrayList.size(), d0Var);
                } catch (Throwable th) {
                    throw th;
                }
            }
            b0Var.f115b.f111a.clear();
        }
    }

    public final void b(Class cls, u3.c cVar) {
        bd.l lVar = this.f1867b;
        synchronized (lVar) {
            lVar.f1617a.add(new k4.a(cls, cVar));
        }
    }

    public final void c(Class cls, u3.l lVar) {
        i4.c cVar = this.f1869d;
        synchronized (cVar) {
            cVar.f5203a.add(new k4.e(cls, lVar));
        }
    }

    public final void d(String str, Class cls, Class cls2, u3.k kVar) {
        o0 o0Var = this.f1868c;
        synchronized (o0Var) {
            o0Var.i(str).add(new k4.d(cls, cls2, kVar));
        }
    }

    public final ArrayList e() {
        ArrayList arrayList;
        k4.b bVar = this.f1871g;
        synchronized (bVar) {
            arrayList = bVar.f5977a;
        }
        if (arrayList.isEmpty()) {
            throw new g("Failed to find image header parser.");
        }
        return arrayList;
    }

    public final List f(Object obj) {
        List listUnmodifiableList;
        b0 b0Var = this.f1866a;
        b0Var.getClass();
        Class<?> cls = obj.getClass();
        synchronized (b0Var) {
            z zVar = (z) b0Var.f115b.f111a.get(cls);
            listUnmodifiableList = zVar == null ? null : zVar.f183a;
            if (listUnmodifiableList == null) {
                listUnmodifiableList = Collections.unmodifiableList(b0Var.f114a.b(cls));
                if (((z) b0Var.f115b.f111a.put(cls, new z(listUnmodifiableList))) != null) {
                    throw new IllegalStateException("Already cached loaders for model: " + cls);
                }
            }
        }
        if (listUnmodifiableList.isEmpty()) {
            throw new g("Failed to find any ModelLoaders registered for model class: " + obj.getClass());
        }
        int size = listUnmodifiableList.size();
        List arrayList = Collections.EMPTY_LIST;
        boolean z4 = true;
        for (int i = 0; i < size; i++) {
            x xVar = (x) listUnmodifiableList.get(i);
            if (xVar.a(obj)) {
                if (z4) {
                    arrayList = new ArrayList(size - i);
                    z4 = false;
                }
                arrayList.add(xVar);
            }
        }
        if (!arrayList.isEmpty()) {
            return arrayList;
        }
        throw new g("Found ModelLoaders for model class: " + listUnmodifiableList + ", but none that handle this specific model instance: " + obj);
    }

    public final com.bumptech.glide.load.data.g g(Object obj) {
        com.bumptech.glide.load.data.g gVarB;
        com.bumptech.glide.load.data.i iVar = this.e;
        synchronized (iVar) {
            try {
                p4.f.b(obj);
                com.bumptech.glide.load.data.f fVar = (com.bumptech.glide.load.data.f) ((HashMap) iVar.f1900b).get(obj.getClass());
                if (fVar == null) {
                    for (com.bumptech.glide.load.data.f fVar2 : ((HashMap) iVar.f1900b).values()) {
                        if (fVar2.a().isAssignableFrom(obj.getClass())) {
                            fVar = fVar2;
                            break;
                        }
                    }
                }
                if (fVar == null) {
                    fVar = com.bumptech.glide.load.data.i.f1898c;
                }
                gVarB = fVar.b(obj);
            } catch (Throwable th) {
                throw th;
            }
        }
        return gVarB;
    }

    public final void h(com.bumptech.glide.load.data.f fVar) {
        com.bumptech.glide.load.data.i iVar = this.e;
        synchronized (iVar) {
            ((HashMap) iVar.f1900b).put(fVar.a(), fVar);
        }
    }

    public final void i(Class cls, Class cls2, i4.a aVar) {
        i4.c cVar = this.f1870f;
        synchronized (cVar) {
            cVar.f5203a.add(new i4.b(cls, cls2, aVar));
        }
    }
}
