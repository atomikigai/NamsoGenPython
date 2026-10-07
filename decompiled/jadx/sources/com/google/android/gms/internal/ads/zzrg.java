package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzrg extends zzcn {
    private int zzd;
    private int zze;
    private boolean zzf;
    private int zzg;
    private byte[] zzh = zzen.zzf;
    private int zzi;
    private long zzj;

    @Override // com.google.android.gms.internal.ads.zzcn, com.google.android.gms.internal.ads.zzcm
    public final ByteBuffer zzb() {
        int i;
        if (super.zzh() && (i = this.zzi) > 0) {
            zzj(i).put(this.zzh, 0, this.zzi).flip();
            this.zzi = 0;
        }
        return super.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzcm
    public final void zze(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i = iLimit - iPosition;
        if (i == 0) {
            return;
        }
        int iMin = Math.min(i, this.zzg);
        this.zzj += (long) (iMin / this.zzb.zze);
        this.zzg -= iMin;
        byteBuffer.position(iPosition + iMin);
        if (this.zzg <= 0) {
            int i10 = i - iMin;
            int length = (this.zzi + i10) - this.zzh.length;
            ByteBuffer byteBufferZzj = zzj(length);
            int iMax = Math.max(0, Math.min(length, this.zzi));
            byteBufferZzj.put(this.zzh, 0, iMax);
            int iMax2 = Math.max(0, Math.min(length - iMax, i10));
            byteBuffer.limit(byteBuffer.position() + iMax2);
            byteBufferZzj.put(byteBuffer);
            byteBuffer.limit(iLimit);
            int i11 = i10 - iMax2;
            int i12 = this.zzi - iMax;
            this.zzi = i12;
            byte[] bArr = this.zzh;
            System.arraycopy(bArr, iMax, bArr, 0, i12);
            byteBuffer.get(this.zzh, this.zzi, i11);
            this.zzi += i11;
            byteBufferZzj.flip();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcn, com.google.android.gms.internal.ads.zzcm
    public final boolean zzh() {
        return super.zzh() && this.zzi == 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcn
    public final zzck zzi(zzck zzckVar) throws zzcl {
        if (zzckVar.zzd != 2) {
            throw new zzcl("Unhandled input format:", zzckVar);
        }
        this.zzf = true;
        return (this.zzd == 0 && this.zze == 0) ? zzck.zza : zzckVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcn
    public final void zzk() {
        if (this.zzf) {
            this.zzf = false;
            int i = this.zze;
            int i10 = this.zzb.zze;
            this.zzh = new byte[i * i10];
            this.zzg = this.zzd * i10;
        }
        this.zzi = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcn
    public final void zzl() {
        if (this.zzf) {
            int i = this.zzi;
            if (i > 0) {
                this.zzj += (long) (i / this.zzb.zze);
            }
            this.zzi = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcn
    public final void zzm() {
        this.zzh = zzen.zzf;
    }

    public final long zzo() {
        return this.zzj;
    }

    public final void zzp() {
        this.zzj = 0L;
    }

    public final void zzq(int i, int i10) {
        this.zzd = i;
        this.zze = i10;
    }
}
