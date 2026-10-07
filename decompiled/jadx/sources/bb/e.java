package bb;

import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import za.j;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f1534d = TimeUnit.HOURS.toMillis(24);
    public static final long e = TimeUnit.MINUTES.toMillis(30);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f1535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f1536b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1537c;

    public e() {
        if (b9.e.f1438b == null) {
            Pattern pattern = j.f11552c;
            b9.e.f1438b = new b9.e(5);
        }
        b9.e eVar = b9.e.f1438b;
        if (j.f11553d == null) {
            j.f11553d = new j(eVar);
        }
        this.f1535a = j.f11553d;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001b  */
    public final synchronized boolean a() {
        boolean z4;
        if (this.f1537c != 0) {
            this.f1535a.f11554a.getClass();
            if (System.currentTimeMillis() > this.f1536b) {
                z4 = true;
            } else {
                z4 = false;
            }
        } else {
            z4 = true;
        }
        return z4;
    }

    public final synchronized void b(int i) {
        long jMin;
        if ((i >= 200 && i < 300) || i == 401 || i == 404) {
            synchronized (this) {
                this.f1537c = 0;
            }
            return;
        }
        this.f1537c++;
        synchronized (this) {
            try {
                if (i == 429 || (i >= 500 && i < 600)) {
                    double dPow = Math.pow(2.0d, this.f1537c);
                    this.f1535a.getClass();
                    jMin = (long) Math.min(dPow + ((long) (Math.random() * 1000.0d)), e);
                } else {
                    jMin = f1534d;
                }
                this.f1535a.f11554a.getClass();
                this.f1536b = System.currentTimeMillis() + jMin;
            } catch (Throwable th) {
                throw th;
            }
        }
        return;
        throw th;
    }
}
