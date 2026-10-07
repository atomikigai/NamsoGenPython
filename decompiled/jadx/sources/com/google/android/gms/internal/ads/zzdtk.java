package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.SystemClock;
import d6.p;
import e6.h2;
import h6.k0;
import java.util.Collections;
import java.util.List;
import x5.e;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzdtk implements e, zzczj, e6.a, zzcwm, zzcxg, zzcxh, zzcya, zzcwp, zzfjs {
    private final List zza;
    private final zzdsy zzb;
    private long zzc;

    public zzdtk(zzdsy zzdsyVar, zzchk zzchkVar) {
        this.zzb = zzdsyVar;
        this.zza = Collections.singletonList(zzchkVar);
    }

    private final void zzg(Class cls, String str, Object... objArr) {
        this.zzb.zza(this.zza, "Event-".concat(cls.getSimpleName()), str, objArr);
    }

    @Override // e6.a
    public final void onAdClicked() {
        zzg(e6.a.class, "onAdClicked", new Object[0]);
    }

    @Override // x5.e
    public final void onAppEvent(String str, String str2) {
        zzg(e.class, "onAppEvent", str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzcwm
    public final void zza() {
        zzg(zzcwm.class, "onAdClosed", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzcwm
    public final void zzb() {
        zzg(zzcwm.class, "onAdLeftApplication", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzcwm
    public final void zzc() {
        zzg(zzcwm.class, "onAdOpened", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzfjs
    public final void zzd(zzfjl zzfjlVar, String str) {
        zzg(zzfjk.class, "onTaskSucceeded", str);
    }

    @Override // com.google.android.gms.internal.ads.zzcwp
    public final void zzdB(h2 h2Var) {
        zzg(zzcwp.class, "onAdFailedToLoad", Integer.valueOf(h2Var.f3314a), h2Var.f3315b, h2Var.f3316c);
    }

    @Override // com.google.android.gms.internal.ads.zzfjs
    public final void zzdC(zzfjl zzfjlVar, String str) {
        zzg(zzfjk.class, "onTaskCreated", str);
    }

    @Override // com.google.android.gms.internal.ads.zzfjs
    public final void zzdD(zzfjl zzfjlVar, String str, Throwable th) {
        zzg(zzfjk.class, "onTaskFailed", str, th.getClass().getSimpleName());
    }

    @Override // com.google.android.gms.internal.ads.zzfjs
    public final void zzdE(zzfjl zzfjlVar, String str) {
        zzg(zzfjk.class, "onTaskStarted", str);
    }

    @Override // com.google.android.gms.internal.ads.zzcxh
    public final void zzdj(Context context) {
        zzg(zzcxh.class, "onDestroy", context);
    }

    @Override // com.google.android.gms.internal.ads.zzcxh
    public final void zzdl(Context context) {
        zzg(zzcxh.class, "onPause", context);
    }

    @Override // com.google.android.gms.internal.ads.zzcxh
    public final void zzdm(Context context) {
        zzg(zzcxh.class, "onResume", context);
    }

    @Override // com.google.android.gms.internal.ads.zzczj
    public final void zzdn(zzbvx zzbvxVar) {
        p.C.f2983j.getClass();
        this.zzc = SystemClock.elapsedRealtime();
        zzg(zzczj.class, "onAdRequest", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzcwm
    public final void zzds(zzbwj zzbwjVar, String str, String str2) {
        zzg(zzcwm.class, "onRewarded", zzbwjVar, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzcwm
    public final void zze() {
        zzg(zzcwm.class, "onRewardedVideoCompleted", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzcwm
    public final void zzf() {
        zzg(zzcwm.class, "onRewardedVideoStarted", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzcxg
    public final void zzr() {
        zzg(zzcxg.class, "onAdImpression", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzcya
    public final void zzs() {
        p.C.f2983j.getClass();
        k0.k("Ad Request Latency : " + (SystemClock.elapsedRealtime() - this.zzc));
        zzg(zzcya.class, "onAdLoaded", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzczj
    public final void zzdo(zzfff zzfffVar) {
    }
}
