package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import d6.p;
import h6.n0;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import o6.r;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzcue implements zzczj, zzdex {
    private zzbvr zza;
    private final Context zzc;
    private final zzfko zzd;
    private final i6.a zze;
    private final Executor zzf;
    private boolean zzg = false;
    private boolean zzh = false;
    private final AtomicBoolean zzb = new AtomicBoolean();

    public zzcue(Context context, zzfko zzfkoVar, i6.a aVar, Executor executor) {
        this.zzc = context;
        this.zzd = zzfkoVar;
        this.zze = aVar;
        this.zzf = executor;
    }

    public final /* synthetic */ void zzc() {
        zzbbx.zze(this.zzc);
        this.zzh = true;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003a  */
    public final void zzd() {
        zzbvr zzbvrVar;
        int i;
        zzboi zzboiVarZza;
        if (!this.zzb.getAndSet(true)) {
            if (((Boolean) zzben.zzk.zze()).booleanValue()) {
                i = 2;
            } else {
                i = 3;
                if (!((Boolean) zzben.zzl.zze()).booleanValue()) {
                    if (((Boolean) zzben.zzj.zze()).booleanValue()) {
                        try {
                            String strOptString = new JSONObject(((n0) p.C.f2982g.zzi()).n().zzc()).optString("local_flag_write");
                            if (TextUtils.equals(strOptString, "client")) {
                                i = 2;
                            } else if (!TextUtils.equals(strOptString, "service")) {
                                i = 1;
                            }
                        } catch (JSONException unused) {
                        }
                    } else {
                        i = 1;
                    }
                }
            }
            int i10 = i - 1;
            if (i10 == 1) {
                zzboiVarZza = p.C.f2990q.zza(this.zzc, i6.a.g(), this.zzd);
            } else if (i10 == 2) {
                zzboiVarZza = p.C.f2990q.zzb(this.zzc, i6.a.g(), this.zzd);
            }
            zzboc zzbocVar = zzbof.zza;
            this.zza = new zzbvt(this.zzc, zzboiVarZza.zza("google.afma.sdkConstants.getSdkConstants", zzbocVar, zzbocVar), this.zze);
            this.zzg = true;
        }
        if (this.zzg && (zzbvrVar = this.zza) != null) {
            m9.a aVarZza = zzbvrVar.zza();
            if (!this.zzh && ((Boolean) zzbef.zzi.zze()).booleanValue()) {
                aVarZza.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcud
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.zzc();
                    }
                }, this.zzf);
            }
            zzcam.zza(aVarZza, "persistFlagsClient");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzczj
    public final void zzdn(zzbvx zzbvxVar) {
        zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzdex
    public final void zze(r rVar) {
        zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzdex
    public final void zzf(String str) {
        zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzczj
    public final void zzdo(zzfff zzfffVar) {
    }
}
