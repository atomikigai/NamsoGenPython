package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzajf {
    public final boolean zza;
    public final String zzb;
    public final zzadw zzc;
    public final int zzd;
    public final byte[] zze;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:25:0x0049  */
    /* JADX WARN: Code duplicated, block: B:26:0x004b  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Instruction removed from duplicated block: B:26:0x004b, please report this as an issue */
    public zzajf(boolean z4, String str, int i, byte[] bArr, int i10, int i11, byte[] bArr2) {
        int i12 = 1;
        zzdb.zzd((bArr2 == null) ^ (i == 0));
        this.zza = z4;
        this.zzb = str;
        this.zzd = i;
        this.zze = bArr2;
        if (str != null) {
            switch (str.hashCode()) {
                case 3046605:
                    if (!str.equals("cbc1")) {
                        zzdt.zzf("TrackEncryptionBox", "Unsupported protection scheme type '" + str + "'. Assuming AES-CTR crypto mode.");
                    } else {
                        i12 = 2;
                    }
                    break;
                case 3046671:
                    if (!str.equals("cbcs")) {
                        zzdt.zzf("TrackEncryptionBox", "Unsupported protection scheme type '" + str + "'. Assuming AES-CTR crypto mode.");
                    } else {
                        i12 = 2;
                    }
                    break;
                case 3049879:
                    if (!str.equals("cenc")) {
                        zzdt.zzf("TrackEncryptionBox", "Unsupported protection scheme type '" + str + "'. Assuming AES-CTR crypto mode.");
                    }
                    break;
                case 3049895:
                    if (!str.equals("cens")) {
                        zzdt.zzf("TrackEncryptionBox", "Unsupported protection scheme type '" + str + "'. Assuming AES-CTR crypto mode.");
                    }
                    break;
                default:
                    zzdt.zzf("TrackEncryptionBox", "Unsupported protection scheme type '" + str + "'. Assuming AES-CTR crypto mode.");
                    break;
            }
        }
        this.zzc = new zzadw(i12, bArr, i10, i11);
    }
}
