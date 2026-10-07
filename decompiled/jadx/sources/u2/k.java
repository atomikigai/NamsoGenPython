package u2;

import a2.l;
import android.content.Context;
import android.database.Cursor;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import d3.o;
import d3.q;
import da.v;
import gb.r;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import t2.m;
import t2.s;
import y1.y;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements Runnable {
    public static final String E = m.f("WorkerWrapper");
    public String A;
    public e3.k B;
    public m9.a C;
    public volatile boolean D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f8828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f8829b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List f8830c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public q5.d f8831d;
    public c3.i e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ListenableWorker f8832f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public l f8833r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public t2.l f8834s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public t2.b f8835t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public b f8836u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public WorkDatabase f8837v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public c3.j f8838w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public aa.c f8839x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public aa.c f8840y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public ArrayList f8841z;

    public final void a(t2.l lVar) {
        boolean z4 = lVar instanceof t2.k;
        String str = E;
        if (!z4) {
            if (lVar instanceof t2.j) {
                m.d().e(str, u3.b.b("Worker result RETRY for ", this.A), new Throwable[0]);
                c();
                return;
            }
            m.d().e(str, u3.b.b("Worker result FAILURE for ", this.A), new Throwable[0]);
            if (this.e.c()) {
                d();
                return;
            } else {
                g();
                return;
            }
        }
        m.d().e(str, u3.b.b("Worker result SUCCESS for ", this.A), new Throwable[0]);
        if (this.e.c()) {
            d();
            return;
        }
        aa.c cVar = this.f8839x;
        String str2 = this.f8829b;
        c3.j jVar = this.f8838w;
        WorkDatabase workDatabase = this.f8837v;
        workDatabase.c();
        try {
            jVar.r(3, str2);
            jVar.p(str2, ((t2.k) this.f8834s).f8549a);
            long jCurrentTimeMillis = System.currentTimeMillis();
            ArrayList arrayListW = cVar.w(str2);
            int size = arrayListW.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayListW.get(i);
                i++;
                String str3 = (String) obj;
                if (jVar.i(str3) == 5) {
                    WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) cVar.f263b;
                    y yVarD = y.d(1, "SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)");
                    if (str3 == null) {
                        yVarD.I(1);
                    } else {
                        yVarD.j(1, str3);
                    }
                    workDatabase_Impl.b();
                    Cursor cursorX = n9.b.x(workDatabase_Impl, yVarD);
                    try {
                        boolean z10 = cursorX.moveToFirst() && cursorX.getInt(0) != 0;
                        cursorX.close();
                        yVarD.g();
                        if (z10) {
                            m.d().e(str, "Setting status to enqueued for " + str3, new Throwable[0]);
                            jVar.r(1, str3);
                            jVar.q(str3, jCurrentTimeMillis);
                        }
                    } catch (Throwable th) {
                        cursorX.close();
                        yVarD.g();
                        throw th;
                    }
                }
            }
            workDatabase.q();
            workDatabase.n();
            e(false);
        } catch (Throwable th2) {
            workDatabase.n();
            e(false);
            throw th2;
        }
    }

    public final void b() {
        List list = this.f8830c;
        String str = this.f8829b;
        WorkDatabase workDatabase = this.f8837v;
        if (!h()) {
            workDatabase.c();
            try {
                int i = this.f8838w.i(str);
                r rVarW = workDatabase.w();
                WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) rVarW.f4493a;
                workDatabase_Impl.b();
                c3.e eVar = (c3.e) rVarW.f4495c;
                i2.k kVarA = eVar.a();
                if (str == null) {
                    kVarA.I(1);
                } else {
                    kVarA.j(1, str);
                }
                workDatabase_Impl.c();
                try {
                    kVarA.c();
                    workDatabase_Impl.q();
                    workDatabase_Impl.n();
                    eVar.g(kVarA);
                    if (i == 0) {
                        e(false);
                    } else if (i == 2) {
                        a(this.f8834s);
                    } else if (!v.a(i)) {
                        c();
                    }
                    workDatabase.q();
                    workDatabase.n();
                } catch (Throwable th) {
                    workDatabase_Impl.n();
                    eVar.g(kVarA);
                    throw th;
                }
            } catch (Throwable th2) {
                workDatabase.n();
                throw th2;
            }
        }
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((c) it.next()).d(str);
            }
            d.a(this.f8835t, workDatabase, list);
        }
    }

    public final void c() {
        String str = this.f8829b;
        c3.j jVar = this.f8838w;
        WorkDatabase workDatabase = this.f8837v;
        workDatabase.c();
        try {
            jVar.r(1, str);
            jVar.q(str, System.currentTimeMillis());
            jVar.o(str, -1L);
            workDatabase.q();
        } finally {
            workDatabase.n();
            e(true);
        }
    }

    public final void d() {
        String str = this.f8829b;
        c3.j jVar = this.f8838w;
        WorkDatabase workDatabase = this.f8837v;
        workDatabase.c();
        try {
            jVar.q(str, System.currentTimeMillis());
            jVar.r(1, str);
            WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) jVar.f1759a;
            workDatabase_Impl.b();
            c3.e eVar = (c3.e) jVar.f1764g;
            i2.k kVarA = eVar.a();
            if (str == null) {
                kVarA.I(1);
            } else {
                kVarA.j(1, str);
            }
            workDatabase_Impl.c();
            try {
                kVarA.c();
                workDatabase_Impl.q();
                workDatabase_Impl.n();
                eVar.g(kVarA);
                jVar.o(str, -1L);
                workDatabase.q();
                workDatabase.n();
                e(false);
            } catch (Throwable th) {
                workDatabase_Impl.n();
                eVar.g(kVarA);
                throw th;
            }
        } catch (Throwable th2) {
            workDatabase.n();
            e(false);
            throw th2;
        }
    }

    public final void e(boolean z4) {
        ListenableWorker listenableWorker;
        this.f8837v.c();
        try {
            c3.j jVarX = this.f8837v.x();
            jVarX.getClass();
            y yVarD = y.d(0, "SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1");
            WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) jVarX.f1759a;
            workDatabase_Impl.b();
            Cursor cursorX = n9.b.x(workDatabase_Impl, yVarD);
            try {
                boolean z10 = cursorX.moveToFirst() && cursorX.getInt(0) != 0;
                cursorX.close();
                yVarD.g();
                if (!z10) {
                    d3.g.a(this.f8828a, RescheduleReceiver.class, false);
                }
                if (z4) {
                    this.f8838w.r(1, this.f8829b);
                    this.f8838w.o(this.f8829b, -1L);
                }
                if (this.e != null && (listenableWorker = this.f8832f) != null && listenableWorker.isRunInForeground()) {
                    b bVar = this.f8836u;
                    String str = this.f8829b;
                    synchronized (bVar.f8799v) {
                        bVar.f8794f.remove(str);
                        bVar.h();
                    }
                }
                this.f8837v.q();
                this.f8837v.n();
                this.B.h(Boolean.valueOf(z4));
            } catch (Throwable th) {
                cursorX.close();
                yVarD.g();
                throw th;
            }
        } catch (Throwable th2) {
            this.f8837v.n();
            throw th2;
        }
    }

    public final void f() {
        c3.j jVar = this.f8838w;
        String str = this.f8829b;
        int i = jVar.i(str);
        String str2 = E;
        if (i == 2) {
            m.d().a(str2, v.i("Status for ", str, " is RUNNING;not doing any work and rescheduling for later execution"), new Throwable[0]);
            e(true);
            return;
        }
        m mVarD = m.d();
        StringBuilder sbN = q1.a.n("Status for ", str, " is ");
        sbN.append(v.x(i));
        sbN.append("; not doing any work");
        mVarD.a(str2, sbN.toString(), new Throwable[0]);
        e(false);
    }

    public final void g() {
        c3.j jVar = this.f8838w;
        String str = this.f8829b;
        WorkDatabase workDatabase = this.f8837v;
        workDatabase.c();
        try {
            LinkedList linkedList = new LinkedList();
            linkedList.add(str);
            while (!linkedList.isEmpty()) {
                String str2 = (String) linkedList.remove();
                if (jVar.i(str2) != 6) {
                    jVar.r(4, str2);
                }
                linkedList.addAll(this.f8839x.w(str2));
            }
            jVar.p(str, ((t2.i) this.f8834s).f8548a);
            workDatabase.q();
        } finally {
            workDatabase.n();
            e(false);
        }
    }

    public final boolean h() {
        if (!this.D) {
            return false;
        }
        m.d().a(E, u3.b.b("Work interrupted for ", this.A), new Throwable[0]);
        int i = this.f8838w.i(this.f8829b);
        if (i == 0) {
            e(false);
            return true;
        }
        e(!v.a(i));
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00c2 A[Catch: all -> 0x007e, TryCatch #4 {all -> 0x007e, blocks: (B:13:0x0055, B:16:0x005f, B:21:0x0081, B:23:0x0085, B:26:0x00ad, B:28:0x00b3, B:30:0x00b9, B:43:0x0101, B:35:0x00c2, B:38:0x00d1, B:40:0x00d9), top: B:113:0x0055 }] */
    @Override // java.lang.Runnable
    public final void run() {
        c3.i iVar;
        t2.h hVar;
        t2.f fVarA;
        boolean z4;
        aa.c cVar = this.f8840y;
        String str = this.f8829b;
        ArrayList arrayListZ = cVar.z(str);
        this.f8841z = arrayListZ;
        StringBuilder sbN = q1.a.n("Work [ id=", str, ", tags={ ");
        int size = arrayListZ.size();
        int i = 0;
        boolean z10 = true;
        while (i < size) {
            Object obj = arrayListZ.get(i);
            i++;
            String str2 = (String) obj;
            if (z10) {
                z10 = false;
            } else {
                sbN.append(", ");
            }
            sbN.append(str2);
        }
        sbN.append(" } ]");
        this.A = sbN.toString();
        t2.b bVar = this.f8835t;
        c3.j jVar = this.f8838w;
        l lVar = this.f8833r;
        WorkDatabase workDatabase = this.f8837v;
        if (h()) {
            return;
        }
        workDatabase.c();
        try {
            c3.i iVarL = jVar.l(str);
            this.e = iVarL;
            String str3 = E;
            if (iVarL == null) {
                m.d().b(str3, "Didn't find WorkSpec for id " + str, new Throwable[0]);
                e(false);
                workDatabase.q();
                workDatabase.n();
                return;
            }
            if (iVarL.f1745b != 1) {
                f();
                workDatabase.q();
                m.d().a(str3, this.e.f1746c + " is not in ENQUEUED state. Nothing more to do.", new Throwable[0]);
                workDatabase.n();
                return;
            }
            if (iVarL.c()) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                iVar = this.e;
                if (iVar.f1754n != 0) {
                    m.d().a(str3, "Delaying execution for " + this.e.f1746c + " because it is being executed before schedule.", new Throwable[0]);
                    e(true);
                    workDatabase.q();
                    workDatabase.n();
                    return;
                }
            } else {
                c3.i iVar2 = this.e;
                if (iVar2.f1745b == 1 && iVar2.f1751k > 0) {
                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                    iVar = this.e;
                    if (iVar.f1754n != 0 && jCurrentTimeMillis2 < iVar.a()) {
                        m.d().a(str3, "Delaying execution for " + this.e.f1746c + " because it is being executed before schedule.", new Throwable[0]);
                        e(true);
                        workDatabase.q();
                        workDatabase.n();
                        return;
                    }
                }
            }
            workDatabase.q();
            workDatabase.n();
            if (this.e.c()) {
                fVarA = this.e.e;
            } else {
                r7.j jVar2 = bVar.f8529d;
                String str4 = this.e.f1747d;
                jVar2.getClass();
                String str5 = t2.h.f8547a;
                try {
                    hVar = (t2.h) Class.forName(str4).newInstance();
                } catch (Exception e) {
                    m.d().b(t2.h.f8547a, u3.b.b("Trouble instantiating + ", str4), e);
                    hVar = null;
                }
                if (hVar == null) {
                    m.d().b(str3, u3.b.b("Could not create Input Merger ", this.e.f1747d), new Throwable[0]);
                    g();
                    return;
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(this.e.e);
                WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) jVar.f1759a;
                y yVarD = y.d(1, "SELECT output FROM workspec WHERE id IN (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)");
                if (str == null) {
                    yVarD.I(1);
                } else {
                    yVarD.j(1, str);
                }
                workDatabase_Impl.b();
                Cursor cursorX = n9.b.x(workDatabase_Impl, yVarD);
                try {
                    ArrayList arrayList2 = new ArrayList(cursorX.getCount());
                    while (cursorX.moveToNext()) {
                        arrayList2.add(t2.f.a(cursorX.getBlob(0)));
                    }
                    cursorX.close();
                    yVarD.g();
                    arrayList.addAll(arrayList2);
                    fVarA = hVar.a(arrayList);
                } catch (Throwable th) {
                    cursorX.close();
                    yVarD.g();
                    throw th;
                }
            }
            UUID uuidFromString = UUID.fromString(str);
            ArrayList arrayList3 = this.f8841z;
            q5.d dVar = this.f8831d;
            int i10 = this.e.f1751k;
            ExecutorService executorService = bVar.f8526a;
            s sVar = bVar.f8528c;
            q qVar = new q(workDatabase, lVar);
            o oVar = new o(workDatabase, this.f8836u, lVar);
            WorkerParameters workerParameters = new WorkerParameters();
            workerParameters.f1244a = uuidFromString;
            workerParameters.f1245b = fVarA;
            workerParameters.f1246c = new HashSet(arrayList3);
            workerParameters.f1247d = dVar;
            workerParameters.e = i10;
            workerParameters.f1248f = executorService;
            workerParameters.f1249g = lVar;
            workerParameters.h = sVar;
            workerParameters.i = qVar;
            workerParameters.f1250j = oVar;
            if (this.f8832f == null) {
                this.f8832f = sVar.a(this.f8828a, this.e.f1746c, workerParameters);
            }
            ListenableWorker listenableWorker = this.f8832f;
            if (listenableWorker == null) {
                m.d().b(str3, u3.b.b("Could not create Worker ", this.e.f1746c), new Throwable[0]);
                g();
                return;
            }
            if (listenableWorker.isUsed()) {
                m.d().b(str3, v.i("Received an already-used Worker ", this.e.f1746c, "; WorkerFactory should return new instances"), new Throwable[0]);
                g();
                return;
            }
            boolean z11 = false;
            this.f8832f.setUsed();
            workDatabase.c();
            try {
                if (jVar.i(str) == 1) {
                    jVar.r(2, str);
                    WorkDatabase_Impl workDatabase_Impl2 = (WorkDatabase_Impl) jVar.f1759a;
                    workDatabase_Impl2.b();
                    c3.e eVar = (c3.e) jVar.f1763f;
                    i2.k kVarA = eVar.a();
                    if (str == null) {
                        z4 = true;
                        kVarA.I(1);
                    } else {
                        z4 = true;
                        kVarA.j(1, str);
                    }
                    workDatabase_Impl2.c();
                    try {
                        kVarA.c();
                        workDatabase_Impl2.q();
                        workDatabase_Impl2.n();
                        eVar.g(kVarA);
                        z11 = z4;
                    } catch (Throwable th2) {
                        workDatabase_Impl2.n();
                        eVar.g(kVarA);
                        throw th2;
                    }
                }
                workDatabase.q();
                workDatabase.n();
                if (!z11) {
                    f();
                    return;
                }
                if (h()) {
                    return;
                }
                e3.k kVar = new e3.k();
                d3.m mVar = new d3.m(this.f8828a, this.e, this.f8832f, oVar, this.f8833r);
                ((f3.b) lVar.f45d).execute(mVar);
                e3.k kVar2 = mVar.f2829a;
                kVar2.addListener(new b3.b(this, kVar2, kVar, 18), (f3.b) lVar.f45d);
                kVar.addListener(new b3.b(this, kVar, this.A, 19), (d3.i) lVar.f43b);
            } catch (Throwable th3) {
                workDatabase.n();
                throw th3;
            }
        } catch (Throwable th4) {
            workDatabase.n();
            throw th4;
        }
    }
}
