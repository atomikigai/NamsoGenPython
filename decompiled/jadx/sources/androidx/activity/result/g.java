package androidx.activity.result;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.l;
import androidx.lifecycle.m;
import androidx.lifecycle.p;
import androidx.lifecycle.r;
import androidx.lifecycle.t;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f396a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f397b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f398c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList f399d = new ArrayList();
    public final transient HashMap e = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashMap f400f = new HashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Bundle f401g = new Bundle();

    public final boolean a(int i, int i10, Intent intent) {
        String str = (String) this.f396a.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        e eVar = (e) this.e.get(str);
        if (eVar != null) {
            b bVar = eVar.f392a;
            if (this.f399d.contains(str)) {
                bVar.e(eVar.f393b.w(intent, i10));
                this.f399d.remove(str);
                return true;
            }
        }
        this.f400f.remove(str);
        this.f401g.putParcelable(str, new a(intent, i10));
        return true;
    }

    public abstract void b(int i, com.bumptech.glide.d dVar, Object obj);

    public final d c(final String str, r rVar, final com.bumptech.glide.d dVar, final b bVar) {
        t tVarL = rVar.l();
        if (tVarL.f1093d.compareTo(m.f1068d) >= 0) {
            throw new IllegalStateException("LifecycleOwner " + rVar + " is attempting to register while current state is " + tVarL.f1093d + ". LifecycleOwners must call register before they are STARTED.");
        }
        e(str);
        HashMap map = this.f398c;
        f fVar = (f) map.get(str);
        if (fVar == null) {
            fVar = new f(tVarL);
        }
        p pVar = new p() { // from class: androidx.activity.result.ActivityResultRegistry$1
            @Override // androidx.lifecycle.p
            public final void a(r rVar2, l lVar) {
                boolean zEquals = l.ON_START.equals(lVar);
                String str2 = str;
                g gVar = this.f385d;
                if (!zEquals) {
                    if (l.ON_STOP.equals(lVar)) {
                        gVar.e.remove(str2);
                        return;
                    } else {
                        if (l.ON_DESTROY.equals(lVar)) {
                            gVar.f(str2);
                            return;
                        }
                        return;
                    }
                }
                HashMap map2 = gVar.e;
                Bundle bundle = gVar.f401g;
                HashMap map3 = gVar.f400f;
                b bVar2 = bVar;
                com.bumptech.glide.d dVar2 = dVar;
                map2.put(str2, new e(bVar2, dVar2));
                if (map3.containsKey(str2)) {
                    Object obj = map3.get(str2);
                    map3.remove(str2);
                    bVar2.e(obj);
                }
                a aVar = (a) bundle.getParcelable(str2);
                if (aVar != null) {
                    bundle.remove(str2);
                    bVar2.e(dVar2.w(aVar.f387b, aVar.f386a));
                }
            }
        };
        fVar.f394a.a(pVar);
        fVar.f395b.add(pVar);
        map.put(str, fVar);
        return new d(this, str, dVar, 0);
    }

    public final d d(String str, com.bumptech.glide.d dVar, b bVar) {
        e(str);
        this.e.put(str, new e(bVar, dVar));
        HashMap map = this.f400f;
        if (map.containsKey(str)) {
            Object obj = map.get(str);
            map.remove(str);
            bVar.e(obj);
        }
        Bundle bundle = this.f401g;
        a aVar = (a) bundle.getParcelable(str);
        if (aVar != null) {
            bundle.remove(str);
            bVar.e(dVar.w(aVar.f387b, aVar.f386a));
        }
        return new d(this, str, dVar, 1);
    }

    public final void e(String str) {
        HashMap map = this.f397b;
        if (((Integer) map.get(str)) != null) {
            return;
        }
        int iNextInt = kc.d.f6207b.f().nextInt(2147418112);
        while (true) {
            int i = iNextInt + 65536;
            Integer numValueOf = Integer.valueOf(i);
            HashMap map2 = this.f396a;
            if (!map2.containsKey(numValueOf)) {
                map2.put(Integer.valueOf(i), str);
                map.put(str, Integer.valueOf(i));
                return;
            }
            iNextInt = kc.d.f6207b.f().nextInt(2147418112);
        }
    }

    public final void f(String str) {
        Integer num;
        if (!this.f399d.contains(str) && (num = (Integer) this.f397b.remove(str)) != null) {
            this.f396a.remove(num);
        }
        this.e.remove(str);
        HashMap map = this.f400f;
        if (map.containsKey(str)) {
            StringBuilder sbN = q1.a.n("Dropping pending result for request ", str, ": ");
            sbN.append(map.get(str));
            Log.w("ActivityResultRegistry", sbN.toString());
            map.remove(str);
        }
        Bundle bundle = this.f401g;
        if (bundle.containsKey(str)) {
            StringBuilder sbN2 = q1.a.n("Dropping pending result for request ", str, ": ");
            sbN2.append(bundle.getParcelable(str));
            Log.w("ActivityResultRegistry", sbN2.toString());
            bundle.remove(str);
        }
        HashMap map2 = this.f398c;
        f fVar = (f) map2.get(str);
        if (fVar != null) {
            ArrayList arrayList = fVar.f395b;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                fVar.f394a.f((p) obj);
            }
            arrayList.clear();
            map2.remove(str);
        }
    }
}
