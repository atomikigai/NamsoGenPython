package androidx.work;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import o6.h0;
import t2.f;
import t2.h;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class OverwritingInputMerger extends h {
    @Override // t2.h
    public final f a(ArrayList arrayList) throws Throwable {
        h0 h0Var = new h0(4, false);
        HashMap map = new HashMap();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            map.putAll(Collections.unmodifiableMap(((f) obj).f8543a));
        }
        h0Var.j(map);
        f fVar = new f((HashMap) h0Var.f7621a);
        f.c(fVar);
        return fVar;
    }
}
