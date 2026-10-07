package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzox {
    private boolean zza;
    private boolean zzb;
    private boolean zzc;

    public final zzox zza(boolean z4) {
        this.zza = true;
        return this;
    }

    public final zzox zzb(boolean z4) {
        this.zzb = z4;
        return this;
    }

    public final zzox zzc(boolean z4) {
        this.zzc = z4;
        return this;
    }

    public final zzoz zzd() {
        if (this.zza || !(this.zzb || this.zzc)) {
            return new zzoz(this, null);
        }
        throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
    }
}
