package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzaee implements zzacr {
    private static final int[] zza = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
    private static final int[] zzb = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
    private static final byte[] zzc;
    private static final byte[] zzd;
    private final byte[] zze;
    private final zzadx zzf;
    private boolean zzg;
    private long zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private long zzm;
    private zzacu zzn;
    private zzadx zzo;
    private zzadx zzp;
    private zzadq zzq;
    private long zzr;
    private boolean zzs;

    static {
        int i = zzen.zza;
        Charset charset = StandardCharsets.UTF_8;
        zzc = "#!AMR\n".getBytes(charset);
        zzd = "#!AMR-WB\n".getBytes(charset);
    }

    public zzaee() {
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002d  */
    /* JADX WARN: Code duplicated, block: B:14:0x002f  */
    /* JADX WARN: Code duplicated, block: B:31:0x005e  */
    private final int zza(zzacs zzacsVar) throws IOException {
        int i = this.zzj;
        if (i == 0) {
            try {
                zzacsVar.zzj();
                zzacsVar.zzh(this.zze, 0, 1);
                byte b10 = this.zze[0];
                if ((b10 & 131) > 0) {
                    throw zzbh.zza("Invalid padding bits for frame header " + ((int) b10), null);
                }
                int i10 = b10 >> 3;
                boolean z4 = this.zzg;
                int i11 = i10 & 15;
                if (!z4) {
                    if (!z4) {
                        if (i11 >= 12 && i11 <= 14) {
                        }
                    }
                    throw zzbh.zza("Illegal AMR " + (true != z4 ? "NB" : "WB") + " frame type " + i11, null);
                }
                if (i11 >= 10 && i11 <= 13) {
                    if (!z4) {
                        if (i11 >= 12) {
                        }
                    }
                    if (true != z4) {
                    }
                    throw zzbh.zza("Illegal AMR " + (true != z4 ? "NB" : "WB") + " frame type " + i11, null);
                }
                i = z4 ? zzb[i11] : zza[i11];
                this.zzi = i;
                this.zzj = i;
                int i12 = this.zzk;
                if (i12 == -1) {
                    this.zzk = i;
                    i12 = i;
                }
                if (i12 == i) {
                    this.zzl++;
                }
            } catch (EOFException unused) {
                return -1;
            }
        }
        int iZzf = this.zzp.zzf(zzacsVar, i, true);
        if (iZzf == -1) {
            return -1;
        }
        int i13 = this.zzj - iZzf;
        this.zzj = i13;
        if (i13 > 0) {
            return 0;
        }
        this.zzp.zzs(this.zzh, 1, this.zzi, 0, null);
        this.zzh += 20000;
        return 0;
    }

    private static boolean zzg(zzacs zzacsVar, byte[] bArr) throws IOException {
        zzacsVar.zzj();
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        zzacsVar.zzh(bArr2, 0, length);
        return Arrays.equals(bArr2, bArr);
    }

    private final boolean zzh(zzacs zzacsVar) throws IOException {
        byte[] bArr = zzc;
        if (zzg(zzacsVar, bArr)) {
            this.zzg = false;
            zzacsVar.zzk(bArr.length);
            return true;
        }
        byte[] bArr2 = zzd;
        if (!zzg(zzacsVar, bArr2)) {
            return false;
        }
        this.zzg = true;
        zzacsVar.zzk(bArr2.length);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzacr
    public final int zzb(zzacs zzacsVar, zzadn zzadnVar) throws IOException {
        zzdb.zzb(this.zzo);
        int i = zzen.zza;
        if (zzacsVar.zzf() == 0 && !zzh(zzacsVar)) {
            throw zzbh.zza("Could not find AMR header.", null);
        }
        if (!this.zzs) {
            this.zzs = true;
            boolean z4 = this.zzg;
            String str = true != z4 ? "audio/3gpp" : "audio/amr-wb";
            int i10 = true != z4 ? 8000 : 16000;
            int i11 = z4 ? zzb[8] : zza[7];
            zzadx zzadxVar = this.zzp;
            zzab zzabVar = new zzab();
            zzabVar.zzZ(str);
            zzabVar.zzQ(i11);
            zzabVar.zzz(1);
            zzabVar.zzaa(i10);
            zzadxVar.zzl(zzabVar.zzaf());
        }
        int iZza = zza(zzacsVar);
        if (this.zzq == null) {
            zzadp zzadpVar = new zzadp(-9223372036854775807L, 0L);
            this.zzq = zzadpVar;
            this.zzn.zzO(zzadpVar);
        }
        return iZza == -1 ? -1 : 0;
    }

    @Override // com.google.android.gms.internal.ads.zzacr
    public final /* synthetic */ List zzd() {
        return zzfzo.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzacr
    public final void zze(zzacu zzacuVar) {
        this.zzn = zzacuVar;
        zzadx zzadxVarZzw = zzacuVar.zzw(0, 1);
        this.zzo = zzadxVarZzw;
        this.zzp = zzadxVarZzw;
        zzacuVar.zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzacr
    public final void zzf(long j4, long j10) {
        this.zzh = 0L;
        this.zzi = 0;
        this.zzj = 0;
        this.zzr = j10;
        this.zzm = 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzacr
    public final boolean zzi(zzacs zzacsVar) throws IOException {
        return zzh(zzacsVar);
    }

    public zzaee(int i) {
        this.zze = new byte[1];
        this.zzk = -1;
        zzacm zzacmVar = new zzacm();
        this.zzf = zzacmVar;
        this.zzp = zzacmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzacr
    public final /* synthetic */ zzacr zzc() {
        return this;
    }
}
