package vb;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class t extends jd.l {
    public static int A(int i) {
        if (i < 0) {
            return i;
        }
        if (i < 3) {
            return i + 1;
        }
        return i < 1073741824 ? (int) ((i / 0.75f) + 1.0f) : com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
    }

    public static Map B(ub.f... fVarArr) {
        if (fVarArr.length <= 0) {
            return r.f9298a;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(A(fVarArr.length));
        C(linkedHashMap, fVarArr);
        return linkedHashMap;
    }

    public static final void C(HashMap map, ub.f[] fVarArr) {
        for (ub.f fVar : fVarArr) {
            map.put(fVar.f9065a, fVar.f9066b);
        }
    }

    public static Map D(ArrayList arrayList) {
        int size = arrayList.size();
        if (size == 0) {
            return r.f9298a;
        }
        if (size == 1) {
            ub.f fVar = (ub.f) arrayList.get(0);
            jc.i.e(fVar, "pair");
            Map mapSingletonMap = Collections.singletonMap(fVar.f9065a, fVar.f9066b);
            jc.i.d(mapSingletonMap, "singletonMap(...)");
            return mapSingletonMap;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(A(arrayList.size()));
        int size2 = arrayList.size();
        int i = 0;
        while (i < size2) {
            Object obj = arrayList.get(i);
            i++;
            ub.f fVar2 = (ub.f) obj;
            linkedHashMap.put(fVar2.f9065a, fVar2.f9066b);
        }
        return linkedHashMap;
    }

    public static final Map E(Map map) {
        jc.i.e(map, "<this>");
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        Map mapSingletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        jc.i.d(mapSingletonMap, "with(...)");
        return mapSingletonMap;
    }
}
