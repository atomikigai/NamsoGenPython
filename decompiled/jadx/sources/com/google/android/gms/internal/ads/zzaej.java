package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzaej implements zzacr {
    private final zzed zza;
    private final zzaeh zzb;
    private final boolean zzc;
    private final zzakg zzd;
    private int zze;
    private zzacu zzf;
    private zzaek zzg;
    private long zzh;
    private zzaem[] zzi;
    private long zzj;
    private zzaem zzk;
    private int zzl;
    private long zzm;
    private long zzn;
    private int zzo;
    private boolean zzp;

    @Deprecated
    public zzaej() {
        this(1, zzakg.zza);
    }

    private final zzaem zzg(int i) {
        for (zzaem zzaemVar : this.zzi) {
            if (zzaemVar.zzf(i)) {
                return zzaemVar;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:139:0x02ef  */
    @Override // com.google.android.gms.internal.ads.zzacr
    public final int zzb(zzacs zzacsVar, zzadn zzadnVar) throws IOException {
        boolean z4;
        int i;
        int i10;
        zzaem zzaemVar;
        long j4 = this.zzj;
        int i11 = 0;
        if (j4 != -1) {
            long jZzf = zzacsVar.zzf();
            if (j4 < jZzf || j4 > 262144 + jZzf) {
                zzadnVar.zza = j4;
                z4 = true;
            } else {
                zzacsVar.zzk((int) (j4 - jZzf));
                z4 = false;
            }
        } else {
            z4 = false;
        }
        this.zzj = -1L;
        if (z4) {
            return 1;
        }
        int i12 = this.zze;
        zzaem zzaemVar2 = null;
        if (i12 == 0) {
            if (!zzi(zzacsVar)) {
                throw zzbh.zza("AVI Header List not found", null);
            }
            zzacsVar.zzk(12);
            this.zze = 1;
            return 0;
        }
        if (i12 == 1) {
            zzacsVar.zzi(this.zza.zzN(), 0, 12);
            this.zza.zzL(0);
            zzaeh zzaehVar = this.zzb;
            zzed zzedVar = this.zza;
            zzaehVar.zza(zzedVar);
            int i13 = zzaehVar.zza;
            if (i13 != 1414744396) {
                throw zzbh.zza("LIST expected, found: " + i13, null);
            }
            zzaehVar.zzc = zzedVar.zzi();
            zzaeh zzaehVar2 = this.zzb;
            int i14 = zzaehVar2.zzc;
            if (i14 == 1819436136) {
                this.zzl = zzaehVar2.zzb;
                this.zze = 2;
                return 0;
            }
            throw zzbh.zza("hdrl expected, found: " + i14, null);
        }
        if (i12 == 2) {
            int i15 = this.zzl - 4;
            zzed zzedVar2 = new zzed(i15);
            zzacsVar.zzi(zzedVar2.zzN(), 0, i15);
            zzaen zzaenVarZzc = zzaen.zzc(1819436136, zzedVar2);
            if (zzaenVarZzc.zza() != 1819436136) {
                throw zzbh.zza("Unexpected header list type " + zzaenVarZzc.zza(), null);
            }
            zzaek zzaekVar = (zzaek) zzaenVarZzc.zzb(zzaek.class);
            if (zzaekVar == null) {
                throw zzbh.zza("AviHeader not found", null);
            }
            this.zzg = zzaekVar;
            this.zzh = ((long) zzaekVar.zzc) * ((long) zzaekVar.zza);
            ArrayList arrayList = new ArrayList();
            zzfzo zzfzoVar = zzaenVarZzc.zza;
            int size = zzfzoVar.size();
            int i16 = 0;
            int i17 = 0;
            while (i16 < size) {
                zzaef zzaefVar = (zzaef) zzfzoVar.get(i16);
                if (zzaefVar.zza() == 1819440243) {
                    zzaen zzaenVar = (zzaen) zzaefVar;
                    int i18 = i17 + 1;
                    zzael zzaelVar = (zzael) zzaenVar.zzb(zzael.class);
                    zzaeo zzaeoVar = (zzaeo) zzaenVar.zzb(zzaeo.class);
                    if (zzaelVar == null) {
                        zzdt.zzf("AviExtractor", "Missing Stream Header");
                    } else {
                        if (zzaeoVar == null) {
                            zzdt.zzf("AviExtractor", "Missing Stream Format");
                        } else {
                            int i19 = zzaelVar.zzd;
                            int i20 = zzaelVar.zzb;
                            int i21 = zzaelVar.zzc;
                            zzad zzadVar = zzaeoVar.zza;
                            i = i18;
                            long jZzu = zzen.zzu(i19, ((long) i20) * 1000000, i21, RoundingMode.FLOOR);
                            zzab zzabVarZzb = zzadVar.zzb();
                            zzabVarZzb.zzK(i17);
                            int i22 = zzaelVar.zze;
                            if (i22 != 0) {
                                zzabVarZzb.zzQ(i22);
                            }
                            zzaep zzaepVar = (zzaep) zzaenVar.zzb(zzaep.class);
                            if (zzaepVar != null) {
                                zzabVarZzb.zzN(zzaepVar.zza);
                            }
                            int iZzb = zzbg.zzb(zzadVar.zzo);
                            if (iZzb == 1) {
                                i10 = iZzb;
                            } else if (iZzb == 2) {
                                i10 = 2;
                            } else {
                                zzaemVar = null;
                            }
                            zzadx zzadxVarZzw = this.zzf.zzw(i17, i10);
                            zzadxVarZzw.zzl(zzabVarZzb.zzaf());
                            zzaemVar = new zzaem(i17, i10, jZzu, zzaelVar.zzd, zzadxVarZzw);
                            this.zzh = jZzu;
                        }
                        if (zzaemVar != null) {
                            arrayList.add(zzaemVar);
                        }
                        i17 = i;
                    }
                    zzaemVar = zzaemVar2;
                    i = i18;
                    if (zzaemVar != null) {
                        arrayList.add(zzaemVar);
                    }
                    i17 = i;
                }
                i16++;
                zzaemVar2 = null;
                i11 = 0;
            }
            int i23 = i11;
            this.zzi = (zzaem[]) arrayList.toArray(new zzaem[i23]);
            this.zzf.zzD();
            this.zze = 3;
            return i23;
        }
        long j10 = 0;
        if (i12 == 3) {
            long j11 = this.zzm;
            if (j11 != -1 && zzacsVar.zzf() != j11) {
                this.zzj = j11;
                return 0;
            }
            zzacsVar.zzh(this.zza.zzN(), 0, 12);
            zzacsVar.zzj();
            this.zza.zzL(0);
            this.zzb.zza(this.zza);
            zzed zzedVar3 = this.zza;
            zzaeh zzaehVar3 = this.zzb;
            int iZzi = zzedVar3.zzi();
            int i24 = zzaehVar3.zza;
            if (i24 == 1179011410) {
                zzacsVar.zzk(12);
                return 0;
            }
            if (i24 != 1414744396 || iZzi != 1769369453) {
                this.zzj = zzacsVar.zzf() + ((long) this.zzb.zzb) + 8;
                return 0;
            }
            long jZzf2 = zzacsVar.zzf();
            this.zzm = jZzf2;
            long j12 = jZzf2 + ((long) this.zzb.zzb) + 8;
            this.zzn = j12;
            if (!this.zzp) {
                zzaek zzaekVar2 = this.zzg;
                zzaekVar2.getClass();
                if ((zzaekVar2.zzb & 16) == 16) {
                    this.zze = 4;
                    this.zzj = j12;
                    return 0;
                }
                this.zzf.zzO(new zzadp(this.zzh, 0L));
                this.zzp = true;
            }
            this.zzj = zzacsVar.zzf() + 12;
            this.zze = 6;
            return 0;
        }
        if (i12 == 4) {
            zzacsVar.zzi(this.zza.zzN(), 0, 8);
            this.zza.zzL(0);
            zzed zzedVar4 = this.zza;
            int iZzi2 = zzedVar4.zzi();
            int iZzi3 = zzedVar4.zzi();
            if (iZzi2 == 829973609) {
                this.zze = 5;
                this.zzo = iZzi3;
            } else {
                this.zzj = zzacsVar.zzf() + ((long) iZzi3);
            }
            return 0;
        }
        if (i12 == 5) {
            zzed zzedVar5 = new zzed(this.zzo);
            zzacsVar.zzi(zzedVar5.zzN(), 0, this.zzo);
            if (zzedVar5.zzb() >= 16) {
                int iZzd = zzedVar5.zzd();
                zzedVar5.zzM(8);
                long jZzi = zzedVar5.zzi();
                long j13 = this.zzm;
                j10 = jZzi <= j13 ? j13 + 8 : 0L;
                zzedVar5.zzL(iZzd);
            }
            while (zzedVar5.zzb() >= 16) {
                int iZzi4 = zzedVar5.zzi();
                int iZzi5 = zzedVar5.zzi();
                long jZzi2 = ((long) zzedVar5.zzi()) + j10;
                zzedVar5.zzi();
                zzaem zzaemVarZzg = zzg(iZzi4);
                if (zzaemVarZzg != null) {
                    zzaemVarZzg.zzb(jZzi2, (iZzi5 & 16) == 16);
                }
            }
            for (zzaem zzaemVar3 : this.zzi) {
                zzaemVar3.zzc();
            }
            this.zzp = true;
            this.zzf.zzO(new zzaeg(this, this.zzh));
            this.zze = 6;
            this.zzj = this.zzm;
            return 0;
        }
        if (zzacsVar.zzf() >= this.zzn) {
            return -1;
        }
        zzaem zzaemVar4 = this.zzk;
        if (zzaemVar4 != null) {
            if (!zzaemVar4.zzg(zzacsVar)) {
                return 0;
            }
            this.zzk = null;
            return 0;
        }
        if ((zzacsVar.zzf() & 1) == 1) {
            zzacsVar.zzk(1);
        }
        zzacsVar.zzh(this.zza.zzN(), 0, 12);
        this.zza.zzL(0);
        int iZzi6 = this.zza.zzi();
        if (iZzi6 == 1414744396) {
            this.zza.zzL(8);
            zzacsVar.zzk(this.zza.zzi() != 1769369453 ? 8 : 12);
            zzacsVar.zzj();
            return 0;
        }
        int iZzi7 = this.zza.zzi();
        if (iZzi6 == 1263424842) {
            this.zzj = zzacsVar.zzf() + ((long) iZzi7) + 8;
            return 0;
        }
        zzacsVar.zzk(8);
        zzacsVar.zzj();
        zzaem zzaemVarZzg2 = zzg(iZzi6);
        if (zzaemVarZzg2 == null) {
            this.zzj = zzacsVar.zzf() + ((long) iZzi7);
            return 0;
        }
        zzaemVarZzg2.zzd(iZzi7);
        this.zzk = zzaemVarZzg2;
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzacr
    public final /* synthetic */ List zzd() {
        return zzfzo.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzacr
    public final void zze(zzacu zzacuVar) {
        this.zze = 0;
        if (this.zzc) {
            zzacuVar = new zzakj(zzacuVar, this.zzd);
        }
        this.zzf = zzacuVar;
        this.zzj = -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzacr
    public final void zzf(long j4, long j10) {
        this.zzj = -1L;
        this.zzk = null;
        for (zzaem zzaemVar : this.zzi) {
            zzaemVar.zze(j4);
        }
        if (j4 == 0) {
            this.zze = this.zzi.length != 0 ? 3 : 0;
        } else {
            this.zze = 6;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzacr
    public final boolean zzi(zzacs zzacsVar) throws IOException {
        zzacsVar.zzh(this.zza.zzN(), 0, 12);
        this.zza.zzL(0);
        if (this.zza.zzi() != 1179011410) {
            return false;
        }
        this.zza.zzM(4);
        return this.zza.zzi() == 541677121;
    }

    public zzaej(int i, zzakg zzakgVar) {
        this.zzd = zzakgVar;
        this.zzc = 1 == (i ^ 1);
        this.zza = new zzed(12);
        this.zzb = new zzaeh(null);
        this.zzf = new zzadl();
        this.zzi = new zzaem[0];
        this.zzm = -1L;
        this.zzn = -1L;
        this.zzl = -1;
        this.zzh = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzacr
    public final /* synthetic */ zzacr zzc() {
        return this;
    }
}
