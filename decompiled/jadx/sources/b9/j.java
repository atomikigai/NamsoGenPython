package b9;

import fa.d0;
import fa.d1;
import fa.e1;
import fa.p1;
import fa.q1;
import fa.t1;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f1469a = new i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f1470b = new i();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f1471c = new i();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f1472d = new i();
    public Object e = new a(0.0f);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f1473f = new a(0.0f);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f1474g = new a(0.0f);
    public Object h = new a(0.0f);
    public Object i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Object f1475j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Object f1476k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Object f1477l;

    public j() {
        int i = 0;
        this.i = new e(i);
        this.f1475j = new e(i);
        this.f1476k = new e(i);
        this.f1477l = new e(i);
    }

    public k a() {
        k kVar = new k();
        kVar.f1479a = (com.bumptech.glide.c) this.f1469a;
        kVar.f1480b = (com.bumptech.glide.c) this.f1470b;
        kVar.f1481c = (com.bumptech.glide.c) this.f1471c;
        kVar.f1482d = (com.bumptech.glide.c) this.f1472d;
        kVar.e = (c) this.e;
        kVar.f1483f = (c) this.f1473f;
        kVar.f1484g = (c) this.f1474g;
        kVar.h = (c) this.h;
        kVar.i = (e) this.i;
        kVar.f1485j = (e) this.f1475j;
        kVar.f1486k = (e) this.f1476k;
        kVar.f1487l = (e) this.f1477l;
        return kVar;
    }

    public d0 b() {
        String strH = ((String) this.f1469a) == null ? " generator" : "";
        if (((String) this.f1470b) == null) {
            strH = strH.concat(" identifier");
        }
        if (((Long) this.f1472d) == null) {
            strH = da.v.h(strH, " startedAt");
        }
        if (((Boolean) this.f1473f) == null) {
            strH = da.v.h(strH, " crashed");
        }
        if (((d1) this.f1474g) == null) {
            strH = da.v.h(strH, " app");
        }
        if (((Integer) this.f1477l) == null) {
            strH = da.v.h(strH, " generatorType");
        }
        if (strH.isEmpty()) {
            return new d0((String) this.f1469a, (String) this.f1470b, (String) this.f1471c, ((Long) this.f1472d).longValue(), (Long) this.e, ((Boolean) this.f1473f).booleanValue(), (d1) this.f1474g, (q1) this.h, (p1) this.i, (e1) this.f1475j, (t1) this.f1476k, ((Integer) this.f1477l).intValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(strH));
    }
}
