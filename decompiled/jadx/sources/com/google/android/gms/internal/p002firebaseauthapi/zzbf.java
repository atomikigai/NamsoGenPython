package com.google.android.gms.internal.p002firebaseauthapi;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbf implements zzca {
    private final OutputStream zza;

    private zzbf(OutputStream outputStream) {
        this.zza = outputStream;
    }

    public static zzca zza(OutputStream outputStream) {
        return new zzbf(outputStream);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzca
    public final void zzb(zzva zzvaVar) throws IOException {
        throw null;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzca
    public final void zzc(zzwv zzwvVar) throws IOException {
        try {
            zzwvVar.zzp(this.zza);
        } finally {
            this.zza.close();
        }
    }
}
