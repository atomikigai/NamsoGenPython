package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.i0;
import e6.f2;
import e6.q0;
import e6.t;
import q7.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzfeq extends zzbwl {
    private final zzfeg zza;
    private final zzfdw zzb;
    private final zzffg zzc;
    private zzdor zzd;
    private boolean zze = false;

    public zzfeq(zzfeg zzfegVar, zzfdw zzfdwVar, zzffg zzffgVar) {
        this.zza = zzfegVar;
        this.zzb = zzfdwVar;
        this.zzc = zzffgVar;
    }

    private final synchronized boolean zzy() {
        zzdor zzdorVar = this.zzd;
        return (zzdorVar == null || zzdorVar.zze()) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzbwm
    public final Bundle zzb() {
        i0.d("getAdMetadata can only be called from the UI thread.");
        zzdor zzdorVar = this.zzd;
        return zzdorVar != null ? zzdorVar.zza() : new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbwm
    public final synchronized f2 zzc() throws RemoteException {
        zzdor zzdorVar;
        if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzgD)).booleanValue() && (zzdorVar = this.zzd) != null) {
            return zzdorVar.zzm();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbwm
    public final synchronized String zzd() throws RemoteException {
        zzdor zzdorVar = this.zzd;
        if (zzdorVar == null || zzdorVar.zzm() == null) {
            return null;
        }
        return zzdorVar.zzm().zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzbwm
    public final void zze() throws RemoteException {
        zzf(null);
    }

    @Override // com.google.android.gms.internal.ads.zzbwm
    public final synchronized void zzf(q7.a aVar) {
        i0.d("destroy must be called on the main UI thread.");
        Context context = null;
        this.zzb.zzg(null);
        if (this.zzd != null) {
            if (aVar != null) {
                context = (Context) b.I(aVar);
            }
            this.zzd.zzn().zza(context);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0042, code lost:
    
        if (((java.lang.Boolean) e6.t.f3437d.f3440c.zza(com.google.android.gms.internal.ads.zzbcn.zzfs)).booleanValue() == false) goto L18;
     */
    @Override // com.google.android.gms.internal.ads.zzbwm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void zzg(com.google.android.gms.internal.ads.zzbwq r5) throws android.os.RemoteException {
        /*
            r4 = this;
            monitor-enter(r4)
            java.lang.String r0 = "loadAd must be called on the main UI thread."
            com.google.android.gms.common.internal.i0.d(r0)     // Catch: java.lang.Throwable -> L20
            java.lang.String r0 = r5.zzb     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.internal.ads.zzbce r1 = com.google.android.gms.internal.ads.zzbcn.zzfq     // Catch: java.lang.Throwable -> L20
            e6.t r2 = e6.t.f3437d     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.internal.ads.zzbcl r2 = r2.f3440c     // Catch: java.lang.Throwable -> L20
            java.lang.Object r1 = r2.zza(r1)     // Catch: java.lang.Throwable -> L20
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L2c
            if (r0 != 0) goto L19
            goto L2c
        L19:
            boolean r0 = java.util.regex.Pattern.matches(r1, r0)     // Catch: java.lang.Throwable -> L20 java.lang.RuntimeException -> L22
            if (r0 == 0) goto L2c
            goto L44
        L20:
            r5 = move-exception
            goto L64
        L22:
            r0 = move-exception
            java.lang.String r1 = "NonagonUtil.isPatternMatched"
            d6.p r2 = d6.p.C     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.internal.ads.zzbzz r2 = r2.f2982g     // Catch: java.lang.Throwable -> L20
            r2.zzw(r0, r1)     // Catch: java.lang.Throwable -> L20
        L2c:
            boolean r0 = r4.zzy()     // Catch: java.lang.Throwable -> L20
            if (r0 == 0) goto L46
            com.google.android.gms.internal.ads.zzbce r0 = com.google.android.gms.internal.ads.zzbcn.zzfs     // Catch: java.lang.Throwable -> L20
            e6.t r1 = e6.t.f3437d     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.internal.ads.zzbcl r1 = r1.f3440c     // Catch: java.lang.Throwable -> L20
            java.lang.Object r0 = r1.zza(r0)     // Catch: java.lang.Throwable -> L20
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L20
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L20
            if (r0 != 0) goto L46
        L44:
            monitor-exit(r4)
            return
        L46:
            com.google.android.gms.internal.ads.zzfdy r0 = new com.google.android.gms.internal.ads.zzfdy     // Catch: java.lang.Throwable -> L20
            r1 = 0
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L20
            r4.zzd = r1     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.internal.ads.zzfeg r1 = r4.zza     // Catch: java.lang.Throwable -> L20
            r2 = 1
            r1.zzj(r2)     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.internal.ads.zzfeg r1 = r4.zza     // Catch: java.lang.Throwable -> L20
            e6.o3 r2 = r5.zza     // Catch: java.lang.Throwable -> L20
            java.lang.String r5 = r5.zzb     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.internal.ads.zzfeo r3 = new com.google.android.gms.internal.ads.zzfeo     // Catch: java.lang.Throwable -> L20
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L20
            r1.zzb(r2, r5, r0, r3)     // Catch: java.lang.Throwable -> L20
            monitor-exit(r4)
            return
        L64:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L20
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfeq.zzg(com.google.android.gms.internal.ads.zzbwq):void");
    }

    @Override // com.google.android.gms.internal.ads.zzbwm
    public final void zzh() {
        zzi(null);
    }

    @Override // com.google.android.gms.internal.ads.zzbwm
    public final synchronized void zzi(q7.a aVar) {
        i0.d("pause must be called on the main UI thread.");
        if (this.zzd != null) {
            this.zzd.zzn().zzb(aVar == null ? null : (Context) b.I(aVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwm
    public final void zzj() {
        zzk(null);
    }

    @Override // com.google.android.gms.internal.ads.zzbwm
    public final synchronized void zzk(q7.a aVar) {
        i0.d("resume must be called on the main UI thread.");
        if (this.zzd != null) {
            this.zzd.zzn().zzc(aVar == null ? null : (Context) b.I(aVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwm
    public final void zzl(q0 q0Var) {
        i0.d("setAdMetadataListener can only be called from the UI thread.");
        if (q0Var == null) {
            this.zzb.zzg(null);
        } else {
            this.zzb.zzg(new zzfep(this, q0Var));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwm
    public final synchronized void zzm(String str) throws RemoteException {
        i0.d("#008 Must be called on the main UI thread.: setCustomData");
        this.zzc.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzbwm
    public final synchronized void zzn(boolean z4) {
        i0.d("setImmersiveMode must be called on the main UI thread.");
        this.zze = z4;
    }

    @Override // com.google.android.gms.internal.ads.zzbwm
    public final void zzo(zzbwp zzbwpVar) throws RemoteException {
        i0.d("setRewardedVideoAdListener can only be called from the UI thread.");
        this.zzb.zzm(zzbwpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbwm
    public final synchronized void zzp(String str) throws RemoteException {
        i0.d("setUserId must be called on the main UI thread.");
        this.zzc.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzbwm
    public final synchronized void zzq() throws RemoteException {
        zzr(null);
    }

    @Override // com.google.android.gms.internal.ads.zzbwm
    public final synchronized void zzr(q7.a aVar) throws RemoteException {
        try {
            i0.d("showAd must be called on the main UI thread.");
            if (this.zzd != null) {
                Activity activity = null;
                if (aVar != null) {
                    Object objI = b.I(aVar);
                    if (objI instanceof Activity) {
                        activity = (Activity) objI;
                    }
                }
                this.zzd.zzh(this.zze, activity);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwm
    public final boolean zzs() throws RemoteException {
        i0.d("isLoaded must be called on the main UI thread.");
        return zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzbwm
    public final boolean zzt() {
        zzdor zzdorVar = this.zzd;
        return zzdorVar != null && zzdorVar.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzbwm
    public final void zzu(zzbwk zzbwkVar) {
        i0.d("#008 Must be called on the main UI thread.: setRewardedAdSkuListener");
        this.zzb.zzn(zzbwkVar);
    }
}
