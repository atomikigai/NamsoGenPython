package fd;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.internal.measurement.zzfs;
import com.google.android.gms.internal.measurement.zzft;
import com.google.android.gms.internal.measurement.zzfx;
import java.io.IOException;
import java.io.Serializable;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import z7.a1;
import z7.i0;
import z7.l0;
import z7.p;
import z7.q;
import z7.z2;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3951a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f3952b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f3953c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f3954d;
    public final Object e;

    public l(Bundle bundle, String str, String str2, long j4) {
        this.f3953c = str;
        this.f3954d = str2;
        this.e = bundle;
        this.f3952b = j4;
    }

    public static l e(q qVar) {
        return new l(qVar.f11303b.g(), qVar.f11302a, qVar.f11304c, qVar.f11305d);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x002e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x0033 A[SYNTHETIC] */
    public boolean a(bd.a aVar, i iVar, ArrayList arrayList, boolean z4) {
        Iterator it = ((ConcurrentLinkedQueue) this.e).iterator();
        while (true) {
            if (!it.hasNext()) {
                return false;
            }
            k kVar = (k) it.next();
            jc.i.d(kVar, "connection");
            synchronized (kVar) {
                if (z4) {
                    try {
                        if (!(kVar.f3942g != null)) {
                            continue;
                        } else if (kVar.h(aVar, arrayList)) {
                            iVar.a(kVar);
                            return true;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                } else if (kVar.h(aVar, arrayList)) {
                    iVar.a(kVar);
                    return true;
                }
            }
        }
    }

    public int b(k kVar, long j4) {
        byte[] bArr = cd.b.f1822a;
        ArrayList arrayList = kVar.f3949p;
        int i = 0;
        while (i < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                String str = "A connection to " + kVar.f3938b.f1547a.i + " was leaked. Did you forget to close a response body?";
                jd.n nVar = jd.n.f5799a;
                jd.n.f5799a.j(((g) reference).f3921a, str);
                arrayList.remove(i);
                kVar.f3943j = true;
                if (arrayList.isEmpty()) {
                    kVar.f3950q = j4 - this.f3952b;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }

    /* JADX WARN: Code duplicated, block: B:75:0x01d2  */
    /* JADX WARN: Not initialized variable reg: 13, insn: 0x00ef: MOVE (r11 I:??[OBJECT, ARRAY]) = (r13 I:??[OBJECT, ARRAY]) (LINE:240), block:B:40:0x00ef */
    public zzft c(zzft zzftVar, String str) throws Throwable {
        long j4;
        Cursor cursorRawQuery;
        Cursor cursor;
        Pair pairCreate;
        Object obj;
        String strZzh = zzftVar.zzh();
        List listZzi = zzftVar.zzi();
        z7.b bVar = (z7.b) this.e;
        a1 a1Var = (a1) bVar.f159a;
        z2 z2Var = bVar.f11411b;
        z2Var.K();
        Long l2 = (Long) l0.j(zzftVar, "_eid");
        if (l2 != null) {
            if (strZzh.equals("_ep")) {
                z2Var.K();
                String str2 = (String) l0.j(zzftVar, "_en");
                Cursor cursor2 = null;
                if (TextUtils.isEmpty(str2)) {
                    i0 i0Var = a1Var.f11007t;
                    a1.f(i0Var);
                    i0Var.f11191r.c(l2, "Extra parameter without an event name. eventId");
                    return null;
                }
                if (((zzft) this.f3953c) == null || ((Long) this.f3954d) == null || l2.longValue() != ((Long) this.f3954d).longValue()) {
                    z7.j jVar = z2Var.f11509c;
                    z2.D(jVar);
                    a1 a1Var2 = (a1) jVar.f159a;
                    jVar.c();
                    jVar.d();
                    try {
                        try {
                            cursorRawQuery = jVar.v().rawQuery("select main_event, children_to_process from main_event_params where app_id=? and event_id=?", new String[]{str, l2.toString()});
                            try {
                                if (cursorRawQuery.moveToFirst()) {
                                    j4 = 0;
                                    try {
                                        try {
                                            pairCreate = Pair.create((zzft) ((zzfs) l0.B(zzft.zze(), cursorRawQuery.getBlob(0))).zzaD(), Long.valueOf(cursorRawQuery.getLong(1)));
                                            cursorRawQuery.close();
                                        } catch (IOException e) {
                                            i0 i0Var2 = a1Var2.f11007t;
                                            a1.f(i0Var2);
                                            i0Var2.f11190f.e("Failed to merge main event. appId, eventId", i0.k(str), l2, e);
                                            cursorRawQuery.close();
                                            pairCreate = null;
                                        }
                                    } catch (SQLiteException e4) {
                                        e = e4;
                                        i0 i0Var3 = a1Var2.f11007t;
                                        a1.f(i0Var3);
                                        i0Var3.f11190f.c(e, "Error selecting main event");
                                        if (cursorRawQuery != null) {
                                            cursorRawQuery.close();
                                        }
                                        pairCreate = null;
                                    }
                                } else {
                                    i0 i0Var4 = a1Var2.f11007t;
                                    a1.f(i0Var4);
                                    i0Var4.f11198y.b("Main event not found");
                                    cursorRawQuery.close();
                                    pairCreate = null;
                                    j4 = 0;
                                }
                            } catch (SQLiteException e10) {
                                e = e10;
                                j4 = 0;
                            }
                        } catch (Throwable th) {
                            th = th;
                            cursor2 = cursor;
                            if (cursor2 != null) {
                                cursor2.close();
                            }
                            throw th;
                        }
                    } catch (SQLiteException e11) {
                        e = e11;
                        j4 = 0;
                        cursorRawQuery = null;
                    } catch (Throwable th2) {
                        th = th2;
                        if (cursor2 != null) {
                            cursor2.close();
                        }
                        throw th;
                    }
                    if (pairCreate == null || (obj = pairCreate.first) == null) {
                        i0 i0Var5 = a1Var.f11007t;
                        a1.f(i0Var5);
                        i0Var5.f11191r.d(str2, "Extra parameter without existing main event. eventName, eventId", l2);
                        return null;
                    }
                    this.f3953c = (zzft) obj;
                    this.f3952b = ((Long) pairCreate.second).longValue();
                    z2Var.K();
                    this.f3954d = (Long) l0.j((zzft) this.f3953c, "_eid");
                } else {
                    j4 = 0;
                }
                long j10 = this.f3952b - 1;
                this.f3952b = j10;
                if (j10 <= j4) {
                    z7.j jVar2 = z2Var.f11509c;
                    z2.D(jVar2);
                    a1 a1Var3 = (a1) jVar2.f159a;
                    jVar2.c();
                    i0 i0Var6 = a1Var3.f11007t;
                    a1.f(i0Var6);
                    i0Var6.f11198y.c(str, "Clearing complex main event info. appId");
                    try {
                        jVar2.v().execSQL("delete from main_event_params where app_id=?", new String[]{str});
                    } catch (SQLiteException e12) {
                        i0 i0Var7 = a1Var3.f11007t;
                        a1.f(i0Var7);
                        i0Var7.f11190f.c(e12, "Error clearing complex main event");
                    }
                } else {
                    z7.j jVar3 = z2Var.f11509c;
                    z2.D(jVar3);
                    jVar3.l(str, l2, this.f3952b, (zzft) this.f3953c);
                }
                ArrayList arrayList = new ArrayList();
                for (zzfx zzfxVar : ((zzft) this.f3953c).zzi()) {
                    z2Var.K();
                    if (l0.h(zzftVar, zzfxVar.zzg()) == null) {
                        arrayList.add(zzfxVar);
                    }
                }
                if (arrayList.isEmpty()) {
                    i0 i0Var8 = a1Var.f11007t;
                    a1.f(i0Var8);
                    i0Var8.f11191r.c(str2, "No unique parameters in main event. eventName");
                } else {
                    arrayList.addAll(listZzi);
                    listZzi = arrayList;
                }
                strZzh = str2;
            } else {
                this.f3954d = l2;
                this.f3953c = zzftVar;
                z2Var.K();
                Serializable serializableJ = l0.j(zzftVar, "_epc");
                long jLongValue = ((Long) (serializableJ != null ? serializableJ : 0L)).longValue();
                this.f3952b = jLongValue;
                if (jLongValue <= 0) {
                    i0 i0Var9 = a1Var.f11007t;
                    a1.f(i0Var9);
                    i0Var9.f11191r.c(strZzh, "Complex event with zero extra param count. eventName");
                } else {
                    z7.j jVar4 = z2Var.f11509c;
                    z2.D(jVar4);
                    jVar4.l(str, l2, this.f3952b, zzftVar);
                }
            }
        }
        zzfs zzfsVar = (zzfs) zzftVar.zzbB();
        zzfsVar.zzi(strZzh);
        zzfsVar.zzg();
        zzfsVar.zzd(listZzi);
        return (zzft) zzfsVar.zzaD();
    }

    public q d() {
        return new q((String) this.f3953c, new p(new Bundle((Bundle) this.e)), (String) this.f3954d, this.f3952b);
    }

    public String toString() {
        switch (this.f3951a) {
            case 1:
                String str = (String) this.f3954d;
                String str2 = (String) this.f3953c;
                String string = ((Bundle) this.e).toString();
                StringBuilder sbE = u3.b.e("origin=", str, ",name=", str2, ",params=");
                sbE.append(string);
                return sbE.toString();
            default:
                return super.toString();
        }
    }

    public l(ed.d dVar) {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        jc.i.e(dVar, "taskRunner");
        jc.i.e(timeUnit, "timeUnit");
        this.f3952b = timeUnit.toNanos(5L);
        this.f3953c = dVar.e();
        this.f3954d = new ed.b(this, q1.a.m(new StringBuilder(), cd.b.f1827g, " ConnectionPool"));
        this.e = new ConcurrentLinkedQueue();
    }
}
