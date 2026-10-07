package y1;

import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f10450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l0 f10451b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f10452c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ReentrantLock f10453d;
    public final g e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final g f10454f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f10455g;

    /* JADX WARN: Type inference failed for: r1v4, types: [y1.g] */
    /* JADX WARN: Type inference failed for: r1v5, types: [y1.g] */
    public i(v vVar, HashMap map, HashMap map2, String... strArr) {
        this.f10450a = vVar;
        l0 l0Var = new l0(vVar, map, map2, strArr, vVar.f10522k, new h(1, this, i.class, "notifyInvalidatedObservers", "notifyInvalidatedObservers(Ljava/util/Set;)V", 0, 0));
        this.f10451b = l0Var;
        this.f10452c = new LinkedHashMap();
        this.f10453d = new ReentrantLock();
        final int i = 0;
        this.e = new ic.a(this) { // from class: y1.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f10436b;

            {
                this.f10436b = this;
            }

            @Override // ic.a
            public final Object a() {
                switch (i) {
                    case 0:
                        this.f10436b.getClass();
                        break;
                    case 1:
                        this.f10436b.getClass();
                        break;
                    default:
                        i iVar = this.f10436b;
                        return Boolean.valueOf(!iVar.f10450a.l() || iVar.f10450a.p());
                }
                return ub.k.f9073a;
            }
        };
        final int i10 = 1;
        this.f10454f = new ic.a(this) { // from class: y1.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f10436b;

            {
                this.f10436b = this;
            }

            @Override // ic.a
            public final Object a() {
                switch (i10) {
                    case 0:
                        this.f10436b.getClass();
                        break;
                    case 1:
                        this.f10436b.getClass();
                        break;
                    default:
                        i iVar = this.f10436b;
                        return Boolean.valueOf(!iVar.f10450a.l() || iVar.f10450a.p());
                }
                return ub.k.f9073a;
            }
        };
        jc.i.d(Collections.newSetFromMap(new IdentityHashMap()), "newSetFromMap(...)");
        this.f10455g = new Object();
        final int i11 = 2;
        l0Var.f10490k = new ic.a(this) { // from class: y1.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f10436b;

            {
                this.f10436b = this;
            }

            @Override // ic.a
            public final Object a() {
                switch (i11) {
                    case 0:
                        this.f10436b.getClass();
                        break;
                    case 1:
                        this.f10436b.getClass();
                        break;
                    default:
                        i iVar = this.f10436b;
                        return Boolean.valueOf(!iVar.f10450a.l() || iVar.f10450a.p());
                }
                return ub.k.f9073a;
            }
        };
    }
}
