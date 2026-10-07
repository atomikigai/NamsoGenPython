package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import android.util.Log;
import l9.d;
import l9.e;
import l9.f;
import l9.g;
import l9.h;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzj {
    private final zzam zza;
    private final zzu zzb;
    private final zzbk zzc;
    private final Object zzd = new Object();
    private final Object zze = new Object();
    private boolean zzf = false;
    private boolean zzg = false;
    private g zzh = new g();

    public zzj(zzam zzamVar, zzu zzuVar, zzbk zzbkVar) {
        this.zza = zzamVar;
        this.zzb = zzuVar;
        this.zzc = zzbkVar;
    }

    public final boolean canRequestAds() {
        if (!this.zza.zzk()) {
            int iZza = !zzc() ? 0 : this.zza.zza();
            if (iZza != 1 && iZza != 3) {
                return false;
            }
        }
        return true;
    }

    public final int getConsentStatus() {
        if (zzc()) {
            return this.zza.zza();
        }
        return 0;
    }

    public final f getPrivacyOptionsRequirementStatus() {
        return !zzc() ? f.f6875a : this.zza.zzb();
    }

    public final boolean isConsentFormAvailable() {
        return this.zzc.zzf();
    }

    public final void requestConsentInfoUpdate(Activity activity, g gVar, e eVar, d dVar) {
        synchronized (this.zzd) {
            this.zzf = true;
        }
        this.zzh = gVar;
        this.zzb.zzc(activity, gVar, eVar, dVar);
    }

    public final void reset() {
        this.zzc.zzd(null);
        this.zza.zze();
        synchronized (this.zzd) {
            this.zzf = false;
        }
    }

    public final void zza(Activity activity) {
        if (zzc() && !zzd()) {
            zzb(true);
            this.zzb.zzc(activity, this.zzh, new e() { // from class: com.google.android.gms.internal.consent_sdk.zzh
                @Override // l9.e
                public final void onConsentInfoUpdateSuccess() {
                    this.zza.zzb(false);
                }
            }, new d() { // from class: com.google.android.gms.internal.consent_sdk.zzi
                @Override // l9.d
                public final void onConsentInfoUpdateFailure(h hVar) {
                    this.zza.zzb(false);
                }
            });
            return;
        }
        Log.w("UserMessagingPlatform", "Retry request is not executed. consentInfoUpdateHasBeenCalled=" + zzc() + ", retryRequestIsInProgress=" + zzd());
    }

    public final void zzb(boolean z4) {
        synchronized (this.zze) {
            this.zzg = z4;
        }
    }

    public final boolean zzc() {
        boolean z4;
        synchronized (this.zzd) {
            z4 = this.zzf;
        }
        return z4;
    }

    public final boolean zzd() {
        boolean z4;
        synchronized (this.zze) {
            z4 = this.zzg;
        }
        return z4;
    }
}
