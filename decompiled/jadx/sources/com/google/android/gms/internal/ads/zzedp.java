package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.RemoteException;
import d6.p;
import e6.t;
import h6.k0;
import h6.r0;
import h6.z;
import i6.k;
import java.util.concurrent.Callable;
import q7.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzedp extends zzfsf {
    private final Context zza;
    private final zzges zzb;

    public zzedp(Context context, zzges zzgesVar) {
        super(context, "AdMobOfflineBufferedPings.db", null, ((Integer) t.f3437d.f3440c.zza(zzbcn.zzhZ)).intValue(), zzfsh.zza);
        this.zza = context;
        this.zzb = zzgesVar;
    }

    public static /* synthetic */ Void zzb(k kVar, SQLiteDatabase sQLiteDatabase) throws Exception {
        zzj(sQLiteDatabase, kVar);
        return null;
    }

    public static /* synthetic */ void zzf(SQLiteDatabase sQLiteDatabase, String str, k kVar) throws Throwable {
        ContentValues contentValues = new ContentValues();
        contentValues.put("event_state", (Integer) 1);
        sQLiteDatabase.update("offline_buffered_pings", contentValues, "gws_query_id = ?", new String[]{str});
        zzj(sQLiteDatabase, kVar);
    }

    public static final void zzi(SQLiteDatabase sQLiteDatabase, String str) {
        sQLiteDatabase.delete("offline_buffered_pings", "gws_query_id = ? AND event_state = ?", new String[]{str, Integer.toString(0)});
    }

    private static void zzj(SQLiteDatabase sQLiteDatabase, k kVar) throws Throwable {
        SQLiteDatabase sQLiteDatabase2;
        String string;
        sQLiteDatabase.beginTransaction();
        try {
            sQLiteDatabase2 = sQLiteDatabase;
            try {
                Cursor cursorQuery = sQLiteDatabase2.query("offline_buffered_pings", new String[]{"timestamp", "url"}, "event_state = 1", null, null, null, "timestamp ASC", null);
                int count = cursorQuery.getCount();
                String[] strArr = new String[count];
                int i = 0;
                while (cursorQuery.moveToNext()) {
                    int columnIndex = cursorQuery.getColumnIndex("timestamp");
                    int columnIndex2 = cursorQuery.getColumnIndex("url");
                    if (columnIndex2 != -1) {
                        long j4 = cursorQuery.getLong(columnIndex);
                        String string2 = cursorQuery.getString(columnIndex2);
                        if (string2 == null) {
                            string = "";
                        } else {
                            Uri uri = Uri.parse(string2);
                            p.C.f2983j.getClass();
                            string = uri.buildUpon().appendQueryParameter("bd", Long.toString(System.currentTimeMillis() - j4)).build().toString();
                        }
                        strArr[i] = string;
                    }
                    i++;
                }
                cursorQuery.close();
                sQLiteDatabase2.delete("offline_buffered_pings", "event_state = ?", new String[]{Integer.toString(1)});
                sQLiteDatabase2.setTransactionSuccessful();
                sQLiteDatabase2.endTransaction();
                for (int i10 = 0; i10 < count; i10++) {
                    kVar.zza(strArr[i10]);
                }
            } catch (Throwable th) {
                th = th;
                Throwable th2 = th;
                sQLiteDatabase2.endTransaction();
                throw th2;
            }
        } catch (Throwable th3) {
            th = th3;
            sQLiteDatabase2 = sQLiteDatabase;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE offline_buffered_pings (timestamp INTEGER PRIMARY_KEY, gws_query_id TEXT, url TEXT, event_state INTEGER)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i10) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i10) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }

    public final Void zza(zzedr zzedrVar, SQLiteDatabase sQLiteDatabase) throws Exception {
        ContentValues contentValues = new ContentValues();
        contentValues.put("timestamp", Long.valueOf(zzedrVar.zza));
        contentValues.put("gws_query_id", zzedrVar.zzb);
        contentValues.put("url", zzedrVar.zzc);
        contentValues.put("event_state", Integer.valueOf(zzedrVar.zzd - 1));
        sQLiteDatabase.insert("offline_buffered_pings", null, contentValues);
        r0 r0Var = p.C.f2979c;
        z zVarJ = r0.J(this.zza);
        if (zVarJ != null) {
            try {
                zVarJ.zze(new b(this.zza));
            } catch (RemoteException e) {
                k0.l("Failed to schedule offline ping sender.", e);
            }
        }
        return null;
    }

    public final void zzc(final String str) {
        zze(new zzfiv(this) { // from class: com.google.android.gms.internal.ads.zzedn
            @Override // com.google.android.gms.internal.ads.zzfiv
            public final Object zza(Object obj) {
                zzedp.zzi((SQLiteDatabase) obj, str);
                return null;
            }
        });
    }

    public final void zzd(final zzedr zzedrVar) {
        zze(new zzfiv() { // from class: com.google.android.gms.internal.ads.zzedj
            @Override // com.google.android.gms.internal.ads.zzfiv
            public final Object zza(Object obj) throws Exception {
                this.zza.zza(zzedrVar, (SQLiteDatabase) obj);
                return null;
            }
        });
    }

    public final void zze(zzfiv zzfivVar) {
        zzgei.zzr(this.zzb.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzedl
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.getWritableDatabase();
            }
        }), new zzedo(this, zzfivVar), this.zzb);
    }

    public final void zzg(final SQLiteDatabase sQLiteDatabase, final k kVar, final String str) {
        this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzedm
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                zzedp.zzf(sQLiteDatabase, str, kVar);
            }
        });
    }

    public final void zzh(final k kVar, final String str) {
        zze(new zzfiv() { // from class: com.google.android.gms.internal.ads.zzedk
            @Override // com.google.android.gms.internal.ads.zzfiv
            public final Object zza(Object obj) {
                this.zza.zzg((SQLiteDatabase) obj, kVar, str);
                return null;
            }
        });
    }
}
