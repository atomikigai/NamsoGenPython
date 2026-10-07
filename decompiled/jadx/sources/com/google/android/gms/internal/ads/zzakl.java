package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzakl implements zzadx {
    private final zzadx zza;
    private final zzakg zzb;
    private zzaki zzg;
    private zzad zzh;
    private int zzd = 0;
    private int zze = 0;
    private byte[] zzf = zzen.zzf;
    private final zzed zzc = new zzed();

    public zzakl(zzadx zzadxVar, zzakg zzakgVar) {
        this.zza = zzadxVar;
        this.zzb = zzakgVar;
    }

    private final void zzb(int i) {
        int length = this.zzf.length;
        int i10 = this.zze;
        if (length - i10 >= i) {
            return;
        }
        int i11 = i10 - this.zzd;
        int iMax = Math.max(i11 + i11, i + i11);
        byte[] bArr = this.zzf;
        byte[] bArr2 = iMax <= bArr.length ? bArr : new byte[iMax];
        System.arraycopy(bArr, this.zzd, bArr2, 0, i11);
        this.zzd = 0;
        this.zze = i11;
        this.zzf = bArr2;
    }

    public final /* synthetic */ void zza(long j4, int i, zzaka zzakaVar) {
        zzdb.zzb(this.zzh);
        zzfzo zzfzoVar = zzakaVar.zza;
        long j10 = zzakaVar.zzc;
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(zzfzoVar.size());
        Iterator<E> it = zzfzoVar.iterator();
        while (it.hasNext()) {
            arrayList.add(((zzct) it.next()).zza());
        }
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("c", arrayList);
        bundle.putLong("d", j10);
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeBundle(bundle);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        zzed zzedVar = this.zzc;
        int length = bArrMarshall.length;
        zzedVar.zzJ(bArrMarshall, length);
        this.zza.zzq(this.zzc, length);
        long j11 = zzakaVar.zzb;
        if (j11 == -9223372036854775807L) {
            zzdb.zzf(this.zzh.zzt == Long.MAX_VALUE);
        } else {
            long j12 = this.zzh.zzt;
            j4 = j12 == Long.MAX_VALUE ? j4 + j11 : j11 + j12;
        }
        this.zza.zzs(j4, i, length, 0, null);
    }

    @Override // com.google.android.gms.internal.ads.zzadx
    public final /* synthetic */ int zzf(zzn zznVar, int i, boolean z4) {
        return zzadv.zza(this, zznVar, i, z4);
    }

    @Override // com.google.android.gms.internal.ads.zzadx
    public final int zzg(zzn zznVar, int i, boolean z4, int i10) throws IOException {
        if (this.zzg == null) {
            return this.zza.zzg(zznVar, i, z4, 0);
        }
        zzb(i);
        int iZza = zznVar.zza(this.zzf, this.zze, i);
        if (iZza != -1) {
            this.zze += iZza;
            return iZza;
        }
        if (z4) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // com.google.android.gms.internal.ads.zzadx
    public final void zzl(zzad zzadVar) {
        String str = zzadVar.zzo;
        str.getClass();
        zzdb.zzd(zzbg.zzb(str) == 3);
        if (!zzadVar.equals(this.zzh)) {
            this.zzh = zzadVar;
            this.zzg = this.zzb.zzc(zzadVar) ? this.zzb.zzb(zzadVar) : null;
        }
        if (this.zzg == null) {
            this.zza.zzl(zzadVar);
            return;
        }
        zzadx zzadxVar = this.zza;
        zzab zzabVarZzb = zzadVar.zzb();
        zzabVarZzb.zzZ("application/x-media3-cues");
        zzabVarZzb.zzA(zzadVar.zzo);
        zzabVarZzb.zzad(Long.MAX_VALUE);
        zzabVarZzb.zzE(this.zzb.zza(zzadVar));
        zzadxVar.zzl(zzabVarZzb.zzaf());
    }

    @Override // com.google.android.gms.internal.ads.zzadx
    public final /* synthetic */ void zzq(zzed zzedVar, int i) {
        zzadv.zzb(this, zzedVar, i);
    }

    @Override // com.google.android.gms.internal.ads.zzadx
    public final void zzr(zzed zzedVar, int i, int i10) {
        if (this.zzg == null) {
            this.zza.zzr(zzedVar, i, i10);
            return;
        }
        zzb(i);
        zzedVar.zzH(this.zzf, this.zze, i);
        this.zze += i;
    }

    @Override // com.google.android.gms.internal.ads.zzadx
    public final void zzs(final long j4, final int i, int i10, int i11, zzadw zzadwVar) {
        if (this.zzg == null) {
            this.zza.zzs(j4, i, i10, i11, zzadwVar);
            return;
        }
        zzdb.zze(zzadwVar == null, "DRM on subtitles is not supported");
        int i12 = (this.zze - i11) - i10;
        this.zzg.zza(this.zzf, i12, i10, zzakh.zza(), new zzdg() { // from class: com.google.android.gms.internal.ads.zzakk
            @Override // com.google.android.gms.internal.ads.zzdg
            public final void zza(Object obj) {
                this.zza.zza(j4, i, (zzaka) obj);
            }
        });
        int i13 = i12 + i10;
        this.zzd = i13;
        if (i13 == this.zze) {
            this.zzd = 0;
            this.zze = 0;
        }
    }
}
