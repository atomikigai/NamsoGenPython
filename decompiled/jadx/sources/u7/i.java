package u7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.fido.zzaj;
import com.google.android.gms.internal.fido.zzak;
import com.google.android.gms.internal.fido.zzbf;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends l {
    public static final Parcelable.Creator<i> CREATOR = new v0(8);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f8911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f8912b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f8913c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f8914d;
    public final byte[] e;

    public i(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        com.google.android.gms.common.internal.i0.i(bArr);
        this.f8911a = bArr;
        com.google.android.gms.common.internal.i0.i(bArr2);
        this.f8912b = bArr2;
        com.google.android.gms.common.internal.i0.i(bArr3);
        this.f8913c = bArr3;
        com.google.android.gms.common.internal.i0.i(bArr4);
        this.f8914d = bArr4;
        this.e = bArr5;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Arrays.equals(this.f8911a, iVar.f8911a) && Arrays.equals(this.f8912b, iVar.f8912b) && Arrays.equals(this.f8913c, iVar.f8913c) && Arrays.equals(this.f8914d, iVar.f8914d) && Arrays.equals(this.e, iVar.e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.f8911a)), Integer.valueOf(Arrays.hashCode(this.f8912b)), Integer.valueOf(Arrays.hashCode(this.f8913c)), Integer.valueOf(Arrays.hashCode(this.f8914d)), Integer.valueOf(Arrays.hashCode(this.e))});
    }

    public final String toString() {
        zzaj zzajVarZza = zzak.zza(this);
        zzbf zzbfVarZzd = zzbf.zzd();
        byte[] bArr = this.f8911a;
        zzajVarZza.zzb("keyHandle", zzbfVarZzd.zze(bArr, 0, bArr.length));
        zzbf zzbfVarZzd2 = zzbf.zzd();
        byte[] bArr2 = this.f8912b;
        zzajVarZza.zzb("clientDataJSON", zzbfVarZzd2.zze(bArr2, 0, bArr2.length));
        zzbf zzbfVarZzd3 = zzbf.zzd();
        byte[] bArr3 = this.f8913c;
        zzajVarZza.zzb("authenticatorData", zzbfVarZzd3.zze(bArr3, 0, bArr3.length));
        zzbf zzbfVarZzd4 = zzbf.zzd();
        byte[] bArr4 = this.f8914d;
        zzajVarZza.zzb("signature", zzbfVarZzd4.zze(bArr4, 0, bArr4.length));
        byte[] bArr5 = this.e;
        if (bArr5 != null) {
            zzajVarZza.zzb("userHandle", zzbf.zzd().zze(bArr5, 0, bArr5.length));
        }
        return zzajVarZza.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = com.bumptech.glide.d.P(20293, parcel);
        com.bumptech.glide.d.D(parcel, 2, this.f8911a, false);
        com.bumptech.glide.d.D(parcel, 3, this.f8912b, false);
        com.bumptech.glide.d.D(parcel, 4, this.f8913c, false);
        com.bumptech.glide.d.D(parcel, 5, this.f8914d, false);
        com.bumptech.glide.d.D(parcel, 6, this.e, false);
        com.bumptech.glide.d.Q(iP, parcel);
    }
}
