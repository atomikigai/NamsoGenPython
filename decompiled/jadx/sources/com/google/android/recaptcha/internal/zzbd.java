package com.google.android.recaptcha.internal;

import jc.f;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzbd {
    public static final zzbc zza = new zzbc(null);
    private String zzb;
    private String zzc;
    private String zzd;

    private zzbd(String str, String str2) {
        this.zzb = str;
        this.zzc = str2;
    }

    public final zzbb zza(zzne zzneVar) {
        return new zzbb(zzneVar, this.zzb, this.zzc, this.zzd, null);
    }

    public final zzbd zzb() {
        return new zzbd(this);
    }

    public final zzbd zzc(String str) {
        this.zzd = str;
        return this;
    }

    public final String zzd() {
        return this.zzc;
    }

    public /* synthetic */ zzbd(String str, String str2, f fVar) {
        this(str, str2);
    }

    private zzbd(zzbd zzbdVar) {
        this(zzbdVar.zzb, zzbdVar.zzc);
        this.zzd = zzbdVar.zzd;
    }
}
