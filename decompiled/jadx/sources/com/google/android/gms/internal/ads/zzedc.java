package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import d6.p;
import i6.h;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzedc {
    private final zzbbl zza;
    private final Context zzb;
    private final zzech zzc;
    private final i6.a zzd;

    public zzedc(Context context, i6.a aVar, zzbbl zzbblVar, zzech zzechVar) {
        this.zzb = context;
        this.zzd = aVar;
        this.zza = zzbblVar;
        this.zzc = zzechVar;
    }

    public final Void zza(boolean z4, SQLiteDatabase sQLiteDatabase) throws Exception {
        if (z4) {
            this.zzb.deleteDatabase("OfflineUpload.db");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = sQLiteDatabase.query("offline_signal_contents", new String[]{"serialized_proto_data"}, null, null, null, null, null);
        while (cursorQuery.moveToNext()) {
            try {
                arrayList.add(zzbbs.zzaf.zza.zzx(cursorQuery.getBlob(cursorQuery.getColumnIndexOrThrow("serialized_proto_data"))));
            } catch (zzgzm e) {
                h.d("Unable to deserialize proto from offline signals database:");
                h.d(e.getMessage());
            }
        }
        cursorQuery.close();
        Context context = this.zzb;
        zzbbs.zzaf.zzc zzcVarZzi = zzbbs.zzaf.zzi();
        zzcVarZzi.zzv(context.getPackageName());
        zzcVarZzi.zzy(Build.MODEL);
        zzcVarZzi.zzA(zzecw.zza(sQLiteDatabase, 0));
        zzcVarZzi.zzh(arrayList);
        zzcVarZzi.zzE(zzecw.zza(sQLiteDatabase, 1));
        zzcVarZzi.zzx(zzecw.zza(sQLiteDatabase, 3));
        p.C.f2983j.getClass();
        zzcVarZzi.zzF(System.currentTimeMillis());
        zzcVarZzi.zzB(zzecw.zzb(sQLiteDatabase, 2));
        final zzbbs.zzaf zzafVarZzbr = zzcVarZzi.zzbr();
        int size = arrayList.size();
        long jZze = 0;
        for (int i = 0; i < size; i++) {
            zzbbs.zzaf.zza zzaVar = (zzbbs.zzaf.zza) arrayList.get(i);
            if (zzaVar.zzk() == zzbbs.zzq.ENUM_TRUE && zzaVar.zze() > jZze) {
                jZze = zzaVar.zze();
            }
        }
        if (jZze != 0) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("value", Long.valueOf(jZze));
            sQLiteDatabase.update("offline_signal_statistics", contentValues, "statistic_name = 'last_successful_request_time'", null);
        }
        this.zza.zzb(new zzbbk() { // from class: com.google.android.gms.internal.ads.zzeda
            @Override // com.google.android.gms.internal.ads.zzbbk
            public final void zza(zzbbs.zzt.zza zzaVar2) {
                zzaVar2.zzW(zzafVarZzbr);
            }
        });
        i6.a aVar = this.zzd;
        zzbbs.zzar.zza zzaVarZzd = zzbbs.zzar.zzd();
        zzaVarZzd.zzg(aVar.f5214b);
        zzaVarZzd.zzi(this.zzd.f5215c);
        zzaVarZzd.zzh(true != this.zzd.f5216d ? 2 : 0);
        final zzbbs.zzar zzarVarZzbr = zzaVarZzd.zzbr();
        this.zza.zzb(new zzbbk() { // from class: com.google.android.gms.internal.ads.zzedb
            @Override // com.google.android.gms.internal.ads.zzbbk
            public final void zza(zzbbs.zzt.zza zzaVar2) {
                zzbbs.zzm.zza zzaVarZzbM = zzaVar2.zzg().zzbM();
                zzaVarZzbM.zzw(zzarVarZzbr);
                zzaVar2.zzK(zzaVarZzbM);
            }
        });
        this.zza.zzc(10004);
        zzecw.zze(sQLiteDatabase);
        return null;
    }

    public final void zzb(final boolean z4) {
        try {
            this.zzc.zza(new zzfiv() { // from class: com.google.android.gms.internal.ads.zzecz
                @Override // com.google.android.gms.internal.ads.zzfiv
                public final Object zza(Object obj) throws Exception {
                    this.zza.zza(z4, (SQLiteDatabase) obj);
                    return null;
                }
            });
        } catch (Exception e) {
            h.d("Error in offline signals database startup: ".concat(String.valueOf(e.getMessage())));
        }
    }
}
