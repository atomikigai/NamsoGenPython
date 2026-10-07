package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.bumptech.glide.d;
import e6.t;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzfhj extends h7.a {
    public static final Parcelable.Creator<zzfhj> CREATOR = new zzfhk();
    public final Context zza;
    public final zzfhg zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final String zzf;
    public final int zzg;
    private final zzfhg[] zzh;
    private final int zzi;
    private final int zzj;
    private final int zzk;
    private final int[] zzl;
    private final int[] zzm;

    public zzfhj(int i, int i10, int i11, int i12, String str, int i13, int i14) {
        zzfhg[] zzfhgVarArrValues = zzfhg.values();
        this.zzh = zzfhgVarArrValues;
        int[] iArrZza = zzfhh.zza();
        this.zzl = iArrZza;
        int[] iArrZza2 = zzfhi.zza();
        this.zzm = iArrZza2;
        this.zza = null;
        this.zzi = i;
        this.zzb = zzfhgVarArrValues[i];
        this.zzc = i10;
        this.zzd = i11;
        this.zze = i12;
        this.zzf = str;
        this.zzj = i13;
        this.zzg = iArrZza[i13];
        this.zzk = i14;
        int i15 = iArrZza2[i14];
    }

    public static zzfhj zza(zzfhg zzfhgVar, Context context) {
        if (zzfhgVar == zzfhg.Rewarded) {
            zzbce zzbceVar = zzbcn.zzgj;
            t tVar = t.f3437d;
            return new zzfhj(context, zzfhgVar, ((Integer) tVar.f3440c.zza(zzbceVar)).intValue(), ((Integer) tVar.f3440c.zza(zzbcn.zzgp)).intValue(), ((Integer) tVar.f3440c.zza(zzbcn.zzgr)).intValue(), (String) tVar.f3440c.zza(zzbcn.zzgt), (String) tVar.f3440c.zza(zzbcn.zzgl), (String) tVar.f3440c.zza(zzbcn.zzgn));
        }
        if (zzfhgVar == zzfhg.Interstitial) {
            zzbce zzbceVar2 = zzbcn.zzgk;
            t tVar2 = t.f3437d;
            return new zzfhj(context, zzfhgVar, ((Integer) tVar2.f3440c.zza(zzbceVar2)).intValue(), ((Integer) tVar2.f3440c.zza(zzbcn.zzgq)).intValue(), ((Integer) tVar2.f3440c.zza(zzbcn.zzgs)).intValue(), (String) tVar2.f3440c.zza(zzbcn.zzgu), (String) tVar2.f3440c.zza(zzbcn.zzgm), (String) tVar2.f3440c.zza(zzbcn.zzgo));
        }
        if (zzfhgVar != zzfhg.AppOpen) {
            return null;
        }
        zzbce zzbceVar3 = zzbcn.zzgx;
        t tVar3 = t.f3437d;
        return new zzfhj(context, zzfhgVar, ((Integer) tVar3.f3440c.zza(zzbceVar3)).intValue(), ((Integer) tVar3.f3440c.zza(zzbcn.zzgz)).intValue(), ((Integer) tVar3.f3440c.zza(zzbcn.zzgA)).intValue(), (String) tVar3.f3440c.zza(zzbcn.zzgv), (String) tVar3.f3440c.zza(zzbcn.zzgw), (String) tVar3.f3440c.zza(zzbcn.zzgy));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i10 = this.zzi;
        int iP = d.P(20293, parcel);
        d.R(parcel, 1, 4);
        parcel.writeInt(i10);
        int i11 = this.zzc;
        d.R(parcel, 2, 4);
        parcel.writeInt(i11);
        int i12 = this.zzd;
        d.R(parcel, 3, 4);
        parcel.writeInt(i12);
        int i13 = this.zze;
        d.R(parcel, 4, 4);
        parcel.writeInt(i13);
        d.K(parcel, 5, this.zzf, false);
        int i14 = this.zzj;
        d.R(parcel, 6, 4);
        parcel.writeInt(i14);
        int i15 = this.zzk;
        d.R(parcel, 7, 4);
        parcel.writeInt(i15);
        d.Q(iP, parcel);
    }

    private zzfhj(Context context, zzfhg zzfhgVar, int i, int i10, int i11, String str, String str2, String str3) {
        int i12;
        this.zzh = zzfhg.values();
        this.zzl = zzfhh.zza();
        this.zzm = zzfhi.zza();
        this.zza = context;
        this.zzi = zzfhgVar.ordinal();
        this.zzb = zzfhgVar;
        this.zzc = i;
        this.zzd = i10;
        this.zze = i11;
        this.zzf = str;
        if ("oldest".equals(str2)) {
            i12 = 1;
        } else {
            i12 = (!"lru".equals(str2) && "lfu".equals(str2)) ? 3 : 2;
        }
        this.zzg = i12;
        this.zzj = i12 - 1;
        "onAdClosed".equals(str3);
        this.zzk = 0;
    }
}
