package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzhfe implements zzarc {
    private static final zzhfp zzg = zzhfp.zzb(zzhfe.class);
    protected final String zza;
    long zzd;
    zzhfj zzf;
    private ByteBuffer zzh;
    long zze = -1;
    boolean zzc = true;
    boolean zzb = true;

    public zzhfe(String str) {
        this.zza = str;
    }

    private final synchronized void zzc() {
        try {
            if (this.zzc) {
                return;
            }
            try {
                zzhfp zzhfpVar = zzg;
                String str = this.zza;
                zzhfpVar.zza(str.length() != 0 ? "mem mapping ".concat(str) : new String("mem mapping "));
                this.zzh = this.zzf.zzd(this.zzd, this.zze);
                this.zzc = true;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzarc
    public final String zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzarc
    public final void zzb(zzhfj zzhfjVar, ByteBuffer byteBuffer, long j4, zzaqz zzaqzVar) throws IOException {
        this.zzd = zzhfjVar.zzb();
        byteBuffer.remaining();
        this.zze = j4;
        this.zzf = zzhfjVar;
        zzhfjVar.zze(zzhfjVar.zzb() + j4);
        this.zzc = false;
        this.zzb = false;
        zzf();
    }

    public abstract void zze(ByteBuffer byteBuffer);

    public final synchronized void zzf() {
        try {
            zzc();
            zzhfp zzhfpVar = zzg;
            String str = this.zza;
            zzhfpVar.zza(str.length() != 0 ? "parsing details of ".concat(str) : new String("parsing details of "));
            ByteBuffer byteBuffer = this.zzh;
            if (byteBuffer != null) {
                this.zzb = true;
                byteBuffer.rewind();
                zze(byteBuffer);
                if (byteBuffer.remaining() > 0) {
                    byteBuffer.slice();
                }
                this.zzh = null;
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
