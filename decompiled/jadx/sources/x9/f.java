package x9;

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import fa.c1;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class f implements c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final jb.i f10323g = new jb.i(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f10324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f10325b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f10326c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k f10327d;
    public final AtomicReference e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final wa.d f10328f;

    public f(ArrayList arrayList, ArrayList arrayList2, wa.d dVar) {
        y9.l lVar = y9.l.f10666a;
        this.f10324a = new HashMap();
        this.f10325b = new HashMap();
        this.f10326c = new HashMap();
        this.e = new AtomicReference();
        k kVar = new k();
        this.f10327d = kVar;
        this.f10328f = dVar;
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(b.b(kVar, k.class, va.c.class, va.b.class));
        int i = 0;
        arrayList3.add(b.b(this, f.class, new Class[0]));
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            b bVar = (b) obj;
            if (bVar != null) {
                arrayList3.add(bVar);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        int size2 = arrayList.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj2 = arrayList.get(i11);
            i11++;
            arrayList4.add(obj2);
        }
        ArrayList arrayList5 = new ArrayList();
        synchronized (this) {
            Iterator it = arrayList4.iterator();
            while (it.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((ya.b) it.next()).get();
                    if (componentRegistrar != null) {
                        arrayList3.addAll(this.f10328f.g(componentRegistrar));
                        it.remove();
                    }
                } catch (l e) {
                    it.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e);
                }
            }
            if (this.f10324a.isEmpty()) {
                c1.r(arrayList3);
            } else {
                ArrayList arrayList6 = new ArrayList(this.f10324a.keySet());
                arrayList6.addAll(arrayList3);
                c1.r(arrayList6);
            }
            int size3 = arrayList3.size();
            int i12 = 0;
            while (i12 < size3) {
                Object obj3 = arrayList3.get(i12);
                i12++;
                b bVar2 = (b) obj3;
                this.f10324a.put(bVar2, new m(new n9.c(2, this, bVar2)));
            }
            arrayList5.addAll(k(arrayList3));
            arrayList5.addAll(l());
            j();
        }
        int size4 = arrayList5.size();
        while (i < size4) {
            Object obj4 = arrayList5.get(i);
            i++;
            ((Runnable) obj4).run();
        }
        Boolean bool = (Boolean) this.e.get();
        if (bool != null) {
            i(this.f10324a, bool.booleanValue());
        }
    }

    @Override // x9.c
    public final synchronized ya.b c(q qVar) {
        jd.d.f(qVar, "Null interface requested.");
        return (ya.b) this.f10325b.get(qVar);
    }

    @Override // x9.c
    public final synchronized ya.b e(q qVar) {
        n nVar = (n) this.f10326c.get(qVar);
        if (nVar != null) {
            return nVar;
        }
        return f10323g;
    }

    @Override // x9.c
    public final o h(q qVar) {
        ya.b bVarC = c(qVar);
        if (bVarC == null) {
            return new o(o.f10345c, o.f10346d);
        }
        return bVarC instanceof o ? (o) bVarC : new o(null, bVarC);
    }

    public final void i(HashMap map, boolean z4) {
        ArrayDeque arrayDeque;
        for (Map.Entry entry : map.entrySet()) {
            b bVar = (b) entry.getKey();
            ya.b bVar2 = (ya.b) entry.getValue();
            int i = bVar.f10318d;
            if (i == 1 || (i == 2 && z4)) {
                bVar2.get();
            }
        }
        k kVar = this.f10327d;
        synchronized (kVar) {
            try {
                arrayDeque = kVar.f10338b;
                if (arrayDeque != null) {
                    kVar.f10338b = null;
                } else {
                    arrayDeque = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (arrayDeque != null) {
            Iterator it = arrayDeque.iterator();
            if (it.hasNext()) {
                throw q1.a.g(it);
            }
        }
    }

    public final void j() {
        HashMap map = this.f10325b;
        HashMap map2 = this.f10326c;
        for (b bVar : this.f10324a.keySet()) {
            for (i iVar : bVar.f10317c) {
                boolean z4 = iVar.f10335b == 2;
                q qVar = iVar.f10334a;
                if (z4 && !map2.containsKey(qVar)) {
                    Set set = Collections.EMPTY_SET;
                    n nVar = new n();
                    nVar.f10344b = null;
                    nVar.f10343a = Collections.newSetFromMap(new ConcurrentHashMap());
                    nVar.f10343a.addAll(set);
                    map2.put(qVar, nVar);
                } else if (map.containsKey(qVar)) {
                    continue;
                } else {
                    int i = iVar.f10335b;
                    if (i == 1) {
                        throw new j("Unsatisfied dependency for component " + bVar + ": " + qVar);
                    }
                    if (i != 2) {
                        map.put(qVar, new o(o.f10345c, o.f10346d));
                    }
                }
            }
        }
    }

    public final ArrayList k(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            b bVar = (b) obj;
            if (bVar.e == 0) {
                ya.b bVar2 = (ya.b) this.f10324a.get(bVar);
                for (q qVar : bVar.f10316b) {
                    HashMap map = this.f10325b;
                    if (map.containsKey(qVar)) {
                        arrayList2.add(new androidx.webkit.b(17, (o) ((ya.b) map.get(qVar)), bVar2));
                    } else {
                        map.put(qVar, bVar2);
                    }
                }
            }
        }
        return arrayList2;
    }

    public final ArrayList l() {
        HashMap map = this.f10326c;
        ArrayList arrayList = new ArrayList();
        HashMap map2 = new HashMap();
        for (Map.Entry entry : this.f10324a.entrySet()) {
            b bVar = (b) entry.getKey();
            if (bVar.e != 0) {
                ya.b bVar2 = (ya.b) entry.getValue();
                for (q qVar : bVar.f10316b) {
                    if (!map2.containsKey(qVar)) {
                        map2.put(qVar, new HashSet());
                    }
                    ((Set) map2.get(qVar)).add(bVar2);
                }
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            if (map.containsKey(entry2.getKey())) {
                n nVar = (n) map.get(entry2.getKey());
                Iterator it = ((Set) entry2.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new androidx.webkit.b(18, nVar, (ya.b) it.next()));
                }
            } else {
                q qVar2 = (q) entry2.getKey();
                Set set = (Set) ((Collection) entry2.getValue());
                n nVar2 = new n();
                nVar2.f10344b = null;
                nVar2.f10343a = Collections.newSetFromMap(new ConcurrentHashMap());
                nVar2.f10343a.addAll(set);
                map.put(qVar2, nVar2);
            }
        }
        return arrayList;
    }
}
