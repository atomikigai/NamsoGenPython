package com.google.android.gms.internal.ads;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzaqj extends FilterInputStream {
    private final long zza;
    private long zzb;

    public zzaqj(InputStream inputStream, long j4) {
        super(inputStream);
        this.zza = j4;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        int i = super.read();
        if (i != -1) {
            this.zzb++;
        }
        return i;
    }

    public final long zza() {
        return this.zza - this.zzb;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i10) throws IOException {
        int i11 = super.read(bArr, i, i10);
        if (i11 != -1) {
            this.zzb += (long) i11;
        }
        return i11;
    }
}
