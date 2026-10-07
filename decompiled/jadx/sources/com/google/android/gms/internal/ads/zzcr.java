package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.text.Layout;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzcr {
    private CharSequence zza;
    private Bitmap zzb;
    private Layout.Alignment zzc;
    private Layout.Alignment zzd;
    private float zze;
    private int zzf;
    private int zzg;
    private float zzh;
    private int zzi;
    private int zzj;
    private float zzk;
    private float zzl;
    private float zzm;
    private int zzn;
    private float zzo;

    public zzcr() {
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
        this.zzd = null;
        this.zze = -3.4028235E38f;
        this.zzf = Integer.MIN_VALUE;
        this.zzg = Integer.MIN_VALUE;
        this.zzh = -3.4028235E38f;
        this.zzi = Integer.MIN_VALUE;
        this.zzj = Integer.MIN_VALUE;
        this.zzk = -3.4028235E38f;
        this.zzl = -3.4028235E38f;
        this.zzm = -3.4028235E38f;
        this.zzn = Integer.MIN_VALUE;
    }

    public final int zza() {
        return this.zzg;
    }

    public final int zzb() {
        return this.zzi;
    }

    public final zzcr zzc(Bitmap bitmap) {
        this.zzb = bitmap;
        return this;
    }

    public final zzcr zzd(float f10) {
        this.zzm = f10;
        return this;
    }

    public final zzcr zze(float f10, int i) {
        this.zze = f10;
        this.zzf = i;
        return this;
    }

    public final zzcr zzf(int i) {
        this.zzg = i;
        return this;
    }

    public final zzcr zzg(Layout.Alignment alignment) {
        this.zzd = alignment;
        return this;
    }

    public final zzcr zzh(float f10) {
        this.zzh = f10;
        return this;
    }

    public final zzcr zzi(int i) {
        this.zzi = i;
        return this;
    }

    public final zzcr zzj(float f10) {
        this.zzo = f10;
        return this;
    }

    public final zzcr zzk(float f10) {
        this.zzl = f10;
        return this;
    }

    public final zzcr zzl(CharSequence charSequence) {
        this.zza = charSequence;
        return this;
    }

    public final zzcr zzm(Layout.Alignment alignment) {
        this.zzc = alignment;
        return this;
    }

    public final zzcr zzn(float f10, int i) {
        this.zzk = f10;
        this.zzj = i;
        return this;
    }

    public final zzcr zzo(int i) {
        this.zzn = i;
        return this;
    }

    public final zzct zzp() {
        return new zzct(this.zza, this.zzc, this.zzd, this.zzb, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, false, -16777216, this.zzn, this.zzo, null);
    }

    public final CharSequence zzq() {
        return this.zza;
    }

    public /* synthetic */ zzcr(zzct zzctVar, zzcs zzcsVar) {
        this.zza = zzctVar.zza;
        this.zzb = zzctVar.zzd;
        this.zzc = zzctVar.zzb;
        this.zzd = zzctVar.zzc;
        this.zze = zzctVar.zze;
        this.zzf = zzctVar.zzf;
        this.zzg = zzctVar.zzg;
        this.zzh = zzctVar.zzh;
        this.zzi = zzctVar.zzi;
        this.zzj = zzctVar.zzl;
        this.zzk = zzctVar.zzm;
        this.zzl = zzctVar.zzj;
        this.zzm = zzctVar.zzk;
        this.zzn = zzctVar.zzn;
        this.zzo = zzctVar.zzo;
    }
}
