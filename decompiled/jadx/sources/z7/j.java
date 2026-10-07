package z7;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.webkit.ProxyConfig;
import com.google.android.gms.internal.ads.zzbbs;
import com.google.android.gms.internal.measurement.zzfs;
import com.google.android.gms.internal.measurement.zzft;
import com.google.android.gms.internal.measurement.zzgc;
import com.google.android.gms.internal.measurement.zzgd;
import com.google.android.gms.internal.measurement.zzop;
import com.google.android.gms.internal.measurement.zzpz;
import com.google.android.gms.internal.measurement.zzqu;
import com.google.android.gms.internal.measurement.zzrd;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends w2 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String[] f11205f = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String[] f11206r = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String[] f11207s = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;", "e_tag", "ALTER TABLE apps ADD COLUMN e_tag TEXT;", "session_stitching_token", "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;", "sgtm_upload_enabled", "ALTER TABLE apps ADD COLUMN sgtm_upload_enabled INTEGER;", "target_os_version", "ALTER TABLE apps ADD COLUMN target_os_version INTEGER;", "session_stitching_token_hash", "ALTER TABLE apps ADD COLUMN session_stitching_token_hash INTEGER;"};

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String[] f11208t = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String[] f11209u = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String[] f11210v = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String[] f11211w = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final String[] f11212x = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i f11213d;
    public final d6.e e;

    public j(z2 z2Var) {
        super(z2Var);
        this.e = new d6.e(((a1) this.f159a).f11012y);
        ((a1) this.f159a).getClass();
        this.f11213d = new i(this, ((a1) this.f159a).f11000a);
    }

    public static final void p(ContentValues contentValues, Object obj) {
        com.google.android.gms.common.internal.i0.e("value");
        com.google.android.gms.common.internal.i0.i(obj);
        if (obj instanceof String) {
            contentValues.put("value", (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put("value", (Long) obj);
        } else {
            if (!(obj instanceof Double)) {
                throw new IllegalArgumentException("Invalid value type");
            }
            contentValues.put("value", (Double) obj);
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:47:? A[SYNTHETIC] */
    public final b3 A(String str, String str2) throws Throwable {
        Throwable th;
        String str3;
        String str4;
        SQLiteException sQLiteException;
        Cursor cursorQuery;
        a1 a1Var = (a1) this.f159a;
        com.google.android.gms.common.internal.i0.e(str);
        com.google.android.gms.common.internal.i0.e(str2);
        c();
        d();
        Cursor cursor = null;
        try {
            cursorQuery = v().query("user_attributes", new String[]{"set_timestamp", "value", "origin"}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
            try {
                try {
                    if (!cursorQuery.moveToFirst()) {
                        cursorQuery.close();
                        return null;
                    }
                    long j4 = cursorQuery.getLong(0);
                    Object objB = B(cursorQuery, 1);
                    if (objB == null) {
                        cursorQuery.close();
                        return null;
                    }
                    str3 = str;
                    str4 = str2;
                    try {
                        b3 b3Var = new b3(str3, cursorQuery.getString(2), str4, j4, objB);
                        if (cursorQuery.moveToNext()) {
                            i0 i0Var = a1Var.f11007t;
                            a1.f(i0Var);
                            i0Var.f11190f.c(i0.k(str3), "Got multiple records for user property, expected one. appId");
                        }
                        cursorQuery.close();
                        return b3Var;
                    } catch (SQLiteException e) {
                        e = e;
                    }
                } catch (SQLiteException e4) {
                    e = e4;
                    str3 = str;
                    str4 = str2;
                }
            } catch (Throwable th2) {
                th = th2;
                cursor = cursorQuery;
                if (cursor != null) {
                    throw th;
                }
                cursor.close();
                throw th;
            }
            sQLiteException = e;
        } catch (SQLiteException e10) {
            str3 = str;
            str4 = str2;
            sQLiteException = e10;
            cursorQuery = null;
        } catch (Throwable th3) {
            th = th3;
            if (cursor != null) {
                throw th;
            }
            cursor.close();
            throw th;
        }
        i0 i0Var2 = a1Var.f11007t;
        a1.f(i0Var2);
        i0Var2.f11190f.e("Error querying user property. appId", i0.k(str3), a1Var.f11011x.f(str4), sQLiteException);
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return null;
    }

    public final Object B(Cursor cursor, int i) {
        a1 a1Var = (a1) this.f159a;
        int type = cursor.getType(i);
        if (type == 0) {
            i0 i0Var = a1Var.f11007t;
            a1.f(i0Var);
            i0Var.f11190f.b("Loaded invalid null value from database");
            return null;
        }
        if (type == 1) {
            return Long.valueOf(cursor.getLong(i));
        }
        if (type == 2) {
            return Double.valueOf(cursor.getDouble(i));
        }
        if (type == 3) {
            return cursor.getString(i);
        }
        if (type != 4) {
            i0 i0Var2 = a1Var.f11007t;
            a1.f(i0Var2);
            i0Var2.f11190f.c(Integer.valueOf(type), "Loaded invalid unknown value type, ignoring it");
            return null;
        }
        i0 i0Var3 = a1Var.f11007t;
        a1.f(i0Var3);
        i0Var3.f11190f.b("Loaded invalid blob type value, ignoring it");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0043  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v3 */
    public final String C() throws Throwable {
        SQLiteException e;
        Cursor cursorRawQuery;
        SQLiteDatabase sQLiteDatabaseV = v();
        ?? r10 = 0;
        try {
            try {
                cursorRawQuery = sQLiteDatabaseV.rawQuery("select app_id from queue order by has_realtime desc, rowid asc limit 1;", null);
                try {
                    if (!cursorRawQuery.moveToFirst()) {
                        cursorRawQuery.close();
                        return null;
                    }
                    String string = cursorRawQuery.getString(0);
                    cursorRawQuery.close();
                    return string;
                } catch (SQLiteException e4) {
                    e = e4;
                    i0 i0Var = ((a1) this.f159a).f11007t;
                    a1.f(i0Var);
                    i0Var.f11190f.c(e, "Database error getting next bundle app id");
                    if (cursorRawQuery != null) {
                        cursorRawQuery.close();
                    }
                    return null;
                }
            } catch (Throwable th) {
                r10 = sQLiteDatabaseV;
                th = th;
                if (r10 != 0) {
                    r10.close();
                }
                throw th;
            }
        } catch (SQLiteException e10) {
            e = e10;
            cursorRawQuery = null;
        } catch (Throwable th2) {
            th = th2;
            if (r10 != 0) {
                r10.close();
            }
            throw th;
        }
    }

    public final List D(String str, String str2, String str3) {
        com.google.android.gms.common.internal.i0.e(str);
        c();
        d();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb2 = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb2.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(String.valueOf(str3).concat(ProxyConfig.MATCH_ALL_SCHEMES));
            sb2.append(" and name glob ?");
        }
        return E(sb2.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    public final List E(String str, String[] strArr) {
        z2 z2Var = this.f11411b;
        a1 a1Var = (a1) this.f159a;
        c();
        d();
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                a1Var.getClass();
                cursorQuery = v().query("conditional_properties", new String[]{"app_id", "origin", "name", "value", "active", "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"}, str, strArr, null, null, "rowid", "1001");
                if (!cursorQuery.moveToFirst()) {
                    cursorQuery.close();
                    return arrayList;
                }
                while (arrayList.size() < 1000) {
                    String string = cursorQuery.getString(0);
                    String string2 = cursorQuery.getString(1);
                    String string3 = cursorQuery.getString(2);
                    Object objB = B(cursorQuery, 3);
                    boolean z4 = cursorQuery.getInt(4) != 0;
                    String string4 = cursorQuery.getString(5);
                    long j4 = cursorQuery.getLong(6);
                    l0 l0Var = z2Var.f11512r;
                    l0 l0Var2 = z2Var.f11512r;
                    z2.D(l0Var);
                    byte[] blob = cursorQuery.getBlob(7);
                    Parcelable.Creator<q> creator = q.CREATOR;
                    q qVar = (q) l0Var.y(blob, creator);
                    long j10 = cursorQuery.getLong(8);
                    z2.D(l0Var2);
                    q qVar2 = (q) l0Var2.y(cursorQuery.getBlob(9), creator);
                    long j11 = cursorQuery.getLong(10);
                    long j12 = cursorQuery.getLong(11);
                    z2.D(l0Var2);
                    arrayList.add(new c(string, string2, new a3(j11, objB, string3, string2), j10, z4, string4, qVar, j4, qVar2, j12, (q) l0Var2.y(cursorQuery.getBlob(12), creator)));
                    if (!cursorQuery.moveToNext()) {
                        cursorQuery.close();
                        return arrayList;
                    }
                }
                i0 i0Var = a1Var.f11007t;
                a1.f(i0Var);
                i0Var.f11190f.c(Integer.valueOf(zzbbs.zzq.zzf), "Read more than the max allowed conditional properties, ignoring extra");
                cursorQuery.close();
                return arrayList;
            } catch (SQLiteException e) {
                i0 i0Var2 = a1Var.f11007t;
                a1.f(i0Var2);
                i0Var2.f11190f.c(e, "Error querying conditional user property value");
                List list = Collections.EMPTY_LIST;
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return list;
            }
        } catch (Throwable th) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th;
        }
    }

    public final List F(String str) {
        String str2;
        a1 a1Var = (a1) this.f159a;
        com.google.android.gms.common.internal.i0.e(str);
        c();
        d();
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                a1Var.getClass();
                cursorQuery = v().query("user_attributes", new String[]{"name", "origin", "set_timestamp", "value"}, "app_id=?", new String[]{str}, null, null, "rowid", "1000");
                try {
                    if (!cursorQuery.moveToFirst()) {
                        cursorQuery.close();
                        return arrayList;
                    }
                    while (true) {
                        String string = cursorQuery.getString(0);
                        String string2 = cursorQuery.getString(1);
                        if (string2 == null) {
                            string2 = "";
                        }
                        String str3 = string2;
                        long j4 = cursorQuery.getLong(2);
                        Object objB = B(cursorQuery, 3);
                        if (objB == null) {
                            i0 i0Var = a1Var.f11007t;
                            a1.f(i0Var);
                            i0Var.f11190f.c(i0.k(str), "Read invalid user property value, ignoring it. appId");
                            str2 = str;
                        } else {
                            str2 = str;
                            arrayList.add(new b3(str2, str3, string, j4, objB));
                        }
                        try {
                            if (!cursorQuery.moveToNext()) {
                                cursorQuery.close();
                                return arrayList;
                            }
                            str = str2;
                        } catch (SQLiteException e) {
                            e = e;
                        }
                    }
                } catch (SQLiteException e4) {
                    e = e4;
                    str2 = str;
                }
            } catch (Throwable th) {
                if (cursorQuery == null) {
                    throw th;
                }
                cursorQuery.close();
                throw th;
            }
        } catch (SQLiteException e10) {
            e = e10;
            str2 = str;
        }
        i0 i0Var2 = a1Var.f11007t;
        a1.f(i0Var2);
        i0Var2.f11190f.d(i0.k(str2), "Error querying user properties. appId", e);
        List list = Collections.EMPTY_LIST;
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return list;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x011c  */
    /* JADX WARN: Code duplicated, block: B:51:0x0123  */
    public final List G(String str, String str2, String str3) throws Throwable {
        Cursor cursor;
        String str4;
        a1 a1Var = (a1) this.f159a;
        com.google.android.gms.common.internal.i0.e(str);
        c();
        d();
        ArrayList arrayList = new ArrayList();
        try {
            ArrayList arrayList2 = new ArrayList(3);
            String str5 = str;
            arrayList2.add(str5);
            StringBuilder sb2 = new StringBuilder("app_id=?");
            if (!TextUtils.isEmpty(str2)) {
                arrayList2.add(str2);
                sb2.append(" and origin=?");
            }
            if (!TextUtils.isEmpty(str3)) {
                arrayList2.add(str3 + ProxyConfig.MATCH_ALL_SCHEMES);
                sb2.append(" and name glob ?");
            }
            String[] strArr = (String[]) arrayList2.toArray(new String[arrayList2.size()]);
            String string = sb2.toString();
            a1Var.getClass();
            i0 i0Var = a1Var.f11007t;
            Cursor cursorQuery = v().query("user_attributes", new String[]{"name", "set_timestamp", "value", "origin"}, string, strArr, null, null, "rowid", "1001");
            try {
                try {
                    if (!cursorQuery.moveToFirst()) {
                        cursorQuery.close();
                        return arrayList;
                    }
                    str4 = str2;
                    while (arrayList.size() < 1000) {
                        try {
                            String string2 = cursorQuery.getString(0);
                            long j4 = cursorQuery.getLong(1);
                            Object objB = B(cursorQuery, 2);
                            String string3 = cursorQuery.getString(3);
                            if (objB == null) {
                                try {
                                    a1.f(i0Var);
                                    i0Var.f11190f.e("(2)Read invalid user property value, ignoring it", i0.k(str5), string3, str3);
                                } catch (SQLiteException e) {
                                    e = e;
                                    cursor = cursorQuery;
                                    str4 = string3;
                                    try {
                                        i0 i0Var2 = a1Var.f11007t;
                                        a1.f(i0Var2);
                                        i0Var2.f11190f.e("(2)Error querying user properties", i0.k(str), str4, e);
                                        List list = Collections.EMPTY_LIST;
                                        if (cursor != null) {
                                            cursor.close();
                                        }
                                        return list;
                                    } catch (Throwable th) {
                                        th = th;
                                        if (cursor != null) {
                                            cursor.close();
                                        }
                                        throw th;
                                    }
                                }
                            } else {
                                arrayList.add(new b3(str5, string3, string2, j4, objB));
                            }
                            if (!cursorQuery.moveToNext()) {
                                cursorQuery.close();
                                return arrayList;
                            }
                            str5 = str;
                            str4 = string3;
                        } catch (SQLiteException e4) {
                            e = e4;
                            cursor = cursorQuery;
                            i0 i0Var3 = a1Var.f11007t;
                            a1.f(i0Var3);
                            i0Var3.f11190f.e("(2)Error querying user properties", i0.k(str), str4, e);
                            List list2 = Collections.EMPTY_LIST;
                            if (cursor != null) {
                                cursor.close();
                            }
                            return list2;
                        }
                    }
                    a1.f(i0Var);
                    i0Var.f11190f.c(Integer.valueOf(zzbbs.zzq.zzf), "Read more than the max allowed user properties, ignoring excess");
                    cursorQuery.close();
                    return arrayList;
                } catch (Throwable th2) {
                    th = th2;
                    cursor = cursorQuery;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            } catch (SQLiteException e10) {
                e = e10;
                str4 = str2;
            }
        } catch (SQLiteException e11) {
            e = e11;
            str4 = str2;
            cursor = null;
        } catch (Throwable th3) {
            th = th3;
            cursor = null;
        }
    }

    public final void H() {
        d();
        v().beginTransaction();
    }

    public final void I() {
        d();
        v().endTransaction();
    }

    public final void J(ArrayList arrayList) {
        a1 a1Var = (a1) this.f159a;
        c();
        d();
        com.google.android.gms.common.internal.i0.i(arrayList);
        if (arrayList.size() == 0) {
            throw new IllegalArgumentException("Given Integer is zero");
        }
        if (a1Var.f11000a.getDatabasePath("google_app_measurement.db").exists()) {
            String strI = da.v.i("(", TextUtils.join(",", arrayList), ")");
            if (q("SELECT COUNT(1) FROM queue WHERE rowid IN " + strI + " AND retry_count =  2147483647 LIMIT 1", null) > 0) {
                i0 i0Var = a1Var.f11007t;
                a1.f(i0Var);
                i0Var.f11193t.b("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                v().execSQL("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN " + strI + " AND (retry_count IS NULL OR retry_count < 2147483647)");
            } catch (SQLiteException e) {
                i0 i0Var2 = a1Var.f11007t;
                a1.f(i0Var2);
                i0Var2.f11190f.c(e, "Error incrementing retry count. error");
            }
        }
    }

    public final void K() {
        a1 a1Var = (a1) this.f159a;
        c();
        d();
        if (a1Var.f11000a.getDatabasePath("google_app_measurement.db").exists()) {
            z2 z2Var = this.f11411b;
            long jA = z2Var.f11514t.e.a();
            a1Var.f11012y.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (Math.abs(jElapsedRealtime - jA) > ((Long) z.f11491y.a(null)).longValue()) {
                z2Var.f11514t.e.b(jElapsedRealtime);
                c();
                d();
                if (a1Var.f11000a.getDatabasePath("google_app_measurement.db").exists()) {
                    SQLiteDatabase sQLiteDatabaseV = v();
                    a1Var.f11012y.getClass();
                    int iDelete = sQLiteDatabaseV.delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(System.currentTimeMillis()), String.valueOf(((Long) z.D.a(null)).longValue())});
                    if (iDelete > 0) {
                        i0 i0Var = a1Var.f11007t;
                        a1.f(i0Var);
                        i0Var.f11198y.c(Integer.valueOf(iDelete), "Deleted stale rows. rowsDeleted");
                    }
                }
            }
        }
    }

    public final void g(String str, String str2) {
        a1 a1Var = (a1) this.f159a;
        com.google.android.gms.common.internal.i0.e(str);
        com.google.android.gms.common.internal.i0.e(str2);
        c();
        d();
        try {
            v().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            i0 i0Var = a1Var.f11007t;
            a1.f(i0Var);
            i0Var.f11190f.e("Error deleting user property. appId", i0.k(str), a1Var.f11011x.f(str2), e);
        }
    }

    public final void h() {
        d();
        v().setTransactionSuccessful();
    }

    public final void j(h1 h1Var) {
        a1 a1Var = (a1) this.f159a;
        c();
        d();
        String strJ = h1Var.J();
        com.google.android.gms.common.internal.i0.i(strJ);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", strJ);
        contentValues.put("app_instance_id", h1Var.K());
        contentValues.put("gmp_app_id", h1Var.a());
        a1 a1Var2 = h1Var.f11154a;
        z0 z0Var = a1Var2.f11008u;
        a1.f(z0Var);
        z0Var.c();
        contentValues.put("resettable_device_id_hash", h1Var.e);
        z0 z0Var2 = a1Var2.f11008u;
        a1.f(z0Var2);
        z0Var2.c();
        contentValues.put("last_bundle_index", Long.valueOf(h1Var.f11159g));
        z0 z0Var3 = a1Var2.f11008u;
        a1.f(z0Var3);
        z0Var3.c();
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(h1Var.h));
        z0 z0Var4 = a1Var2.f11008u;
        a1.f(z0Var4);
        z0Var4.c();
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(h1Var.i));
        contentValues.put("app_version", h1Var.L());
        z0 z0Var5 = a1Var2.f11008u;
        a1.f(z0Var5);
        z0Var5.c();
        contentValues.put("app_store", h1Var.f11162l);
        z0 z0Var6 = a1Var2.f11008u;
        a1.f(z0Var6);
        z0Var6.c();
        contentValues.put("gmp_version", Long.valueOf(h1Var.f11163m));
        z0 z0Var7 = a1Var2.f11008u;
        a1.f(z0Var7);
        z0Var7.c();
        contentValues.put("dev_cert_hash", Long.valueOf(h1Var.f11164n));
        z0 z0Var8 = a1Var2.f11008u;
        a1.f(z0Var8);
        z0Var8.c();
        contentValues.put("measurement_enabled", Boolean.valueOf(h1Var.f11165o));
        z0 z0Var9 = a1Var2.f11008u;
        a1.f(z0Var9);
        z0Var9.c();
        contentValues.put("day", Long.valueOf(h1Var.f11175y));
        z0 z0Var10 = a1Var2.f11008u;
        a1.f(z0Var10);
        z0Var10.c();
        contentValues.put("daily_public_events_count", Long.valueOf(h1Var.f11176z));
        a1.f(z0Var10);
        z0Var10.c();
        contentValues.put("daily_events_count", Long.valueOf(h1Var.A));
        a1.f(z0Var10);
        z0Var10.c();
        contentValues.put("daily_conversions_count", Long.valueOf(h1Var.B));
        z0 z0Var11 = a1Var2.f11008u;
        a1.f(z0Var11);
        z0Var11.c();
        contentValues.put("config_fetched_time", Long.valueOf(h1Var.G));
        z0 z0Var12 = a1Var2.f11008u;
        a1.f(z0Var12);
        z0Var12.c();
        contentValues.put("failed_config_fetch_time", Long.valueOf(h1Var.H));
        contentValues.put("app_version_int", Long.valueOf(h1Var.F()));
        contentValues.put("firebase_instance_id", h1Var.M());
        a1.f(z0Var10);
        z0Var10.c();
        contentValues.put("daily_error_events_count", Long.valueOf(h1Var.C));
        a1.f(z0Var10);
        z0Var10.c();
        contentValues.put("daily_realtime_events_count", Long.valueOf(h1Var.D));
        a1.f(z0Var10);
        z0Var10.c();
        contentValues.put("health_monitor_sample", h1Var.E);
        z0 z0Var13 = a1Var2.f11008u;
        a1.f(z0Var13);
        z0Var13.c();
        contentValues.put("android_id", (Long) 0L);
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(h1Var.D()));
        contentValues.put("admob_app_id", h1Var.H());
        contentValues.put("dynamite_version", Long.valueOf(h1Var.G()));
        z0 z0Var14 = a1Var2.f11008u;
        a1.f(z0Var14);
        z0Var14.c();
        contentValues.put("session_stitching_token", h1Var.f11171u);
        contentValues.put("sgtm_upload_enabled", Boolean.valueOf(h1Var.E()));
        z0 z0Var15 = a1Var2.f11008u;
        a1.f(z0Var15);
        z0Var15.c();
        contentValues.put("target_os_version", Long.valueOf(h1Var.f11173w));
        z0 z0Var16 = a1Var2.f11008u;
        a1.f(z0Var16);
        z0Var16.c();
        contentValues.put("session_stitching_token_hash", Long.valueOf(h1Var.f11174x));
        z0 z0Var17 = a1Var2.f11008u;
        a1.f(z0Var17);
        z0Var17.c();
        ArrayList arrayList = h1Var.f11170t;
        if (arrayList != null) {
            if (arrayList.isEmpty()) {
                i0 i0Var = a1Var.f11007t;
                a1.f(i0Var);
                i0Var.f11193t.c(strJ, "Safelisted events should not be an empty list. appId");
            } else {
                contentValues.put("safelisted_events", TextUtils.join(",", arrayList));
            }
        }
        zzop.zzc();
        g gVar = a1Var.f11005r;
        i0 i0Var2 = a1Var.f11007t;
        if (gVar.l(null, z.f11459g0) && !contentValues.containsKey("safelisted_events")) {
            contentValues.put("safelisted_events", (String) null);
        }
        try {
            SQLiteDatabase sQLiteDatabaseV = v();
            if (sQLiteDatabaseV.update("apps", contentValues, "app_id = ?", new String[]{strJ}) == 0 && sQLiteDatabaseV.insertWithOnConflict("apps", null, contentValues, 5) == -1) {
                a1.f(i0Var2);
                i0Var2.f11190f.c(i0.k(strJ), "Failed to insert/update app (got -1). appId");
            }
        } catch (SQLiteException e) {
            a1.f(i0Var2);
            i0Var2.f11190f.d(i0.k(strJ), "Error storing app. appId", e);
        }
    }

    public final void k(n nVar) {
        a1 a1Var = (a1) this.f159a;
        com.google.android.gms.common.internal.i0.i(nVar);
        c();
        d();
        ContentValues contentValues = new ContentValues();
        String str = nVar.f11262a;
        contentValues.put("app_id", str);
        contentValues.put("name", nVar.f11263b);
        contentValues.put("lifetime_count", Long.valueOf(nVar.f11264c));
        contentValues.put("current_bundle_count", Long.valueOf(nVar.f11265d));
        contentValues.put("last_fire_timestamp", Long.valueOf(nVar.f11266f));
        contentValues.put("last_bundled_timestamp", Long.valueOf(nVar.f11267g));
        contentValues.put("last_bundled_day", nVar.h);
        contentValues.put("last_sampled_complex_event_id", nVar.i);
        contentValues.put("last_sampling_rate", nVar.f11268j);
        contentValues.put("current_session_count", Long.valueOf(nVar.e));
        Boolean bool = nVar.f11269k;
        contentValues.put("last_exempt_from_sampling", (bool == null || !bool.booleanValue()) ? null : 1L);
        try {
            if (v().insertWithOnConflict("events", null, contentValues, 5) == -1) {
                i0 i0Var = a1Var.f11007t;
                a1.f(i0Var);
                i0Var.f11190f.c(i0.k(str), "Failed to insert/update event aggregates (got -1). appId");
            }
        } catch (SQLiteException e) {
            i0 i0Var2 = a1Var.f11007t;
            a1.f(i0Var2);
            i0Var2.f11190f.d(i0.k(str), "Error storing event aggregates. appId", e);
        }
    }

    public final void l(String str, Long l2, long j4, zzft zzftVar) {
        c();
        d();
        com.google.android.gms.common.internal.i0.i(zzftVar);
        com.google.android.gms.common.internal.i0.e(str);
        byte[] bArrZzbx = zzftVar.zzbx();
        a1 a1Var = (a1) this.f159a;
        i0 i0Var = a1Var.f11007t;
        i0 i0Var2 = a1Var.f11007t;
        a1.f(i0Var);
        i0Var.f11198y.d(a1Var.f11011x.d(str), "Saving complex main event, appId, data size", Integer.valueOf(bArrZzbx.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l2);
        contentValues.put("children_to_process", Long.valueOf(j4));
        contentValues.put("main_event", bArrZzbx);
        try {
            if (v().insertWithOnConflict("main_event_params", null, contentValues, 5) == -1) {
                a1.f(i0Var2);
                i0Var2.f11190f.c(i0.k(str), "Failed to insert complex main event (got -1). appId");
            }
        } catch (SQLiteException e) {
            a1.f(i0Var2);
            i0Var2.f11190f.d(i0.k(str), "Error storing complex main event. appId", e);
        }
    }

    public final boolean m(c cVar) {
        a1 a1Var = (a1) this.f159a;
        c();
        d();
        String str = cVar.f11037a;
        com.google.android.gms.common.internal.i0.i(str);
        if (A(str, cVar.f11039c.f11015b) == null) {
            long jQ = q("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str});
            a1Var.getClass();
            if (jQ >= 1000) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", cVar.f11038b);
        contentValues.put("name", cVar.f11039c.f11015b);
        Object objZza = cVar.f11039c.zza();
        com.google.android.gms.common.internal.i0.i(objZza);
        p(contentValues, objZza);
        contentValues.put("active", Boolean.valueOf(cVar.e));
        contentValues.put("trigger_event_name", cVar.f11041f);
        contentValues.put("trigger_timeout", Long.valueOf(cVar.f11043s));
        d3 d3Var = a1Var.f11010w;
        i0 i0Var = a1Var.f11007t;
        d3 d3Var2 = a1Var.f11010w;
        a1.d(d3Var);
        contentValues.put("timed_out_event", d3.S(cVar.f11042r));
        contentValues.put("creation_timestamp", Long.valueOf(cVar.f11040d));
        a1.d(d3Var2);
        contentValues.put("triggered_event", d3.S(cVar.f11044t));
        contentValues.put("triggered_timestamp", Long.valueOf(cVar.f11039c.f11016c));
        contentValues.put("time_to_live", Long.valueOf(cVar.f11045u));
        a1.d(d3Var2);
        contentValues.put("expired_event", d3.S(cVar.f11046v));
        try {
            if (v().insertWithOnConflict("conditional_properties", null, contentValues, 5) != -1) {
                return true;
            }
            a1.f(i0Var);
            i0Var.f11190f.c(i0.k(str), "Failed to insert/update conditional user property (got -1)");
            return true;
        } catch (SQLiteException e) {
            a1.f(i0Var);
            i0Var.f11190f.d(i0.k(str), "Error storing conditional user property", e);
            return true;
        }
    }

    public final boolean n(b3 b3Var) {
        a1 a1Var = (a1) this.f159a;
        String str = b3Var.f11034b;
        c();
        d();
        String str2 = b3Var.f11033a;
        String str3 = b3Var.f11035c;
        if (A(str2, str3) == null) {
            if (d3.P(str3)) {
                if (q("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{str2}) >= Math.max(Math.min(a1Var.f11005r.f(str2, z.G), 100), 25)) {
                    return false;
                }
            } else if (!"_npa".equals(str3)) {
                long jQ = q("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{str2, str});
                a1Var.getClass();
                if (jQ >= 25) {
                    return false;
                }
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str2);
        contentValues.put("origin", str);
        contentValues.put("name", str3);
        contentValues.put("set_timestamp", Long.valueOf(b3Var.f11036d));
        p(contentValues, b3Var.e);
        try {
            if (v().insertWithOnConflict("user_attributes", null, contentValues, 5) != -1) {
                return true;
            }
            i0 i0Var = a1Var.f11007t;
            a1.f(i0Var);
            i0Var.f11190f.c(i0.k(str2), "Failed to insert/update user property (got -1). appId");
            return true;
        } catch (SQLiteException e) {
            i0 i0Var2 = a1Var.f11007t;
            a1.f(i0Var2);
            i0Var2.f11190f.d(i0.k(str2), "Error storing user property. appId", e);
            return true;
        }
    }

    /* JADX WARN: Code duplicated, block: B:84:0x01e6  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r5v2 */
    public final void o(long j4, long j10, kb.d dVar) throws Throwable {
        String string;
        String str;
        String[] strArr;
        a1 a1Var = (a1) this.f159a;
        ?? r10 = "select app_id, metadata_fingerprint from raw_events where ";
        c();
        d();
        ?? r11 = 0;
        String string2 = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabaseV = v();
                try {
                    if (TextUtils.isEmpty(null)) {
                        Cursor cursorRawQuery = sQLiteDatabaseV.rawQuery("select app_id, metadata_fingerprint from raw_events where " + (j10 != -1 ? "rowid <= ? and " : "") + "app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;", j10 != -1 ? new String[]{String.valueOf(j10), String.valueOf(j4)} : new String[]{String.valueOf(j4)});
                        if (!cursorRawQuery.moveToFirst()) {
                            cursorRawQuery.close();
                            return;
                        } else {
                            string2 = cursorRawQuery.getString(0);
                            string = cursorRawQuery.getString(1);
                            cursorRawQuery.close();
                        }
                    } else {
                        Cursor cursorRawQuery2 = sQLiteDatabaseV.rawQuery("select metadata_fingerprint from raw_events where app_id = ?" + (j10 != -1 ? " and rowid <= ?" : "") + " order by rowid limit 1;", j10 != -1 ? new String[]{null, String.valueOf(j10)} : new String[]{null});
                        if (!cursorRawQuery2.moveToFirst()) {
                            cursorRawQuery2.close();
                            return;
                        } else {
                            string = cursorRawQuery2.getString(0);
                            cursorRawQuery2.close();
                        }
                    }
                    Cursor cursorQuery = sQLiteDatabaseV.query("raw_events_metadata", new String[]{"metadata"}, "app_id = ? and metadata_fingerprint = ?", new String[]{string2, string}, null, null, "rowid", "2");
                    if (!cursorQuery.moveToFirst()) {
                        i0 i0Var = a1Var.f11007t;
                        a1.f(i0Var);
                        i0Var.f11190f.c(i0.k(string2), "Raw event metadata record is missing. appId");
                        cursorQuery.close();
                        return;
                    }
                    try {
                        zzgd zzgdVar = (zzgd) ((zzgc) l0.B(zzgd.zzu(), cursorQuery.getBlob(0))).zzaD();
                        if (cursorQuery.moveToNext()) {
                            i0 i0Var2 = a1Var.f11007t;
                            a1.f(i0Var2);
                            i0Var2.f11193t.c(i0.k(string2), "Get multiple raw event metadata records, expected one. appId");
                        }
                        cursorQuery.close();
                        com.google.android.gms.common.internal.i0.i(zzgdVar);
                        dVar.f6152b = zzgdVar;
                        if (j10 != -1) {
                            str = "app_id = ? and metadata_fingerprint = ? and rowid <= ?";
                            strArr = new String[]{string2, string, String.valueOf(j10)};
                        } else {
                            str = "app_id = ? and metadata_fingerprint = ?";
                            strArr = new String[]{string2, string};
                        }
                        Cursor cursorQuery2 = sQLiteDatabaseV.query("raw_events", new String[]{"rowid", "name", "timestamp", "data"}, str, strArr, null, null, "rowid", null);
                        if (!cursorQuery2.moveToFirst()) {
                            i0 i0Var3 = a1Var.f11007t;
                            a1.f(i0Var3);
                            i0Var3.f11193t.c(i0.k(string2), "Raw event data disappeared while in transaction. appId");
                            cursorQuery2.close();
                            return;
                        }
                        do {
                            long j11 = cursorQuery2.getLong(0);
                            try {
                                zzfs zzfsVar = (zzfs) l0.B(zzft.zze(), cursorQuery2.getBlob(3));
                                zzfsVar.zzi(cursorQuery2.getString(1));
                                zzfsVar.zzm(cursorQuery2.getLong(2));
                                if (!dVar.c((zzft) zzfsVar.zzaD(), j11)) {
                                    cursorQuery2.close();
                                    return;
                                }
                            } catch (IOException e) {
                                i0 i0Var4 = a1Var.f11007t;
                                a1.f(i0Var4);
                                i0Var4.f11190f.d(i0.k(string2), "Data loss. Failed to merge raw event. appId", e);
                            }
                        } while (cursorQuery2.moveToNext());
                        cursorQuery2.close();
                    } catch (IOException e4) {
                        i0 i0Var5 = a1Var.f11007t;
                        a1.f(i0Var5);
                        i0Var5.f11190f.d(i0.k(string2), "Data loss. Failed to merge raw event metadata. appId", e4);
                        cursorQuery.close();
                    }
                } catch (SQLiteException e10) {
                    e = e10;
                    i0 i0Var6 = a1Var.f11007t;
                    a1.f(i0Var6);
                    i0Var6.f11190f.d(i0.k(null), "Data loss. Error selecting raw event. appId", e);
                    if (r10 != 0) {
                        r10.close();
                    }
                }
            } catch (Throwable th) {
                th = th;
                r11 = "select app_id, metadata_fingerprint from raw_events where ";
                if (r11 != 0) {
                    r11.close();
                }
                throw th;
            }
        } catch (SQLiteException e11) {
            e = e11;
            r10 = 0;
        } catch (Throwable th2) {
            th = th2;
            if (r11 != 0) {
                r11.close();
            }
            throw th;
        }
    }

    public final long q(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                Cursor cursorRawQuery = v().rawQuery(str, strArr);
                if (!cursorRawQuery.moveToFirst()) {
                    throw new SQLiteException("Database returned empty set");
                }
                long j4 = cursorRawQuery.getLong(0);
                cursorRawQuery.close();
                return j4;
            } catch (SQLiteException e) {
                i0 i0Var = ((a1) this.f159a).f11007t;
                a1.f(i0Var);
                i0Var.f11190f.d(str, "Database error", e);
                throw e;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    public final void r(String str, String str2) {
        a1 a1Var = (a1) this.f159a;
        com.google.android.gms.common.internal.i0.e(str);
        com.google.android.gms.common.internal.i0.e(str2);
        c();
        d();
        try {
            v().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            i0 i0Var = a1Var.f11007t;
            a1.f(i0Var);
            i0Var.f11190f.e("Error deleting conditional property", i0.k(str), a1Var.f11011x.f(str2), e);
        }
    }

    public final long s(String str, String[] strArr, long j4) {
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = v().rawQuery(str, strArr);
                if (!cursorRawQuery.moveToFirst()) {
                    cursorRawQuery.close();
                    return j4;
                }
                long j10 = cursorRawQuery.getLong(0);
                cursorRawQuery.close();
                return j10;
            } catch (SQLiteException e) {
                i0 i0Var = ((a1) this.f159a).f11007t;
                a1.f(i0Var);
                i0Var.f11190f.d(str, "Database error", e);
                throw e;
            }
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th;
        }
    }

    public final long t(String str) {
        a1 a1Var = (a1) this.f159a;
        com.google.android.gms.common.internal.i0.e(str);
        com.google.android.gms.common.internal.i0.e("first_open_count");
        c();
        d();
        SQLiteDatabase sQLiteDatabaseV = v();
        sQLiteDatabaseV.beginTransaction();
        long j4 = 0;
        try {
            try {
                long jS = s("select first_open_count from app2 where app_id=?", new String[]{str}, -1L);
                if (jS == -1) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("app_id", str);
                    contentValues.put("first_open_count", (Integer) 0);
                    contentValues.put("previous_install_count", (Integer) 0);
                    if (sQLiteDatabaseV.insertWithOnConflict("app2", null, contentValues, 5) == -1) {
                        i0 i0Var = a1Var.f11007t;
                        a1.f(i0Var);
                        i0Var.f11190f.d(i0.k(str), "Failed to insert column (got -1). appId", "first_open_count");
                        return -1L;
                    }
                    jS = 0;
                    i0 i0Var2 = a1Var.f11007t;
                    a1.f(i0Var2);
                    i0Var2.f11190f.e("Error inserting column. appId", i0.k(str), "first_open_count", e);
                    return j4;
                }
                try {
                    ContentValues contentValues2 = new ContentValues();
                    contentValues2.put("app_id", str);
                    contentValues2.put("first_open_count", Long.valueOf(1 + jS));
                    if (sQLiteDatabaseV.update("app2", contentValues2, "app_id = ?", new String[]{str}) != 0) {
                        sQLiteDatabaseV.setTransactionSuccessful();
                        return jS;
                    }
                    i0 i0Var3 = a1Var.f11007t;
                    a1.f(i0Var3);
                    i0Var3.f11190f.d(i0.k(str), "Failed to update column (got 0). appId", "first_open_count");
                    return -1L;
                } catch (SQLiteException e) {
                    e = e;
                    j4 = jS;
                }
            } finally {
                sQLiteDatabaseV.endTransaction();
            }
        } catch (SQLiteException e4) {
            e = e4;
        }
    }

    public final long u(String str) {
        com.google.android.gms.common.internal.i0.e(str);
        return s("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0L);
    }

    public final SQLiteDatabase v() {
        c();
        try {
            return this.f11213d.getWritableDatabase();
        } catch (SQLiteException e) {
            i0 i0Var = ((a1) this.f159a).f11007t;
            a1.f(i0Var);
            i0Var.f11193t.c(e, "Error opening database");
            throw e;
        }
    }

    public final h1 w(String str) throws Throwable {
        Cursor cursorQuery;
        a1 a1Var = (a1) this.f159a;
        com.google.android.gms.common.internal.i0.e(str);
        c();
        d();
        Cursor cursor = null;
        try {
            cursorQuery = v().query("apps", new String[]{"app_instance_id", "gmp_app_id", "resettable_device_id_hash", "last_bundle_index", "last_bundle_start_timestamp", "last_bundle_end_timestamp", "app_version", "app_store", "gmp_version", "dev_cert_hash", "measurement_enabled", "day", "daily_public_events_count", "daily_events_count", "daily_conversions_count", "config_fetched_time", "failed_config_fetch_time", "app_version_int", "firebase_instance_id", "daily_error_events_count", "daily_realtime_events_count", "health_monitor_sample", "android_id", "adid_reporting_enabled", "admob_app_id", "dynamite_version", "safelisted_events", "ga_app_id", "session_stitching_token", "sgtm_upload_enabled", "target_os_version", "session_stitching_token_hash"}, "app_id=?", new String[]{str}, null, null, null);
            try {
                try {
                    if (!cursorQuery.moveToFirst()) {
                        cursorQuery.close();
                        return null;
                    }
                    h1 h1Var = new h1(this.f11411b.f11517w, str);
                    a1 a1Var2 = h1Var.f11154a;
                    h1Var.d(cursorQuery.getString(0));
                    boolean z4 = true;
                    h1Var.s(cursorQuery.getString(1));
                    h1Var.z(cursorQuery.getString(2));
                    h1Var.w(cursorQuery.getLong(3));
                    h1Var.x(cursorQuery.getLong(4));
                    h1Var.v(cursorQuery.getLong(5));
                    h1Var.f(cursorQuery.getString(6));
                    h1Var.e(cursorQuery.getString(7));
                    h1Var.t(cursorQuery.getLong(8));
                    h1Var.o(cursorQuery.getLong(9));
                    h1Var.y(cursorQuery.isNull(10) || cursorQuery.getInt(10) != 0);
                    h1Var.n(cursorQuery.getLong(11));
                    h1Var.l(cursorQuery.getLong(12));
                    h1Var.k(cursorQuery.getLong(13));
                    h1Var.i(cursorQuery.getLong(14));
                    h1Var.h(cursorQuery.getLong(15));
                    h1Var.q(cursorQuery.getLong(16));
                    h1Var.g(cursorQuery.isNull(17) ? -2147483648L : cursorQuery.getInt(17));
                    h1Var.r(cursorQuery.getString(18));
                    h1Var.j(cursorQuery.getLong(19));
                    h1Var.m(cursorQuery.getLong(20));
                    h1Var.u(cursorQuery.getString(21));
                    boolean z10 = cursorQuery.isNull(23) || cursorQuery.getInt(23) != 0;
                    z0 z0Var = a1Var2.f11008u;
                    a1.f(z0Var);
                    z0Var.c();
                    h1Var.F |= h1Var.f11166p != z10;
                    h1Var.f11166p = z10;
                    h1Var.c(cursorQuery.getString(24));
                    h1Var.p(cursorQuery.isNull(25) ? 0L : cursorQuery.getLong(25));
                    if (!cursorQuery.isNull(26)) {
                        h1Var.A(Arrays.asList(cursorQuery.getString(26).split(",", -1)));
                    }
                    zzqu.zzc();
                    g gVar = a1Var.f11005r;
                    g gVar2 = a1Var.f11005r;
                    if (gVar.l(str, z.k0) || gVar2.l(null, z.f11461i0)) {
                        String string = cursorQuery.getString(28);
                        z0 z0Var2 = a1Var2.f11008u;
                        a1.f(z0Var2);
                        z0Var2.c();
                        h1Var.F |= !k1.d(h1Var.f11171u, string);
                        h1Var.f11171u = string;
                    }
                    zzrd.zzc();
                    if (gVar2.l(null, z.f11466l0)) {
                        boolean z11 = (cursorQuery.isNull(29) || cursorQuery.getInt(29) == 0) ? false : true;
                        z0 z0Var3 = a1Var2.f11008u;
                        a1.f(z0Var3);
                        z0Var3.c();
                        boolean z12 = h1Var.F;
                        if (h1Var.f11172v == z11) {
                            z4 = false;
                        }
                        h1Var.F = z4 | z12;
                        h1Var.f11172v = z11;
                    }
                    zzpz.zzc();
                    if (gVar2.l(null, z.f11488w0)) {
                        h1Var.C(cursorQuery.getLong(30));
                    }
                    if (gVar2.l(null, z.f11494z0)) {
                        h1Var.B(cursorQuery.getLong(31));
                    }
                    z0 z0Var4 = a1Var2.f11008u;
                    a1.f(z0Var4);
                    z0Var4.c();
                    h1Var.F = false;
                    if (cursorQuery.moveToNext()) {
                        i0 i0Var = a1Var.f11007t;
                        a1.f(i0Var);
                        i0Var.f11190f.c(i0.k(str), "Got multiple records for app, expected one. appId");
                    }
                    cursorQuery.close();
                    return h1Var;
                } catch (SQLiteException e) {
                    e = e;
                    i0 i0Var2 = a1Var.f11007t;
                    a1.f(i0Var2);
                    i0Var2.f11190f.d(i0.k(str), "Error querying app. appId", e);
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                cursor = cursorQuery;
            }
        } catch (SQLiteException e4) {
            e = e4;
            cursorQuery = null;
        } catch (Throwable th2) {
            th = th2;
        }
        th = th;
        cursor = cursorQuery;
        if (cursor != null) {
            cursor.close();
        }
        throw th;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0120  */
    public final c x(String str, String str2) throws Throwable {
        String str3;
        Cursor cursorQuery;
        z2 z2Var = this.f11411b;
        a1 a1Var = (a1) this.f159a;
        com.google.android.gms.common.internal.i0.e(str);
        com.google.android.gms.common.internal.i0.e(str2);
        c();
        d();
        Cursor cursor = null;
        try {
            cursorQuery = v().query("conditional_properties", new String[]{"origin", "value", "active", "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
            try {
                try {
                    if (!cursorQuery.moveToFirst()) {
                        cursorQuery.close();
                        return null;
                    }
                    String string = cursorQuery.getString(0);
                    if (string == null) {
                        string = "";
                    }
                    String str4 = string;
                    Object objB = B(cursorQuery, 1);
                    boolean z4 = cursorQuery.getInt(2) != 0;
                    String string2 = cursorQuery.getString(3);
                    long j4 = cursorQuery.getLong(4);
                    l0 l0Var = z2Var.f11512r;
                    l0 l0Var2 = z2Var.f11512r;
                    z2.D(l0Var);
                    byte[] blob = cursorQuery.getBlob(5);
                    Parcelable.Creator<q> creator = q.CREATOR;
                    q qVar = (q) l0Var.y(blob, creator);
                    long j10 = cursorQuery.getLong(6);
                    z2.D(l0Var2);
                    q qVar2 = (q) l0Var2.y(cursorQuery.getBlob(7), creator);
                    long j11 = cursorQuery.getLong(8);
                    long j12 = cursorQuery.getLong(9);
                    z2.D(l0Var2);
                    str3 = str2;
                    try {
                        c cVar = new c(str, str4, new a3(j11, objB, str3, str4), j10, z4, string2, qVar, j4, qVar2, j12, (q) l0Var2.y(cursorQuery.getBlob(10), creator));
                        if (cursorQuery.moveToNext()) {
                            i0 i0Var = a1Var.f11007t;
                            a1.f(i0Var);
                            i0Var.f11190f.d(i0.k(str), "Got multiple records for conditional property, expected one", a1Var.f11011x.f(str3));
                        }
                        cursorQuery.close();
                        return cVar;
                    } catch (SQLiteException e) {
                        e = e;
                    }
                } catch (SQLiteException e4) {
                    e = e4;
                    str3 = str2;
                }
            } catch (Throwable th) {
                th = th;
                cursor = cursorQuery;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (SQLiteException e10) {
            e = e10;
            str3 = str2;
            cursorQuery = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
        i0 i0Var2 = a1Var.f11007t;
        a1.f(i0Var2);
        i0Var2.f11190f.e("Error querying conditional property", i0.k(str), a1Var.f11011x.f(str3), e);
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return null;
    }

    public final h y(long j4, String str, long j10, boolean z4, boolean z10, boolean z11, boolean z12, boolean z13) {
        a1 a1Var = (a1) this.f159a;
        com.google.android.gms.common.internal.i0.e(str);
        c();
        d();
        String[] strArr = {str};
        h hVar = new h();
        Cursor cursor = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabaseV = v();
                Cursor cursorQuery = sQLiteDatabaseV.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count"}, "app_id=?", new String[]{str}, null, null, null);
                if (!cursorQuery.moveToFirst()) {
                    i0 i0Var = a1Var.f11007t;
                    a1.f(i0Var);
                    i0Var.f11193t.c(i0.k(str), "Not updating daily counts, app is not known. appId");
                    cursorQuery.close();
                    return hVar;
                }
                if (cursorQuery.getLong(0) == j4) {
                    hVar.f11150b = cursorQuery.getLong(1);
                    hVar.f11149a = cursorQuery.getLong(2);
                    hVar.f11151c = cursorQuery.getLong(3);
                    hVar.f11152d = cursorQuery.getLong(4);
                    hVar.e = cursorQuery.getLong(5);
                }
                if (z4) {
                    hVar.f11150b += j10;
                }
                if (z10) {
                    hVar.f11149a += j10;
                }
                if (z11) {
                    hVar.f11151c += j10;
                }
                if (z12) {
                    hVar.f11152d += j10;
                }
                if (z13) {
                    hVar.e += j10;
                }
                ContentValues contentValues = new ContentValues();
                contentValues.put("day", Long.valueOf(j4));
                contentValues.put("daily_public_events_count", Long.valueOf(hVar.f11149a));
                contentValues.put("daily_events_count", Long.valueOf(hVar.f11150b));
                contentValues.put("daily_conversions_count", Long.valueOf(hVar.f11151c));
                contentValues.put("daily_error_events_count", Long.valueOf(hVar.f11152d));
                contentValues.put("daily_realtime_events_count", Long.valueOf(hVar.e));
                sQLiteDatabaseV.update("apps", contentValues, "app_id=?", strArr);
                cursorQuery.close();
                return hVar;
            } catch (SQLiteException e) {
                i0 i0Var2 = a1Var.f11007t;
                a1.f(i0Var2);
                i0Var2.f11190f.d(i0.k(str), "Error updating daily counts. appId", e);
                if (0 != 0) {
                    cursor.close();
                }
                return hVar;
            }
        } catch (Throwable th) {
            if (0 == 0) {
                throw th;
            }
            cursor.close();
            throw th;
        }
    }

    public final n z(String str, String str2) throws Throwable {
        Cursor cursorQuery;
        Boolean boolValueOf;
        a1 a1Var = (a1) this.f159a;
        com.google.android.gms.common.internal.i0.e(str);
        com.google.android.gms.common.internal.i0.e(str2);
        c();
        d();
        Cursor cursor = null;
        try {
            cursorQuery = v().query("events", (String[]) new ArrayList(Arrays.asList("lifetime_count", "current_bundle_count", "last_fire_timestamp", "last_bundled_timestamp", "last_bundled_day", "last_sampled_complex_event_id", "last_sampling_rate", "last_exempt_from_sampling", "current_session_count")).toArray(new String[0]), "app_id=? and name=?", new String[]{str, str2}, null, null, null);
            try {
                try {
                    if (!cursorQuery.moveToFirst()) {
                        cursorQuery.close();
                        return null;
                    }
                    long j4 = cursorQuery.getLong(0);
                    long j10 = cursorQuery.getLong(1);
                    long j11 = cursorQuery.getLong(2);
                    long j12 = cursorQuery.isNull(3) ? 0L : cursorQuery.getLong(3);
                    Long lValueOf = cursorQuery.isNull(4) ? null : Long.valueOf(cursorQuery.getLong(4));
                    Long lValueOf2 = cursorQuery.isNull(5) ? null : Long.valueOf(cursorQuery.getLong(5));
                    Long lValueOf3 = cursorQuery.isNull(6) ? null : Long.valueOf(cursorQuery.getLong(6));
                    if (cursorQuery.isNull(7)) {
                        boolValueOf = null;
                    } else {
                        boolValueOf = Boolean.valueOf(cursorQuery.getLong(7) == 1);
                    }
                    n nVar = new n(str, str2, j4, j10, cursorQuery.isNull(8) ? 0L : cursorQuery.getLong(8), j11, j12, lValueOf, lValueOf2, lValueOf3, boolValueOf);
                    if (cursorQuery.moveToNext()) {
                        i0 i0Var = a1Var.f11007t;
                        a1.f(i0Var);
                        i0Var.f11190f.c(i0.k(str), "Got multiple records for event aggregates, expected one. appId");
                    }
                    cursorQuery.close();
                    return nVar;
                } catch (SQLiteException e) {
                    e = e;
                    i0 i0Var2 = a1Var.f11007t;
                    a1.f(i0Var2);
                    i0Var2.f11190f.e("Error querying events. appId", i0.k(str), a1Var.f11011x.d(str2), e);
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                cursor = cursorQuery;
            }
        } catch (SQLiteException e4) {
            e = e4;
            cursorQuery = null;
        } catch (Throwable th2) {
            th = th2;
        }
        th = th;
        cursor = cursorQuery;
        if (cursor != null) {
            cursor.close();
        }
        throw th;
    }

    @Override // z7.w2
    public final void f() {
    }
}
