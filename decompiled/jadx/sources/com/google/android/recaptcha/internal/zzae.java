package com.google.android.recaptcha.internal;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzae extends Exception {
    private final Throwable zza;
    private final zzpg zzb;
    private final int zzc;
    private final int zzd;

    public zzae(int i, int i10, Throwable th) {
        this.zzc = i;
        this.zzd = i10;
        this.zza = th;
        zzpg zzpgVarZzf = zzph.zzf();
        zzpgVarZzf.zze(i10);
        zzpgVarZzf.zzp(i);
        this.zzb = zzpgVarZzf;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.zza;
    }

    public final zzpg zza() {
        return this.zzb;
    }

    public final int zzb() {
        return this.zzd;
    }
}
