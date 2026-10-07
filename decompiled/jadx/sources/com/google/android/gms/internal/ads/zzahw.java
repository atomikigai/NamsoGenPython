package com.google.android.gms.internal.ads;

import da.v;
import java.io.EOFException;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzahw implements zzacr {
    private final zzed zza;
    private final zzadj zzb;
    private final zzadf zzc;
    private final zzadh zzd;
    private final zzadx zze;
    private zzacu zzf;
    private zzadx zzg;
    private zzadx zzh;
    private int zzi;
    private zzbd zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private int zzo;
    private zzahy zzp;
    private boolean zzq;

    public zzahw() {
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005e  */
    /* JADX WARN: Code duplicated, block: B:26:0x0066  */
    /* JADX WARN: Code duplicated, block: B:28:0x006f  */
    /* JADX WARN: Code duplicated, block: B:29:0x0071  */
    /* JADX WARN: Code duplicated, block: B:36:0x009b  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:50:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:53:0x0107  */
    /* JADX WARN: Code duplicated, block: B:54:0x010c  */
    /* JADX WARN: Code duplicated, block: B:56:0x0118  */
    /* JADX WARN: Code duplicated, block: B:57:0x011b  */
    /* JADX WARN: Code duplicated, block: B:59:0x0121  */
    /* JADX WARN: Code duplicated, block: B:61:0x012e  */
    /* JADX WARN: Code duplicated, block: B:63:0x0132  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v43 */
    /* JADX WARN: Type inference failed for: r2v44, types: [com.google.android.gms.internal.ads.zzadq] */
    /* JADX WARN: Type inference failed for: r2v50 */
    /* JADX WARN: Type inference failed for: r2v51 */
    /* JADX WARN: Type inference failed for: r2v52, types: [com.google.android.gms.internal.ads.zzadq, com.google.android.gms.internal.ads.zzahy] */
    /* JADX WARN: Type inference failed for: r2v65 */
    /* JADX WARN: Type inference failed for: r2v66 */
    /* JADX WARN: Type inference failed for: r2v67 */
    /* JADX WARN: Type inference failed for: r5v32, types: [com.google.android.gms.internal.ads.zzacu] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private final int zzg(zzacs zzacsVar) throws Throwable {
        long j4;
        Throwable th;
        int iZzg;
        zzaia zzaiaVarZzb;
        zzadf zzadfVar;
        long jZzf;
        long jZzd;
        long jZza;
        long j10;
        int i;
        Object zzahtVar;
        long j11;
        long j12;
        int i10;
        int i11;
        Object objZzb;
        ?? zzahtVar2;
        long jZzs;
        zzahz zzahzVar;
        if (this.zzi == 0) {
            try {
                zzm(zzacsVar, false);
            } catch (EOFException unused) {
                return -1;
            }
        }
        if (this.zzp == null) {
            zzed zzedVar = new zzed(this.zzb.zzc);
            zzacsVar.zzh(zzedVar.zzN(), 0, this.zzb.zzc);
            zzadj zzadjVar = this.zzb;
            int i12 = 21;
            if ((zzadjVar.zza & 1) != 0) {
                if (zzadjVar.zze != 1) {
                    i12 = 36;
                }
            } else if (zzadjVar.zze == 1) {
                i12 = 13;
            }
            if (zzedVar.zze() >= i12 + 4) {
                zzedVar.zzL(i12);
                iZzg = zzedVar.zzg();
                if (iZzg != 1483304551) {
                    if (iZzg == 1231971951) {
                        iZzg = 1231971951;
                    } else if (zzedVar.zze() >= 40) {
                        zzedVar.zzL(36);
                        if (zzedVar.zzg() == 1447187017) {
                            iZzg = 1447187017;
                        } else {
                            iZzg = 0;
                        }
                    } else {
                        iZzg = 0;
                    }
                }
            } else if (zzedVar.zze() >= 40) {
                zzedVar.zzL(36);
                if (zzedVar.zzg() == 1447187017) {
                    iZzg = 1447187017;
                } else {
                    iZzg = 0;
                }
            } else {
                iZzg = 0;
            }
            if (iZzg == 1231971951) {
                zzaiaVarZzb = zzaia.zzb(this.zzb, zzedVar);
                zzadfVar = this.zzc;
                if (!zzadfVar.zza() && (i10 = zzaiaVarZzb.zzd) != -1 && (i11 = zzaiaVarZzb.zze) != -1) {
                    zzadfVar.zza = i10;
                    zzadfVar.zzb = i11;
                }
                jZzf = zzacsVar.zzf();
                if (zzacsVar.zzd() != -1) {
                    j11 = zzaiaVarZzb.zzc;
                    if (j11 != -1) {
                        j12 = j11 + jZzf;
                        if (zzacsVar.zzd() != j12) {
                            j4 = -9223372036854775807L;
                            th = null;
                            StringBuilder sbL = v.l("Data size mismatch between stream (", ") and Xing frame (", zzacsVar.zzd());
                            sbL.append(j12);
                            sbL.append("), using Xing value.");
                            zzdt.zze("Mp3Extractor", sbL.toString());
                        } else {
                            j4 = -9223372036854775807L;
                            th = null;
                        }
                    } else {
                        j4 = -9223372036854775807L;
                        th = null;
                    }
                } else {
                    j4 = -9223372036854775807L;
                    th = null;
                }
                zzacsVar.zzk(this.zzb.zzc);
                if (iZzg == 1483304551) {
                    zzahtVar = zzaib.zzb(zzaiaVarZzb, jZzf);
                } else {
                    jZzd = zzacsVar.zzd();
                    jZza = zzaiaVarZzb.zza();
                    if (jZza == j4) {
                        zzahtVar = th;
                    } else {
                        j10 = zzaiaVarZzb.zzc;
                        if (j10 != -1) {
                            jZzd = jZzf + j10;
                            i = zzaiaVarZzb.zza.zzc;
                        } else if (jZzd != -1) {
                            j10 = jZzd - jZzf;
                            i = zzaiaVarZzb.zza.zzc;
                        } else {
                            zzahtVar = th;
                        }
                        long j13 = j10 - ((long) i);
                        long j14 = jZzd;
                        RoundingMode roundingMode = RoundingMode.HALF_UP;
                        zzahtVar = new zzaht(j14, jZzf + ((long) zzaiaVarZzb.zza.zzc), zzgcr.zzb(zzen.zzu(j13, 8000000L, jZza, roundingMode)), zzgcr.zzb(zzgcm.zzb(j13, zzaiaVarZzb.zzb, roundingMode)), false);
                    }
                }
            } else {
                if (iZzg == 1447187017) {
                    zzahz zzahzVarZzb = zzahz.zzb(zzacsVar.zzd(), zzacsVar.zzf(), this.zzb, zzedVar);
                    zzacsVar.zzk(this.zzb.zzc);
                    zzahzVar = zzahzVarZzb;
                } else if (iZzg != 1483304551) {
                    zzacsVar.zzj();
                    zzahzVar = null;
                } else {
                    zzaiaVarZzb = zzaia.zzb(this.zzb, zzedVar);
                    zzadfVar = this.zzc;
                    if (!zzadfVar.zza()) {
                        zzadfVar.zza = i10;
                        zzadfVar.zzb = i11;
                    }
                    jZzf = zzacsVar.zzf();
                    if (zzacsVar.zzd() != -1) {
                        j11 = zzaiaVarZzb.zzc;
                        if (j11 != -1) {
                            j12 = j11 + jZzf;
                            if (zzacsVar.zzd() != j12) {
                                j4 = -9223372036854775807L;
                                th = null;
                                StringBuilder sbL2 = v.l("Data size mismatch between stream (", ") and Xing frame (", zzacsVar.zzd());
                                sbL2.append(j12);
                                sbL2.append("), using Xing value.");
                                zzdt.zze("Mp3Extractor", sbL2.toString());
                            } else {
                                j4 = -9223372036854775807L;
                                th = null;
                            }
                        } else {
                            j4 = -9223372036854775807L;
                            th = null;
                        }
                    } else {
                        j4 = -9223372036854775807L;
                        th = null;
                    }
                    zzacsVar.zzk(this.zzb.zzc);
                    if (iZzg == 1483304551) {
                        zzahtVar = zzaib.zzb(zzaiaVarZzb, jZzf);
                    } else {
                        jZzd = zzacsVar.zzd();
                        jZza = zzaiaVarZzb.zza();
                        if (jZza == j4) {
                            zzahtVar = th;
                        } else {
                            j10 = zzaiaVarZzb.zzc;
                            if (j10 != -1) {
                                jZzd = jZzf + j10;
                                i = zzaiaVarZzb.zza.zzc;
                            } else if (jZzd != -1) {
                                j10 = jZzd - jZzf;
                                i = zzaiaVarZzb.zza.zzc;
                            } else {
                                zzahtVar = th;
                            }
                            long j15 = j10 - ((long) i);
                            long j16 = jZzd;
                            RoundingMode roundingMode2 = RoundingMode.HALF_UP;
                            zzahtVar = new zzaht(j16, jZzf + ((long) zzaiaVarZzb.zza.zzc), zzgcr.zzb(zzen.zzu(j15, 8000000L, jZza, roundingMode2)), zzgcr.zzb(zzgcm.zzb(j15, zzaiaVarZzb.zzb, roundingMode2)), false);
                        }
                    }
                }
                j4 = -9223372036854775807L;
                th = null;
                zzahtVar = zzahzVar;
            }
            zzbd zzbdVar = this.zzj;
            long jZzf2 = zzacsVar.zzf();
            if (zzbdVar == null) {
                objZzb = th;
                break;
            }
            int iZza = zzbdVar.zza();
            int i13 = 0;
            while (true) {
                if (i13 >= iZza) {
                    objZzb = th;
                    break;
                }
                zzbc zzbcVarZzb = zzbdVar.zzb(i13);
                if (zzbcVarZzb instanceof zzagq) {
                    zzagq zzagqVar = (zzagq) zzbcVarZzb;
                    int iZza2 = zzbdVar.zza();
                    int i14 = 0;
                    while (true) {
                        if (i14 >= iZza2) {
                            jZzs = j4;
                            break;
                        }
                        zzbc zzbcVarZzb2 = zzbdVar.zzb(i14);
                        if (zzbcVarZzb2 instanceof zzagu) {
                            zzagu zzaguVar = (zzagu) zzbcVarZzb2;
                            if (zzaguVar.zzf.equals("TLEN")) {
                                jZzs = zzen.zzs(Long.parseLong((String) zzaguVar.zzb.get(0)));
                                break;
                            }
                        }
                        i14++;
                    }
                    objZzb = zzahv.zzb(jZzf2, zzagqVar, jZzs);
                    break;
                }
                i13++;
            }
            ?? r10 = zzahtVar;
            if (this.zzq) {
                zzahtVar2 = new zzahx();
            } else {
                if (objZzb != null) {
                    r10 = objZzb;
                } else if (zzahtVar == null) {
                    r10 = th;
                }
                if (r10 != 0) {
                    r10.zzh();
                    zzahtVar2 = r10;
                } else {
                    zzacsVar.zzh(this.zza.zzN(), 0, 4);
                    this.zza.zzL(0);
                    this.zzb.zza(this.zza.zzg());
                    long jZzd2 = zzacsVar.zzd();
                    long jZzf3 = zzacsVar.zzf();
                    zzadj zzadjVar2 = this.zzb;
                    zzahtVar2 = new zzaht(jZzd2, jZzf3, zzadjVar2.zzf, zzadjVar2.zzc, false);
                }
            }
            this.zzp = zzahtVar2;
            this.zzf.zzO(zzahtVar2);
            zzab zzabVar = new zzab();
            zzabVar.zzZ(this.zzb.zzb);
            zzabVar.zzQ(4096);
            zzabVar.zzz(this.zzb.zze);
            zzabVar.zzaa(this.zzb.zzd);
            zzabVar.zzG(this.zzc.zza);
            zzabVar.zzH(this.zzc.zzb);
            zzabVar.zzS(this.zzj);
            if (this.zzp.zzc() != -2147483647) {
                zzabVar.zzy(this.zzp.zzc());
            }
            this.zzh.zzl(zzabVar.zzaf());
            this.zzm = zzacsVar.zzf();
        } else {
            j4 = -9223372036854775807L;
            th = null;
            long j17 = this.zzm;
            if (j17 != 0) {
                long jZzf4 = zzacsVar.zzf();
                if (jZzf4 < j17) {
                    zzacsVar.zzk((int) (j17 - jZzf4));
                }
            }
        }
        int i15 = this.zzo;
        if (i15 == 0) {
            zzacsVar.zzj();
            if (zzl(zzacsVar)) {
                return -1;
            }
            this.zza.zzL(0);
            int iZzg2 = this.zza.zzg();
            if (!zzk(iZzg2, this.zzi) || zzadk.zzb(iZzg2) == -1) {
                zzacsVar.zzk(1);
                this.zzi = 0;
                return 0;
            }
            this.zzb.zza(iZzg2);
            if (this.zzk == j4) {
                this.zzk = this.zzp.zze(zzacsVar.zzf());
            }
            zzadj zzadjVar3 = this.zzb;
            int i16 = zzadjVar3.zzc;
            this.zzo = i16;
            this.zzn = zzacsVar.zzf() + ((long) i16);
            if (this.zzp instanceof zzahu) {
                zzh(this.zzl + ((long) zzadjVar3.zzg));
                throw th;
            }
            i15 = i16;
        }
        int iZzf = this.zzh.zzf(zzacsVar, i15, true);
        if (iZzf == -1) {
            return -1;
        }
        int i17 = this.zzo - iZzf;
        this.zzo = i17;
        if (i17 > 0) {
            return 0;
        }
        this.zzh.zzs(zzh(this.zzl), 1, this.zzb.zzc, 0, null);
        this.zzl += (long) this.zzb.zzg;
        this.zzo = 0;
        return 0;
    }

    private final long zzh(long j4) {
        zzadj zzadjVar = this.zzb;
        return ((j4 * 1000000) / ((long) zzadjVar.zzd)) + this.zzk;
    }

    private final void zzj() {
        zzahy zzahyVar = this.zzp;
        if ((zzahyVar instanceof zzaht) && zzahyVar.zzh()) {
            long j4 = this.zzn;
            if (j4 == -1 || j4 == this.zzp.zzd()) {
                return;
            }
            this.zzp = ((zzaht) this.zzp).zzf(this.zzn);
            zzacu zzacuVar = this.zzf;
            zzacuVar.getClass();
            zzacuVar.zzO(this.zzp);
        }
    }

    private static boolean zzk(int i, long j4) {
        return ((long) (i & (-128000))) == (j4 & (-128000));
    }

    private final boolean zzl(zzacs zzacsVar) throws IOException {
        zzahy zzahyVar = this.zzp;
        if (zzahyVar != null) {
            long jZzd = zzahyVar.zzd();
            if (jZzd != -1 && zzacsVar.zze() > jZzd - 4) {
                return true;
            }
        }
        try {
            return !zzacsVar.zzm(this.zza.zzN(), 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    private final boolean zzm(zzacs zzacsVar, boolean z4) throws IOException {
        int iZze;
        int i;
        int iZzb;
        zzacsVar.zzj();
        if (zzacsVar.zzf() == 0) {
            zzbd zzbdVarZza = this.zzd.zza(zzacsVar, null);
            this.zzj = zzbdVarZza;
            if (zzbdVarZza != null) {
                this.zzc.zzb(zzbdVarZza);
            }
            iZze = (int) zzacsVar.zze();
            if (!z4) {
                zzacsVar.zzk(iZze);
            }
            i = 0;
        } else {
            iZze = 0;
            i = 0;
        }
        int i10 = i;
        int i11 = i10;
        while (true) {
            if (zzl(zzacsVar)) {
                if (i10 > 0) {
                    break;
                }
                zzj();
                throw new EOFException();
            }
            this.zza.zzL(0);
            int iZzg = this.zza.zzg();
            if ((i == 0 || zzk(iZzg, i)) && (iZzb = zzadk.zzb(iZzg)) != -1) {
                i10++;
                if (i10 != 1) {
                    if (i10 == 4) {
                        break;
                    }
                } else {
                    this.zzb.zza(iZzg);
                    i = iZzg;
                }
                zzacsVar.zzg(iZzb - 4);
            } else {
                int i12 = i11 + 1;
                if (i11 == (true != z4 ? 131072 : 32768)) {
                    if (z4) {
                        return false;
                    }
                    zzj();
                    throw new EOFException();
                }
                if (z4) {
                    zzacsVar.zzj();
                    zzacsVar.zzg(iZze + i12);
                } else {
                    zzacsVar.zzk(1);
                }
                i = 0;
                i11 = i12;
                i10 = 0;
            }
        }
        if (z4) {
            zzacsVar.zzk(iZze + i11);
        } else {
            zzacsVar.zzj();
        }
        this.zzi = i;
        return true;
    }

    public final void zza() {
        this.zzq = true;
    }

    @Override // com.google.android.gms.internal.ads.zzacr
    public final int zzb(zzacs zzacsVar, zzadn zzadnVar) throws Throwable {
        zzdb.zzb(this.zzg);
        int i = zzen.zza;
        int iZzg = zzg(zzacsVar);
        if (iZzg == -1 && (this.zzp instanceof zzahu)) {
            if (this.zzp.zza() != zzh(this.zzl)) {
                throw null;
            }
        }
        return iZzg;
    }

    @Override // com.google.android.gms.internal.ads.zzacr
    public final /* synthetic */ List zzd() {
        return zzfzo.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzacr
    public final void zze(zzacu zzacuVar) {
        this.zzf = zzacuVar;
        zzadx zzadxVarZzw = zzacuVar.zzw(0, 1);
        this.zzg = zzadxVarZzw;
        this.zzh = zzadxVarZzw;
        this.zzf.zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzacr
    public final void zzf(long j4, long j10) {
        this.zzi = 0;
        this.zzk = -9223372036854775807L;
        this.zzl = 0L;
        this.zzo = 0;
        if (this.zzp instanceof zzahu) {
            throw null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzacr
    public final boolean zzi(zzacs zzacsVar) throws IOException {
        return zzm(zzacsVar, true);
    }

    public zzahw(int i) {
        this.zza = new zzed(10);
        this.zzb = new zzadj();
        this.zzc = new zzadf();
        this.zzk = -9223372036854775807L;
        this.zzd = new zzadh();
        zzacm zzacmVar = new zzacm();
        this.zze = zzacmVar;
        this.zzh = zzacmVar;
        this.zzn = -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzacr
    public final /* synthetic */ zzacr zzc() {
        return this;
    }
}
