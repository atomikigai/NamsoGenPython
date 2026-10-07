package com.google.android.gms.internal.ads;

import android.app.Activity;
import g6.i;
import u3.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzedg extends zzeec {
    private final Activity zza;
    private final i zzb;
    private final String zzc;
    private final String zzd;

    public /* synthetic */ zzedg(Activity activity, i iVar, String str, String str2, zzedf zzedfVar) {
        this.zza = activity;
        this.zzb = iVar;
        this.zzc = str;
        this.zzd = str2;
    }

    public final boolean equals(Object obj) {
        i iVar;
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzeec) {
            zzeec zzeecVar = (zzeec) obj;
            if (this.zza.equals(zzeecVar.zza()) && ((iVar = this.zzb) != null ? iVar.equals(zzeecVar.zzb()) : zzeecVar.zzb() == null) && ((str = this.zzc) != null ? str.equals(zzeecVar.zzc()) : zzeecVar.zzc() == null) && ((str2 = this.zzd) != null ? str2.equals(zzeecVar.zzd()) : zzeecVar.zzd() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.zza.hashCode() ^ 1000003;
        i iVar = this.zzb;
        int iHashCode2 = ((iHashCode * 1000003) ^ (iVar == null ? 0 : iVar.hashCode())) * 1000003;
        String str = this.zzc;
        int iHashCode3 = (iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.zzd;
        return iHashCode3 ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbE = b.e("OfflineUtilsParams{activity=", this.zza.toString(), ", adOverlay=", String.valueOf(this.zzb), ", gwsQueryId=");
        sbE.append(this.zzc);
        sbE.append(", uri=");
        return q1.a.m(sbE, this.zzd, "}");
    }

    @Override // com.google.android.gms.internal.ads.zzeec
    public final Activity zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzeec
    public final i zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzeec
    public final String zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzeec
    public final String zzd() {
        return this.zzd;
    }
}
