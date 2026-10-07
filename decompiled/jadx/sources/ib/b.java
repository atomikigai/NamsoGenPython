package ib;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f5253b;

    public b(Set set, c cVar) {
        this.f5252a = b(set);
        this.f5253b = cVar;
    }

    public static String b(Set set) {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            sb2.append(aVar.f5250a);
            sb2.append('/');
            sb2.append(aVar.f5251b);
            if (it.hasNext()) {
                sb2.append(' ');
            }
        }
        return sb2.toString();
    }

    public final String a() {
        Set setUnmodifiableSet;
        Set setUnmodifiableSet2;
        String str = this.f5252a;
        c cVar = this.f5253b;
        synchronized (((HashSet) cVar.f5256b)) {
            setUnmodifiableSet = Collections.unmodifiableSet((HashSet) cVar.f5256b);
        }
        if (setUnmodifiableSet.isEmpty()) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(' ');
        synchronized (((HashSet) cVar.f5256b)) {
            setUnmodifiableSet2 = Collections.unmodifiableSet((HashSet) cVar.f5256b);
        }
        sb2.append(b(setUnmodifiableSet2));
        return sb2.toString();
    }
}
