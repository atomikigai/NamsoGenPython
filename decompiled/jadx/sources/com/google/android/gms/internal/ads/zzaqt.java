package com.google.android.gms.internal.ads;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzaqt extends ByteArrayOutputStream {
    private final zzaqg zza;

    public zzaqt(zzaqg zzaqgVar, int i) {
        this.zza = zzaqgVar;
        ((ByteArrayOutputStream) this).buf = zzaqgVar.zzb(Math.max(i, 256));
    }

    private final void zza(int i) {
        int i10 = ((ByteArrayOutputStream) this).count;
        if (i10 + i <= ((ByteArrayOutputStream) this).buf.length) {
            return;
        }
        int i11 = i10 + i;
        byte[] bArrZzb = this.zza.zzb(i11 + i11);
        System.arraycopy(((ByteArrayOutputStream) this).buf, 0, bArrZzb, 0, ((ByteArrayOutputStream) this).count);
        this.zza.zza(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = bArrZzb;
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.zza.zza(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = null;
        super.close();
    }

    public final void finalize() {
        this.zza.zza(((ByteArrayOutputStream) this).buf);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public final synchronized void write(int i) {
        zza(1);
        super.write(i);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i, int i10) {
        zza(i10);
        super.write(bArr, i, i10);
    }
}
