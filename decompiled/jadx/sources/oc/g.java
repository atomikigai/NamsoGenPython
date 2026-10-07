package oc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import vb.q;

/* JADX INFO: loaded from: classes3.dex */
public abstract class g extends h {
    public static e S(Iterator it) {
        jc.i.e(it, "<this>");
        return new a(new d(it, 1));
    }

    public static String T(e eVar, String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "");
        int i = 0;
        for (Object obj : eVar) {
            i++;
            if (i > 1) {
                sb2.append((CharSequence) str);
            }
            com.bumptech.glide.c.b(sb2, obj, null);
        }
        sb2.append((CharSequence) "");
        return sb2.toString();
    }

    public static List U(e eVar) {
        Iterator it = eVar.iterator();
        if (!it.hasNext()) {
            return q.f9297a;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return jd.d.D(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
