package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzekn implements zzefb {
    private final zzefd zza;
    private final zzefh zzb;
    private final zzfjr zzc;
    private final zzges zzd;

    public zzekn(zzfjr zzfjrVar, zzges zzgesVar, zzefd zzefdVar, zzefh zzefhVar) {
        this.zzc = zzfjrVar;
        this.zzd = zzgesVar;
        this.zzb = zzefhVar;
        this.zza = zzefdVar;
    }

    public static final String zze(String str, int i) {
        return "Error from: " + str + ", code: " + i;
    }

    @Override // com.google.android.gms.internal.ads.zzefb
    public final m9.a zza(final zzfff zzfffVar, final zzfet zzfetVar) {
        final zzefe zzefeVarZza;
        Iterator it = zzfetVar.zzt.iterator();
        while (true) {
            if (!it.hasNext()) {
                zzefeVarZza = null;
                break;
            }
            try {
                zzefeVarZza = this.zza.zza((String) it.next(), zzfetVar.zzv);
                break;
            } catch (zzffv unused) {
            }
        }
        if (zzefeVarZza == null) {
            return zzgei.zzg(new zzeid("Unable to instantiate mediation adapter class."));
        }
        zzcao zzcaoVar = new zzcao();
        zzefeVarZza.zzc.zza(new zzekm(this, zzefeVarZza, zzcaoVar));
        if (zzfetVar.zzM) {
            Bundle bundle = zzfffVar.zza.zza.zzd.f3382x;
            Bundle bundle2 = bundle.getBundle(AdMobAdapter.class.getName());
            if (bundle2 == null) {
                bundle2 = new Bundle();
                bundle.putBundle(AdMobAdapter.class.getName(), bundle2);
            }
            bundle2.putBoolean("render_test_ad_label", true);
        }
        zzfjr zzfjrVar = this.zzc;
        return zzfjb.zzd(new zzfiw() { // from class: com.google.android.gms.internal.ads.zzekk
            @Override // com.google.android.gms.internal.ads.zzfiw
            public final void zza() throws Exception {
                this.zza.zzd(zzfffVar, zzfetVar, zzefeVarZza);
            }
        }, this.zzd, zzfjl.ADAPTER_LOAD_AD_SYN, zzfjrVar).zzb(zzfjl.ADAPTER_LOAD_AD_ACK).zzd(zzcaoVar).zzb(zzfjl.ADAPTER_WRAP_ADAPTER).zze(new zzfiv() { // from class: com.google.android.gms.internal.ads.zzekl
            @Override // com.google.android.gms.internal.ads.zzfiv
            public final Object zza(Object obj) {
                return this.zza.zzc(zzfffVar, zzfetVar, zzefeVarZza, (Void) obj);
            }
        }).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzefb
    public final boolean zzb(zzfff zzfffVar, zzfet zzfetVar) {
        return !zzfetVar.zzt.isEmpty();
    }

    public final /* synthetic */ Object zzc(zzfff zzfffVar, zzfet zzfetVar, zzefe zzefeVar, Void r10) throws Exception {
        return this.zzb.zza(zzfffVar, zzfetVar, zzefeVar);
    }

    public final /* synthetic */ void zzd(zzfff zzfffVar, zzfet zzfetVar, zzefe zzefeVar) throws Exception {
        this.zzb.zzb(zzfffVar, zzfetVar, zzefeVar);
    }
}
