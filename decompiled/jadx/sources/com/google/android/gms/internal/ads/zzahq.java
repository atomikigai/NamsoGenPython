package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import java.io.IOException;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzahq implements zzacr {
    private static final byte[] zza = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    private static final byte[] zzb;
    private static final byte[] zzc;
    private static final byte[] zzd;
    private static final UUID zze;
    private static final Map zzf;
    private long zzA;
    private zzaho zzB;
    private boolean zzC;
    private int zzD;
    private long zzE;
    private boolean zzF;
    private long zzG;
    private long zzH;
    private long zzI;
    private zzdu zzJ;
    private zzdu zzK;
    private boolean zzL;
    private boolean zzM;
    private int zzN;
    private long zzO;
    private long zzP;
    private int zzQ;
    private int zzR;
    private int[] zzS;
    private int zzT;
    private int zzU;
    private int zzV;
    private int zzW;
    private boolean zzX;
    private long zzY;
    private int zzZ;
    private int zzaa;
    private int zzab;
    private boolean zzac;
    private boolean zzad;
    private boolean zzae;
    private int zzaf;
    private byte zzag;
    private boolean zzah;
    private zzacu zzai;
    private final zzahl zzaj;
    private final zzahs zzg;
    private final SparseArray zzh;
    private final boolean zzi;
    private final boolean zzj;
    private final zzakg zzk;
    private final zzed zzl;
    private final zzed zzm;
    private final zzed zzn;
    private final zzed zzo;
    private final zzed zzp;
    private final zzed zzq;
    private final zzed zzr;
    private final zzed zzs;
    private final zzed zzt;
    private final zzed zzu;
    private ByteBuffer zzv;
    private long zzw;
    private long zzx;
    private long zzy;
    private long zzz;

    static {
        int i = zzen.zza;
        zzb = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(StandardCharsets.UTF_8);
        zzc = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        zzd = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        zze = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap map = new HashMap();
        map.put("htc_video_rotA-000", 0);
        map.put("htc_video_rotA-090", 90);
        map.put("htc_video_rotA-180", 180);
        map.put("htc_video_rotA-270", 270);
        zzf = Collections.unmodifiableMap(map);
    }

    @Deprecated
    public zzahq() {
        this(new zzahl(), 2, zzakg.zza);
    }

    private final int zzp(zzacs zzacsVar, zzaho zzahoVar, int i, boolean z4) throws IOException {
        int i10;
        if ("S_TEXT/UTF8".equals(zzahoVar.zzb)) {
            zzx(zzacsVar, zza, i);
            int i11 = this.zzaa;
            zzw();
            return i11;
        }
        if ("S_TEXT/ASS".equals(zzahoVar.zzb)) {
            zzx(zzacsVar, zzc, i);
            int i12 = this.zzaa;
            zzw();
            return i12;
        }
        if ("S_TEXT/WEBVTT".equals(zzahoVar.zzb)) {
            zzx(zzacsVar, zzd, i);
            int i13 = this.zzaa;
            zzw();
            return i13;
        }
        zzadx zzadxVar = zzahoVar.zzW;
        if (!this.zzac) {
            if (zzahoVar.zzg) {
                this.zzV &= -1073741825;
                if (!this.zzad) {
                    zzacsVar.zzi(this.zzn.zzN(), 0, 1);
                    this.zzZ++;
                    if ((this.zzn.zzN()[0] & 128) == 128) {
                        throw zzbh.zza("Extension bit is set in signal byte", null);
                    }
                    this.zzag = this.zzn.zzN()[0];
                    this.zzad = true;
                }
                byte b10 = this.zzag;
                if ((b10 & 1) == 1) {
                    int i14 = b10 & 2;
                    this.zzV |= 1073741824;
                    if (!this.zzah) {
                        zzacsVar.zzi(this.zzs.zzN(), 0, 8);
                        this.zzZ += 8;
                        this.zzah = true;
                        this.zzn.zzN()[0] = (byte) ((i14 != 2 ? 0 : 128) | 8);
                        this.zzn.zzL(0);
                        zzadxVar.zzr(this.zzn, 1, 1);
                        this.zzaa++;
                        this.zzs.zzL(0);
                        zzadxVar.zzr(this.zzs, 8, 1);
                        this.zzaa += 8;
                    }
                    if (i14 == 2) {
                        if (!this.zzae) {
                            zzacsVar.zzi(this.zzn.zzN(), 0, 1);
                            this.zzZ++;
                            this.zzn.zzL(0);
                            this.zzaf = this.zzn.zzm();
                            this.zzae = true;
                        }
                        int i15 = this.zzaf * 4;
                        this.zzn.zzI(i15);
                        zzacsVar.zzi(this.zzn.zzN(), 0, i15);
                        this.zzZ += i15;
                        int i16 = (this.zzaf >> 1) + 1;
                        int i17 = (i16 * 6) + 2;
                        ByteBuffer byteBuffer = this.zzv;
                        if (byteBuffer == null || byteBuffer.capacity() < i17) {
                            this.zzv = ByteBuffer.allocate(i17);
                        }
                        this.zzv.position(0);
                        this.zzv.putShort((short) i16);
                        int i18 = 0;
                        int i19 = 0;
                        while (true) {
                            i10 = this.zzaf;
                            if (i18 >= i10) {
                                break;
                            }
                            int iZzp = this.zzn.zzp();
                            int i20 = iZzp - i19;
                            if (i18 % 2 == 0) {
                                this.zzv.putShort((short) i20);
                            } else {
                                this.zzv.putInt(i20);
                            }
                            i18++;
                            i19 = iZzp;
                        }
                        int i21 = (i - this.zzZ) - i19;
                        if ((i10 & 1) == 1) {
                            this.zzv.putInt(i21);
                        } else {
                            this.zzv.putShort((short) i21);
                            this.zzv.putInt(0);
                        }
                        this.zzt.zzJ(this.zzv.array(), i17);
                        zzadxVar.zzr(this.zzt, i17, 1);
                        this.zzaa += i17;
                    }
                }
            } else {
                byte[] bArr = zzahoVar.zzh;
                if (bArr != null) {
                    this.zzq.zzJ(bArr, bArr.length);
                }
            }
            if (!"A_OPUS".equals(zzahoVar.zzb) ? zzahoVar.zzf > 0 : z4) {
                this.zzV |= 268435456;
                this.zzu.zzI(0);
                int iZze = (this.zzq.zze() + i) - this.zzZ;
                this.zzn.zzI(4);
                this.zzn.zzN()[0] = (byte) ((iZze >> 24) & 255);
                this.zzn.zzN()[1] = (byte) ((iZze >> 16) & 255);
                this.zzn.zzN()[2] = (byte) ((iZze >> 8) & 255);
                this.zzn.zzN()[3] = (byte) (iZze & 255);
                zzadxVar.zzr(this.zzn, 4, 2);
                this.zzaa += 4;
            }
            this.zzac = true;
        }
        int iZze2 = this.zzq.zze() + i;
        if (!"V_MPEG4/ISO/AVC".equals(zzahoVar.zzb) && !"V_MPEGH/ISO/HEVC".equals(zzahoVar.zzb)) {
            if (zzahoVar.zzT != null) {
                zzdb.zzf(this.zzq.zze() == 0);
                zzahoVar.zzT.zzd(zzacsVar);
            }
            while (true) {
                int i22 = this.zzZ;
                if (i22 >= iZze2) {
                    break;
                }
                int iZzq = zzq(zzacsVar, zzadxVar, iZze2 - i22);
                this.zzZ += iZzq;
                this.zzaa += iZzq;
            }
        } else {
            byte[] bArrZzN = this.zzm.zzN();
            bArrZzN[0] = 0;
            bArrZzN[1] = 0;
            bArrZzN[2] = 0;
            int i23 = zzahoVar.zzX;
            int i24 = 4 - i23;
            while (this.zzZ < iZze2) {
                int i25 = this.zzab;
                if (i25 == 0) {
                    int iMin = Math.min(i23, this.zzq.zzb());
                    zzacsVar.zzi(bArrZzN, i24 + iMin, i23 - iMin);
                    if (iMin > 0) {
                        this.zzq.zzH(bArrZzN, i24, iMin);
                    }
                    this.zzZ += i23;
                    this.zzm.zzL(0);
                    this.zzab = this.zzm.zzp();
                    this.zzl.zzL(0);
                    zzadxVar.zzq(this.zzl, 4);
                    this.zzaa += 4;
                } else {
                    int iZzq2 = zzq(zzacsVar, zzadxVar, i25);
                    this.zzZ += iZzq2;
                    this.zzaa += iZzq2;
                    this.zzab -= iZzq2;
                }
            }
        }
        if ("A_VORBIS".equals(zzahoVar.zzb)) {
            this.zzo.zzL(0);
            zzadxVar.zzq(this.zzo, 4);
            this.zzaa += 4;
        }
        int i26 = this.zzaa;
        zzw();
        return i26;
    }

    private final int zzq(zzacs zzacsVar, zzadx zzadxVar, int i) throws IOException {
        int iZzb = this.zzq.zzb();
        if (iZzb <= 0) {
            return zzadxVar.zzf(zzacsVar, i, false);
        }
        int iMin = Math.min(i, iZzb);
        zzadxVar.zzq(this.zzq, iMin);
        return iMin;
    }

    private final long zzr(long j4) throws zzbh {
        long j10 = this.zzy;
        if (j10 != -9223372036854775807L) {
            return zzen.zzu(j4, j10, 1000L, RoundingMode.FLOOR);
        }
        throw zzbh.zza("Can't scale timecode prior to timecodeScale being set.", null);
    }

    private final void zzs(int i) throws zzbh {
        if (this.zzJ == null || this.zzK == null) {
            throw zzbh.zza("Element " + i + " must be in a Cues", null);
        }
    }

    private final void zzt(int i) throws zzbh {
        if (this.zzB != null) {
            return;
        }
        throw zzbh.zza("Element " + i + " must be in a TrackEntry", null);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c8 A[LOOP:0: B:34:0x00b0->B:39:0x00c8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:53:0x00c2 A[SYNTHETIC] */
    private final void zzu(zzaho zzahoVar, long j4, int i, int i10, int i11) {
        byte[] bArrZzy;
        int i12;
        int iZzd;
        int iZze;
        zzady zzadyVar = zzahoVar.zzT;
        if (zzadyVar != null) {
            zzadyVar.zzc(zzahoVar.zzW, j4, i, i10, i11, zzahoVar.zzi);
        } else {
            if ("S_TEXT/UTF8".equals(zzahoVar.zzb) || "S_TEXT/ASS".equals(zzahoVar.zzb) || "S_TEXT/WEBVTT".equals(zzahoVar.zzb)) {
                if (this.zzR > 1) {
                    zzdt.zzf("MatroskaExtractor", "Skipping subtitle sample in laced block.");
                } else {
                    long j10 = this.zzP;
                    if (j10 != -9223372036854775807L) {
                        String str = zzahoVar.zzb;
                        byte[] bArrZzN = this.zzr.zzN();
                        int iHashCode = str.hashCode();
                        if (iHashCode == 738597099) {
                            if (str.equals("S_TEXT/ASS")) {
                                bArrZzy = zzy(j10, "%01d:%02d:%02d:%02d", 10000L);
                                i12 = 21;
                                System.arraycopy(bArrZzy, 0, bArrZzN, i12, bArrZzy.length);
                                for (iZzd = this.zzr.zzd(); iZzd < this.zzr.zze(); iZzd++) {
                                    if (this.zzr.zzN()[iZzd] == 0) {
                                        this.zzr.zzK(iZzd);
                                        break;
                                    }
                                }
                                zzadx zzadxVar = zzahoVar.zzW;
                                zzed zzedVar = this.zzr;
                                zzadxVar.zzq(zzedVar, zzedVar.zze());
                                iZze = this.zzr.zze() + i10;
                            }
                            throw new IllegalArgumentException();
                        }
                        if (iHashCode == 1045209816) {
                            if (str.equals("S_TEXT/WEBVTT")) {
                                bArrZzy = zzy(j10, "%02d:%02d:%02d.%03d", 1000L);
                                i12 = 25;
                                System.arraycopy(bArrZzy, 0, bArrZzN, i12, bArrZzy.length);
                                while (iZzd < this.zzr.zze()) {
                                    if (this.zzr.zzN()[iZzd] == 0) {
                                        this.zzr.zzK(iZzd);
                                        break;
                                    }
                                }
                                zzadx zzadxVar2 = zzahoVar.zzW;
                                zzed zzedVar2 = this.zzr;
                                zzadxVar2.zzq(zzedVar2, zzedVar2.zze());
                                iZze = this.zzr.zze() + i10;
                            }
                            throw new IllegalArgumentException();
                        }
                        if (iHashCode == 1422270023 && str.equals("S_TEXT/UTF8")) {
                            bArrZzy = zzy(j10, "%02d:%02d:%02d,%03d", 1000L);
                            i12 = 19;
                            System.arraycopy(bArrZzy, 0, bArrZzN, i12, bArrZzy.length);
                            while (iZzd < this.zzr.zze()) {
                                if (this.zzr.zzN()[iZzd] == 0) {
                                    this.zzr.zzK(iZzd);
                                    break;
                                }
                            }
                            zzadx zzadxVar3 = zzahoVar.zzW;
                            zzed zzedVar3 = this.zzr;
                            zzadxVar3.zzq(zzedVar3, zzedVar3.zze());
                            iZze = this.zzr.zze() + i10;
                        }
                        throw new IllegalArgumentException();
                    }
                    zzdt.zzf("MatroskaExtractor", "Skipping subtitle sample with no duration.");
                }
                iZze = i10;
            } else {
                iZze = i10;
            }
            if ((i & 268435456) != 0) {
                if (this.zzR > 1) {
                    this.zzu.zzI(0);
                } else {
                    int iZze2 = this.zzu.zze();
                    zzahoVar.zzW.zzr(this.zzu, iZze2, 2);
                    iZze += iZze2;
                }
            }
            zzahoVar.zzW.zzs(j4, i, iZze, i11, zzahoVar.zzi);
        }
        this.zzM = true;
    }

    private final void zzv(zzacs zzacsVar, int i) throws IOException {
        if (this.zzn.zze() >= i) {
            return;
        }
        if (this.zzn.zzc() < i) {
            zzed zzedVar = this.zzn;
            int iZzc = zzedVar.zzc();
            zzedVar.zzF(Math.max(iZzc + iZzc, i));
        }
        zzed zzedVar2 = this.zzn;
        zzacsVar.zzi(zzedVar2.zzN(), zzedVar2.zze(), i - zzedVar2.zze());
        this.zzn.zzK(i);
    }

    private final void zzw() {
        this.zzZ = 0;
        this.zzaa = 0;
        this.zzab = 0;
        this.zzac = false;
        this.zzad = false;
        this.zzae = false;
        this.zzaf = 0;
        this.zzag = (byte) 0;
        this.zzah = false;
        this.zzq.zzI(0);
    }

    private final void zzx(zzacs zzacsVar, byte[] bArr, int i) throws IOException {
        int length = bArr.length;
        int i10 = length + i;
        if (this.zzr.zzc() < i10) {
            zzed zzedVar = this.zzr;
            byte[] bArrCopyOf = Arrays.copyOf(bArr, i10 + i);
            zzedVar.zzJ(bArrCopyOf, bArrCopyOf.length);
        } else {
            System.arraycopy(bArr, 0, this.zzr.zzN(), 0, length);
        }
        zzacsVar.zzi(this.zzr.zzN(), length, i);
        this.zzr.zzL(0);
        this.zzr.zzK(i10);
    }

    private static byte[] zzy(long j4, String str, long j10) {
        zzdb.zzd(j4 != -9223372036854775807L);
        Locale locale = Locale.US;
        int i = (int) (j4 / 3600000000L);
        Integer numValueOf = Integer.valueOf(i);
        long j11 = j4 - (((long) i) * 3600000000L);
        int i10 = (int) (j11 / 60000000);
        Integer numValueOf2 = Integer.valueOf(i10);
        long j12 = j11 - (((long) i10) * 60000000);
        int i11 = (int) (j12 / 1000000);
        String str2 = String.format(locale, str, numValueOf, numValueOf2, Integer.valueOf(i11), Integer.valueOf((int) ((j12 - (((long) i11) * 1000000)) / j10)));
        int i12 = zzen.zza;
        return str2.getBytes(StandardCharsets.UTF_8);
    }

    private static int[] zzz(int[] iArr, int i) {
        if (iArr == null) {
            return new int[i];
        }
        int length = iArr.length;
        return length >= i ? iArr : new int[Math.max(length + length, i)];
    }

    @Override // com.google.android.gms.internal.ads.zzacr
    public final int zzb(zzacs zzacsVar, zzadn zzadnVar) throws IOException {
        this.zzM = false;
        while (!this.zzM) {
            if (!this.zzaj.zzc(zzacsVar)) {
                for (int i = 0; i < this.zzh.size(); i++) {
                    zzaho zzahoVar = (zzaho) this.zzh.valueAt(i);
                    zzahoVar.zzW.getClass();
                    zzady zzadyVar = zzahoVar.zzT;
                    if (zzadyVar != null) {
                        zzadyVar.zza(zzahoVar.zzW, zzahoVar.zzi);
                    }
                }
                return -1;
            }
            long jZzf = zzacsVar.zzf();
            if (this.zzF) {
                this.zzH = jZzf;
                zzadnVar.zza = this.zzG;
                this.zzF = false;
                return 1;
            }
            if (this.zzC) {
                long j4 = this.zzH;
                if (j4 != -1) {
                    zzadnVar.zza = j4;
                    this.zzH = -1L;
                    return 1;
                }
            }
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzacr
    public final /* synthetic */ List zzd() {
        return zzfzo.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzacr
    public final void zze(zzacu zzacuVar) {
        this.zzai = zzacuVar;
        if (this.zzj) {
            zzacuVar = new zzakj(zzacuVar, this.zzk);
        }
        this.zzai = zzacuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzacr
    public final void zzf(long j4, long j10) {
        this.zzI = -9223372036854775807L;
        this.zzN = 0;
        this.zzaj.zzb();
        this.zzg.zze();
        zzw();
        for (int i = 0; i < this.zzh.size(); i++) {
            zzady zzadyVar = ((zzaho) this.zzh.valueAt(i)).zzT;
            if (zzadyVar != null) {
                zzadyVar.zzb();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:110:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:112:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:114:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:116:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:117:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:118:0x02c3  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void zzh(int i, int i10, zzacs zzacsVar) throws IOException {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        long j4;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20 = i;
        int i21 = 1;
        int i22 = 0;
        if (i20 != 161 && i20 != 163) {
            if (i20 == 165) {
                if (this.zzN != 2) {
                    return;
                }
                zzaho zzahoVar = (zzaho) this.zzh.get(this.zzT);
                if (this.zzW != 4 || !"V_VP9".equals(zzahoVar.zzb)) {
                    zzacsVar.zzk(i10);
                    return;
                } else {
                    this.zzu.zzI(i10);
                    zzacsVar.zzi(this.zzu.zzN(), 0, i10);
                    return;
                }
            }
            if (i20 == 16877) {
                zzt(i);
                zzaho zzahoVar2 = this.zzB;
                if (zzahoVar2.zzY != 1685485123 && zzahoVar2.zzY != 1685480259) {
                    zzacsVar.zzk(i10);
                    return;
                }
                byte[] bArr = new byte[i10];
                zzahoVar2.zzN = bArr;
                zzacsVar.zzi(bArr, 0, i10);
                return;
            }
            if (i20 == 16981) {
                zzt(i);
                byte[] bArr2 = new byte[i10];
                this.zzB.zzh = bArr2;
                zzacsVar.zzi(bArr2, 0, i10);
                return;
            }
            if (i20 == 18402) {
                byte[] bArr3 = new byte[i10];
                zzacsVar.zzi(bArr3, 0, i10);
                zzt(i);
                this.zzB.zzi = new zzadw(1, bArr3, 0, 0);
                return;
            }
            if (i20 == 21419) {
                Arrays.fill(this.zzp.zzN(), (byte) 0);
                zzacsVar.zzi(this.zzp.zzN(), 4 - i10, i10);
                this.zzp.zzL(0);
                this.zzD = (int) this.zzp.zzu();
                return;
            }
            if (i20 == 25506) {
                zzt(i);
                byte[] bArr4 = new byte[i10];
                this.zzB.zzj = bArr4;
                zzacsVar.zzi(bArr4, 0, i10);
                return;
            }
            if (i20 != 30322) {
                throw zzbh.zza("Unexpected id: " + i20, null);
            }
            zzt(i);
            byte[] bArr5 = new byte[i10];
            this.zzB.zzv = bArr5;
            zzacsVar.zzi(bArr5, 0, i10);
            return;
        }
        int i23 = 8;
        if (this.zzN == 0) {
            this.zzT = (int) this.zzg.zzd(zzacsVar, false, true, 8);
            this.zzU = this.zzg.zza();
            this.zzP = -9223372036854775807L;
            this.zzN = 1;
            this.zzn.zzI(0);
        }
        zzaho zzahoVar3 = (zzaho) this.zzh.get(this.zzT);
        if (zzahoVar3 == null) {
            zzacsVar.zzk(i10 - this.zzU);
            this.zzN = 0;
            return;
        }
        zzahoVar3.zzW.getClass();
        if (this.zzN == 1) {
            zzv(zzacsVar, 3);
            int i24 = (this.zzn.zzN()[2] & 6) >> 1;
            if (i24 == 0) {
                this.zzR = 1;
                int[] iArrZzz = zzz(this.zzS, 1);
                this.zzS = iArrZzz;
                iArrZzz[0] = (i10 - this.zzU) - 3;
            } else {
                zzv(zzacsVar, 4);
                int i25 = (this.zzn.zzN()[3] & 255) + 1;
                this.zzR = i25;
                int[] iArrZzz2 = zzz(this.zzS, i25);
                this.zzS = iArrZzz2;
                if (i24 == 2) {
                    int i26 = (i10 - this.zzU) - 4;
                    int i27 = this.zzR;
                    Arrays.fill(iArrZzz2, 0, i27, i26 / i27);
                } else {
                    if (i24 == 1) {
                        int i28 = 0;
                        int i29 = 0;
                        int i30 = 4;
                        while (true) {
                            i16 = this.zzR - 1;
                            if (i28 >= i16) {
                                break;
                            }
                            this.zzS[i28] = 0;
                            while (true) {
                                i17 = i30 + 1;
                                zzv(zzacsVar, i17);
                                int i31 = this.zzn.zzN()[i30] & 255;
                                int[] iArr = this.zzS;
                                i18 = iArr[i28] + i31;
                                iArr[i28] = i18;
                                if (i31 != 255) {
                                    break;
                                } else {
                                    i30 = i17;
                                }
                            }
                            i29 += i18;
                            i28++;
                            i30 = i17;
                        }
                        this.zzS[i16] = ((i10 - this.zzU) - i30) - i29;
                    } else {
                        if (i24 != 3) {
                            throw zzbh.zza("Unexpected lacing value: 2", null);
                        }
                        int i32 = 0;
                        int i33 = 0;
                        int i34 = 4;
                        while (true) {
                            int i35 = this.zzR - 1;
                            if (i32 >= i35) {
                                i11 = i21;
                                i13 = i22;
                                this.zzS[i35] = ((i10 - this.zzU) - i34) - i33;
                                break;
                            }
                            this.zzS[i32] = i22;
                            int i36 = i34 + 1;
                            zzv(zzacsVar, i36);
                            int i37 = i21;
                            if (this.zzn.zzN()[i34] == 0) {
                                throw zzbh.zza("No valid varint length mask found", null);
                            }
                            int i38 = i22;
                            while (true) {
                                if (i38 >= i23) {
                                    i14 = i22;
                                    i15 = i23;
                                    j4 = 0;
                                    break;
                                }
                                i15 = i23;
                                int i39 = i37 << (7 - i38);
                                i14 = i22;
                                if ((this.zzn.zzN()[i34] & i39) != 0) {
                                    i36 += i38;
                                    zzv(zzacsVar, i36);
                                    j4 = this.zzn.zzN()[i34] & 255 & (~i39);
                                    for (int i40 = i34 + 1; i40 < i36; i40++) {
                                        j4 = (j4 << i15) | ((long) (this.zzn.zzN()[i40] & 255));
                                    }
                                    if (i32 <= 0) {
                                        break;
                                    }
                                    j4 -= (1 << ((i38 * 7) + 6)) - 1;
                                    break;
                                }
                                i38++;
                                i22 = i14;
                                i23 = i15;
                            }
                            i34 = i36;
                            if (j4 < -2147483648L || j4 > 2147483647L) {
                                throw zzbh.zza("EBML lacing sample size out of range.", null);
                            }
                            int[] iArr2 = this.zzS;
                            int i41 = (int) j4;
                            if (i32 != 0) {
                                i41 += iArr2[i32 - 1];
                            }
                            iArr2[i32] = i41;
                            i33 += i41;
                            i32++;
                            i21 = i37;
                            i22 = i14;
                            i23 = i15;
                        }
                    }
                    this.zzO = this.zzI + zzr((this.zzn.zzN()[i13] << 8) | (this.zzn.zzN()[i11] & 255));
                    if (zzahoVar3.zzd != 2) {
                        i19 = i11;
                    } else if (i20 == 163) {
                        if ((this.zzn.zzN()[2] & 128) == 128) {
                            i19 = i11;
                        } else {
                            i19 = i13;
                        }
                        i20 = 163;
                    } else {
                        i19 = i13;
                    }
                    this.zzV = i19;
                    this.zzN = 2;
                    this.zzQ = i13;
                    i12 = 163;
                }
            }
            i11 = 1;
            i13 = 0;
            this.zzO = this.zzI + zzr((this.zzn.zzN()[i13] << 8) | (this.zzn.zzN()[i11] & 255));
            if (zzahoVar3.zzd != 2) {
                i19 = i11;
            } else if (i20 == 163) {
                if ((this.zzn.zzN()[2] & 128) == 128) {
                    i19 = i11;
                } else {
                    i19 = i13;
                }
                i20 = 163;
            } else {
                i19 = i13;
            }
            this.zzV = i19;
            this.zzN = 2;
            this.zzQ = i13;
            i12 = 163;
        } else {
            i11 = 1;
            i12 = 163;
        }
        if (i20 == i12) {
            while (true) {
                int i42 = this.zzQ;
                if (i42 >= this.zzR) {
                    this.zzN = 0;
                    return;
                }
                int iZzp = zzp(zzacsVar, zzahoVar3, this.zzS[i42], false);
                zzaho zzahoVar4 = zzahoVar3;
                zzu(zzahoVar4, this.zzO + ((long) ((this.zzQ * zzahoVar3.zze) / zzbbs.zzq.zzf)), this.zzV, iZzp, 0);
                this.zzQ++;
                zzahoVar3 = zzahoVar4;
            }
        } else {
            while (true) {
                int i43 = this.zzQ;
                if (i43 >= this.zzR) {
                    return;
                }
                int[] iArr3 = this.zzS;
                boolean z4 = i11;
                iArr3[i43] = zzp(zzacsVar, zzahoVar3, iArr3[i43], z4);
                this.zzQ += z4 ? 1 : 0;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzacr
    public final boolean zzi(zzacs zzacsVar) throws IOException {
        return new zzahr().zza(zzacsVar);
    }

    /* JADX WARN: Code duplicated, block: B:186:0x02d4  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void zzj(int i) throws zzbh {
        int i10;
        zzadq zzadpVar;
        int i11;
        zzdb.zzb(this.zzai);
        if (i == 160) {
            if (this.zzN == 2) {
                zzaho zzahoVar = (zzaho) this.zzh.get(this.zzT);
                zzahoVar.zzW.getClass();
                if (this.zzY > 0 && "A_OPUS".equals(zzahoVar.zzb)) {
                    zzed zzedVar = this.zzu;
                    byte[] bArrArray = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.zzY).array();
                    zzedVar.zzJ(bArrArray, bArrArray.length);
                }
                int i12 = 0;
                for (int i13 = 0; i13 < this.zzR; i13++) {
                    i12 += this.zzS[i13];
                }
                int i14 = 0;
                while (i14 < this.zzR) {
                    long j4 = this.zzO + ((long) ((zzahoVar.zze * i14) / zzbbs.zzq.zzf));
                    int i15 = this.zzV;
                    if (i14 == 0) {
                        if (!this.zzX) {
                            i15 |= 1;
                        }
                        i10 = 0;
                    } else {
                        i10 = i14;
                    }
                    int i16 = this.zzS[i10];
                    int i17 = i12 - i16;
                    zzu(zzahoVar, j4, i15, i16, i17);
                    i14 = i10 + 1;
                    i12 = i17;
                }
                this.zzN = 0;
                return;
            }
            return;
        }
        if (i != 174) {
            if (i == 19899) {
                int i18 = this.zzD;
                if (i18 != -1) {
                    long j10 = this.zzE;
                    if (j10 != -1) {
                        if (i18 == 475249515) {
                            this.zzG = j10;
                            return;
                        }
                        return;
                    }
                }
                throw zzbh.zza("Mandatory element SeekID or SeekPosition not found", null);
            }
            if (i == 25152) {
                zzt(i);
                zzaho zzahoVar2 = this.zzB;
                if (zzahoVar2.zzg) {
                    if (zzahoVar2.zzi == null) {
                        throw zzbh.zza("Encrypted Track found but ContentEncKeyID was not found", null);
                    }
                    zzahoVar2.zzk = new zzw(null, new zzv(zzj.zza, null, "video/webm", this.zzB.zzi.zzb));
                    return;
                }
                return;
            }
            if (i == 28032) {
                zzt(i);
                zzaho zzahoVar3 = this.zzB;
                if (zzahoVar3.zzg && zzahoVar3.zzh != null) {
                    throw zzbh.zza("Combining encryption and compression is not supported", null);
                }
                return;
            }
            if (i == 357149030) {
                if (this.zzy == -9223372036854775807L) {
                    this.zzy = 1000000L;
                }
                long j11 = this.zzz;
                if (j11 != -9223372036854775807L) {
                    this.zzA = zzr(j11);
                    return;
                }
                return;
            }
            if (i == 374648427) {
                if (this.zzh.size() == 0) {
                    throw zzbh.zza("No valid tracks were found", null);
                }
                this.zzai.zzD();
                return;
            }
            if (i != 475249515) {
                return;
            }
            if (!this.zzC) {
                zzacu zzacuVar = this.zzai;
                zzdu zzduVar = this.zzJ;
                zzdu zzduVar2 = this.zzK;
                if (this.zzx == -1 || this.zzA == -9223372036854775807L || zzduVar == null || zzduVar.zza() == 0 || zzduVar2 == null || zzduVar2.zza() != zzduVar.zza()) {
                    zzadpVar = new zzadp(this.zzA, 0L);
                } else {
                    int iZza = zzduVar.zza();
                    int[] iArrCopyOf = new int[iZza];
                    long[] jArrCopyOf = new long[iZza];
                    long[] jArrCopyOf2 = new long[iZza];
                    long[] jArrCopyOf3 = new long[iZza];
                    int i19 = 0;
                    while (i19 < iZza) {
                        jArrCopyOf3[i19] = zzduVar.zzb(i19);
                        jArrCopyOf[i19] = zzduVar2.zzb(i19) + this.zzx;
                        i19++;
                        iZza = iZza;
                    }
                    int i20 = iZza;
                    int i21 = 0;
                    while (true) {
                        i11 = i20 - 1;
                        if (i21 >= i11) {
                            break;
                        }
                        int i22 = i21 + 1;
                        iArrCopyOf[i21] = (int) (jArrCopyOf[i22] - jArrCopyOf[i21]);
                        jArrCopyOf2[i21] = jArrCopyOf3[i22] - jArrCopyOf3[i21];
                        i21 = i22;
                    }
                    iArrCopyOf[i11] = (int) ((this.zzx + this.zzw) - jArrCopyOf[i11]);
                    long j12 = this.zzA - jArrCopyOf3[i11];
                    jArrCopyOf2[i11] = j12;
                    if (j12 <= 0) {
                        zzdt.zzf("MatroskaExtractor", "Discarding last cue point with unexpected duration: " + j12);
                        iArrCopyOf = Arrays.copyOf(iArrCopyOf, i11);
                        jArrCopyOf = Arrays.copyOf(jArrCopyOf, i11);
                        jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i11);
                        jArrCopyOf3 = Arrays.copyOf(jArrCopyOf3, i11);
                    }
                    zzadpVar = new zzace(iArrCopyOf, jArrCopyOf, jArrCopyOf2, jArrCopyOf3);
                }
                zzacuVar.zzO(zzadpVar);
                this.zzC = true;
            }
            this.zzJ = null;
            this.zzK = null;
            return;
        }
        zzaho zzahoVar4 = this.zzB;
        zzdb.zzb(zzahoVar4);
        String str = zzahoVar4.zzb;
        if (str == null) {
            throw zzbh.zza("CodecId is missing in TrackEntry element", null);
        }
        switch (str.hashCode()) {
            case -2095576542:
                if (str.equals("V_MPEG4/ISO/AP")) {
                    zzahoVar4.zze(this.zzai, zzahoVar4.zzc);
                    this.zzh.put(zzahoVar4.zzc, zzahoVar4);
                }
                break;
            case -2095575984:
                if (str.equals("V_MPEG4/ISO/SP")) {
                    zzahoVar4.zze(this.zzai, zzahoVar4.zzc);
                    this.zzh.put(zzahoVar4.zzc, zzahoVar4);
                }
                break;
            case -1985379776:
                if (str.equals("A_MS/ACM")) {
                    zzahoVar4.zze(this.zzai, zzahoVar4.zzc);
                    this.zzh.put(zzahoVar4.zzc, zzahoVar4);
                }
                break;
            case -1784763192:
                if (str.equals("A_TRUEHD")) {
                    zzahoVar4.zze(this.zzai, zzahoVar4.zzc);
                    this.zzh.put(zzahoVar4.zzc, zzahoVar4);
                }
                break;
            case -1730367663:
                if (str.equals("A_VORBIS")) {
                    zzahoVar4.zze(this.zzai, zzahoVar4.zzc);
                    this.zzh.put(zzahoVar4.zzc, zzahoVar4);
                }
                break;
            case -1482641358:
                if (str.equals("A_MPEG/L2")) {
                    zzahoVar4.zze(this.zzai, zzahoVar4.zzc);
                    this.zzh.put(zzahoVar4.zzc, zzahoVar4);
                }
                break;
            case -1482641357:
                if (str.equals("A_MPEG/L3")) {
                    zzahoVar4.zze(this.zzai, zzahoVar4.zzc);
                    this.zzh.put(zzahoVar4.zzc, zzahoVar4);
                }
                break;
            case -1373388978:
                if (str.equals("V_MS/VFW/FOURCC")) {
                    zzahoVar4.zze(this.zzai, zzahoVar4.zzc);
                    this.zzh.put(zzahoVar4.zzc, zzahoVar4);
                }
                break;
            case -933872740:
                if (str.equals("S_DVBSUB")) {
                    zzahoVar4.zze(this.zzai, zzahoVar4.zzc);
                    this.zzh.put(zzahoVar4.zzc, zzahoVar4);
                }
                break;
            case -538363189:
                if (str.equals("V_MPEG4/ISO/ASP")) {
                    zzahoVar4.zze(this.zzai, zzahoVar4.zzc);
                    this.zzh.put(zzahoVar4.zzc, zzahoVar4);
                }
                break;
            case -538363109:
                if (str.equals("V_MPEG4/ISO/AVC")) {
                    zzahoVar4.zze(this.zzai, zzahoVar4.zzc);
                    this.zzh.put(zzahoVar4.zzc, zzahoVar4);
                }
                break;
            case -425012669:
                if (str.equals("S_VOBSUB")) {
                    zzahoVar4.zze(this.zzai, zzahoVar4.zzc);
                    this.zzh.put(zzahoVar4.zzc, zzahoVar4);
                }
                break;
            case -356037306:
                if (str.equals("A_DTS/LOSSLESS")) {
                    zzahoVar4.zze(this.zzai, zzahoVar4.zzc);
                    this.zzh.put(zzahoVar4.zzc, zzahoVar4);
                }
                break;
            case 62923557:
                if (str.equals("A_AAC")) {
                    zzahoVar4.zze(this.zzai, zzahoVar4.zzc);
                    this.zzh.put(zzahoVar4.zzc, zzahoVar4);
                }
                break;
            case 62923603:
                if (str.equals("A_AC3")) {
                    zzahoVar4.zze(this.zzai, zzahoVar4.zzc);
                    this.zzh.put(zzahoVar4.zzc, zzahoVar4);
                }
                break;
            case 62927045:
                if (str.equals("A_DTS")) {
                    zzahoVar4.zze(this.zzai, zzahoVar4.zzc);
                    this.zzh.put(zzahoVar4.zzc, zzahoVar4);
                }
                break;
            case 82318131:
                if (str.equals("V_AV1")) {
                    zzahoVar4.zze(this.zzai, zzahoVar4.zzc);
                    this.zzh.put(zzahoVar4.zzc, zzahoVar4);
                }
                break;
            case 82338133:
                if (str.equals("V_VP8")) {
                    zzahoVar4.zze(this.zzai, zzahoVar4.zzc);
                    this.zzh.put(zzahoVar4.zzc, zzahoVar4);
                }
                break;
            case 82338134:
                if (str.equals("V_VP9")) {
                    zzahoVar4.zze(this.zzai, zzahoVar4.zzc);
                    this.zzh.put(zzahoVar4.zzc, zzahoVar4);
                }
                break;
            case 99146302:
                if (str.equals("S_HDMV/PGS")) {
                    zzahoVar4.zze(this.zzai, zzahoVar4.zzc);
                    this.zzh.put(zzahoVar4.zzc, zzahoVar4);
                }
                break;
            case 444813526:
                if (str.equals("V_THEORA")) {
                    zzahoVar4.zze(this.zzai, zzahoVar4.zzc);
                    this.zzh.put(zzahoVar4.zzc, zzahoVar4);
                }
                break;
            case 542569478:
                if (str.equals("A_DTS/EXPRESS")) {
                    zzahoVar4.zze(this.zzai, zzahoVar4.zzc);
                    this.zzh.put(zzahoVar4.zzc, zzahoVar4);
                }
                break;
            case 635596514:
                if (str.equals("A_PCM/FLOAT/IEEE")) {
                    zzahoVar4.zze(this.zzai, zzahoVar4.zzc);
                    this.zzh.put(zzahoVar4.zzc, zzahoVar4);
                }
                break;
            case 725948237:
                if (str.equals("A_PCM/INT/BIG")) {
                    zzahoVar4.zze(this.zzai, zzahoVar4.zzc);
                    this.zzh.put(zzahoVar4.zzc, zzahoVar4);
                }
                break;
            case 725957860:
                if (str.equals("A_PCM/INT/LIT")) {
                    zzahoVar4.zze(this.zzai, zzahoVar4.zzc);
                    this.zzh.put(zzahoVar4.zzc, zzahoVar4);
                }
                break;
            case 738597099:
                if (str.equals("S_TEXT/ASS")) {
                    zzahoVar4.zze(this.zzai, zzahoVar4.zzc);
                    this.zzh.put(zzahoVar4.zzc, zzahoVar4);
                }
                break;
            case 855502857:
                if (str.equals("V_MPEGH/ISO/HEVC")) {
                    zzahoVar4.zze(this.zzai, zzahoVar4.zzc);
                    this.zzh.put(zzahoVar4.zzc, zzahoVar4);
                }
                break;
            case 1045209816:
                if (str.equals("S_TEXT/WEBVTT")) {
                    zzahoVar4.zze(this.zzai, zzahoVar4.zzc);
                    this.zzh.put(zzahoVar4.zzc, zzahoVar4);
                }
                break;
            case 1422270023:
                if (str.equals("S_TEXT/UTF8")) {
                    zzahoVar4.zze(this.zzai, zzahoVar4.zzc);
                    this.zzh.put(zzahoVar4.zzc, zzahoVar4);
                }
                break;
            case 1809237540:
                if (str.equals("V_MPEG2")) {
                    zzahoVar4.zze(this.zzai, zzahoVar4.zzc);
                    this.zzh.put(zzahoVar4.zzc, zzahoVar4);
                }
                break;
            case 1950749482:
                if (str.equals("A_EAC3")) {
                    zzahoVar4.zze(this.zzai, zzahoVar4.zzc);
                    this.zzh.put(zzahoVar4.zzc, zzahoVar4);
                }
                break;
            case 1950789798:
                if (str.equals("A_FLAC")) {
                    zzahoVar4.zze(this.zzai, zzahoVar4.zzc);
                    this.zzh.put(zzahoVar4.zzc, zzahoVar4);
                }
                break;
            case 1951062397:
                if (str.equals("A_OPUS")) {
                    zzahoVar4.zze(this.zzai, zzahoVar4.zzc);
                    this.zzh.put(zzahoVar4.zzc, zzahoVar4);
                }
                break;
        }
        this.zzB = null;
    }

    public final void zzk(int i, double d10) throws zzbh {
        if (i == 181) {
            zzt(i);
            this.zzB.zzQ = (int) d10;
            return;
        }
        if (i == 17545) {
            this.zzz = (long) d10;
            return;
        }
        switch (i) {
            case 21969:
                zzt(i);
                this.zzB.zzD = (float) d10;
                break;
            case 21970:
                zzt(i);
                this.zzB.zzE = (float) d10;
                break;
            case 21971:
                zzt(i);
                this.zzB.zzF = (float) d10;
                break;
            case 21972:
                zzt(i);
                this.zzB.zzG = (float) d10;
                break;
            case 21973:
                zzt(i);
                this.zzB.zzH = (float) d10;
                break;
            case 21974:
                zzt(i);
                this.zzB.zzI = (float) d10;
                break;
            case 21975:
                zzt(i);
                this.zzB.zzJ = (float) d10;
                break;
            case 21976:
                zzt(i);
                this.zzB.zzK = (float) d10;
                break;
            case 21977:
                zzt(i);
                this.zzB.zzL = (float) d10;
                break;
            case 21978:
                zzt(i);
                this.zzB.zzM = (float) d10;
                break;
            default:
                switch (i) {
                    case 30323:
                        zzt(i);
                        this.zzB.zzs = (float) d10;
                        break;
                    case 30324:
                        zzt(i);
                        this.zzB.zzt = (float) d10;
                        break;
                    case 30325:
                        zzt(i);
                        this.zzB.zzu = (float) d10;
                        break;
                }
                break;
        }
    }

    public final void zzl(int i, long j4) throws zzbh {
        boolean z4;
        if (i == 20529) {
            if (j4 == 0) {
                return;
            }
            throw zzbh.zza("ContentEncodingOrder " + j4 + " not supported", null);
        }
        if (i == 20530) {
            if (j4 == 1) {
                return;
            }
            throw zzbh.zza("ContentEncodingScope " + j4 + " not supported", null);
        }
        switch (i) {
            case 131:
                zzt(i);
                this.zzB.zzd = (int) j4;
                return;
            case 136:
                z4 = j4 == 1;
                zzt(i);
                this.zzB.zzV = z4;
                return;
            case 155:
                this.zzP = zzr(j4);
                return;
            case 159:
                zzt(i);
                this.zzB.zzO = (int) j4;
                return;
            case 176:
                zzt(i);
                this.zzB.zzl = (int) j4;
                return;
            case 179:
                zzs(i);
                this.zzJ.zzc(zzr(j4));
                return;
            case 186:
                zzt(i);
                this.zzB.zzm = (int) j4;
                return;
            case 215:
                zzt(i);
                this.zzB.zzc = (int) j4;
                return;
            case 231:
                this.zzI = zzr(j4);
                return;
            case 238:
                this.zzW = (int) j4;
                return;
            case 241:
                if (this.zzL) {
                    return;
                }
                zzs(i);
                this.zzK.zzc(j4);
                this.zzL = true;
                return;
            case 251:
                this.zzX = true;
                return;
            case 16871:
                zzt(i);
                this.zzB.zzY = (int) j4;
                return;
            case 16980:
                if (j4 == 3) {
                    return;
                }
                throw zzbh.zza("ContentCompAlgo " + j4 + " not supported", null);
            case 17029:
                if (j4 < 1 || j4 > 2) {
                    throw zzbh.zza("DocTypeReadVersion " + j4 + " not supported", null);
                }
                return;
            case 17143:
                if (j4 == 1) {
                    return;
                }
                throw zzbh.zza("EBMLReadVersion " + j4 + " not supported", null);
            case 18401:
                if (j4 == 5) {
                    return;
                }
                throw zzbh.zza("ContentEncAlgo " + j4 + " not supported", null);
            case 18408:
                if (j4 == 1) {
                    return;
                }
                throw zzbh.zza("AESSettingsCipherMode " + j4 + " not supported", null);
            case 21420:
                this.zzE = j4 + this.zzx;
                return;
            case 21432:
                int i10 = (int) j4;
                zzt(i);
                if (i10 == 0) {
                    this.zzB.zzw = 0;
                    return;
                }
                if (i10 == 1) {
                    this.zzB.zzw = 2;
                    return;
                } else if (i10 == 3) {
                    this.zzB.zzw = 1;
                    return;
                } else {
                    if (i10 != 15) {
                        return;
                    }
                    this.zzB.zzw = 3;
                    return;
                }
            case 21680:
                zzt(i);
                this.zzB.zzo = (int) j4;
                return;
            case 21682:
                zzt(i);
                this.zzB.zzq = (int) j4;
                return;
            case 21690:
                zzt(i);
                this.zzB.zzp = (int) j4;
                return;
            case 21930:
                z4 = j4 == 1;
                zzt(i);
                this.zzB.zzU = z4;
                return;
            case 21938:
                zzt(i);
                zzaho zzahoVar = this.zzB;
                zzahoVar.zzx = true;
                zzahoVar.zzn = (int) j4;
                return;
            case 21998:
                zzt(i);
                this.zzB.zzf = (int) j4;
                return;
            case 22186:
                zzt(i);
                this.zzB.zzR = j4;
                return;
            case 22203:
                zzt(i);
                this.zzB.zzS = j4;
                return;
            case 25188:
                zzt(i);
                this.zzB.zzP = (int) j4;
                return;
            case 30114:
                this.zzY = j4;
                return;
            case 30321:
                int i11 = (int) j4;
                zzt(i);
                if (i11 == 0) {
                    this.zzB.zzr = 0;
                    return;
                }
                if (i11 == 1) {
                    this.zzB.zzr = 1;
                    return;
                } else if (i11 == 2) {
                    this.zzB.zzr = 2;
                    return;
                } else {
                    if (i11 != 3) {
                        return;
                    }
                    this.zzB.zzr = 3;
                    return;
                }
            case 2352003:
                zzt(i);
                this.zzB.zze = (int) j4;
                return;
            case 2807729:
                this.zzy = j4;
                return;
            default:
                switch (i) {
                    case 21945:
                        int i12 = (int) j4;
                        zzt(i);
                        if (i12 == 1) {
                            this.zzB.zzA = 2;
                            return;
                        } else {
                            if (i12 != 2) {
                                return;
                            }
                            this.zzB.zzA = 1;
                            return;
                        }
                    case 21946:
                        zzt(i);
                        int iZzb = zzm.zzb((int) j4);
                        if (iZzb != -1) {
                            this.zzB.zzz = iZzb;
                            return;
                        }
                        return;
                    case 21947:
                        zzt(i);
                        this.zzB.zzx = true;
                        int iZza = zzm.zza((int) j4);
                        if (iZza != -1) {
                            this.zzB.zzy = iZza;
                            return;
                        }
                        return;
                    case 21948:
                        zzt(i);
                        this.zzB.zzB = (int) j4;
                        return;
                    case 21949:
                        zzt(i);
                        this.zzB.zzC = (int) j4;
                        return;
                    default:
                        return;
                }
        }
    }

    public final void zzm(int i, long j4, long j10) throws zzbh {
        zzdb.zzb(this.zzai);
        if (i == 160) {
            this.zzX = false;
            this.zzY = 0L;
            return;
        }
        if (i == 174) {
            this.zzB = new zzaho();
            return;
        }
        if (i == 187) {
            this.zzL = false;
            return;
        }
        if (i == 19899) {
            this.zzD = -1;
            this.zzE = -1L;
            return;
        }
        if (i == 20533) {
            zzt(i);
            this.zzB.zzg = true;
            return;
        }
        if (i == 21968) {
            zzt(i);
            this.zzB.zzx = true;
            return;
        }
        if (i == 408125543) {
            long j11 = this.zzx;
            if (j11 != -1 && j11 != j4) {
                throw zzbh.zza("Multiple Segment elements not supported", null);
            }
            this.zzx = j4;
            this.zzw = j10;
            return;
        }
        if (i == 475249515) {
            this.zzJ = new zzdu(32);
            this.zzK = new zzdu(32);
        } else if (i == 524531317 && !this.zzC) {
            if (this.zzi && this.zzG != -1) {
                this.zzF = true;
            } else {
                this.zzai.zzO(new zzadp(this.zzA, 0L));
                this.zzC = true;
            }
        }
    }

    public final void zzn(int i, String str) throws zzbh {
        if (i == 134) {
            zzt(i);
            this.zzB.zzb = str;
            return;
        }
        if (i == 17026) {
            if ("webm".equals(str) || "matroska".equals(str)) {
                return;
            }
            throw zzbh.zza("DocType " + str + " not supported", null);
        }
        if (i == 21358) {
            zzt(i);
            this.zzB.zza = str;
        } else {
            if (i != 2274716) {
                return;
            }
            zzt(i);
            this.zzB.zzZ = str;
        }
    }

    public zzahq(zzahl zzahlVar, int i, zzakg zzakgVar) {
        this.zzx = -1L;
        this.zzy = -9223372036854775807L;
        this.zzz = -9223372036854775807L;
        this.zzA = -9223372036854775807L;
        this.zzG = -1L;
        this.zzH = -1L;
        this.zzI = -9223372036854775807L;
        this.zzaj = zzahlVar;
        zzahlVar.zza(new zzahn(this, null));
        this.zzk = zzakgVar;
        this.zzi = 1 == ((i & 1) ^ 1);
        this.zzj = (i & 2) == 0;
        this.zzg = new zzahs();
        this.zzh = new SparseArray();
        this.zzn = new zzed(4);
        this.zzo = new zzed(ByteBuffer.allocate(4).putInt(-1).array());
        this.zzp = new zzed(4);
        this.zzl = new zzed(zzfp.zza);
        this.zzm = new zzed(4);
        this.zzq = new zzed();
        this.zzr = new zzed();
        this.zzs = new zzed(8);
        this.zzt = new zzed();
        this.zzu = new zzed();
        this.zzS = new int[1];
    }

    public zzahq(zzakg zzakgVar, int i) {
        this(new zzahl(), 0, zzakgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzacr
    public final /* synthetic */ zzacr zzc() {
        return this;
    }
}
