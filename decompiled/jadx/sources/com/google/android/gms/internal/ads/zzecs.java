package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import i6.h;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzecs implements zzgee {
    final /* synthetic */ boolean zza;
    final /* synthetic */ zzect zzb;

    public zzecs(zzect zzectVar, boolean z4) {
        this.zza = z4;
        this.zzb = zzectVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgee
    public final void zza(Throwable th) {
        h.d("Failed to get signals bundle");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:22:0x0059  */
    /* JADX WARN: Code duplicated, block: B:25:0x0067  */
    /* JADX WARN: Code duplicated, block: B:27:0x006f  */
    /* JADX WARN: Code duplicated, block: B:28:0x0072  */
    /* JADX WARN: Code duplicated, block: B:30:0x007a  */
    /* JADX WARN: Code duplicated, block: B:31:0x007d  */
    /* JADX WARN: Code duplicated, block: B:33:0x0085  */
    /* JADX WARN: Code duplicated, block: B:34:0x0088  */
    /* JADX WARN: Code duplicated, block: B:36:0x0090  */
    /* JADX WARN: Code duplicated, block: B:37:0x0093  */
    @Override // com.google.android.gms.internal.ads.zzgee
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        List listUnmodifiableList;
        List listAsList;
        final ArrayList arrayList;
        Iterator it;
        zzbbs.zzd.zza zzaVar;
        Bundle bundle = (Bundle) obj;
        if (this.zzb.zzf()) {
            return;
        }
        Object obj2 = bundle.get("ad_types");
        if (!(obj2 instanceof List)) {
            if (obj2 instanceof String[]) {
                listAsList = Arrays.asList((String[]) obj2);
            } else {
                listUnmodifiableList = Collections.EMPTY_LIST;
            }
            arrayList = new ArrayList();
            it = listUnmodifiableList.iterator();
            while (it.hasNext()) {
                switch ((String) it.next()) {
                    case "banner":
                        zzaVar = zzbbs.zzd.zza.BANNER;
                        break;
                    case "native":
                        zzaVar = zzbbs.zzd.zza.NATIVE_APP_INSTALL;
                        break;
                    case "rewarded":
                        zzaVar = zzbbs.zzd.zza.REWARD_BASED_VIDEO_AD;
                        break;
                    case "interstitial":
                        zzaVar = zzbbs.zzd.zza.INTERSTITIAL;
                        break;
                    default:
                        zzaVar = zzbbs.zzd.zza.AD_FORMAT_TYPE_UNSPECIFIED;
                        break;
                }
                arrayList.add(zzaVar);
            }
            final zzbbs.zzaf.zzd zzdVarZzb = zzect.zzb(this.zzb, bundle);
            final zzbbs.zzab zzabVarZza = zzect.zza(this.zzb, bundle);
            zzect zzectVar = this.zzb;
            zzectVar.zza.zza(new zzfiv() { // from class: com.google.android.gms.internal.ads.zzecr
                @Override // com.google.android.gms.internal.ads.zzfiv
                public final Object zza(Object obj3) {
                    zzecs zzecsVar = this.zza;
                    SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj3;
                    if (zzecsVar.zzb.zzf()) {
                        return null;
                    }
                    zzbbs.zzaf.zzd zzdVar = zzdVarZzb;
                    zzbbs.zzab zzabVar = zzabVarZza;
                    ArrayList arrayList2 = arrayList;
                    zzect zzectVar2 = zzecsVar.zzb;
                    boolean z4 = zzecsVar.zza;
                    byte[] bArrZze = zzect.zze(zzectVar2, z4, arrayList2, zzabVar, zzdVar);
                    zzecw.zzf(sQLiteDatabase, z4, true);
                    zzecw.zzc(sQLiteDatabase, zzecsVar.zzb.zzf.zzd(), bArrZze);
                    return null;
                }
            });
        }
        listAsList = (List) obj2;
        ArrayList arrayList2 = new ArrayList(listAsList.size());
        for (Object obj3 : listAsList) {
            if (obj3 instanceof String) {
                arrayList2.add((String) obj3);
            }
        }
        listUnmodifiableList = Collections.unmodifiableList(arrayList2);
        arrayList = new ArrayList();
        it = listUnmodifiableList.iterator();
        while (it.hasNext()) {
            switch ((String) it.next()) {
                case -1396342996:
                    if (!r2.equals("banner")) {
                        zzaVar = zzbbs.zzd.zza.BANNER;
                    } else {
                        zzaVar = zzbbs.zzd.zza.AD_FORMAT_TYPE_UNSPECIFIED;
                    }
                    break;
                case -1052618729:
                    if (!r2.equals("native")) {
                        zzaVar = zzbbs.zzd.zza.NATIVE_APP_INSTALL;
                    } else {
                        zzaVar = zzbbs.zzd.zza.AD_FORMAT_TYPE_UNSPECIFIED;
                    }
                    break;
                case -239580146:
                    if (!r2.equals("rewarded")) {
                        zzaVar = zzbbs.zzd.zza.REWARD_BASED_VIDEO_AD;
                    } else {
                        zzaVar = zzbbs.zzd.zza.AD_FORMAT_TYPE_UNSPECIFIED;
                    }
                    break;
                case 604727084:
                    if (!r2.equals("interstitial")) {
                        zzaVar = zzbbs.zzd.zza.INTERSTITIAL;
                    } else {
                        zzaVar = zzbbs.zzd.zza.AD_FORMAT_TYPE_UNSPECIFIED;
                    }
                    break;
                default:
                    zzaVar = zzbbs.zzd.zza.AD_FORMAT_TYPE_UNSPECIFIED;
                    break;
            }
            arrayList.add(zzaVar);
        }
        final zzbbs.zzaf.zzd zzdVarZzb2 = zzect.zzb(this.zzb, bundle);
        final zzbbs.zzab zzabVarZza2 = zzect.zza(this.zzb, bundle);
        zzect zzectVar2 = this.zzb;
        zzectVar2.zza.zza(new zzfiv() { // from class: com.google.android.gms.internal.ads.zzecr
            @Override // com.google.android.gms.internal.ads.zzfiv
            public final Object zza(Object obj4) {
                zzecs zzecsVar = this.zza;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj4;
                if (zzecsVar.zzb.zzf()) {
                    return null;
                }
                zzbbs.zzaf.zzd zzdVar = zzdVarZzb2;
                zzbbs.zzab zzabVar = zzabVarZza2;
                ArrayList arrayList3 = arrayList;
                zzect zzectVar3 = zzecsVar.zzb;
                boolean z4 = zzecsVar.zza;
                byte[] bArrZze = zzect.zze(zzectVar3, z4, arrayList3, zzabVar, zzdVar);
                zzecw.zzf(sQLiteDatabase, z4, true);
                zzecw.zzc(sQLiteDatabase, zzecsVar.zzb.zzf.zzd(), bArrZze);
                return null;
            }
        });
    }
}
