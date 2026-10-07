package d3;

import android.database.Cursor;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import da.v;
import fa.c1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import o6.h0;
import y1.y;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements Runnable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f2805c = t2.m.f("EnqueueRunnable");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u2.e f2806a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s5.j f2807b = new s5.j(3);

    public d(u2.e eVar) {
        this.f2806a = eVar;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0205  */
    /* JADX WARN: Code duplicated, block: B:110:0x023f  */
    /* JADX WARN: Code duplicated, block: B:117:0x0271  */
    /* JADX WARN: Code duplicated, block: B:154:0x029b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x015d  */
    /* JADX WARN: Code duplicated, block: B:77:0x017d  */
    /* JADX WARN: Code duplicated, block: B:79:0x0185  */
    /* JADX WARN: Code duplicated, block: B:80:0x0188  */
    /* JADX WARN: Code duplicated, block: B:83:0x0192  */
    /* JADX WARN: Code duplicated, block: B:90:0x01da  */
    /* JADX WARN: Code duplicated, block: B:94:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:99:0x0201  */
    /* JADX WARN: Instruction removed from duplicated block: B:99:0x0201, please report this as an issue */
    public static boolean a(u2.e eVar) throws Throwable {
        boolean z4;
        boolean z10;
        boolean z11;
        List list;
        WorkDatabase workDatabase;
        boolean z12;
        Iterator it;
        boolean z13;
        c3.i iVar;
        UUID uuid;
        Iterator it2;
        WorkDatabase_Impl workDatabase_Impl;
        WorkDatabase_Impl workDatabase_Impl2;
        WorkDatabase_Impl workDatabase_Impl3;
        int i;
        WorkDatabase_Impl workDatabase_Impl4;
        String str;
        HashSet hashSetV = u2.e.V(eVar);
        u2.j jVar = eVar.f8802a;
        List list2 = eVar.f8803b;
        boolean z14 = false;
        String[] strArr = (String[]) hashSetV.toArray(new String[0]);
        long jCurrentTimeMillis = System.currentTimeMillis();
        WorkDatabase workDatabase2 = jVar.f8821o;
        boolean z15 = strArr != null && strArr.length > 0;
        if (z15) {
            int length = strArr.length;
            int i10 = 0;
            z4 = false;
            z10 = false;
            z11 = true;
            while (true) {
                if (i10 < length) {
                    String str2 = strArr[i10];
                    c3.i iVarL = workDatabase2.x().l(str2);
                    if (iVarL == null) {
                        t2.m.d().b(f2805c, v.i("Prerequisite ", str2, " doesn't exist; not enqueuing"), new Throwable[0]);
                    } else {
                        int i11 = iVarL.f1745b;
                        z11 &= i11 == 3;
                        if (i11 == 4) {
                            z10 = true;
                        } else if (i11 == 6) {
                            z4 = true;
                        }
                        i10++;
                    }
                }
                eVar.e = true;
                return z14;
            }
        }
        z4 = false;
        z10 = false;
        z11 = true;
        boolean zIsEmpty = TextUtils.isEmpty(null);
        if (!zIsEmpty && !z15) {
            WorkDatabase_Impl workDatabase_Impl5 = (WorkDatabase_Impl) workDatabase2.x().f1759a;
            y yVarD = y.d(1, "SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)");
            yVarD.I(1);
            workDatabase_Impl5.b();
            Cursor cursorX = n9.b.x(workDatabase_Impl5, yVarD);
            try {
                int iJ = jd.l.j(cursorX, "id");
                int iJ2 = jd.l.j(cursorX, "state");
                list = list2;
                ArrayList arrayList = new ArrayList(cursorX.getCount());
                while (cursorX.moveToNext()) {
                    c3.h hVar = new c3.h();
                    WorkDatabase workDatabase3 = workDatabase2;
                    hVar.f1742a = cursorX.getString(iJ);
                    hVar.f1743b = c1.y(cursorX.getInt(iJ2));
                    arrayList.add(hVar);
                    workDatabase2 = workDatabase3;
                }
                workDatabase = workDatabase2;
                cursorX.close();
                yVarD.g();
                if (!arrayList.isEmpty()) {
                    int size = arrayList.size();
                    int i12 = 0;
                    while (true) {
                        if (i12 < size) {
                            Object obj = arrayList.get(i12);
                            i12++;
                            int i13 = ((c3.h) obj).f1743b;
                            if (i13 == 1 || i13 == 2) {
                                z14 = false;
                            }
                        } else {
                            new b(jVar, 1).run();
                            c3.j jVarX = workDatabase.x();
                            int size2 = arrayList.size();
                            int i14 = 0;
                            while (i14 < size2) {
                                Object obj2 = arrayList.get(i14);
                                i14++;
                                String str3 = ((c3.h) obj2).f1742a;
                                WorkDatabase_Impl workDatabase_Impl6 = (WorkDatabase_Impl) jVarX.f1759a;
                                workDatabase_Impl6.b();
                                c3.e eVar2 = (c3.e) jVarX.f1761c;
                                i2.k kVarA = eVar2.a();
                                if (str3 == null) {
                                    kVarA.I(1);
                                } else {
                                    kVarA.j(1, str3);
                                }
                                workDatabase_Impl6.c();
                                try {
                                    kVarA.c();
                                    workDatabase_Impl6.q();
                                    workDatabase_Impl6.n();
                                    eVar2.g(kVarA);
                                    jVarX = jVarX;
                                } catch (Throwable th) {
                                    workDatabase_Impl6.n();
                                    eVar2.g(kVarA);
                                    throw th;
                                }
                            }
                            z12 = true;
                        }
                        eVar.e = true;
                        return z14;
                    }
                }
                it = list.iterator();
                z13 = z12;
                while (it.hasNext()) {
                    t2.n nVar = (t2.n) it.next();
                    iVar = nVar.f8553b;
                    uuid = nVar.f8552a;
                    if (z15 || z11) {
                        if (iVar.c()) {
                            iVar.f1754n = 0L;
                        } else {
                            iVar.f1754n = jCurrentTimeMillis;
                        }
                    } else if (z10) {
                        iVar.f1745b = 4;
                    } else if (z4) {
                        iVar.f1745b = 6;
                    } else {
                        iVar.f1745b = 5;
                    }
                    try {
                        if (Build.VERSION.SDK_INT <= 25) {
                            t2.c cVar = iVar.f1750j;
                            str = iVar.f1746c;
                            it2 = it;
                            if (str.equals(ConstraintTrackingWorker.class.getName()) && (cVar.f8535d || cVar.e)) {
                                h0 h0Var = new h0(4, false);
                                h0Var.j(iVar.e.f8543a);
                                ((HashMap) h0Var.f7621a).put("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", str);
                                iVar.f1746c = ConstraintTrackingWorker.class.getName();
                                t2.f fVar = new t2.f((HashMap) h0Var.f7621a);
                                t2.f.c(fVar);
                                iVar.e = fVar;
                            }
                            if (iVar.f1745b == 1) {
                                z13 = true;
                            }
                            c3.j jVarX2 = workDatabase.x();
                            workDatabase_Impl = (WorkDatabase_Impl) jVarX2.f1759a;
                            workDatabase_Impl.b();
                            workDatabase_Impl.c();
                            ((c3.b) jVarX2.f1760b).m(iVar);
                            workDatabase_Impl.q();
                            workDatabase_Impl.n();
                            if (z15) {
                                for (String str4 : strArr) {
                                    c3.a aVar = new c3.a(uuid.toString(), str4);
                                    aa.c cVarS = workDatabase.s();
                                    workDatabase_Impl4 = (WorkDatabase_Impl) cVarS.f263b;
                                    workDatabase_Impl4.b();
                                    workDatabase_Impl4.c();
                                    try {
                                        ((c3.b) cVarS.f264c).m(aVar);
                                        workDatabase_Impl4.q();
                                        workDatabase_Impl4.n();
                                    } catch (Throwable th2) {
                                        workDatabase_Impl4.n();
                                        throw th2;
                                    }
                                }
                            }
                            for (String str5 : nVar.f8554c) {
                                aa.c cVarY = workDatabase.y();
                                c3.k kVar = new c3.k(str5, uuid.toString());
                                workDatabase_Impl3 = (WorkDatabase_Impl) cVarY.f263b;
                                workDatabase_Impl3.b();
                                workDatabase_Impl3.c();
                                try {
                                    ((c3.b) cVarY.f264c).m(kVar);
                                    workDatabase_Impl3.q();
                                    workDatabase_Impl3.n();
                                } catch (Throwable th3) {
                                    workDatabase_Impl3.n();
                                    throw th3;
                                }
                            }
                            if (!zIsEmpty) {
                                aa.c cVarV = workDatabase.v();
                                c3.f fVar2 = new c3.f(uuid.toString());
                                workDatabase_Impl2 = (WorkDatabase_Impl) cVarV.f263b;
                                workDatabase_Impl2.b();
                                workDatabase_Impl2.c();
                                try {
                                    ((c3.b) cVarV.f264c).m(fVar2);
                                    workDatabase_Impl2.q();
                                    workDatabase_Impl2.n();
                                } catch (Throwable th4) {
                                    workDatabase_Impl2.n();
                                    throw th4;
                                }
                            }
                            it = it2;
                            jCurrentTimeMillis = jCurrentTimeMillis;
                        } else {
                            it2 = it;
                        }
                        ((c3.b) jVarX2.f1760b).m(iVar);
                        workDatabase_Impl.q();
                        workDatabase_Impl.n();
                        if (z15) {
                            while (i < r3) {
                                c3.a aVar2 = new c3.a(uuid.toString(), str4);
                                aa.c cVarS2 = workDatabase.s();
                                workDatabase_Impl4 = (WorkDatabase_Impl) cVarS2.f263b;
                                workDatabase_Impl4.b();
                                workDatabase_Impl4.c();
                                ((c3.b) cVarS2.f264c).m(aVar2);
                                workDatabase_Impl4.q();
                                workDatabase_Impl4.n();
                            }
                        }
                        while (r2.hasNext()) {
                            aa.c cVarY2 = workDatabase.y();
                            c3.k kVar2 = new c3.k(str5, uuid.toString());
                            workDatabase_Impl3 = (WorkDatabase_Impl) cVarY2.f263b;
                            workDatabase_Impl3.b();
                            workDatabase_Impl3.c();
                            ((c3.b) cVarY2.f264c).m(kVar2);
                            workDatabase_Impl3.q();
                            workDatabase_Impl3.n();
                        }
                        if (!zIsEmpty) {
                            aa.c cVarV2 = workDatabase.v();
                            c3.f fVar3 = new c3.f(uuid.toString());
                            workDatabase_Impl2 = (WorkDatabase_Impl) cVarV2.f263b;
                            workDatabase_Impl2.b();
                            workDatabase_Impl2.c();
                            ((c3.b) cVarV2.f264c).m(fVar3);
                            workDatabase_Impl2.q();
                            workDatabase_Impl2.n();
                        }
                        it = it2;
                        jCurrentTimeMillis = jCurrentTimeMillis;
                    } catch (Throwable th5) {
                        workDatabase_Impl.n();
                        throw th5;
                    }
                    if (iVar.f1745b == 1) {
                        z13 = true;
                    }
                    c3.j jVarX3 = workDatabase.x();
                    workDatabase_Impl = (WorkDatabase_Impl) jVarX3.f1759a;
                    workDatabase_Impl.b();
                    workDatabase_Impl.c();
                }
                z14 = z13;
                eVar.e = true;
                return z14;
            } catch (Throwable th6) {
                cursorX.close();
                yVarD.g();
                throw th6;
            }
        }
        list = list2;
        workDatabase = workDatabase2;
        z12 = false;
        it = list.iterator();
        z13 = z12;
        while (it.hasNext()) {
            t2.n nVar2 = (t2.n) it.next();
            iVar = nVar2.f8553b;
            uuid = nVar2.f8552a;
            if (z15) {
                if (iVar.c()) {
                    iVar.f1754n = jCurrentTimeMillis;
                } else {
                    iVar.f1754n = 0L;
                }
            } else if (iVar.c()) {
                iVar.f1754n = jCurrentTimeMillis;
            } else {
                iVar.f1754n = 0L;
            }
            if (Build.VERSION.SDK_INT <= 25) {
                t2.c cVar2 = iVar.f1750j;
                str = iVar.f1746c;
                it2 = it;
                if (str.equals(ConstraintTrackingWorker.class.getName())) {
                }
                if (iVar.f1745b == 1) {
                    z13 = true;
                }
                c3.j jVarX4 = workDatabase.x();
                workDatabase_Impl = (WorkDatabase_Impl) jVarX4.f1759a;
                workDatabase_Impl.b();
                workDatabase_Impl.c();
                ((c3.b) jVarX4.f1760b).m(iVar);
                workDatabase_Impl.q();
                workDatabase_Impl.n();
                if (z15) {
                    while (i < r3) {
                        c3.a aVar3 = new c3.a(uuid.toString(), str4);
                        aa.c cVarS3 = workDatabase.s();
                        workDatabase_Impl4 = (WorkDatabase_Impl) cVarS3.f263b;
                        workDatabase_Impl4.b();
                        workDatabase_Impl4.c();
                        ((c3.b) cVarS3.f264c).m(aVar3);
                        workDatabase_Impl4.q();
                        workDatabase_Impl4.n();
                    }
                }
                while (r2.hasNext()) {
                    aa.c cVarY3 = workDatabase.y();
                    c3.k kVar3 = new c3.k(str5, uuid.toString());
                    workDatabase_Impl3 = (WorkDatabase_Impl) cVarY3.f263b;
                    workDatabase_Impl3.b();
                    workDatabase_Impl3.c();
                    ((c3.b) cVarY3.f264c).m(kVar3);
                    workDatabase_Impl3.q();
                    workDatabase_Impl3.n();
                }
                if (!zIsEmpty) {
                    aa.c cVarV3 = workDatabase.v();
                    c3.f fVar4 = new c3.f(uuid.toString());
                    workDatabase_Impl2 = (WorkDatabase_Impl) cVarV3.f263b;
                    workDatabase_Impl2.b();
                    workDatabase_Impl2.c();
                    ((c3.b) cVarV3.f264c).m(fVar4);
                    workDatabase_Impl2.q();
                    workDatabase_Impl2.n();
                }
                it = it2;
                jCurrentTimeMillis = jCurrentTimeMillis;
            } else {
                it2 = it;
            }
            if (iVar.f1745b == 1) {
                z13 = true;
            }
            c3.j jVarX5 = workDatabase.x();
            workDatabase_Impl = (WorkDatabase_Impl) jVarX5.f1759a;
            workDatabase_Impl.b();
            workDatabase_Impl.c();
            ((c3.b) jVarX5.f1760b).m(iVar);
            workDatabase_Impl.q();
            workDatabase_Impl.n();
            if (z15) {
                while (i < r3) {
                    c3.a aVar4 = new c3.a(uuid.toString(), str4);
                    aa.c cVarS4 = workDatabase.s();
                    workDatabase_Impl4 = (WorkDatabase_Impl) cVarS4.f263b;
                    workDatabase_Impl4.b();
                    workDatabase_Impl4.c();
                    ((c3.b) cVarS4.f264c).m(aVar4);
                    workDatabase_Impl4.q();
                    workDatabase_Impl4.n();
                }
            }
            while (r2.hasNext()) {
                aa.c cVarY4 = workDatabase.y();
                c3.k kVar4 = new c3.k(str5, uuid.toString());
                workDatabase_Impl3 = (WorkDatabase_Impl) cVarY4.f263b;
                workDatabase_Impl3.b();
                workDatabase_Impl3.c();
                ((c3.b) cVarY4.f264c).m(kVar4);
                workDatabase_Impl3.q();
                workDatabase_Impl3.n();
            }
            if (!zIsEmpty) {
                aa.c cVarV4 = workDatabase.v();
                c3.f fVar5 = new c3.f(uuid.toString());
                workDatabase_Impl2 = (WorkDatabase_Impl) cVarV4.f263b;
                workDatabase_Impl2.b();
                workDatabase_Impl2.c();
                ((c3.b) cVarV4.f264c).m(fVar5);
                workDatabase_Impl2.q();
                workDatabase_Impl2.n();
            }
            it = it2;
            jCurrentTimeMillis = jCurrentTimeMillis;
        }
        z14 = z13;
        eVar.e = true;
        return z14;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z4;
        s5.j jVar = this.f2807b;
        u2.e eVar = this.f2806a;
        u2.j jVar2 = eVar.f8802a;
        try {
            HashSet hashSet = new HashSet();
            hashSet.addAll(eVar.f8804c);
            HashSet hashSetV = u2.e.V(eVar);
            Iterator it = hashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    hashSet.removeAll(eVar.f8804c);
                    z4 = false;
                    break;
                } else if (hashSetV.contains((String) it.next())) {
                    z4 = true;
                    break;
                }
            }
            if (z4) {
                throw new IllegalStateException("WorkContinuation has cycles (" + eVar + ")");
            }
            WorkDatabase workDatabase = jVar2.f8821o;
            workDatabase.c();
            try {
                boolean zA = a(eVar);
                workDatabase.q();
                workDatabase.n();
                if (zA) {
                    g.a(jVar2.f8819m, RescheduleReceiver.class, true);
                    u2.d.a(jVar2.f8820n, jVar2.f8821o, jVar2.f8823q);
                }
                jVar.C(t2.r.f8556m);
            } catch (Throwable th) {
                workDatabase.n();
                throw th;
            }
        } catch (Throwable th2) {
            jVar.C(new t2.o(th2));
        }
    }
}
