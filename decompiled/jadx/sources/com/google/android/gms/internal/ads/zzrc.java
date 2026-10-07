package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzrc extends zzsy implements zzkp {
    private final Context zzb;
    private final zzpm zzc;
    private final zzpu zzd;
    private final zzsj zze;
    private int zzf;
    private boolean zzg;
    private boolean zzh;
    private zzad zzi;
    private zzad zzj;
    private long zzk;
    private boolean zzl;
    private boolean zzm;
    private boolean zzn;
    private int zzo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzrc(Context context, zzsl zzslVar, zzta zztaVar, boolean z4, Handler handler, zzpn zzpnVar, zzpu zzpuVar) {
        super(1, zzslVar, zztaVar, false, 44100.0f);
        zzrb zzrbVar = null;
        zzsj zzsjVar = zzen.zza >= 35 ? new zzsj(zzsi.zza) : null;
        this.zzb = context.getApplicationContext();
        this.zzd = zzpuVar;
        this.zze = zzsjVar;
        this.zzo = -1000;
        this.zzc = new zzpm(handler, zzpnVar);
        zzpuVar.zzq(new zzra(this, zzrbVar));
    }

    private final int zzaQ(zzsq zzsqVar, zzad zzadVar) {
        int i;
        if (!"OMX.google.raw.decoder".equals(zzsqVar.zza) || (i = zzen.zza) >= 24 || (i == 23 && zzen.zzM(this.zzb))) {
            return zzadVar.zzp;
        }
        return -1;
    }

    private static List zzaR(zzta zztaVar, zzad zzadVar, boolean z4, zzpu zzpuVar) throws zztf {
        zzsq zzsqVarZza;
        if (zzadVar.zzo == null) {
            return zzfzo.zzn();
        }
        return (!zzpuVar.zzA(zzadVar) || (zzsqVarZza = zztl.zza()) == null) ? zztl.zze(zztaVar, zzadVar, false, false) : zzfzo.zzo(zzsqVarZza);
    }

    private final void zzaS() {
        long jZzb = this.zzd.zzb(zzW());
        if (jZzb != Long.MIN_VALUE) {
            if (!this.zzl) {
                jZzb = Math.max(this.zzk, jZzb);
            }
            this.zzk = jZzb;
            this.zzl = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhw
    public final void zzA() {
        zzsj zzsjVar;
        this.zzd.zzk();
        if (zzen.zza < 35 || (zzsjVar = this.zze) == null) {
            return;
        }
        zzsjVar.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzsy, com.google.android.gms.internal.ads.zzhw
    public final void zzC() {
        this.zzn = false;
        try {
            super.zzC();
            if (this.zzm) {
            }
        } finally {
            if (this.zzm) {
                this.zzm = false;
                this.zzd.zzl();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhw
    public final void zzD() {
        this.zzd.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzhw
    public final void zzE() {
        zzaS();
        this.zzd.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzln, com.google.android.gms.internal.ads.zzlq
    public final String zzU() {
        return "MediaCodecAudioRenderer";
    }

    @Override // com.google.android.gms.internal.ads.zzsy, com.google.android.gms.internal.ads.zzln
    public final boolean zzW() {
        return super.zzW() && this.zzd.zzz();
    }

    @Override // com.google.android.gms.internal.ads.zzsy, com.google.android.gms.internal.ads.zzln
    public final boolean zzX() {
        return this.zzd.zzy() || super.zzX();
    }

    @Override // com.google.android.gms.internal.ads.zzsy
    public final float zzZ(float f10, zzad zzadVar, zzad[] zzadVarArr) {
        int iMax = -1;
        for (zzad zzadVar2 : zzadVarArr) {
            int i = zzadVar2.zzD;
            if (i != -1) {
                iMax = Math.max(iMax, i);
            }
        }
        if (iMax == -1) {
            return -1.0f;
        }
        return iMax * f10;
    }

    @Override // com.google.android.gms.internal.ads.zzkp
    public final long zza() {
        if (zzcV() == 2) {
            zzaS();
        }
        return this.zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzsy
    public final int zzaa(zzta zztaVar, zzad zzadVar) throws zztf {
        int i;
        boolean z4;
        if (!zzbg.zzg(zzadVar.zzo)) {
            return 128;
        }
        int i10 = zzadVar.zzJ;
        boolean zZzaP = zzsy.zzaP(zzadVar);
        int i11 = 1;
        if (!zZzaP || (i10 != 0 && zztl.zza() == null)) {
            i = 0;
        } else {
            zzoz zzozVarZzd = this.zzd.zzd(zzadVar);
            if (zzozVarZzd.zzb) {
                i = true != zzozVarZzd.zzc ? 512 : 1536;
                if (zzozVarZzd.zzd) {
                    i |= 2048;
                }
            } else {
                i = 0;
            }
            if (this.zzd.zzA(zzadVar)) {
                return i | 172;
            }
        }
        if ((!"audio/raw".equals(zzadVar.zzo) || this.zzd.zzA(zzadVar)) && this.zzd.zzA(zzen.zzA(2, zzadVar.zzC, zzadVar.zzD))) {
            List listZzaR = zzaR(zztaVar, zzadVar, false, this.zzd);
            if (!listZzaR.isEmpty()) {
                if (zZzaP) {
                    zzsq zzsqVar = (zzsq) listZzaR.get(0);
                    boolean zZze = zzsqVar.zze(zzadVar);
                    if (!zZze) {
                        int i12 = 1;
                        while (true) {
                            if (i12 >= listZzaR.size()) {
                                z4 = true;
                                break;
                            }
                            zzsq zzsqVar2 = (zzsq) listZzaR.get(i12);
                            if (zzsqVar2.zze(zzadVar)) {
                                z4 = false;
                                zZze = true;
                                zzsqVar = zzsqVar2;
                                break;
                            }
                            i12++;
                        }
                    } else {
                        z4 = true;
                        break;
                    }
                    int i13 = true != zZze ? 3 : 4;
                    int i14 = 8;
                    if (zZze && zzsqVar.zzf(zzadVar)) {
                        i14 = 16;
                    }
                    return i13 | i14 | 32 | (true != zzsqVar.zzg ? 0 : 64) | (true != z4 ? 0 : 128) | i;
                }
                i11 = 2;
            }
        }
        return i11 | 128;
    }

    @Override // com.google.android.gms.internal.ads.zzsy
    public final zzhy zzab(zzsq zzsqVar, zzad zzadVar, zzad zzadVar2) {
        int i;
        int i10;
        zzhy zzhyVarZzb = zzsqVar.zzb(zzadVar, zzadVar2);
        int i11 = zzhyVarZzb.zze;
        if (zzaM(zzadVar2)) {
            i11 |= 32768;
        }
        if (zzaQ(zzsqVar, zzadVar2) > this.zzf) {
            i11 |= 64;
        }
        String str = zzsqVar.zza;
        if (i11 != 0) {
            i10 = 0;
            i = i11;
        } else {
            i = 0;
            i10 = zzhyVarZzb.zzd;
        }
        return new zzhy(str, zzadVar, zzadVar2, i10, i);
    }

    @Override // com.google.android.gms.internal.ads.zzsy
    public final zzhy zzac(zzkj zzkjVar) throws zzig {
        zzad zzadVar = zzkjVar.zza;
        zzadVar.getClass();
        this.zzi = zzadVar;
        zzhy zzhyVarZzac = super.zzac(zzkjVar);
        this.zzc.zzi(zzadVar, zzhyVarZzac);
        return zzhyVarZzac;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005e  */
    /* JADX WARN: Code duplicated, block: B:44:0x00d1  */
    @Override // com.google.android.gms.internal.ads.zzsy
    public final zzsk zzaf(zzsq zzsqVar, zzad zzadVar, MediaCrypto mediaCrypto, float f10) {
        boolean z4;
        zzad[] zzadVarArrZzT = zzT();
        int length = zzadVarArrZzT.length;
        int iZzaQ = zzaQ(zzsqVar, zzadVar);
        if (length != 1) {
            for (zzad zzadVar2 : zzadVarArrZzT) {
                if (zzsqVar.zzb(zzadVar, zzadVar2).zzd != 0) {
                    iZzaQ = Math.max(iZzaQ, zzaQ(zzsqVar, zzadVar2));
                }
            }
        }
        this.zzf = iZzaQ;
        String str = zzsqVar.zza;
        int i = zzen.zza;
        if (i < 24 && "OMX.SEC.aac.dec".equals(str) && "samsung".equals(zzen.zzc)) {
            String str2 = zzen.zzb;
            if (str2.startsWith("zeroflte") || str2.startsWith("herolte") || str2.startsWith("heroqlte")) {
                z4 = true;
            } else {
                z4 = false;
            }
        } else {
            z4 = false;
        }
        this.zzg = z4;
        String str3 = zzsqVar.zza;
        this.zzh = str3.equals("OMX.google.opus.decoder") || str3.equals("c2.android.opus.decoder") || str3.equals("OMX.google.vorbis.decoder") || str3.equals("c2.android.vorbis.decoder");
        String str4 = zzsqVar.zzc;
        int i10 = this.zzf;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str4);
        mediaFormat.setInteger("channel-count", zzadVar.zzC);
        mediaFormat.setInteger("sample-rate", zzadVar.zzD);
        zzdw.zzb(mediaFormat, zzadVar.zzr);
        zzdw.zza(mediaFormat, "max-input-size", i10);
        if (i >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f10 != -1.0f) {
                if (i == 23) {
                    String str5 = zzen.zzd;
                    if (!"ZTE B2017G".equals(str5) && !"AXON 7 mini".equals(str5)) {
                        mediaFormat.setFloat("operating-rate", f10);
                    }
                } else {
                    mediaFormat.setFloat("operating-rate", f10);
                }
            }
        }
        if (i <= 28 && "audio/ac4".equals(zzadVar.zzo)) {
            mediaFormat.setInteger("ac4-is-sync", 1);
        }
        if (i >= 24 && this.zzd.zza(zzen.zzA(4, zzadVar.zzC, zzadVar.zzD)) == 2) {
            mediaFormat.setInteger("pcm-encoding", 4);
        }
        if (i >= 32) {
            mediaFormat.setInteger("max-output-channel-count", 99);
        }
        if (i >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.zzo));
        }
        this.zzj = (!"audio/raw".equals(zzsqVar.zzb) || "audio/raw".equals(zzadVar.zzo)) ? null : zzadVar;
        return zzsk.zza(zzsqVar, mediaFormat, zzadVar, null, this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzsy
    public final List zzag(zzta zztaVar, zzad zzadVar, boolean z4) throws zztf {
        return zztl.zzf(zzaR(zztaVar, zzadVar, false, this.zzd), zzadVar);
    }

    @Override // com.google.android.gms.internal.ads.zzsy
    public final void zzaj(zzhm zzhmVar) {
        zzad zzadVar;
        if (zzen.zza < 29 || (zzadVar = zzhmVar.zza) == null || !Objects.equals(zzadVar.zzo, "audio/opus") || !zzaL()) {
            return;
        }
        ByteBuffer byteBuffer = zzhmVar.zzf;
        byteBuffer.getClass();
        zzad zzadVar2 = zzhmVar.zza;
        zzadVar2.getClass();
        int i = zzadVar2.zzF;
        if (byteBuffer.remaining() == 8) {
            this.zzd.zzr(i, (int) ((byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong() * 48000) / 1000000000));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsy
    public final void zzak(Exception exc) {
        zzdt.zzd("MediaCodecAudioRenderer", "Audio codec error", exc);
        this.zzc.zza(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzsy
    public final void zzal(String str, zzsk zzskVar, long j4, long j10) {
        this.zzc.zze(str, j4, j10);
    }

    @Override // com.google.android.gms.internal.ads.zzsy
    public final void zzam(String str) {
        this.zzc.zzf(str);
    }

    @Override // com.google.android.gms.internal.ads.zzsy
    public final void zzan(zzad zzadVar, MediaFormat mediaFormat) throws zzig {
        int iZzn;
        int i;
        zzad zzadVar2 = this.zzj;
        int[] iArr = null;
        boolean z4 = true;
        if (zzadVar2 != null) {
            zzadVar = zzadVar2;
        } else if (zzaz() != null) {
            mediaFormat.getClass();
            if ("audio/raw".equals(zzadVar.zzo)) {
                iZzn = zzadVar.zzE;
            } else if (zzen.zza < 24 || !mediaFormat.containsKey("pcm-encoding")) {
                iZzn = mediaFormat.containsKey("v-bits-per-sample") ? zzen.zzn(mediaFormat.getInteger("v-bits-per-sample")) : 2;
            } else {
                iZzn = mediaFormat.getInteger("pcm-encoding");
            }
            zzab zzabVar = new zzab();
            zzabVar.zzZ("audio/raw");
            zzabVar.zzT(iZzn);
            zzabVar.zzG(zzadVar.zzF);
            zzabVar.zzH(zzadVar.zzG);
            zzabVar.zzS(zzadVar.zzl);
            zzabVar.zzL(zzadVar.zza);
            zzabVar.zzN(zzadVar.zzb);
            zzabVar.zzO(zzadVar.zzc);
            zzabVar.zzP(zzadVar.zzd);
            zzabVar.zzab(zzadVar.zze);
            zzabVar.zzX(zzadVar.zzf);
            zzabVar.zzz(mediaFormat.getInteger("channel-count"));
            zzabVar.zzaa(mediaFormat.getInteger("sample-rate"));
            zzad zzadVarZzaf = zzabVar.zzaf();
            if (this.zzg && zzadVarZzaf.zzC == 6 && (i = zzadVar.zzC) < 6) {
                iArr = new int[i];
                for (int i10 = 0; i10 < zzadVar.zzC; i10++) {
                    iArr[i10] = i10;
                }
            } else if (this.zzh) {
                int i11 = zzadVarZzaf.zzC;
                if (i11 == 3) {
                    iArr = new int[]{0, 2, 1};
                } else if (i11 == 5) {
                    iArr = new int[]{0, 2, 1, 3, 4};
                } else if (i11 == 6) {
                    iArr = new int[]{0, 2, 1, 5, 3, 4};
                } else if (i11 == 7) {
                    iArr = new int[]{0, 2, 1, 6, 5, 3, 4};
                } else if (i11 == 8) {
                    iArr = new int[]{0, 2, 1, 7, 5, 6, 3, 4};
                }
            }
            zzadVar = zzadVarZzaf;
        }
        try {
            int i12 = zzen.zza;
            if (i12 >= 29) {
                if (zzaL()) {
                    zzn();
                }
                if (i12 < 29) {
                    z4 = false;
                }
                zzdb.zzf(z4);
            }
            this.zzd.zze(zzadVar, 0, iArr);
        } catch (zzpp e) {
            throw zzcY(e, e.zza, false, 5001);
        }
    }

    public final void zzao() {
        this.zzl = true;
    }

    @Override // com.google.android.gms.internal.ads.zzsy
    public final void zzap() {
        this.zzd.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzsy
    public final void zzaq() throws zzig {
        try {
            this.zzd.zzj();
        } catch (zzpt e) {
            throw zzcY(e, e.zzc, e.zzb, true != zzaL() ? 5002 : 5003);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsy
    public final boolean zzar(long j4, long j10, zzsn zzsnVar, ByteBuffer byteBuffer, int i, int i10, int i11, long j11, boolean z4, boolean z10, zzad zzadVar) throws zzig {
        byteBuffer.getClass();
        if (this.zzj != null && (i10 & 2) != 0) {
            zzsnVar.getClass();
            zzsnVar.zzo(i, false);
            return true;
        }
        if (z4) {
            if (zzsnVar != null) {
                zzsnVar.zzo(i, false);
            }
            ((zzsy) this).zza.zzf += i11;
            this.zzd.zzg();
            return true;
        }
        try {
            if (!this.zzd.zzx(byteBuffer, j11, i11)) {
                return false;
            }
            if (zzsnVar != null) {
                zzsnVar.zzo(i, false);
            }
            ((zzsy) this).zza.zze += i11;
            return true;
        } catch (zzpq e) {
            zzad zzadVar2 = this.zzi;
            if (zzaL()) {
                zzn();
            }
            throw zzcY(e, zzadVar2, e.zzb, 5001);
        } catch (zzpt e4) {
            if (zzaL()) {
                zzn();
            }
            throw zzcY(e4, zzadVar, e4.zzb, 5002);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsy
    public final boolean zzas(zzad zzadVar) {
        zzn();
        return this.zzd.zzA(zzadVar);
    }

    @Override // com.google.android.gms.internal.ads.zzkp
    public final zzbj zzc() {
        return this.zzd.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzkp
    public final void zzg(zzbj zzbjVar) {
        this.zzd.zzs(zzbjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzkp
    public final boolean zzj() {
        boolean z4 = this.zzn;
        this.zzn = false;
        return z4;
    }

    @Override // com.google.android.gms.internal.ads.zzsy, com.google.android.gms.internal.ads.zzhw, com.google.android.gms.internal.ads.zzli
    public final void zzu(int i, Object obj) throws zzig {
        zzsj zzsjVar;
        if (i == 2) {
            zzpu zzpuVar = this.zzd;
            obj.getClass();
            zzpuVar.zzw(((Float) obj).floatValue());
            return;
        }
        if (i == 3) {
            zzg zzgVar = (zzg) obj;
            zzpu zzpuVar2 = this.zzd;
            zzgVar.getClass();
            zzpuVar2.zzm(zzgVar);
            return;
        }
        if (i == 6) {
            zzh zzhVar = (zzh) obj;
            zzpu zzpuVar3 = this.zzd;
            zzhVar.getClass();
            zzpuVar3.zzo(zzhVar);
            return;
        }
        if (i == 12) {
            if (zzen.zza >= 23) {
                zzqz.zza(this.zzd, obj);
                return;
            }
            return;
        }
        if (i == 16) {
            obj.getClass();
            this.zzo = ((Integer) obj).intValue();
            zzsn zzsnVarZzaz = zzaz();
            if (zzsnVarZzaz == null || zzen.zza < 35) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putInt("importance", Math.max(0, -this.zzo));
            zzsnVarZzaz.zzq(bundle);
            return;
        }
        if (i == 9) {
            zzpu zzpuVar4 = this.zzd;
            obj.getClass();
            zzpuVar4.zzv(((Boolean) obj).booleanValue());
        } else {
            if (i != 10) {
                super.zzu(i, obj);
                return;
            }
            obj.getClass();
            int iIntValue = ((Integer) obj).intValue();
            this.zzd.zzn(iIntValue);
            if (zzen.zza < 35 || (zzsjVar = this.zze) == null) {
                return;
            }
            zzsjVar.zzd(iIntValue);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsy, com.google.android.gms.internal.ads.zzhw
    public final void zzx() {
        this.zzm = true;
        this.zzi = null;
        try {
            this.zzd.zzf();
            super.zzx();
        } catch (Throwable th) {
            super.zzx();
            throw th;
        } finally {
            this.zzc.zzg(((zzsy) this).zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsy, com.google.android.gms.internal.ads.zzhw
    public final void zzy(boolean z4, boolean z10) throws zzig {
        super.zzy(z4, z10);
        this.zzc.zzh(((zzsy) this).zza);
        zzn();
        this.zzd.zzt(zzo());
        this.zzd.zzp(zzi());
    }

    @Override // com.google.android.gms.internal.ads.zzsy, com.google.android.gms.internal.ads.zzhw
    public final void zzz(long j4, boolean z4) throws zzig {
        super.zzz(j4, z4);
        this.zzd.zzf();
        this.zzk = j4;
        this.zzn = false;
        this.zzl = true;
    }

    @Override // com.google.android.gms.internal.ads.zzhw, com.google.android.gms.internal.ads.zzln
    public final zzkp zzl() {
        return this;
    }
}
