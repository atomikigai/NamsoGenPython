package ed;

import da.v;
import e7.i;
import java.util.ArrayList;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class d {
    public static final wa.d h = new wa.d();
    public static final d i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Logger f3545j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f3546a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f3548c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f3549d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3547b = 10000;
    public final ArrayList e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f3550f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final androidx.activity.i f3551g = new androidx.activity.i(this, 16);

    static {
        String str = cd.b.f1827g + " TaskRunner";
        jc.i.e(str, "name");
        i = new d(new i(new cd.a(str, true)));
        Logger logger = Logger.getLogger(d.class.getName());
        jc.i.d(logger, "getLogger(TaskRunner::class.java.name)");
        f3545j = logger;
    }

    public d(i iVar) {
        this.f3546a = iVar;
    }

    public static final void a(d dVar, a aVar) {
        byte[] bArr = cd.b.f1822a;
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        threadCurrentThread.setName(aVar.f3535a);
        try {
            long jA = aVar.a();
            synchronized (dVar) {
                dVar.b(aVar, jA);
            }
        } finally {
            synchronized (dVar) {
                dVar.b(aVar, -1L);
                threadCurrentThread.setName(name);
            }
        }
    }

    public final void b(a aVar, long j4) {
        byte[] bArr = cd.b.f1822a;
        c cVar = aVar.f3537c;
        jc.i.b(cVar);
        if (cVar.f3543d != aVar) {
            throw new IllegalStateException("Check failed.");
        }
        boolean z4 = cVar.f3544f;
        cVar.f3544f = false;
        cVar.f3543d = null;
        this.e.remove(cVar);
        if (j4 != -1 && !z4 && !cVar.f3542c) {
            cVar.d(aVar, j4, true);
        }
        if (cVar.e.isEmpty()) {
            return;
        }
        this.f3550f.add(cVar);
    }

    public final a c() {
        long j4;
        a aVar;
        boolean z4;
        byte[] bArr = cd.b.f1822a;
        while (true) {
            ArrayList arrayList = this.f3550f;
            if (arrayList.isEmpty()) {
                return null;
            }
            long jNanoTime = System.nanoTime();
            int size = arrayList.size();
            long jMin = Long.MAX_VALUE;
            int i10 = 0;
            a aVar2 = null;
            while (true) {
                if (i10 >= size) {
                    j4 = jNanoTime;
                    aVar = null;
                    z4 = false;
                    break;
                }
                Object obj = arrayList.get(i10);
                i10++;
                a aVar3 = (a) ((c) obj).e.get(0);
                j4 = jNanoTime;
                aVar = null;
                long jMax = Math.max(0L, aVar3.f3538d - j4);
                if (jMax > 0) {
                    jMin = Math.min(jMax, jMin);
                } else {
                    if (aVar2 != null) {
                        z4 = true;
                        break;
                    }
                    aVar2 = aVar3;
                }
                jNanoTime = j4;
            }
            ArrayList arrayList2 = this.e;
            if (aVar2 != null) {
                byte[] bArr2 = cd.b.f1822a;
                aVar2.f3538d = -1L;
                c cVar = aVar2.f3537c;
                jc.i.b(cVar);
                cVar.e.remove(aVar2);
                arrayList.remove(cVar);
                cVar.f3543d = aVar2;
                arrayList2.add(cVar);
                if (z4 || (!this.f3548c && !arrayList.isEmpty())) {
                    androidx.activity.i iVar = this.f3551g;
                    jc.i.e(iVar, "runnable");
                    ((ThreadPoolExecutor) this.f3546a.f3489b).execute(iVar);
                }
                return aVar2;
            }
            if (this.f3548c) {
                if (jMin >= this.f3549d - j4) {
                    return aVar;
                }
                notify();
                return aVar;
            }
            this.f3548c = true;
            this.f3549d = j4 + jMin;
            try {
                try {
                    long j10 = jMin / 1000000;
                    long j11 = jMin - (1000000 * j10);
                    if (j10 > 0 || jMin > 0) {
                        wait(j10, (int) j11);
                    }
                } catch (InterruptedException unused) {
                    for (int size2 = arrayList2.size() - 1; -1 < size2; size2--) {
                        ((c) arrayList2.get(size2)).b();
                    }
                    for (int size3 = arrayList.size() - 1; -1 < size3; size3--) {
                        c cVar2 = (c) arrayList.get(size3);
                        cVar2.b();
                        if (cVar2.e.isEmpty()) {
                            arrayList.remove(size3);
                        }
                    }
                }
                this.f3548c = false;
            } catch (Throwable th) {
                this.f3548c = false;
                throw th;
            }
        }
    }

    public final void d(c cVar) {
        jc.i.e(cVar, "taskQueue");
        byte[] bArr = cd.b.f1822a;
        if (cVar.f3543d == null) {
            boolean zIsEmpty = cVar.e.isEmpty();
            ArrayList arrayList = this.f3550f;
            if (zIsEmpty) {
                arrayList.remove(cVar);
            } else {
                jc.i.e(arrayList, "<this>");
                if (!arrayList.contains(cVar)) {
                    arrayList.add(cVar);
                }
            }
        }
        if (this.f3548c) {
            notify();
            return;
        }
        androidx.activity.i iVar = this.f3551g;
        jc.i.e(iVar, "runnable");
        ((ThreadPoolExecutor) this.f3546a.f3489b).execute(iVar);
    }

    public final c e() {
        int i10;
        synchronized (this) {
            i10 = this.f3547b;
            this.f3547b = i10 + 1;
        }
        return new c(this, v.f(i10, "Q"));
    }
}
