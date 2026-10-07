package u2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import t2.m;
import t2.n;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends com.bumptech.glide.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f8801f = m.f("WorkContinuationImpl");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f8802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f8803b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f8804c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f8805d = new ArrayList();
    public boolean e;

    public e(j jVar, List list) {
        this.f8802a = jVar;
        this.f8803b = list;
        this.f8804c = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            String string = ((n) list.get(i)).f8552a.toString();
            this.f8804c.add(string);
            this.f8805d.add(string);
        }
    }

    public static HashSet V(e eVar) {
        HashSet hashSet = new HashSet();
        eVar.getClass();
        return hashSet;
    }
}
