package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzcj {
    private final zzfzo zza;
    private final List zzb = new ArrayList();
    private ByteBuffer[] zzc = new ByteBuffer[0];
    private boolean zzd;

    public zzcj(zzfzo zzfzoVar) {
        this.zza = zzfzoVar;
        zzck zzckVar = zzck.zza;
        this.zzd = false;
    }

    private final int zzi() {
        return this.zzc.length - 1;
    }

    private final void zzj(ByteBuffer byteBuffer) {
        boolean z4;
        do {
            z4 = false;
            for (int i = 0; i <= zzi(); i++) {
                if (!this.zzc[i].hasRemaining()) {
                    zzcm zzcmVar = (zzcm) this.zzb.get(i);
                    if (!zzcmVar.zzh()) {
                        ByteBuffer byteBuffer2 = i > 0 ? this.zzc[i - 1] : byteBuffer.hasRemaining() ? byteBuffer : zzcm.zza;
                        long jRemaining = byteBuffer2.remaining();
                        zzcmVar.zze(byteBuffer2);
                        this.zzc[i] = zzcmVar.zzb();
                        long jRemaining2 = jRemaining - ((long) byteBuffer2.remaining());
                        boolean z10 = true;
                        if (jRemaining2 <= 0 && !this.zzc[i].hasRemaining()) {
                            z10 = false;
                        }
                        z4 |= z10;
                    } else if (!this.zzc[i].hasRemaining() && i < zzi()) {
                        ((zzcm) this.zzb.get(i + 1)).zzd();
                    }
                }
            }
        } while (z4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzcj)) {
            return false;
        }
        zzcj zzcjVar = (zzcj) obj;
        if (this.zza.size() != zzcjVar.zza.size()) {
            return false;
        }
        for (int i = 0; i < this.zza.size(); i++) {
            if (this.zza.get(i) != zzcjVar.zza.get(i)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final zzck zza(zzck zzckVar) throws zzcl {
        if (zzckVar.equals(zzck.zza)) {
            throw new zzcl("Unhandled input format:", zzckVar);
        }
        for (int i = 0; i < this.zza.size(); i++) {
            zzcm zzcmVar = (zzcm) this.zza.get(i);
            zzck zzckVarZza = zzcmVar.zza(zzckVar);
            if (zzcmVar.zzg()) {
                zzdb.zzf(!zzckVarZza.equals(zzck.zza));
                zzckVar = zzckVarZza;
            }
        }
        return zzckVar;
    }

    public final ByteBuffer zzb() {
        if (!zzh()) {
            return zzcm.zza;
        }
        ByteBuffer byteBuffer = this.zzc[zzi()];
        if (byteBuffer.hasRemaining()) {
            return byteBuffer;
        }
        zzj(zzcm.zza);
        return this.zzc[zzi()];
    }

    public final void zzc() {
        this.zzb.clear();
        this.zzd = false;
        for (int i = 0; i < this.zza.size(); i++) {
            zzcm zzcmVar = (zzcm) this.zza.get(i);
            zzcmVar.zzc();
            if (zzcmVar.zzg()) {
                this.zzb.add(zzcmVar);
            }
        }
        this.zzc = new ByteBuffer[this.zzb.size()];
        for (int i10 = 0; i10 <= zzi(); i10++) {
            this.zzc[i10] = ((zzcm) this.zzb.get(i10)).zzb();
        }
    }

    public final void zzd() {
        if (!zzh() || this.zzd) {
            return;
        }
        this.zzd = true;
        ((zzcm) this.zzb.get(0)).zzd();
    }

    public final void zze(ByteBuffer byteBuffer) {
        if (!zzh() || this.zzd) {
            return;
        }
        zzj(byteBuffer);
    }

    public final void zzf() {
        for (int i = 0; i < this.zza.size(); i++) {
            zzcm zzcmVar = (zzcm) this.zza.get(i);
            zzcmVar.zzc();
            zzcmVar.zzf();
        }
        this.zzc = new ByteBuffer[0];
        zzck zzckVar = zzck.zza;
        this.zzd = false;
    }

    public final boolean zzg() {
        return this.zzd && ((zzcm) this.zzb.get(zzi())).zzh() && !this.zzc[zzi()].hasRemaining();
    }

    public final boolean zzh() {
        return !this.zzb.isEmpty();
    }
}
