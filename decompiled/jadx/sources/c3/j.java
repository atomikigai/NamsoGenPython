package c3;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.work.impl.WorkDatabase_Impl;
import c3.j;
import da.v;
import fa.c1;
import fa.g0;
import fa.t1;
import fa.y;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import jd.l;
import k5.t;
import k5.u;
import k5.w;
import l.m3;
import l5.i;
import l5.n;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f1759a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f1760b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f1761c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f1762d;
    public Object e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f1763f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f1764g;
    public Object h;
    public Object i;

    public /* synthetic */ j(ViewGroup viewGroup, TextView textView, TextView textView2, TextView textView3, View view, View view2, TextView textView4, TextView textView5, TextView textView6, TextView textView7) {
        this.f1759a = textView;
        this.f1760b = textView2;
        this.f1761c = textView3;
        this.f1762d = view;
        this.e = view2;
        this.f1763f = textView4;
        this.f1764g = textView5;
        this.h = textView6;
        this.i = textView7;
    }

    public static void n(JSONObject jSONObject, String str) {
        StringBuilder sbB = u.e.b(str);
        sbB.append(jSONObject.toString());
        String string = sbB.toString();
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", string, null);
        }
    }

    public y a() {
        String strH = ((Integer) this.f1759a) == null ? " pid" : "";
        if (((String) this.f1760b) == null) {
            strH = strH.concat(" processName");
        }
        if (((Integer) this.f1761c) == null) {
            strH = v.h(strH, " reasonCode");
        }
        if (((Integer) this.f1762d) == null) {
            strH = v.h(strH, " importance");
        }
        if (((Long) this.e) == null) {
            strH = v.h(strH, " pss");
        }
        if (((Long) this.f1763f) == null) {
            strH = v.h(strH, " rss");
        }
        if (((Long) this.f1764g) == null) {
            strH = v.h(strH, " timestamp");
        }
        if (strH.isEmpty()) {
            return new y(((Integer) this.f1759a).intValue(), (String) this.f1760b, ((Integer) this.f1761c).intValue(), ((Integer) this.f1762d).intValue(), ((Long) this.e).longValue(), ((Long) this.f1763f).longValue(), ((Long) this.f1764g).longValue(), (String) this.h, (t1) this.i);
        }
        throw new IllegalStateException("Missing required properties:".concat(strH));
    }

    public g0 b() {
        String strH = ((Integer) this.f1759a) == null ? " arch" : "";
        if (((String) this.f1760b) == null) {
            strH = strH.concat(" model");
        }
        if (((Integer) this.f1761c) == null) {
            strH = v.h(strH, " cores");
        }
        if (((Long) this.f1762d) == null) {
            strH = v.h(strH, " ram");
        }
        if (((Long) this.e) == null) {
            strH = v.h(strH, " diskSpace");
        }
        if (((Boolean) this.f1763f) == null) {
            strH = v.h(strH, " simulator");
        }
        if (((Integer) this.f1764g) == null) {
            strH = v.h(strH, " state");
        }
        if (((String) this.h) == null) {
            strH = v.h(strH, " manufacturer");
        }
        if (((String) this.i) == null) {
            strH = v.h(strH, " modelClass");
        }
        if (strH.isEmpty()) {
            return new g0(((Integer) this.f1759a).intValue(), (String) this.f1760b, ((Integer) this.f1761c).intValue(), ((Long) this.f1762d).longValue(), ((Long) this.e).longValue(), ((Boolean) this.f1763f).booleanValue(), ((Integer) this.f1764g).intValue(), (String) this.h, (String) this.i);
        }
        throw new IllegalStateException("Missing required properties:".concat(strH));
    }

    public ArrayList c() throws Throwable {
        y1.y yVar;
        y1.y yVarD = y1.y.d(1, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 ORDER BY period_start_time LIMIT ?");
        yVarD.b(1, 200);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f1759a;
        workDatabase_Impl.b();
        Cursor cursorX = n9.b.x(workDatabase_Impl, yVarD);
        try {
            int iJ = l.j(cursorX, "required_network_type");
            int iJ2 = l.j(cursorX, "requires_charging");
            int iJ3 = l.j(cursorX, "requires_device_idle");
            int iJ4 = l.j(cursorX, "requires_battery_not_low");
            int iJ5 = l.j(cursorX, "requires_storage_not_low");
            int iJ6 = l.j(cursorX, "trigger_content_update_delay");
            int iJ7 = l.j(cursorX, "trigger_max_content_delay");
            int iJ8 = l.j(cursorX, "content_uri_triggers");
            int iJ9 = l.j(cursorX, "id");
            int iJ10 = l.j(cursorX, "state");
            int iJ11 = l.j(cursorX, "worker_class_name");
            int iJ12 = l.j(cursorX, "input_merger_class_name");
            int iJ13 = l.j(cursorX, "input");
            yVar = yVarD;
            try {
                int iJ14 = l.j(cursorX, "output");
                int iJ15 = l.j(cursorX, "initial_delay");
                int iJ16 = l.j(cursorX, "interval_duration");
                int iJ17 = l.j(cursorX, "flex_duration");
                int iJ18 = l.j(cursorX, "run_attempt_count");
                int iJ19 = l.j(cursorX, "backoff_policy");
                int iJ20 = l.j(cursorX, "backoff_delay_duration");
                int iJ21 = l.j(cursorX, "period_start_time");
                int iJ22 = l.j(cursorX, "minimum_retention_duration");
                int iJ23 = l.j(cursorX, "schedule_requested_at");
                int iJ24 = l.j(cursorX, "run_in_foreground");
                int iJ25 = l.j(cursorX, "out_of_quota_policy");
                int i = iJ14;
                ArrayList arrayList = new ArrayList(cursorX.getCount());
                while (cursorX.moveToNext()) {
                    String string = cursorX.getString(iJ9);
                    int i10 = iJ9;
                    String string2 = cursorX.getString(iJ11);
                    int i11 = iJ11;
                    t2.c cVar = new t2.c();
                    int i12 = iJ;
                    cVar.f8532a = c1.w(cursorX.getInt(iJ));
                    cVar.f8533b = cursorX.getInt(iJ2) != 0;
                    cVar.f8534c = cursorX.getInt(iJ3) != 0;
                    cVar.f8535d = cursorX.getInt(iJ4) != 0;
                    cVar.e = cursorX.getInt(iJ5) != 0;
                    int i13 = iJ2;
                    cVar.f8536f = cursorX.getLong(iJ6);
                    cVar.f8537g = cursorX.getLong(iJ7);
                    cVar.h = c1.g(cursorX.getBlob(iJ8));
                    i iVar = new i(string, string2);
                    iVar.f1745b = c1.y(cursorX.getInt(iJ10));
                    iVar.f1747d = cursorX.getString(iJ12);
                    iVar.e = t2.f.a(cursorX.getBlob(iJ13));
                    int i14 = i;
                    iVar.f1748f = t2.f.a(cursorX.getBlob(i14));
                    int i15 = iJ13;
                    i = i14;
                    int i16 = iJ15;
                    iVar.f1749g = cursorX.getLong(i16);
                    iJ15 = i16;
                    int i17 = iJ3;
                    int i18 = iJ16;
                    iVar.h = cursorX.getLong(i18);
                    iJ16 = i18;
                    int i19 = iJ17;
                    iVar.i = cursorX.getLong(i19);
                    int i20 = iJ18;
                    iVar.f1751k = cursorX.getInt(i20);
                    int i21 = iJ19;
                    iJ18 = i20;
                    iVar.f1752l = c1.v(cursorX.getInt(i21));
                    iJ17 = i19;
                    int i22 = iJ20;
                    iVar.f1753m = cursorX.getLong(i22);
                    iJ20 = i22;
                    int i23 = iJ21;
                    iVar.f1754n = cursorX.getLong(i23);
                    iJ21 = i23;
                    int i24 = iJ22;
                    iVar.f1755o = cursorX.getLong(i24);
                    iJ22 = i24;
                    int i25 = iJ23;
                    iVar.f1756p = cursorX.getLong(i25);
                    int i26 = iJ24;
                    iVar.f1757q = cursorX.getInt(i26) != 0;
                    int i27 = iJ25;
                    iJ24 = i26;
                    iVar.f1758r = c1.x(cursorX.getInt(i27));
                    iVar.f1750j = cVar;
                    arrayList.add(iVar);
                    iJ19 = i21;
                    iJ3 = i17;
                    iJ25 = i27;
                    iJ23 = i25;
                    iJ13 = i15;
                    iJ9 = i10;
                    iJ11 = i11;
                    iJ = i12;
                    iJ2 = i13;
                }
                cursorX.close();
                yVar.g();
                return arrayList;
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

    public ka.b d(int i) {
        ka.b bVar = null;
        try {
            if (!u.e.a(2, i)) {
                JSONObject jSONObjectT = ((ib.c) this.e).t();
                if (jSONObjectT != null) {
                    ka.b bVarD = ((e7.i) this.f1761c).D(jSONObjectT);
                    n(jSONObjectT, "Loaded cached settings: ");
                    ((b9.e) this.f1762d).getClass();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (u.e.a(3, i) || bVarD.f6131c >= jCurrentTimeMillis) {
                        try {
                            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                                Log.v("FirebaseCrashlytics", "Returning cached settings.", null);
                            }
                            return bVarD;
                        } catch (Exception e) {
                            e = e;
                            bVar = bVarD;
                            Log.e("FirebaseCrashlytics", "Failed to get cached settings", e);
                            return bVar;
                        }
                    }
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", "Cached settings have expired.", null);
                        return null;
                    }
                } else if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "No cached settings data found.", null);
                }
            }
            return null;
        } catch (Exception e4) {
            e = e4;
        }
    }

    public ArrayList e(int i) throws Throwable {
        y1.y yVar;
        y1.y yVarD = y1.y.d(1, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY period_start_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))");
        yVarD.b(1, i);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f1759a;
        workDatabase_Impl.b();
        Cursor cursorX = n9.b.x(workDatabase_Impl, yVarD);
        try {
            int iJ = l.j(cursorX, "required_network_type");
            int iJ2 = l.j(cursorX, "requires_charging");
            int iJ3 = l.j(cursorX, "requires_device_idle");
            int iJ4 = l.j(cursorX, "requires_battery_not_low");
            int iJ5 = l.j(cursorX, "requires_storage_not_low");
            int iJ6 = l.j(cursorX, "trigger_content_update_delay");
            int iJ7 = l.j(cursorX, "trigger_max_content_delay");
            int iJ8 = l.j(cursorX, "content_uri_triggers");
            int iJ9 = l.j(cursorX, "id");
            int iJ10 = l.j(cursorX, "state");
            int iJ11 = l.j(cursorX, "worker_class_name");
            int iJ12 = l.j(cursorX, "input_merger_class_name");
            int iJ13 = l.j(cursorX, "input");
            yVar = yVarD;
            try {
                int iJ14 = l.j(cursorX, "output");
                int iJ15 = l.j(cursorX, "initial_delay");
                int iJ16 = l.j(cursorX, "interval_duration");
                int iJ17 = l.j(cursorX, "flex_duration");
                int iJ18 = l.j(cursorX, "run_attempt_count");
                int iJ19 = l.j(cursorX, "backoff_policy");
                int iJ20 = l.j(cursorX, "backoff_delay_duration");
                int iJ21 = l.j(cursorX, "period_start_time");
                int iJ22 = l.j(cursorX, "minimum_retention_duration");
                int iJ23 = l.j(cursorX, "schedule_requested_at");
                int iJ24 = l.j(cursorX, "run_in_foreground");
                int iJ25 = l.j(cursorX, "out_of_quota_policy");
                int i10 = iJ14;
                ArrayList arrayList = new ArrayList(cursorX.getCount());
                while (cursorX.moveToNext()) {
                    String string = cursorX.getString(iJ9);
                    int i11 = iJ9;
                    String string2 = cursorX.getString(iJ11);
                    int i12 = iJ11;
                    t2.c cVar = new t2.c();
                    int i13 = iJ;
                    cVar.f8532a = c1.w(cursorX.getInt(iJ));
                    cVar.f8533b = cursorX.getInt(iJ2) != 0;
                    cVar.f8534c = cursorX.getInt(iJ3) != 0;
                    cVar.f8535d = cursorX.getInt(iJ4) != 0;
                    cVar.e = cursorX.getInt(iJ5) != 0;
                    int i14 = iJ2;
                    cVar.f8536f = cursorX.getLong(iJ6);
                    cVar.f8537g = cursorX.getLong(iJ7);
                    cVar.h = c1.g(cursorX.getBlob(iJ8));
                    i iVar = new i(string, string2);
                    iVar.f1745b = c1.y(cursorX.getInt(iJ10));
                    iVar.f1747d = cursorX.getString(iJ12);
                    iVar.e = t2.f.a(cursorX.getBlob(iJ13));
                    int i15 = i10;
                    iVar.f1748f = t2.f.a(cursorX.getBlob(i15));
                    int i16 = iJ15;
                    int i17 = iJ13;
                    i10 = i15;
                    iVar.f1749g = cursorX.getLong(i16);
                    int i18 = iJ3;
                    int i19 = iJ16;
                    iVar.h = cursorX.getLong(i19);
                    iJ16 = i19;
                    int i20 = iJ17;
                    iVar.i = cursorX.getLong(i20);
                    int i21 = iJ18;
                    iVar.f1751k = cursorX.getInt(i21);
                    int i22 = iJ19;
                    iJ18 = i21;
                    iVar.f1752l = c1.v(cursorX.getInt(i22));
                    iJ17 = i20;
                    int i23 = iJ20;
                    iVar.f1753m = cursorX.getLong(i23);
                    iJ20 = i23;
                    int i24 = iJ21;
                    iVar.f1754n = cursorX.getLong(i24);
                    iJ21 = i24;
                    int i25 = iJ22;
                    iVar.f1755o = cursorX.getLong(i25);
                    iJ22 = i25;
                    int i26 = iJ23;
                    iVar.f1756p = cursorX.getLong(i26);
                    int i27 = iJ24;
                    iVar.f1757q = cursorX.getInt(i27) != 0;
                    int i28 = iJ25;
                    iJ24 = i27;
                    iVar.f1758r = c1.x(cursorX.getInt(i28));
                    iVar.f1750j = cVar;
                    arrayList.add(iVar);
                    iJ19 = i22;
                    iJ3 = i18;
                    iJ13 = i17;
                    iJ25 = i28;
                    iJ23 = i26;
                    iJ15 = i16;
                    iJ9 = i11;
                    iJ11 = i12;
                    iJ = i13;
                    iJ2 = i14;
                }
                cursorX.close();
                yVar.g();
                return arrayList;
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

    public ArrayList f() throws Throwable {
        y1.y yVar;
        y1.y yVarD = y1.y.d(0, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=1");
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f1759a;
        workDatabase_Impl.b();
        Cursor cursorX = n9.b.x(workDatabase_Impl, yVarD);
        try {
            int iJ = l.j(cursorX, "required_network_type");
            int iJ2 = l.j(cursorX, "requires_charging");
            int iJ3 = l.j(cursorX, "requires_device_idle");
            int iJ4 = l.j(cursorX, "requires_battery_not_low");
            int iJ5 = l.j(cursorX, "requires_storage_not_low");
            int iJ6 = l.j(cursorX, "trigger_content_update_delay");
            int iJ7 = l.j(cursorX, "trigger_max_content_delay");
            int iJ8 = l.j(cursorX, "content_uri_triggers");
            int iJ9 = l.j(cursorX, "id");
            int iJ10 = l.j(cursorX, "state");
            int iJ11 = l.j(cursorX, "worker_class_name");
            int iJ12 = l.j(cursorX, "input_merger_class_name");
            int iJ13 = l.j(cursorX, "input");
            yVar = yVarD;
            try {
                int iJ14 = l.j(cursorX, "output");
                int iJ15 = l.j(cursorX, "initial_delay");
                int iJ16 = l.j(cursorX, "interval_duration");
                int iJ17 = l.j(cursorX, "flex_duration");
                int iJ18 = l.j(cursorX, "run_attempt_count");
                int iJ19 = l.j(cursorX, "backoff_policy");
                int iJ20 = l.j(cursorX, "backoff_delay_duration");
                int iJ21 = l.j(cursorX, "period_start_time");
                int iJ22 = l.j(cursorX, "minimum_retention_duration");
                int iJ23 = l.j(cursorX, "schedule_requested_at");
                int iJ24 = l.j(cursorX, "run_in_foreground");
                int iJ25 = l.j(cursorX, "out_of_quota_policy");
                int i = iJ14;
                ArrayList arrayList = new ArrayList(cursorX.getCount());
                while (cursorX.moveToNext()) {
                    String string = cursorX.getString(iJ9);
                    int i10 = iJ9;
                    String string2 = cursorX.getString(iJ11);
                    int i11 = iJ11;
                    t2.c cVar = new t2.c();
                    int i12 = iJ;
                    cVar.f8532a = c1.w(cursorX.getInt(iJ));
                    cVar.f8533b = cursorX.getInt(iJ2) != 0;
                    cVar.f8534c = cursorX.getInt(iJ3) != 0;
                    cVar.f8535d = cursorX.getInt(iJ4) != 0;
                    cVar.e = cursorX.getInt(iJ5) != 0;
                    int i13 = iJ2;
                    cVar.f8536f = cursorX.getLong(iJ6);
                    cVar.f8537g = cursorX.getLong(iJ7);
                    cVar.h = c1.g(cursorX.getBlob(iJ8));
                    i iVar = new i(string, string2);
                    iVar.f1745b = c1.y(cursorX.getInt(iJ10));
                    iVar.f1747d = cursorX.getString(iJ12);
                    iVar.e = t2.f.a(cursorX.getBlob(iJ13));
                    int i14 = i;
                    iVar.f1748f = t2.f.a(cursorX.getBlob(i14));
                    int i15 = iJ13;
                    i = i14;
                    int i16 = iJ15;
                    iVar.f1749g = cursorX.getLong(i16);
                    iJ15 = i16;
                    int i17 = iJ3;
                    int i18 = iJ16;
                    iVar.h = cursorX.getLong(i18);
                    iJ16 = i18;
                    int i19 = iJ17;
                    iVar.i = cursorX.getLong(i19);
                    int i20 = iJ18;
                    iVar.f1751k = cursorX.getInt(i20);
                    int i21 = iJ19;
                    iJ18 = i20;
                    iVar.f1752l = c1.v(cursorX.getInt(i21));
                    iJ17 = i19;
                    int i22 = iJ20;
                    iVar.f1753m = cursorX.getLong(i22);
                    iJ20 = i22;
                    int i23 = iJ21;
                    iVar.f1754n = cursorX.getLong(i23);
                    iJ21 = i23;
                    int i24 = iJ22;
                    iVar.f1755o = cursorX.getLong(i24);
                    iJ22 = i24;
                    int i25 = iJ23;
                    iVar.f1756p = cursorX.getLong(i25);
                    int i26 = iJ24;
                    iVar.f1757q = cursorX.getInt(i26) != 0;
                    int i27 = iJ25;
                    iJ24 = i26;
                    iVar.f1758r = c1.x(cursorX.getInt(i27));
                    iVar.f1750j = cVar;
                    arrayList.add(iVar);
                    iJ19 = i21;
                    iJ3 = i17;
                    iJ25 = i27;
                    iJ23 = i25;
                    iJ13 = i15;
                    iJ9 = i10;
                    iJ11 = i11;
                    iJ = i12;
                    iJ2 = i13;
                }
                cursorX.close();
                yVar.g();
                return arrayList;
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

    public ArrayList g() {
        y1.y yVar;
        y1.y yVarD = y1.y.d(0, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at<>-1");
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f1759a;
        workDatabase_Impl.b();
        Cursor cursorX = n9.b.x(workDatabase_Impl, yVarD);
        try {
            int iJ = l.j(cursorX, "required_network_type");
            int iJ2 = l.j(cursorX, "requires_charging");
            int iJ3 = l.j(cursorX, "requires_device_idle");
            int iJ4 = l.j(cursorX, "requires_battery_not_low");
            int iJ5 = l.j(cursorX, "requires_storage_not_low");
            int iJ6 = l.j(cursorX, "trigger_content_update_delay");
            int iJ7 = l.j(cursorX, "trigger_max_content_delay");
            int iJ8 = l.j(cursorX, "content_uri_triggers");
            int iJ9 = l.j(cursorX, "id");
            int iJ10 = l.j(cursorX, "state");
            int iJ11 = l.j(cursorX, "worker_class_name");
            int iJ12 = l.j(cursorX, "input_merger_class_name");
            int iJ13 = l.j(cursorX, "input");
            yVar = yVarD;
            try {
                int iJ14 = l.j(cursorX, "output");
                int iJ15 = l.j(cursorX, "initial_delay");
                int iJ16 = l.j(cursorX, "interval_duration");
                int iJ17 = l.j(cursorX, "flex_duration");
                int iJ18 = l.j(cursorX, "run_attempt_count");
                int iJ19 = l.j(cursorX, "backoff_policy");
                int iJ20 = l.j(cursorX, "backoff_delay_duration");
                int iJ21 = l.j(cursorX, "period_start_time");
                int iJ22 = l.j(cursorX, "minimum_retention_duration");
                int iJ23 = l.j(cursorX, "schedule_requested_at");
                int iJ24 = l.j(cursorX, "run_in_foreground");
                int iJ25 = l.j(cursorX, "out_of_quota_policy");
                int i = iJ14;
                ArrayList arrayList = new ArrayList(cursorX.getCount());
                while (cursorX.moveToNext()) {
                    String string = cursorX.getString(iJ9);
                    int i10 = iJ9;
                    String string2 = cursorX.getString(iJ11);
                    int i11 = iJ11;
                    t2.c cVar = new t2.c();
                    int i12 = iJ;
                    cVar.f8532a = c1.w(cursorX.getInt(iJ));
                    cVar.f8533b = cursorX.getInt(iJ2) != 0;
                    cVar.f8534c = cursorX.getInt(iJ3) != 0;
                    cVar.f8535d = cursorX.getInt(iJ4) != 0;
                    cVar.e = cursorX.getInt(iJ5) != 0;
                    int i13 = iJ2;
                    cVar.f8536f = cursorX.getLong(iJ6);
                    cVar.f8537g = cursorX.getLong(iJ7);
                    cVar.h = c1.g(cursorX.getBlob(iJ8));
                    i iVar = new i(string, string2);
                    iVar.f1745b = c1.y(cursorX.getInt(iJ10));
                    iVar.f1747d = cursorX.getString(iJ12);
                    iVar.e = t2.f.a(cursorX.getBlob(iJ13));
                    int i14 = i;
                    iVar.f1748f = t2.f.a(cursorX.getBlob(i14));
                    int i15 = iJ13;
                    i = i14;
                    int i16 = iJ15;
                    iVar.f1749g = cursorX.getLong(i16);
                    iJ15 = i16;
                    int i17 = iJ3;
                    int i18 = iJ16;
                    iVar.h = cursorX.getLong(i18);
                    iJ16 = i18;
                    int i19 = iJ17;
                    iVar.i = cursorX.getLong(i19);
                    int i20 = iJ18;
                    iVar.f1751k = cursorX.getInt(i20);
                    int i21 = iJ19;
                    iJ18 = i20;
                    iVar.f1752l = c1.v(cursorX.getInt(i21));
                    iJ17 = i19;
                    int i22 = iJ20;
                    iVar.f1753m = cursorX.getLong(i22);
                    iJ20 = i22;
                    int i23 = iJ21;
                    iVar.f1754n = cursorX.getLong(i23);
                    iJ21 = i23;
                    int i24 = iJ22;
                    iVar.f1755o = cursorX.getLong(i24);
                    iJ22 = i24;
                    int i25 = iJ23;
                    iVar.f1756p = cursorX.getLong(i25);
                    int i26 = iJ24;
                    iVar.f1757q = cursorX.getInt(i26) != 0;
                    int i27 = iJ25;
                    iJ24 = i26;
                    iVar.f1758r = c1.x(cursorX.getInt(i27));
                    iVar.f1750j = cVar;
                    arrayList.add(iVar);
                    iJ19 = i21;
                    iJ3 = i17;
                    iJ25 = i27;
                    iJ23 = i25;
                    iJ13 = i15;
                    iJ9 = i10;
                    iJ11 = i11;
                    iJ = i12;
                    iJ2 = i13;
                }
                cursorX.close();
                yVar.g();
                return arrayList;
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

    public ka.b h() {
        return (ka.b) ((AtomicReference) this.h).get();
    }

    public int i(String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f1759a;
        y1.y yVarD = y1.y.d(1, "SELECT state FROM workspec WHERE id=?");
        if (str == null) {
            yVarD.I(1);
        } else {
            yVarD.j(1, str);
        }
        workDatabase_Impl.b();
        Cursor cursorX = n9.b.x(workDatabase_Impl, yVarD);
        try {
            return cursorX.moveToFirst() ? c1.y(cursorX.getInt(0)) : 0;
        } finally {
            cursorX.close();
            yVarD.g();
        }
    }

    public ArrayList j() {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f1759a;
        y1.y yVarD = y1.y.d(1, "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)");
        yVarD.I(1);
        workDatabase_Impl.b();
        Cursor cursorX = n9.b.x(workDatabase_Impl, yVarD);
        try {
            ArrayList arrayList = new ArrayList(cursorX.getCount());
            while (cursorX.moveToNext()) {
                arrayList.add(cursorX.getString(0));
            }
            cursorX.close();
            yVarD.g();
            return arrayList;
        } catch (Throwable th) {
            cursorX.close();
            yVarD.g();
            throw th;
        }
    }

    public ArrayList k() {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f1759a;
        y1.y yVarD = y1.y.d(1, "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)");
        yVarD.j(1, "offline_ping_sender_work");
        workDatabase_Impl.b();
        Cursor cursorX = n9.b.x(workDatabase_Impl, yVarD);
        try {
            ArrayList arrayList = new ArrayList(cursorX.getCount());
            while (cursorX.moveToNext()) {
                arrayList.add(cursorX.getString(0));
            }
            cursorX.close();
            yVarD.g();
            return arrayList;
        } catch (Throwable th) {
            cursorX.close();
            yVarD.g();
            throw th;
        }
    }

    public i l(String str) {
        y1.y yVar;
        i iVar;
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f1759a;
        y1.y yVarD = y1.y.d(1, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE id=?");
        if (str == null) {
            yVarD.I(1);
        } else {
            yVarD.j(1, str);
        }
        workDatabase_Impl.b();
        Cursor cursorX = n9.b.x(workDatabase_Impl, yVarD);
        try {
            int iJ = l.j(cursorX, "required_network_type");
            int iJ2 = l.j(cursorX, "requires_charging");
            int iJ3 = l.j(cursorX, "requires_device_idle");
            int iJ4 = l.j(cursorX, "requires_battery_not_low");
            int iJ5 = l.j(cursorX, "requires_storage_not_low");
            int iJ6 = l.j(cursorX, "trigger_content_update_delay");
            int iJ7 = l.j(cursorX, "trigger_max_content_delay");
            int iJ8 = l.j(cursorX, "content_uri_triggers");
            int iJ9 = l.j(cursorX, "id");
            int iJ10 = l.j(cursorX, "state");
            int iJ11 = l.j(cursorX, "worker_class_name");
            int iJ12 = l.j(cursorX, "input_merger_class_name");
            int iJ13 = l.j(cursorX, "input");
            int iJ14 = l.j(cursorX, "output");
            yVar = yVarD;
            try {
                int iJ15 = l.j(cursorX, "initial_delay");
                int iJ16 = l.j(cursorX, "interval_duration");
                int iJ17 = l.j(cursorX, "flex_duration");
                int iJ18 = l.j(cursorX, "run_attempt_count");
                int iJ19 = l.j(cursorX, "backoff_policy");
                int iJ20 = l.j(cursorX, "backoff_delay_duration");
                int iJ21 = l.j(cursorX, "period_start_time");
                int iJ22 = l.j(cursorX, "minimum_retention_duration");
                int iJ23 = l.j(cursorX, "schedule_requested_at");
                int iJ24 = l.j(cursorX, "run_in_foreground");
                int iJ25 = l.j(cursorX, "out_of_quota_policy");
                if (cursorX.moveToFirst()) {
                    String string = cursorX.getString(iJ9);
                    String string2 = cursorX.getString(iJ11);
                    t2.c cVar = new t2.c();
                    cVar.f8532a = c1.w(cursorX.getInt(iJ));
                    cVar.f8533b = cursorX.getInt(iJ2) != 0;
                    cVar.f8534c = cursorX.getInt(iJ3) != 0;
                    cVar.f8535d = cursorX.getInt(iJ4) != 0;
                    cVar.e = cursorX.getInt(iJ5) != 0;
                    cVar.f8536f = cursorX.getLong(iJ6);
                    cVar.f8537g = cursorX.getLong(iJ7);
                    cVar.h = c1.g(cursorX.getBlob(iJ8));
                    iVar = new i(string, string2);
                    iVar.f1745b = c1.y(cursorX.getInt(iJ10));
                    iVar.f1747d = cursorX.getString(iJ12);
                    iVar.e = t2.f.a(cursorX.getBlob(iJ13));
                    iVar.f1748f = t2.f.a(cursorX.getBlob(iJ14));
                    iVar.f1749g = cursorX.getLong(iJ15);
                    iVar.h = cursorX.getLong(iJ16);
                    iVar.i = cursorX.getLong(iJ17);
                    iVar.f1751k = cursorX.getInt(iJ18);
                    iVar.f1752l = c1.v(cursorX.getInt(iJ19));
                    iVar.f1753m = cursorX.getLong(iJ20);
                    iVar.f1754n = cursorX.getLong(iJ21);
                    iVar.f1755o = cursorX.getLong(iJ22);
                    iVar.f1756p = cursorX.getLong(iJ23);
                    iVar.f1757q = cursorX.getInt(iJ24) != 0;
                    iVar.f1758r = c1.x(cursorX.getInt(iJ25));
                    iVar.f1750j = cVar;
                } else {
                    iVar = null;
                }
                cursorX.close();
                yVar.g();
                return iVar;
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

    public void m(l5.i iVar, int i) {
        byte[] bArr;
        long j4;
        m5.a aVar;
        String str;
        m5.a aVar2;
        int i10;
        j5.b bVarG;
        String str2;
        Integer numValueOf;
        m3 m3Var;
        final j jVar = this;
        final l5.i iVar2 = iVar;
        byte[] bArr2 = iVar2.f6823b;
        t5.c cVar = (t5.c) jVar.f1763f;
        m5.e eVarA = ((m5.d) jVar.f1760b).a(iVar2.f6822a);
        long jMax = 0;
        while (true) {
            final int i11 = 0;
            s5.i iVar3 = (s5.i) cVar;
            if (!((Boolean) iVar3.E(new t5.b(jVar) { // from class: r5.f

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ j f8189b;

                {
                    this.f8189b = jVar;
                }

                @Override // t5.b
                public final Object f() {
                    Boolean bool;
                    switch (i11) {
                        case 0:
                            i iVar4 = iVar2;
                            s5.i iVar5 = (s5.i) ((s5.d) this.f8189b.f1761c);
                            SQLiteDatabase sQLiteDatabaseC = iVar5.c();
                            sQLiteDatabaseC.beginTransaction();
                            try {
                                Long lD = s5.i.d(sQLiteDatabaseC, iVar4);
                                if (lD == null) {
                                    bool = Boolean.FALSE;
                                } else {
                                    Cursor cursorRawQuery = iVar5.c().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{lD.toString()});
                                    try {
                                        Boolean boolValueOf = Boolean.valueOf(cursorRawQuery.moveToNext());
                                        cursorRawQuery.close();
                                        bool = boolValueOf;
                                    } catch (Throwable th) {
                                        cursorRawQuery.close();
                                        throw th;
                                    }
                                }
                                sQLiteDatabaseC.setTransactionSuccessful();
                                sQLiteDatabaseC.endTransaction();
                                return bool;
                            } catch (Throwable th2) {
                                sQLiteDatabaseC.endTransaction();
                                throw th2;
                            }
                        default:
                            s5.i iVar6 = (s5.i) ((s5.d) this.f8189b.f1761c);
                            iVar6.getClass();
                            return (Iterable) iVar6.g(new e5.c(22, iVar6, iVar2));
                    }
                }
            })).booleanValue()) {
                iVar3.E(new aa.a(jVar, iVar2, jMax));
                return;
            }
            final int i12 = 1;
            Iterable iterable = (Iterable) iVar3.E(new t5.b(jVar) { // from class: r5.f

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ j f8189b;

                {
                    this.f8189b = jVar;
                }

                @Override // t5.b
                public final Object f() {
                    Boolean bool;
                    switch (i12) {
                        case 0:
                            i iVar4 = iVar2;
                            s5.i iVar5 = (s5.i) ((s5.d) this.f8189b.f1761c);
                            SQLiteDatabase sQLiteDatabaseC = iVar5.c();
                            sQLiteDatabaseC.beginTransaction();
                            try {
                                Long lD = s5.i.d(sQLiteDatabaseC, iVar4);
                                if (lD == null) {
                                    bool = Boolean.FALSE;
                                } else {
                                    Cursor cursorRawQuery = iVar5.c().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{lD.toString()});
                                    try {
                                        Boolean boolValueOf = Boolean.valueOf(cursorRawQuery.moveToNext());
                                        cursorRawQuery.close();
                                        bool = boolValueOf;
                                    } catch (Throwable th) {
                                        cursorRawQuery.close();
                                        throw th;
                                    }
                                }
                                sQLiteDatabaseC.setTransactionSuccessful();
                                sQLiteDatabaseC.endTransaction();
                                return bool;
                            } catch (Throwable th2) {
                                sQLiteDatabaseC.endTransaction();
                                throw th2;
                            }
                        default:
                            s5.i iVar6 = (s5.i) ((s5.d) this.f8189b.f1761c);
                            iVar6.getClass();
                            return (Iterable) iVar6.g(new e5.c(22, iVar6, iVar2));
                    }
                }
            });
            if (!iterable.iterator().hasNext()) {
                return;
            }
            if (eVarA == null) {
                a.a.e(iVar2, "Uploader", "Unknown backend for %s, deleting event batch for it...");
                aVar2 = new m5.a(3, -1L);
                bArr = bArr2;
                j4 = jMax;
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((s5.b) it.next()).f8432c);
                }
                if (bArr2 != null) {
                    s5.c cVar2 = (s5.c) jVar.i;
                    Objects.requireNonNull(cVar2);
                    o5.a aVar3 = (o5.a) iVar3.E(new a5.a(cVar2, 25));
                    bd.v vVar = new bd.v(8);
                    vVar.f1685g = new HashMap();
                    vVar.e = Long.valueOf(((u5.a) jVar.f1764g).d());
                    vVar.f1684f = Long.valueOf(((u5.a) jVar.h).d());
                    vVar.f1681b = "GDT_CLIENT_METRICS";
                    i5.b bVar = new i5.b("proto");
                    aVar3.getClass();
                    q5.d dVar = n.f6833a;
                    dVar.getClass();
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        dVar.g(aVar3, byteArrayOutputStream);
                    } catch (IOException unused) {
                    }
                    vVar.f1683d = new l5.l(bVar, byteArrayOutputStream.toByteArray());
                    arrayList.add(((j5.c) eVarA).a(vVar.e()));
                }
                j5.c cVar3 = (j5.c) eVarA;
                HashMap map = new HashMap();
                int size = arrayList.size();
                int i13 = 0;
                while (i13 < size) {
                    Object obj = arrayList.get(i13);
                    i13++;
                    l5.h hVar = (l5.h) obj;
                    String str3 = hVar.f6817a;
                    if (map.containsKey(str3)) {
                        ((List) map.get(str3)).add(hVar);
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(hVar);
                        map.put(str3, arrayList2);
                    }
                    bArr2 = bArr2;
                }
                bArr = bArr2;
                ArrayList arrayList3 = new ArrayList();
                Iterator it2 = map.entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    l5.h hVar2 = (l5.h) ((List) entry.getValue()).get(0);
                    w wVar = w.f6047a;
                    long jD = cVar3.f5699f.d();
                    long jD2 = cVar3.e.d();
                    k5.j jVar2 = new k5.j(new k5.h(Integer.valueOf(hVar2.b("sdk-version")), hVar2.a("model"), hVar2.a("hardware"), hVar2.a("device"), hVar2.a("product"), hVar2.a("os-uild"), hVar2.a("manufacturer"), hVar2.a("fingerprint"), hVar2.a("locale"), hVar2.a("country"), hVar2.a("mcc_mnc"), hVar2.a("application_build")));
                    try {
                        numValueOf = Integer.valueOf(Integer.parseInt((String) entry.getKey()));
                        str2 = null;
                    } catch (NumberFormatException unused2) {
                        str2 = (String) entry.getKey();
                        numValueOf = null;
                    }
                    ArrayList arrayList4 = new ArrayList();
                    for (l5.h hVar3 : (List) entry.getValue()) {
                        Iterator it3 = it2;
                        l5.l lVar = hVar3.f6819c;
                        i5.b bVar2 = lVar.f6830a;
                        byte[] bArr3 = lVar.f6831b;
                        long j10 = jMax;
                        if (bVar2.equals(new i5.b("proto"))) {
                            m3Var = new m3();
                            m3Var.f6362d = bArr3;
                        } else {
                            if (bVar2.equals(new i5.b("json"))) {
                                String str4 = new String(bArr3, Charset.forName("UTF-8"));
                                m3 m3Var2 = new m3();
                                m3Var2.e = str4;
                                m3Var = m3Var2;
                            } else {
                                String strH = a.a.h("CctTransportBackend");
                                if (Log.isLoggable(strH, 5)) {
                                    Log.w(strH, "Received event of unsupported encoding " + bVar2 + ". Skipping...");
                                }
                            }
                            it2 = it3;
                            jMax = j10;
                        }
                        m3Var.f6359a = Long.valueOf(hVar3.f6820d);
                        m3Var.f6361c = Long.valueOf(hVar3.e);
                        String str5 = (String) hVar3.f6821f.get("tz-offset");
                        m3Var.f6363f = Long.valueOf(str5 == null ? 0L : Long.valueOf(str5).longValue());
                        m3Var.f6364r = new k5.n((u) u.f6045a.get(hVar3.b("net-type")), (t) t.f6043a.get(hVar3.b("mobile-subtype")));
                        Integer num = hVar3.f6818b;
                        if (num != null) {
                            m3Var.f6360b = num;
                        }
                        String strH2 = ((Long) m3Var.f6359a) == null ? " eventTimeMs" : "";
                        if (((Long) m3Var.f6361c) == null) {
                            strH2 = strH2.concat(" eventUptimeMs");
                        }
                        if (((Long) m3Var.f6363f) == null) {
                            strH2 = v.h(strH2, " timezoneOffsetSeconds");
                        }
                        if (!strH2.isEmpty()) {
                            throw new IllegalStateException("Missing required properties:".concat(strH2));
                        }
                        arrayList4.add(new k5.k(((Long) m3Var.f6359a).longValue(), (Integer) m3Var.f6360b, ((Long) m3Var.f6361c).longValue(), (byte[]) m3Var.f6362d, (String) m3Var.e, ((Long) m3Var.f6363f).longValue(), (k5.n) m3Var.f6364r));
                        it2 = it3;
                        jMax = j10;
                    }
                    arrayList3.add(new k5.l(jD, jD2, jVar2, numValueOf, str2, arrayList4));
                    it2 = it2;
                }
                j4 = jMax;
                k5.i iVar4 = new k5.i(arrayList3);
                URL urlB = cVar3.f5698d;
                if (bArr != null) {
                    try {
                        j5.a aVarA = j5.a.a(bArr);
                        str = aVarA.f5691b;
                        if (str == null) {
                            str = null;
                        }
                        String str6 = aVarA.f5690a;
                        if (str6 != null) {
                            urlB = j5.c.b(str6);
                        }
                    } catch (IllegalArgumentException unused3) {
                        aVar = new m5.a(3, -1L);
                    }
                } else {
                    str = null;
                }
                try {
                    int i14 = 22;
                    a2.l lVar2 = new a2.l(urlB, iVar4, str, i14);
                    a5.a aVar4 = new a5.a(cVar3, 16);
                    int i15 = 5;
                    do {
                        bVarG = aVar4.g(lVar2);
                        URL url = bVarG.f5693b;
                        if (url != null) {
                            a.a.e(url, "CctTransportBackend", "Following redirect to: %s");
                            lVar2 = new a2.l(url, (k5.i) lVar2.f44c, (String) lVar2.f45d, i14);
                        } else {
                            lVar2 = null;
                        }
                        if (lVar2 == null) {
                            break;
                        } else {
                            i15--;
                        }
                    } while (i15 >= 1);
                    int i16 = bVarG.f5692a;
                    if (i16 == 200) {
                        aVar2 = new m5.a(1, bVarG.f5694c);
                    } else {
                        if (i16 >= 500 || i16 == 404) {
                            aVar = new m5.a(2, -1L);
                        } else if (i16 == 400) {
                            try {
                                aVar = new m5.a(4, -1L);
                            } catch (IOException e) {
                                e = e;
                                a.a.f(e, "CctTransportBackend", "Could not make request to the backend");
                                i10 = 2;
                                aVar2 = new m5.a(2, -1L);
                            }
                        } else {
                            aVar = new m5.a(3, -1L);
                        }
                        aVar2 = aVar;
                    }
                } catch (IOException e4) {
                    e = e4;
                }
            }
            i10 = 2;
            int i17 = aVar2.f7060a;
            if (i17 == i10) {
                iVar3.E(new r5.g(this, iterable, iVar, j4));
                ((q5.d) this.f1762d).i(iVar, i + 1, true);
                return;
            }
            jVar = this;
            iVar2 = iVar;
            jMax = j4;
            iVar3.E(new e5.c(20, jVar, iterable));
            if (i17 == 1) {
                jMax = Math.max(jMax, aVar2.f7061b);
                if (bArr != null) {
                    iVar3.E(new a5.a(jVar, 27));
                }
            } else if (i17 == 4) {
                HashMap map2 = new HashMap();
                Iterator it4 = iterable.iterator();
                while (it4.hasNext()) {
                    String str7 = ((s5.b) it4.next()).f8432c.f6817a;
                    if (map2.containsKey(str7)) {
                        map2.put(str7, Integer.valueOf(((Integer) map2.get(str7)).intValue() + 1));
                    } else {
                        map2.put(str7, 1);
                    }
                }
                iVar3.E(new e5.c(21, jVar, map2));
            }
            bArr2 = bArr;
        }
    }

    public void o(String str, long j4) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f1759a;
        workDatabase_Impl.b();
        e eVar = (e) this.h;
        i2.k kVarA = eVar.a();
        kVarA.b(1, j4);
        if (str == null) {
            kVarA.I(2);
        } else {
            kVarA.j(2, str);
        }
        workDatabase_Impl.c();
        try {
            kVarA.c();
            workDatabase_Impl.q();
        } finally {
            workDatabase_Impl.n();
            eVar.g(kVarA);
        }
    }

    public void p(String str, t2.f fVar) throws Throwable {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f1759a;
        workDatabase_Impl.b();
        e eVar = (e) this.f1762d;
        i2.k kVarA = eVar.a();
        byte[] bArrC = t2.f.c(fVar);
        if (bArrC == null) {
            kVarA.I(1);
        } else {
            kVarA.w(1, bArrC);
        }
        if (str == null) {
            kVarA.I(2);
        } else {
            kVarA.j(2, str);
        }
        workDatabase_Impl.c();
        try {
            kVarA.c();
            workDatabase_Impl.q();
        } finally {
            workDatabase_Impl.n();
            eVar.g(kVarA);
        }
    }

    public void q(String str, long j4) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f1759a;
        workDatabase_Impl.b();
        e eVar = (e) this.e;
        i2.k kVarA = eVar.a();
        kVarA.b(1, j4);
        if (str == null) {
            kVarA.I(2);
        } else {
            kVarA.j(2, str);
        }
        workDatabase_Impl.c();
        try {
            kVarA.c();
            workDatabase_Impl.q();
        } finally {
            workDatabase_Impl.n();
            eVar.g(kVarA);
        }
    }

    public void r(int i, String... strArr) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f1759a;
        workDatabase_Impl.b();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("UPDATE workspec SET state=? WHERE id IN (");
        android.support.v4.media.session.a.a(sb2, strArr.length);
        sb2.append(")");
        String string = sb2.toString();
        jc.i.e(string, "sql");
        workDatabase_Impl.a();
        workDatabase_Impl.b();
        i2.k kVarK = workDatabase_Impl.i().z().k(string);
        kVarK.b(1, c1.F(i));
        int i10 = 2;
        for (String str : strArr) {
            if (str == null) {
                kVarK.I(i10);
            } else {
                kVarK.j(i10, str);
            }
            i10++;
        }
        workDatabase_Impl.c();
        try {
            kVarK.c();
            workDatabase_Impl.q();
        } finally {
            workDatabase_Impl.n();
        }
    }

    public j(WorkDatabase_Impl workDatabase_Impl) {
        this.f1759a = workDatabase_Impl;
        this.f1760b = new b(workDatabase_Impl, 5);
        this.f1761c = new e(workDatabase_Impl, 3);
        this.f1762d = new e(workDatabase_Impl, 4);
        this.e = new e(workDatabase_Impl, 5);
        this.f1763f = new e(workDatabase_Impl, 6);
        this.f1764g = new e(workDatabase_Impl, 7);
        this.h = new e(workDatabase_Impl, 8);
        this.i = new e(workDatabase_Impl, 9);
        new e(workDatabase_Impl, 10);
    }
}
