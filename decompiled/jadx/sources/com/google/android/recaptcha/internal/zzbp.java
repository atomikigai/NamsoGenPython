package com.google.android.recaptcha.internal;

import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzbp {
    public static final zzbp zza = new zzbp();

    private zzbp() {
    }

    public static final zzno zza(zzz zzzVar, zzz zzzVar2) {
        zznn zznnVarZzf = zzno.zzf();
        zznnVarZzf.zzp(zzmg.zzb(zzzVar.zzb()));
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        zznnVarZzf.zzq(zzme.zza(zzzVar.zza(timeUnit)));
        zznnVarZzf.zzd(zzmg.zzb(zzzVar2.zzb()));
        zznnVarZzf.zze(zzme.zza(zzzVar2.zza(timeUnit)));
        return (zzno) zznnVarZzf.zzj();
    }
}
