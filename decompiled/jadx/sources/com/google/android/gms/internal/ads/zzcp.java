package com.google.android.gms.internal.ads;

import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzcp implements zzcm {
    private int zzb;
    private float zzc = 1.0f;
    private float zzd = 1.0f;
    private zzck zze;
    private zzck zzf;
    private zzck zzg;
    private zzck zzh;
    private boolean zzi;
    private zzco zzj;
    private ByteBuffer zzk;
    private ShortBuffer zzl;
    private ByteBuffer zzm;
    private long zzn;
    private long zzo;
    private boolean zzp;

    public zzcp() {
        zzck zzckVar = zzck.zza;
        this.zze = zzckVar;
        this.zzf = zzckVar;
        this.zzg = zzckVar;
        this.zzh = zzckVar;
        ByteBuffer byteBuffer = zzcm.zza;
        this.zzk = byteBuffer;
        this.zzl = byteBuffer.asShortBuffer();
        this.zzm = byteBuffer;
        this.zzb = -1;
    }

    @Override // com.google.android.gms.internal.ads.zzcm
    public final zzck zza(zzck zzckVar) throws zzcl {
        if (zzckVar.zzd != 2) {
            throw new zzcl("Unhandled input format:", zzckVar);
        }
        int i = this.zzb;
        if (i == -1) {
            i = zzckVar.zzb;
        }
        this.zze = zzckVar;
        zzck zzckVar2 = new zzck(i, zzckVar.zzc, 2);
        this.zzf = zzckVar2;
        this.zzi = true;
        return zzckVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzcm
    public final ByteBuffer zzb() {
        int iZza;
        zzco zzcoVar = this.zzj;
        if (zzcoVar != null && (iZza = zzcoVar.zza()) > 0) {
            if (this.zzk.capacity() < iZza) {
                ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(iZza).order(ByteOrder.nativeOrder());
                this.zzk = byteBufferOrder;
                this.zzl = byteBufferOrder.asShortBuffer();
            } else {
                this.zzk.clear();
                this.zzl.clear();
            }
            zzcoVar.zzd(this.zzl);
            this.zzo += (long) iZza;
            this.zzk.limit(iZza);
            this.zzm = this.zzk;
        }
        ByteBuffer byteBuffer = this.zzm;
        this.zzm = zzcm.zza;
        return byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.zzcm
    public final void zzc() {
        if (zzg()) {
            zzck zzckVar = this.zze;
            this.zzg = zzckVar;
            zzck zzckVar2 = this.zzf;
            this.zzh = zzckVar2;
            if (this.zzi) {
                this.zzj = new zzco(zzckVar.zzb, zzckVar.zzc, this.zzc, this.zzd, zzckVar2.zzb);
            } else {
                zzco zzcoVar = this.zzj;
                if (zzcoVar != null) {
                    zzcoVar.zzc();
                }
            }
        }
        this.zzm = zzcm.zza;
        this.zzn = 0L;
        this.zzo = 0L;
        this.zzp = false;
    }

    @Override // com.google.android.gms.internal.ads.zzcm
    public final void zzd() {
        zzco zzcoVar = this.zzj;
        if (zzcoVar != null) {
            zzcoVar.zze();
        }
        this.zzp = true;
    }

    @Override // com.google.android.gms.internal.ads.zzcm
    public final void zze(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            zzco zzcoVar = this.zzj;
            zzcoVar.getClass();
            ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
            int iRemaining = byteBuffer.remaining();
            this.zzn += (long) iRemaining;
            zzcoVar.zzf(shortBufferAsShortBuffer);
            byteBuffer.position(byteBuffer.position() + iRemaining);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcm
    public final void zzf() {
        this.zzc = 1.0f;
        this.zzd = 1.0f;
        zzck zzckVar = zzck.zza;
        this.zze = zzckVar;
        this.zzf = zzckVar;
        this.zzg = zzckVar;
        this.zzh = zzckVar;
        ByteBuffer byteBuffer = zzcm.zza;
        this.zzk = byteBuffer;
        this.zzl = byteBuffer.asShortBuffer();
        this.zzm = byteBuffer;
        this.zzb = -1;
        this.zzi = false;
        this.zzj = null;
        this.zzn = 0L;
        this.zzo = 0L;
        this.zzp = false;
    }

    @Override // com.google.android.gms.internal.ads.zzcm
    public final boolean zzg() {
        if (this.zzf.zzb != -1) {
            return Math.abs(this.zzc + (-1.0f)) >= 1.0E-4f || Math.abs(this.zzd + (-1.0f)) >= 1.0E-4f || this.zzf.zzb != this.zze.zzb;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcm
    public final boolean zzh() {
        if (!this.zzp) {
            return false;
        }
        zzco zzcoVar = this.zzj;
        return zzcoVar == null || zzcoVar.zza() == 0;
    }

    public final long zzi(long j4) {
        long j10 = this.zzo;
        if (j10 < 1024) {
            return (long) (((double) this.zzc) * j4);
        }
        long j11 = this.zzn;
        zzco zzcoVar = this.zzj;
        zzcoVar.getClass();
        long jZzb = j11 - ((long) zzcoVar.zzb());
        int i = this.zzh.zzb;
        int i10 = this.zzg.zzb;
        return i == i10 ? zzen.zzu(j4, jZzb, j10, RoundingMode.FLOOR) : zzen.zzu(j4, jZzb * ((long) i), j10 * ((long) i10), RoundingMode.FLOOR);
    }

    public final void zzj(float f10) {
        if (this.zzd != f10) {
            this.zzd = f10;
            this.zzi = true;
        }
    }

    public final void zzk(float f10) {
        if (this.zzc != f10) {
            this.zzc = f10;
            this.zzi = true;
        }
    }
}
