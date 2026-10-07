package com.google.android.gms.internal.play_billing;

import java.io.IOException;
import q1.a;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
class zzeg extends zzef {
    protected final byte[] zza;

    public zzeg(byte[] bArr) {
        super(null);
        bArr.getClass();
        this.zza = bArr;
    }

    @Override // com.google.android.gms.internal.play_billing.zzei
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzei) || zzd() != ((zzei) obj).zzd()) {
            return false;
        }
        if (zzd() == 0) {
            return true;
        }
        if (!(obj instanceof zzeg)) {
            return obj.equals(this);
        }
        zzeg zzegVar = (zzeg) obj;
        int iZzi = zzi();
        int iZzi2 = zzegVar.zzi();
        if (iZzi != 0 && iZzi2 != 0 && iZzi != iZzi2) {
            return false;
        }
        int iZzd = zzd();
        if (iZzd > zzegVar.zzd()) {
            throw new IllegalArgumentException("Length too large: " + iZzd + zzd());
        }
        if (iZzd > zzegVar.zzd()) {
            throw new IllegalArgumentException(a.i(iZzd, zzegVar.zzd(), "Ran off end of other: 0, ", ", "));
        }
        byte[] bArr = this.zza;
        byte[] bArr2 = zzegVar.zza;
        zzegVar.zzc();
        int i = 0;
        int i10 = 0;
        while (i < iZzd) {
            if (bArr[i] != bArr2[i10]) {
                return false;
            }
            i++;
            i10++;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.play_billing.zzei
    public byte zza(int i) {
        return this.zza[i];
    }

    @Override // com.google.android.gms.internal.play_billing.zzei
    public byte zzb(int i) {
        return this.zza[i];
    }

    public int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.play_billing.zzei
    public int zzd() {
        return this.zza.length;
    }

    @Override // com.google.android.gms.internal.play_billing.zzei
    public final int zze(int i, int i10, int i11) {
        return zzfo.zzb(i, this.zza, 0, i11);
    }

    @Override // com.google.android.gms.internal.play_billing.zzei
    public final zzei zzf(int i, int i10) {
        int iZzh = zzei.zzh(0, i10, zzd());
        return iZzh == 0 ? zzei.zzb : new zzec(this.zza, 0, iZzh);
    }

    @Override // com.google.android.gms.internal.play_billing.zzei
    public final void zzg(zzdz zzdzVar) throws IOException {
        ((zzem) zzdzVar).zzc(this.zza, 0, zzd());
    }
}
