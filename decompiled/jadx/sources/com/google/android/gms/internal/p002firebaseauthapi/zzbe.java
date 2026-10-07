package com.google.android.gms.internal.p002firebaseauthapi;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbe {
    private final InputStream zza;

    private zzbe(InputStream inputStream) {
        this.zza = inputStream;
    }

    public static zzbe zzc(byte[] bArr) {
        return new zzbe(new ByteArrayInputStream(bArr));
    }

    public final zzva zza() throws IOException {
        try {
            return zzva.zzc(this.zza, zzajx.zza());
        } finally {
            this.zza.close();
        }
    }

    public final zzwv zzb() throws IOException {
        try {
            return zzwv.zzf(this.zza, zzajx.zza());
        } finally {
            this.zza.close();
        }
    }
}
