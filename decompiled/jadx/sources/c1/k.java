package c1;

import ic.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import vb.t;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends ac.i implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ b1.e f1726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ d1.b f1727b;

    @Override // ic.q
    public final Object b(Object obj, Object obj2, Object obj3) {
        k kVar = new k(3, (yb.d) obj3);
        kVar.f1726a = (b1.e) obj;
        kVar.f1727b = (d1.b) obj2;
        return kVar.invokeSuspend(ub.k.f9073a);
    }

    @Override // ac.a
    public final Object invokeSuspend(Object obj) {
        zb.a aVar = zb.a.f11555a;
        r7.g.G(obj);
        b1.e eVar = this.f1726a;
        d1.b bVar = this.f1727b;
        Set setKeySet = bVar.a().keySet();
        ArrayList arrayList = new ArrayList(vb.k.U(setKeySet));
        Iterator it = setKeySet.iterator();
        while (it.hasNext()) {
            arrayList.add(((d1.d) it.next()).f2797a);
        }
        Map<String, ?> all = eVar.f1347a.getAll();
        jc.i.d(all, "prefs.all");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<Map.Entry<String, ?>> it2 = all.entrySet().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Map.Entry<String, ?> next = it2.next();
            String key = next.getKey();
            Set set = eVar.f1348b;
            if (set != null ? set.contains(key) : true) {
                linkedHashMap.put(next.getKey(), next.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(t.A(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key2 = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Set) {
                value = vb.i.q0((Iterable) value);
            }
            linkedHashMap2.put(key2, value);
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
            if (!arrayList.contains((String) entry2.getKey())) {
                linkedHashMap3.put(entry2.getKey(), entry2.getValue());
            }
        }
        d1.b bVar2 = new d1.b(new LinkedHashMap(bVar.a()), false);
        for (Map.Entry entry3 : linkedHashMap3.entrySet()) {
            String str = (String) entry3.getKey();
            Object value2 = entry3.getValue();
            if (value2 instanceof Boolean) {
                jc.i.e(str, "name");
                bVar2.c(new d1.d(str), value2);
            } else if (value2 instanceof Float) {
                jc.i.e(str, "name");
                bVar2.c(new d1.d(str), value2);
            } else if (value2 instanceof Integer) {
                bVar2.c(android.support.v4.media.session.a.l(str), value2);
            } else if (value2 instanceof Long) {
                jc.i.e(str, "name");
                bVar2.c(new d1.d(str), value2);
            } else if (value2 instanceof String) {
                jc.i.e(str, "name");
                bVar2.c(new d1.d(str), value2);
            } else if (value2 instanceof Set) {
                jc.i.e(str, "name");
                bVar2.c(new d1.d(str), (Set) value2);
            }
        }
        return new d1.b(new LinkedHashMap(bVar2.a()), true);
    }
}
