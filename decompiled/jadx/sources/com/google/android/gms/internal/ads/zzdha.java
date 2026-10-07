package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import i6.h;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzdha implements zzcwm, zzddq {
    private final zzbyr zza;
    private final Context zzb;
    private final zzbyv zzc;
    private final View zzd;
    private String zze;
    private final zzbbs.zza.EnumC0000zza zzf;

    public zzdha(zzbyr zzbyrVar, Context context, zzbyv zzbyvVar, View view, zzbbs.zza.EnumC0000zza enumC0000zza) {
        this.zza = zzbyrVar;
        this.zzb = context;
        this.zzc = zzbyvVar;
        this.zzd = view;
        this.zzf = enumC0000zza;
    }

    @Override // com.google.android.gms.internal.ads.zzcwm
    public final void zza() {
        this.zza.zzb(false);
    }

    @Override // com.google.android.gms.internal.ads.zzcwm
    public final void zzc() {
        View view = this.zzd;
        if (view != null && this.zze != null) {
            this.zzc.zzo(view.getContext(), this.zze);
        }
        this.zza.zzb(true);
    }

    @Override // com.google.android.gms.internal.ads.zzcwm
    public final void zzds(zzbwj zzbwjVar, String str, String str2) {
        if (this.zzc.zzp(this.zzb)) {
            try {
                zzbyv zzbyvVar = this.zzc;
                Context context = this.zzb;
                zzbyvVar.zzl(context, zzbyvVar.zza(context), this.zza.zza(), zzbwjVar.zzc(), zzbwjVar.zzb());
            } catch (RemoteException e) {
                h.h("Remote Exception to get reward item.", e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddq
    public final void zzl() {
        if (this.zzf == zzbbs.zza.EnumC0000zza.APP_OPEN) {
            return;
        }
        String strZzc = this.zzc.zzc(this.zzb);
        this.zze = strZzc;
        this.zze = String.valueOf(strZzc).concat(this.zzf == zzbbs.zza.EnumC0000zza.REWARD_BASED_VIDEO_AD ? "/Rewarded" : "/Interstitial");
    }

    @Override // com.google.android.gms.internal.ads.zzcwm
    public final void zzb() {
    }

    @Override // com.google.android.gms.internal.ads.zzcwm
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.zzcwm
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzddq
    public final void zzk() {
    }
}
