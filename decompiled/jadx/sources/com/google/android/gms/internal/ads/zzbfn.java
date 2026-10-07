package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.bumptech.glide.d;
import e6.l3;
import n6.g;
import n6.h;
import w5.x;
import z5.e;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbfn extends h7.a {
    public static final Parcelable.Creator<zzbfn> CREATOR = new zzbfo();
    public final int zza;
    public final boolean zzb;
    public final int zzc;
    public final boolean zzd;
    public final int zze;
    public final l3 zzf;
    public final boolean zzg;
    public final int zzh;
    public final int zzi;
    public final boolean zzj;
    public final int zzk;

    public zzbfn(int i, boolean z4, int i10, boolean z10, int i11, l3 l3Var, boolean z11, int i12, int i13, boolean z12, int i14) {
        this.zza = i;
        this.zzb = z4;
        this.zzc = i10;
        this.zzd = z10;
        this.zze = i11;
        this.zzf = l3Var;
        this.zzg = z11;
        this.zzh = i12;
        this.zzj = z12;
        this.zzi = i13;
        this.zzk = i14;
    }

    public static h zza(zzbfn zzbfnVar) {
        g gVar = new g();
        gVar.f7288a = false;
        gVar.f7289b = 0;
        gVar.f7290c = false;
        int i = 1;
        gVar.e = 1;
        gVar.f7292f = false;
        gVar.f7293g = false;
        gVar.h = 0;
        gVar.i = 1;
        if (zzbfnVar == null) {
            return new h(gVar);
        }
        int i10 = zzbfnVar.zza;
        if (i10 == 2) {
            gVar.e = zzbfnVar.zze;
        } else {
            if (i10 != 3) {
                if (i10 == 4) {
                    gVar.f7292f = zzbfnVar.zzg;
                    gVar.f7289b = zzbfnVar.zzh;
                    int i11 = zzbfnVar.zzi;
                    gVar.f7293g = zzbfnVar.zzj;
                    gVar.h = i11;
                    int i12 = zzbfnVar.zzk;
                    if (i12 != 0) {
                        if (i12 == 2) {
                            i = 3;
                        } else if (i12 == 1) {
                            i = 2;
                        }
                    }
                    gVar.i = i;
                }
            }
            l3 l3Var = zzbfnVar.zzf;
            if (l3Var != null) {
                gVar.f7291d = new x(l3Var);
            }
            gVar.e = zzbfnVar.zze;
        }
        gVar.f7288a = zzbfnVar.zzb;
        gVar.f7290c = zzbfnVar.zzd;
        return new h(gVar);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i10 = this.zza;
        int iP = d.P(20293, parcel);
        d.R(parcel, 1, 4);
        parcel.writeInt(i10);
        boolean z4 = this.zzb;
        d.R(parcel, 2, 4);
        parcel.writeInt(z4 ? 1 : 0);
        int i11 = this.zzc;
        d.R(parcel, 3, 4);
        parcel.writeInt(i11);
        boolean z10 = this.zzd;
        d.R(parcel, 4, 4);
        parcel.writeInt(z10 ? 1 : 0);
        int i12 = this.zze;
        d.R(parcel, 5, 4);
        parcel.writeInt(i12);
        d.J(parcel, 6, this.zzf, i, false);
        boolean z11 = this.zzg;
        d.R(parcel, 7, 4);
        parcel.writeInt(z11 ? 1 : 0);
        int i13 = this.zzh;
        d.R(parcel, 8, 4);
        parcel.writeInt(i13);
        int i14 = this.zzi;
        d.R(parcel, 9, 4);
        parcel.writeInt(i14);
        boolean z12 = this.zzj;
        d.R(parcel, 10, 4);
        parcel.writeInt(z12 ? 1 : 0);
        int i15 = this.zzk;
        d.R(parcel, 11, 4);
        parcel.writeInt(i15);
        d.Q(iP, parcel);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @Deprecated
    public zzbfn(e eVar) {
        boolean z4 = eVar.f10976a;
        int i = eVar.f10977b;
        boolean z10 = eVar.f10979d;
        int i10 = eVar.e;
        x xVar = eVar.f10980f;
        this(4, z4, i, z10, i10, xVar != null ? new l3(xVar) : null, eVar.f10981g, eVar.f10978c, 0, false, 0);
    }
}
