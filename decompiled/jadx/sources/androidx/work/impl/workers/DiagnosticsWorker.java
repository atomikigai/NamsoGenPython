package androidx.work.impl.workers;

import a2.l;
import aa.c;
import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import c3.d;
import c3.i;
import fa.c1;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import n9.b;
import t2.f;
import t2.k;
import t2.m;
import u2.j;
import y1.y;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class DiagnosticsWorker extends Worker {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f1281r = m.f("DiagnosticsWrkr");

    public DiagnosticsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public static String a(c cVar, c cVar2, l lVar, ArrayList arrayList) {
        String str;
        StringBuilder sb2 = new StringBuilder("\n Id \t Class Name\t Job Id\t State\t Unique Name\t Tags\t");
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            i iVar = (i) obj;
            d dVarZ = lVar.z(iVar.f1744a);
            Integer numValueOf = dVarZ != null ? Integer.valueOf(dVarZ.f1737b) : null;
            String str2 = iVar.f1744a;
            WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) cVar.f263b;
            y yVarD = y.d(1, "SELECT name FROM workname WHERE work_spec_id=?");
            if (str2 == null) {
                yVarD.I(1);
            } else {
                yVarD.j(1, str2);
            }
            workDatabase_Impl.b();
            Cursor cursorX = b.x(workDatabase_Impl, yVarD);
            try {
                ArrayList arrayList2 = new ArrayList(cursorX.getCount());
                while (cursorX.moveToNext()) {
                    arrayList2.add(cursorX.getString(0));
                }
                cursorX.close();
                yVarD.g();
                ArrayList arrayListZ = cVar2.z(iVar.f1744a);
                String strJoin = TextUtils.join(",", arrayList2);
                String strJoin2 = TextUtils.join(",", arrayListZ);
                String str3 = iVar.f1744a;
                String str4 = iVar.f1746c;
                switch (iVar.f1745b) {
                    case 1:
                        str = "ENQUEUED";
                        break;
                    case 2:
                        str = "RUNNING";
                        break;
                    case 3:
                        str = "SUCCEEDED";
                        break;
                    case 4:
                        str = "FAILED";
                        break;
                    case 5:
                        str = "BLOCKED";
                        break;
                    case 6:
                        str = "CANCELLED";
                        break;
                    default:
                        throw null;
                }
                StringBuilder sbE = u3.b.e("\n", str3, "\t ", str4, "\t ");
                sbE.append(numValueOf);
                sbE.append("\t ");
                sbE.append(str);
                sbE.append("\t ");
                sbE.append(strJoin);
                sbE.append("\t ");
                sbE.append(strJoin2);
                sbE.append("\t");
                sb2.append(sbE.toString());
            } catch (Throwable th) {
                cursorX.close();
                yVarD.g();
                throw th;
            }
        }
        return sb2.toString();
    }

    @Override // androidx.work.Worker
    public final t2.l doWork() throws Throwable {
        y yVar;
        l lVar;
        c cVar;
        c cVar2;
        int i;
        WorkDatabase workDatabase = j.S(getApplicationContext()).f8821o;
        c3.j jVarX = workDatabase.x();
        c cVarV = workDatabase.v();
        c cVarY = workDatabase.y();
        l lVarU = workDatabase.u();
        long jCurrentTimeMillis = System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1L);
        jVarX.getClass();
        y yVarD = y.d(1, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE period_start_time >= ? AND state IN (2, 3, 5) ORDER BY period_start_time DESC");
        yVarD.b(1, jCurrentTimeMillis);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) jVarX.f1759a;
        workDatabase_Impl.b();
        Cursor cursorX = b.x(workDatabase_Impl, yVarD);
        try {
            int iJ = jd.l.j(cursorX, "required_network_type");
            int iJ2 = jd.l.j(cursorX, "requires_charging");
            int iJ3 = jd.l.j(cursorX, "requires_device_idle");
            int iJ4 = jd.l.j(cursorX, "requires_battery_not_low");
            int iJ5 = jd.l.j(cursorX, "requires_storage_not_low");
            int iJ6 = jd.l.j(cursorX, "trigger_content_update_delay");
            int iJ7 = jd.l.j(cursorX, "trigger_max_content_delay");
            int iJ8 = jd.l.j(cursorX, "content_uri_triggers");
            int iJ9 = jd.l.j(cursorX, "id");
            int iJ10 = jd.l.j(cursorX, "state");
            int iJ11 = jd.l.j(cursorX, "worker_class_name");
            yVar = yVarD;
            try {
                int iJ12 = jd.l.j(cursorX, "input_merger_class_name");
                int iJ13 = jd.l.j(cursorX, "input");
                int iJ14 = jd.l.j(cursorX, "output");
                int iJ15 = jd.l.j(cursorX, "initial_delay");
                int iJ16 = jd.l.j(cursorX, "interval_duration");
                int iJ17 = jd.l.j(cursorX, "flex_duration");
                int iJ18 = jd.l.j(cursorX, "run_attempt_count");
                int iJ19 = jd.l.j(cursorX, "backoff_policy");
                int iJ20 = jd.l.j(cursorX, "backoff_delay_duration");
                int iJ21 = jd.l.j(cursorX, "period_start_time");
                int iJ22 = jd.l.j(cursorX, "minimum_retention_duration");
                int iJ23 = jd.l.j(cursorX, "schedule_requested_at");
                int iJ24 = jd.l.j(cursorX, "run_in_foreground");
                int iJ25 = jd.l.j(cursorX, "out_of_quota_policy");
                int i10 = iJ14;
                ArrayList arrayList = new ArrayList(cursorX.getCount());
                while (cursorX.moveToNext()) {
                    String string = cursorX.getString(iJ9);
                    int i11 = iJ9;
                    String string2 = cursorX.getString(iJ11);
                    int i12 = iJ11;
                    t2.c cVar3 = new t2.c();
                    int i13 = iJ;
                    cVar3.f8532a = c1.w(cursorX.getInt(iJ));
                    cVar3.f8533b = cursorX.getInt(iJ2) != 0;
                    cVar3.f8534c = cursorX.getInt(iJ3) != 0;
                    cVar3.f8535d = cursorX.getInt(iJ4) != 0;
                    cVar3.e = cursorX.getInt(iJ5) != 0;
                    int i14 = iJ2;
                    int i15 = iJ3;
                    cVar3.f8536f = cursorX.getLong(iJ6);
                    cVar3.f8537g = cursorX.getLong(iJ7);
                    cVar3.h = c1.g(cursorX.getBlob(iJ8));
                    i iVar = new i(string, string2);
                    iVar.f1745b = c1.y(cursorX.getInt(iJ10));
                    iVar.f1747d = cursorX.getString(iJ12);
                    iVar.e = f.a(cursorX.getBlob(iJ13));
                    int i16 = i10;
                    iVar.f1748f = f.a(cursorX.getBlob(i16));
                    int i17 = iJ10;
                    int i18 = iJ15;
                    iVar.f1749g = cursorX.getLong(i18);
                    int i19 = iJ16;
                    int i20 = iJ12;
                    iVar.h = cursorX.getLong(i19);
                    int i21 = iJ4;
                    int i22 = iJ17;
                    iVar.i = cursorX.getLong(i22);
                    int i23 = iJ18;
                    iVar.f1751k = cursorX.getInt(i23);
                    int i24 = iJ19;
                    int i25 = iJ13;
                    iVar.f1752l = c1.v(cursorX.getInt(i24));
                    int i26 = iJ20;
                    iVar.f1753m = cursorX.getLong(i26);
                    int i27 = iJ21;
                    iVar.f1754n = cursorX.getLong(i27);
                    int i28 = iJ22;
                    iVar.f1755o = cursorX.getLong(i28);
                    int i29 = iJ23;
                    iVar.f1756p = cursorX.getLong(i29);
                    int i30 = iJ24;
                    iVar.f1757q = cursorX.getInt(i30) != 0;
                    int i31 = iJ25;
                    iVar.f1758r = c1.x(cursorX.getInt(i31));
                    iVar.f1750j = cVar3;
                    arrayList.add(iVar);
                    iJ18 = i23;
                    iJ12 = i20;
                    iJ16 = i19;
                    iJ21 = i27;
                    iJ4 = i21;
                    i10 = i16;
                    iJ24 = i30;
                    iJ2 = i14;
                    iJ15 = i18;
                    iJ13 = i25;
                    iJ17 = i22;
                    iJ19 = i24;
                    iJ22 = i28;
                    iJ20 = i26;
                    iJ11 = i12;
                    iJ = i13;
                    iJ25 = i31;
                    iJ23 = i29;
                    iJ10 = i17;
                    iJ9 = i11;
                    iJ3 = i15;
                }
                cursorX.close();
                yVar.g();
                ArrayList arrayListF = jVarX.f();
                ArrayList arrayListC = jVarX.c();
                boolean zIsEmpty = arrayList.isEmpty();
                String str = f1281r;
                if (zIsEmpty) {
                    lVar = lVarU;
                    cVar = cVarV;
                    cVar2 = cVarY;
                    i = 0;
                } else {
                    i = 0;
                    m.d().e(str, "Recently completed work:\n\n", new Throwable[0]);
                    lVar = lVarU;
                    cVar = cVarV;
                    cVar2 = cVarY;
                    m.d().e(str, a(cVar, cVar2, lVar, arrayList), new Throwable[0]);
                }
                if (!arrayListF.isEmpty()) {
                    m.d().e(str, "Running work:\n\n", new Throwable[i]);
                    m.d().e(str, a(cVar, cVar2, lVar, arrayListF), new Throwable[i]);
                }
                if (!arrayListC.isEmpty()) {
                    m.d().e(str, "Enqueued work:\n\n", new Throwable[i]);
                    m.d().e(str, a(cVar, cVar2, lVar, arrayListC), new Throwable[i]);
                }
                return new k(f.f8542c);
            } catch (Throwable th) {
                th = th;
                cursorX.close();
                yVar.g();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            yVar = yVarD;
        }
    }
}
