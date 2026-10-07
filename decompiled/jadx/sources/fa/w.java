package fa;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Serializable f3865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Serializable f3866b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Serializable f3867c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Serializable f3868d;
    public Object e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f3869f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f3870g;
    public Serializable h;
    public Object i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Object f3871j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Object f3872k;

    public void a(q3.k kVar) {
        kVar.f8011s = this;
        synchronized (((HashSet) this.f3866b)) {
            ((HashSet) this.f3866b).add(kVar);
        }
        kVar.f8010r = Integer.valueOf(((AtomicInteger) this.f3865a).incrementAndGet());
        kVar.a("add-to-queue");
        c();
        if (kVar.f8012t) {
            ((PriorityBlockingQueue) this.f3867c).add(kVar);
        } else {
            ((PriorityBlockingQueue) this.f3868d).add(kVar);
        }
    }

    public x b() {
        String strH = ((String) this.f3865a) == null ? " sdkVersion" : "";
        if (((String) this.f3866b) == null) {
            strH = strH.concat(" gmpAppId");
        }
        if (((Integer) this.h) == null) {
            strH = da.v.h(strH, " platform");
        }
        if (((String) this.f3867c) == null) {
            strH = da.v.h(strH, " installationUuid");
        }
        if (((String) this.f3869f) == null) {
            strH = da.v.h(strH, " buildVersion");
        }
        if (((String) this.f3870g) == null) {
            strH = da.v.h(strH, " displayVersion");
        }
        if (strH.isEmpty()) {
            return new x((String) this.f3865a, (String) this.f3866b, ((Integer) this.h).intValue(), (String) this.f3867c, (String) this.f3868d, (String) this.e, (String) this.f3869f, (String) this.f3870g, (r1) this.i, (b1) this.f3871j, (y0) this.f3872k);
        }
        throw new IllegalStateException("Missing required properties:".concat(strH));
    }

    public void c() {
        synchronized (((ArrayList) this.f3872k)) {
            try {
                Iterator it = ((ArrayList) this.f3872k).iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
