package com.google.android.gms.internal.ads;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzgfn {
    private final InputStream zza;

    private zzgfn(InputStream inputStream) {
        this.zza = inputStream;
    }

    public static zzgfn zzb(byte[] bArr) {
        return new zzgfn(new ByteArrayInputStream(bArr));
    }

    public final zzgum zza() throws IOException {
        try {
            return zzgum.zzg(this.zza, zzgyh.zza());
        } finally {
            this.zza.close();
        }
    }
}
