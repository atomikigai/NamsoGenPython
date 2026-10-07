package a4;

import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 {
    public static final h0 e = new h0(10);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final i0 f132f = new i0(2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a2.l f136d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f133a = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashSet f135c = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h0 f134b = e;

    public e0(a2.l lVar) {
        this.f136d = lVar;
    }

    public final synchronized x a(Class cls, Class cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = this.f133a;
            int size = arrayList2.size();
            boolean z4 = false;
            int i = 0;
            while (i < size) {
                Object obj = arrayList2.get(i);
                i++;
                d0 d0Var = (d0) obj;
                if (this.f135c.contains(d0Var)) {
                    z4 = true;
                } else if (d0Var.f127a.isAssignableFrom(cls) && d0Var.f128b.isAssignableFrom(cls2)) {
                    this.f135c.add(d0Var);
                    arrayList.add(d0Var.f129c.i(this));
                    this.f135c.remove(d0Var);
                }
            }
            if (arrayList.size() > 1) {
                h0 h0Var = this.f134b;
                a2.l lVar = this.f136d;
                h0Var.getClass();
                return new c(2, arrayList, lVar);
            }
            if (arrayList.size() == 1) {
                return (x) arrayList.get(0);
            }
            if (z4) {
                return f132f;
            }
            throw new com.bumptech.glide.g("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
        } catch (Throwable th) {
            this.f135c.clear();
            throw th;
        }
    }

    public final synchronized ArrayList b(Class cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            ArrayList arrayList2 = this.f133a;
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList2.get(i);
                i++;
                d0 d0Var = (d0) obj;
                if (!this.f135c.contains(d0Var) && d0Var.f127a.isAssignableFrom(cls)) {
                    this.f135c.add(d0Var);
                    arrayList.add(d0Var.f129c.i(this));
                    this.f135c.remove(d0Var);
                }
            }
        } catch (Throwable th) {
            this.f135c.clear();
            throw th;
        }
        return arrayList;
    }

    public final synchronized ArrayList c(Class cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        ArrayList arrayList2 = this.f133a;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            d0 d0Var = (d0) obj;
            if (!arrayList.contains(d0Var.f128b) && d0Var.f127a.isAssignableFrom(cls)) {
                arrayList.add(d0Var.f128b);
            }
        }
        return arrayList;
    }
}
