package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import android.util.Log;
import h3.p1;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import l9.b;
import l9.c;
import l9.f;
import l9.h;
import l9.i;
import l9.j;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbk {
    private final zzdp zza;
    private final Executor zzb;
    private final AtomicReference zzc = new AtomicReference();
    private final AtomicReference zzd = new AtomicReference();

    public zzbk(zzdp zzdpVar, Executor executor) {
        this.zza = zzdpVar;
        this.zzb = executor;
    }

    public final /* synthetic */ void zza(zzay zzayVar) {
        final AtomicReference atomicReference = this.zzd;
        Objects.requireNonNull(atomicReference);
        zzayVar.zzf(new j() { // from class: com.google.android.gms.internal.consent_sdk.zzbb
            @Override // l9.j
            public final void onConsentFormLoadSuccess(c cVar) {
                atomicReference.set(cVar);
            }
        }, new i() { // from class: com.google.android.gms.internal.consent_sdk.zzbc
            @Override // l9.i
            public final void onConsentFormLoadFailure(h hVar) {
                Log.e("UserMessagingPlatform", "Failed to load and cache a form, error=".concat(String.valueOf(hVar.f6879a)));
            }
        });
    }

    public final void zzb(j jVar, i iVar) {
        zzco.zza();
        zzbm zzbmVar = (zzbm) this.zzc.get();
        if (zzbmVar == null) {
            iVar.onConsentFormLoadFailure(new zzg(3, "No available form can be built.").zza());
        } else {
            ((zzas) this.zza.zza()).zza(zzbmVar).zzb().zza().zzf(jVar, iVar);
        }
    }

    public final void zzc() {
        zzbm zzbmVar = (zzbm) this.zzc.get();
        if (zzbmVar == null) {
            Log.e("UserMessagingPlatform", "Failed to load and cache a form due to null consent form resources.");
            return;
        }
        final zzay zzayVarZza = ((zzas) this.zza.zza()).zza(zzbmVar).zzb().zza();
        zzayVarZza.zza = true;
        zzco.zza.post(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzba
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zza(zzayVarZza);
            }
        });
    }

    public final void zzd(zzbm zzbmVar) {
        this.zzc.set(zzbmVar);
    }

    public final void zze(Activity activity, final b bVar) {
        zzco.zza();
        zzj zzjVarZzb = zza.zza(activity).zzb();
        if (zzjVarZzb == null) {
            zzco.zza.post(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzbd
                @Override // java.lang.Runnable
                public final void run() {
                    ((p1) bVar).a(new zzg(1, "No consentInformation.").zza());
                }
            });
            return;
        }
        boolean zIsConsentFormAvailable = zzjVarZzb.isConsentFormAvailable();
        f fVar = f.f6876b;
        if (!zIsConsentFormAvailable && zzjVarZzb.getPrivacyOptionsRequirementStatus() != fVar) {
            zzco.zza.post(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzbe
                @Override // java.lang.Runnable
                public final void run() {
                    ((p1) bVar).a(new zzg(3, "No valid response received yet.").zza());
                }
            });
            zzjVarZzb.zza(activity);
        } else {
            if (zzjVarZzb.getPrivacyOptionsRequirementStatus() == fVar) {
                zzco.zza.post(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzbf
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((p1) bVar).a(new zzg(3, "Privacy options form is not required.").zza());
                    }
                });
                return;
            }
            c cVar = (c) this.zzd.get();
            if (cVar == null) {
                zzco.zza.post(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzbg
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((p1) bVar).a(new zzg(3, "Privacy options form is being loading. Please try again later.").zza());
                    }
                });
            } else {
                cVar.show(activity, bVar);
                this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzbh
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.zzc();
                    }
                });
            }
        }
    }

    public final boolean zzf() {
        return this.zzc.get() != null;
    }
}
