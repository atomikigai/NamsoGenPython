package x3;

import android.util.Log;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.NavigableMap;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s5.j f10271a = new s5.j(15);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f10272b = new e(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f10273c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f10274d = new HashMap();
    public final int e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f10275f;

    public f(int i) {
        this.e = i;
    }

    public final void a(int i, Class cls) {
        NavigableMap navigableMapF = f(cls);
        Integer num = (Integer) navigableMapF.get(Integer.valueOf(i));
        if (num != null) {
            if (num.intValue() == 1) {
                navigableMapF.remove(Integer.valueOf(i));
                return;
            } else {
                navigableMapF.put(Integer.valueOf(i), Integer.valueOf(num.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + i + ", this: " + this);
    }

    public final void b(int i) {
        while (this.f10275f > i) {
            Object objA = this.f10271a.A();
            p4.f.b(objA);
            b bVarD = d(objA.getClass());
            this.f10275f -= bVarD.b() * bVarD.a(objA);
            a(bVarD.a(objA), objA.getClass());
            if (Log.isLoggable(bVarD.c(), 2)) {
                Log.v(bVarD.c(), "evicted: " + bVarD.a(objA));
            }
        }
    }

    public final synchronized Object c(int i, Class cls) {
        d dVar;
        int i10;
        try {
            Integer num = (Integer) f(cls).ceilingKey(Integer.valueOf(i));
            if (num == null || ((i10 = this.f10275f) != 0 && this.e / i10 < 2 && num.intValue() > i * 8)) {
                e eVar = this.f10272b;
                h hVarD = (h) ((ArrayDeque) eVar.f159a).poll();
                if (hVarD == null) {
                    hVarD = eVar.d();
                }
                dVar = (d) hVarD;
                dVar.f10268b = i;
                dVar.f10269c = cls;
            } else {
                e eVar2 = this.f10272b;
                int iIntValue = num.intValue();
                h hVarD2 = (h) ((ArrayDeque) eVar2.f159a).poll();
                if (hVarD2 == null) {
                    hVarD2 = eVar2.d();
                }
                dVar = (d) hVarD2;
                dVar.f10268b = iIntValue;
                dVar.f10269c = cls;
            }
        } catch (Throwable th) {
            throw th;
        }
        return e(dVar, cls);
    }

    public final b d(Class cls) {
        b bVar;
        HashMap map = this.f10274d;
        b bVar2 = (b) map.get(cls);
        if (bVar2 != null) {
            return bVar2;
        }
        if (cls.equals(int[].class)) {
            bVar = new b(1);
        } else {
            if (!cls.equals(byte[].class)) {
                throw new IllegalArgumentException("No array pool found for: ".concat(cls.getSimpleName()));
            }
            bVar = new b(0);
        }
        map.put(cls, bVar);
        return bVar;
    }

    public final Object e(d dVar, Class cls) {
        b bVarD = d(cls);
        Object objJ = this.f10271a.j(dVar);
        if (objJ != null) {
            this.f10275f -= bVarD.b() * bVarD.a(objJ);
            a(bVarD.a(objJ), cls);
        }
        if (objJ != null) {
            return objJ;
        }
        if (Log.isLoggable(bVarD.c(), 2)) {
            Log.v(bVarD.c(), "Allocated " + dVar.f10268b + " bytes");
        }
        int i = dVar.f10268b;
        switch (bVarD.f10262a) {
            case 0:
                return new byte[i];
            default:
                return new int[i];
        }
    }

    public final NavigableMap f(Class cls) {
        HashMap map = this.f10273c;
        NavigableMap navigableMap = (NavigableMap) map.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        map.put(cls, treeMap);
        return treeMap;
    }

    public final synchronized void g(Object obj) {
        Class<?> cls = obj.getClass();
        b bVarD = d(cls);
        int iA = bVarD.a(obj);
        int iB = bVarD.b() * iA;
        if (iB <= this.e / 2) {
            e eVar = this.f10272b;
            h hVarD = (h) ((ArrayDeque) eVar.f159a).poll();
            if (hVarD == null) {
                hVarD = eVar.d();
            }
            d dVar = (d) hVarD;
            dVar.f10268b = iA;
            dVar.f10269c = cls;
            this.f10271a.w(dVar, obj);
            NavigableMap navigableMapF = f(cls);
            Integer num = (Integer) navigableMapF.get(Integer.valueOf(dVar.f10268b));
            Integer numValueOf = Integer.valueOf(dVar.f10268b);
            int iIntValue = 1;
            if (num != null) {
                iIntValue = 1 + num.intValue();
            }
            navigableMapF.put(numValueOf, Integer.valueOf(iIntValue));
            this.f10275f += iB;
            b(this.e);
        }
    }
}
