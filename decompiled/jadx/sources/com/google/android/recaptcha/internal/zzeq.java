package com.google.android.recaptcha.internal;

import android.webkit.JavascriptInterface;
import java.util.concurrent.TimeUnit;
import rc.p;
import rc.q;
import ub.k;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzeq {
    final /* synthetic */ zzez zza;
    private Long zzb;
    private final zzfh zzc = zzfh.zzb();

    public zzeq(zzez zzezVar) {
        this.zza = zzezVar;
    }

    private final void zzb() {
        if (this.zzb == null) {
            this.zzc.zzf();
            this.zzb = Long.valueOf(this.zzc.zza(TimeUnit.MILLISECONDS));
        }
    }

    public final Long zza() {
        return this.zzb;
    }

    @JavascriptInterface
    public final void zzlce(String str) throws zzje {
        zznf zznfVarZzI = zznf.zzI(zzfy.zzh().zzj(str));
        zzez zzezVar = this.zza;
        if (zzezVar.zzg().zzb == null) {
            zzezVar.zzi.zza(zzezVar.zzp.zza(zzne.LOAD_WEBVIEW));
        }
        zzb();
        zzpc zzpcVarZzi = zzpd.zzi();
        zzpcVarZzi.zzd(zznfVarZzI);
        this.zza.zzi.zzd((zzpd) zzpcVarZzi.zzj());
    }

    @JavascriptInterface
    public final void zzlsm(String str) {
        zzb();
        zzpc zzpcVarZzi = zzpd.zzi();
        zzpcVarZzi.zze(zznu.zzi(zzfy.zzh().zzj(str)));
        this.zza.zzi.zzd((zzpd) zzpcVarZzi.zzj());
    }

    @JavascriptInterface
    public final void zzoid(String str) throws zzje {
        zzb();
        zzox zzoxVarZzg = zzox.zzg(zzfy.zzh().zzj(str));
        zzoxVarZzg.zzi().name();
        if (zzoxVarZzg.zzi() != zzpb.JS_CODE_SUCCESS) {
            zzoxVarZzg.zzi().name();
            zzo zzoVar = zzp.zza;
            zzp zzpVarZza = zzo.zza(zzoxVarZzg.zzi());
            this.zza.zzk().hashCode();
            ((q) this.zza.zzk()).W(zzpVarZza);
            return;
        }
        this.zza.zzk().hashCode();
        if (((q) this.zza.zzk()).K(k.f9073a)) {
            return;
        }
        this.zza.zzk().hashCode();
    }

    @JavascriptInterface
    public final void zzrp(String str) {
        zzb();
        zzbu zzbuVar = this.zza.zzc;
        if (zzbuVar == null) {
            zzbuVar = null;
        }
        zzbuVar.zza(str);
    }

    @JavascriptInterface
    public final void zzscd(String str) throws zzje {
        zzb();
        zzog zzogVarZzi = zzog.zzi(zzfy.zzh().zzj(str));
        zzogVarZzi.toString();
        p pVar = (p) this.zza.zzl.remove(zzogVarZzi.zzk());
        if (pVar != null) {
            ((q) pVar).K(zzogVarZzi);
        }
    }
}
