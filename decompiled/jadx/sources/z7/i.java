package z7;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.SystemClock;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11186a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a4.l f11187b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, Context context) {
        super(context, "google_app_measurement.db", (SQLiteDatabase.CursorFactory) null, 1);
        this.f11187b = jVar;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getWritableDatabase() {
        switch (this.f11186a) {
            case 0:
                j jVar = (j) this.f11187b;
                d6.e eVar = jVar.e;
                a1 a1Var = (a1) jVar.f159a;
                a1Var.getClass();
                if (eVar.f2935b != 0) {
                    ((n7.b) ((n7.a) eVar.f2936c)).getClass();
                    if (SystemClock.elapsedRealtime() - eVar.f2935b < 3600000) {
                        throw new SQLiteException("Database open failed");
                    }
                }
                try {
                    return super.getWritableDatabase();
                } catch (SQLiteException unused) {
                    ((n7.b) ((n7.a) eVar.f2936c)).getClass();
                    eVar.f2935b = SystemClock.elapsedRealtime();
                    i0 i0Var = a1Var.f11007t;
                    a1.f(i0Var);
                    i0Var.f11190f.b("Opening the database failed, dropping and recreating it");
                    a1Var.getClass();
                    if (!a1Var.f11000a.getDatabasePath("google_app_measurement.db").delete()) {
                        i0 i0Var2 = a1Var.f11007t;
                        a1.f(i0Var2);
                        i0Var2.f11190f.c("google_app_measurement.db", "Failed to delete corrupted db file");
                    }
                    try {
                        SQLiteDatabase writableDatabase = super.getWritableDatabase();
                        eVar.f2935b = 0L;
                        return writableDatabase;
                    } catch (SQLiteException e) {
                        i0 i0Var3 = a1Var.f11007t;
                        a1.f(i0Var3);
                        i0Var3.f11190f.c(e, "Failed to open freshly created database");
                        throw e;
                    }
                }
            default:
                d0 d0Var = (d0) this.f11187b;
                try {
                    return super.getWritableDatabase();
                } catch (SQLiteDatabaseLockedException e4) {
                    throw e4;
                } catch (SQLiteException unused2) {
                    i0 i0Var4 = ((a1) d0Var.f159a).f11007t;
                    a1.f(i0Var4);
                    i0Var4.f11190f.b("Opening the local database failed, dropping and recreating it");
                    ((a1) d0Var.f159a).getClass();
                    if (!((a1) d0Var.f159a).f11000a.getDatabasePath("google_app_measurement_local.db").delete()) {
                        i0 i0Var5 = ((a1) d0Var.f159a).f11007t;
                        a1.f(i0Var5);
                        i0Var5.f11190f.c("google_app_measurement_local.db", "Failed to delete corrupted local db file");
                    }
                    try {
                        return super.getWritableDatabase();
                    } catch (SQLiteException e10) {
                        i0 i0Var6 = ((a1) d0Var.f159a).f11007t;
                        a1.f(i0Var6);
                        i0Var6.f11190f.c(e10, "Failed to open local database. Events will bypass local storage");
                        return null;
                    }
                }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        switch (this.f11186a) {
            case 0:
                i0 i0Var = ((a1) ((j) this.f11187b).f159a).f11007t;
                a1.f(i0Var);
                k1.h(i0Var, sQLiteDatabase);
                break;
            default:
                i0 i0Var2 = ((a1) ((d0) this.f11187b).f159a).f11007t;
                a1.f(i0Var2);
                k1.h(i0Var2, sQLiteDatabase);
                break;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i10) {
        int i11 = this.f11186a;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) throws Throwable {
        switch (this.f11186a) {
            case 0:
                j jVar = (j) this.f11187b;
                i0 i0Var = ((a1) jVar.f159a).f11007t;
                a1.f(i0Var);
                k1.c(i0Var, sQLiteDatabase, "events", "CREATE TABLE IF NOT EXISTS events ( app_id TEXT NOT NULL, name TEXT NOT NULL, lifetime_count INTEGER NOT NULL, current_bundle_count INTEGER NOT NULL, last_fire_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,lifetime_count,current_bundle_count,last_fire_timestamp", j.f11205f);
                i0 i0Var2 = ((a1) jVar.f159a).f11007t;
                a1.f(i0Var2);
                k1.c(i0Var2, sQLiteDatabase, "conditional_properties", "CREATE TABLE IF NOT EXISTS conditional_properties ( app_id TEXT NOT NULL, origin TEXT NOT NULL, name TEXT NOT NULL, value BLOB NOT NULL, creation_timestamp INTEGER NOT NULL, active INTEGER NOT NULL, trigger_event_name TEXT, trigger_timeout INTEGER NOT NULL, timed_out_event BLOB,triggered_event BLOB, triggered_timestamp INTEGER NOT NULL, time_to_live INTEGER NOT NULL, expired_event BLOB, PRIMARY KEY (app_id, name)) ;", "app_id,origin,name,value,active,trigger_event_name,trigger_timeout,creation_timestamp,timed_out_event,triggered_event,triggered_timestamp,time_to_live,expired_event", null);
                i0 i0Var3 = ((a1) jVar.f159a).f11007t;
                a1.f(i0Var3);
                k1.c(i0Var3, sQLiteDatabase, "user_attributes", "CREATE TABLE IF NOT EXISTS user_attributes ( app_id TEXT NOT NULL, name TEXT NOT NULL, set_timestamp INTEGER NOT NULL, value BLOB NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,set_timestamp,value", j.f11206r);
                i0 i0Var4 = ((a1) jVar.f159a).f11007t;
                a1.f(i0Var4);
                k1.c(i0Var4, sQLiteDatabase, "apps", "CREATE TABLE IF NOT EXISTS apps ( app_id TEXT NOT NULL, app_instance_id TEXT, gmp_app_id TEXT, resettable_device_id_hash TEXT, last_bundle_index INTEGER NOT NULL, last_bundle_end_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id)) ;", "app_id,app_instance_id,gmp_app_id,resettable_device_id_hash,last_bundle_index,last_bundle_end_timestamp", j.f11207s);
                i0 i0Var5 = ((a1) jVar.f159a).f11007t;
                a1.f(i0Var5);
                k1.c(i0Var5, sQLiteDatabase, "queue", "CREATE TABLE IF NOT EXISTS queue ( app_id TEXT NOT NULL, bundle_end_timestamp INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,bundle_end_timestamp,data", j.f11209u);
                i0 i0Var6 = ((a1) jVar.f159a).f11007t;
                a1.f(i0Var6);
                k1.c(i0Var6, sQLiteDatabase, "raw_events_metadata", "CREATE TABLE IF NOT EXISTS raw_events_metadata ( app_id TEXT NOT NULL, metadata_fingerprint INTEGER NOT NULL, metadata BLOB NOT NULL, PRIMARY KEY (app_id, metadata_fingerprint));", "app_id,metadata_fingerprint,metadata", null);
                i0 i0Var7 = ((a1) jVar.f159a).f11007t;
                a1.f(i0Var7);
                k1.c(i0Var7, sQLiteDatabase, "raw_events", "CREATE TABLE IF NOT EXISTS raw_events ( app_id TEXT NOT NULL, name TEXT NOT NULL, timestamp INTEGER NOT NULL, metadata_fingerprint INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,name,timestamp,metadata_fingerprint,data", j.f11208t);
                i0 i0Var8 = ((a1) jVar.f159a).f11007t;
                a1.f(i0Var8);
                k1.c(i0Var8, sQLiteDatabase, "event_filters", "CREATE TABLE IF NOT EXISTS event_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, event_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, event_name, audience_id, filter_id));", "app_id,audience_id,filter_id,event_name,data", j.f11210v);
                i0 i0Var9 = ((a1) jVar.f159a).f11007t;
                a1.f(i0Var9);
                k1.c(i0Var9, sQLiteDatabase, "property_filters", "CREATE TABLE IF NOT EXISTS property_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, property_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, property_name, audience_id, filter_id));", "app_id,audience_id,filter_id,property_name,data", j.f11211w);
                i0 i0Var10 = ((a1) jVar.f159a).f11007t;
                a1.f(i0Var10);
                k1.c(i0Var10, sQLiteDatabase, "audience_filter_values", "CREATE TABLE IF NOT EXISTS audience_filter_values ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, current_results BLOB, PRIMARY KEY (app_id, audience_id));", "app_id,audience_id,current_results", null);
                i0 i0Var11 = ((a1) jVar.f159a).f11007t;
                a1.f(i0Var11);
                k1.c(i0Var11, sQLiteDatabase, "app2", "CREATE TABLE IF NOT EXISTS app2 ( app_id TEXT NOT NULL, first_open_count INTEGER NOT NULL, PRIMARY KEY (app_id));", "app_id,first_open_count", j.f11212x);
                i0 i0Var12 = ((a1) jVar.f159a).f11007t;
                a1.f(i0Var12);
                k1.c(i0Var12, sQLiteDatabase, "main_event_params", "CREATE TABLE IF NOT EXISTS main_event_params ( app_id TEXT NOT NULL, event_id TEXT NOT NULL, children_to_process INTEGER NOT NULL, main_event BLOB NOT NULL, PRIMARY KEY (app_id));", "app_id,event_id,children_to_process,main_event", null);
                i0 i0Var13 = ((a1) jVar.f159a).f11007t;
                a1.f(i0Var13);
                k1.c(i0Var13, sQLiteDatabase, "default_event_params", "CREATE TABLE IF NOT EXISTS default_event_params ( app_id TEXT NOT NULL, parameters BLOB NOT NULL, PRIMARY KEY (app_id));", "app_id,parameters", null);
                i0 i0Var14 = ((a1) jVar.f159a).f11007t;
                a1.f(i0Var14);
                k1.c(i0Var14, sQLiteDatabase, "consent_settings", "CREATE TABLE IF NOT EXISTS consent_settings ( app_id TEXT NOT NULL, consent_state TEXT NOT NULL, PRIMARY KEY (app_id));", "app_id,consent_state", null);
                break;
            default:
                i0 i0Var15 = ((a1) ((d0) this.f11187b).f159a).f11007t;
                a1.f(i0Var15);
                k1.c(i0Var15, sQLiteDatabase, "messages", "create table if not exists messages ( type INTEGER NOT NULL, entry BLOB NOT NULL)", "type,entry", null);
                break;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i10) {
        int i11 = this.f11186a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(d0 d0Var, Context context) {
        super(context, "google_app_measurement_local.db", (SQLiteDatabase.CursorFactory) null, 1);
        this.f11187b = d0Var;
    }

    private final void c(SQLiteDatabase sQLiteDatabase, int i, int i10) {
    }

    private final void d(SQLiteDatabase sQLiteDatabase, int i, int i10) {
    }

    private final void g(SQLiteDatabase sQLiteDatabase, int i, int i10) {
    }

    private final void o(SQLiteDatabase sQLiteDatabase, int i, int i10) {
    }
}
