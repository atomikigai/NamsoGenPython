package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzamo implements zzamm {
    private static final double[] zza = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    private String zzb;
    private zzadx zzc;
    private final zzaod zzd;
    private final zzed zze;
    private final zzane zzf;
    private final boolean[] zzg;
    private final zzamn zzh;
    private long zzi;
    private boolean zzj;
    private boolean zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private boolean zzp;
    private boolean zzq;

    public zzamo() {
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:40:0x0129  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.gms.internal.ads.zzamm
    public final void zza(zzed zzedVar) {
        long j4;
        boolean z4;
        boolean z10;
        int i;
        int i10;
        int i11;
        float f10;
        int i12;
        long j10;
        double d10;
        int i13;
        int i14;
        zzdb.zzb(this.zzc);
        int iZzd = zzedVar.zzd();
        int iZze = zzedVar.zze();
        byte[] bArrZzN = zzedVar.zzN();
        this.zzi += (long) zzedVar.zzb();
        this.zzc.zzq(zzedVar, zzedVar.zzb());
        while (true) {
            int iZza = zzfp.zza(bArrZzN, iZzd, iZze, this.zzg);
            if (iZza == iZze) {
                break;
            }
            int i15 = iZza + 3;
            int i16 = zzedVar.zzN()[i15] & 255;
            int i17 = iZza - iZzd;
            if (!this.zzk) {
                if (i17 > 0) {
                    this.zzh.zza(bArrZzN, iZzd, iZza);
                }
                if (this.zzh.zzc(i16, i17 < 0 ? -i17 : 0)) {
                    zzamn zzamnVar = this.zzh;
                    String str = this.zzb;
                    str.getClass();
                    byte[] bArrCopyOf = Arrays.copyOf(zzamnVar.zzc, zzamnVar.zza);
                    int i18 = bArrCopyOf[4] & 255;
                    byte b10 = bArrCopyOf[5];
                    int i19 = bArrCopyOf[6] & 255;
                    int i20 = ((b10 & 255) >> 4) | (i18 << 4);
                    int i21 = (bArrCopyOf[7] & 240) >> 4;
                    int i22 = ((b10 & 15) << 8) | i19;
                    if (i21 == 2) {
                        i10 = i22 * 4;
                        i11 = i20 * 3;
                    } else if (i21 != 3) {
                        if (i21 != 4) {
                            f10 = 1.0f;
                        } else {
                            i10 = i22 * 121;
                            i11 = i20 * 100;
                        }
                        zzab zzabVar = new zzab();
                        zzabVar.zzL(str);
                        zzabVar.zzZ("video/mpeg2");
                        zzabVar.zzae(i20);
                        zzabVar.zzJ(i22);
                        zzabVar.zzV(f10);
                        zzabVar.zzM(Collections.singletonList(bArrCopyOf));
                        zzad zzadVarZzaf = zzabVar.zzaf();
                        i12 = (bArrCopyOf[7] & 15) - 1;
                        j10 = 0;
                        if (i12 >= 0 && i12 < 8) {
                            d10 = zza[i12];
                            byte b11 = bArrCopyOf[zzamnVar.zzb + 9];
                            i13 = (b11 & 96) >> 5;
                            i14 = b11 & 31;
                            if (i13 != i14) {
                                d10 *= (((double) i13) + 1.0d) / ((double) (i14 + 1));
                            }
                            j10 = (long) (1000000.0d / d10);
                        }
                        Pair pairCreate = Pair.create(zzadVarZzaf, Long.valueOf(j10));
                        this.zzc.zzl((zzad) pairCreate.first);
                        this.zzl = ((Long) pairCreate.second).longValue();
                        this.zzk = true;
                    } else {
                        i10 = i22 * 16;
                        i11 = i20 * 9;
                    }
                    f10 = i10 / i11;
                    zzab zzabVar2 = new zzab();
                    zzabVar2.zzL(str);
                    zzabVar2.zzZ("video/mpeg2");
                    zzabVar2.zzae(i20);
                    zzabVar2.zzJ(i22);
                    zzabVar2.zzV(f10);
                    zzabVar2.zzM(Collections.singletonList(bArrCopyOf));
                    zzad zzadVarZzaf2 = zzabVar2.zzaf();
                    i12 = (bArrCopyOf[7] & 15) - 1;
                    j10 = 0;
                    if (i12 >= 0) {
                        d10 = zza[i12];
                        byte b12 = bArrCopyOf[zzamnVar.zzb + 9];
                        i13 = (b12 & 96) >> 5;
                        i14 = b12 & 31;
                        if (i13 != i14) {
                            d10 *= (((double) i13) + 1.0d) / ((double) (i14 + 1));
                        }
                        j10 = (long) (1000000.0d / d10);
                    }
                    Pair pairCreate2 = Pair.create(zzadVarZzaf2, Long.valueOf(j10));
                    this.zzc.zzl((zzad) pairCreate2.first);
                    this.zzl = ((Long) pairCreate2.second).longValue();
                    this.zzk = true;
                }
            }
            zzane zzaneVar = this.zzf;
            if (zzaneVar != null) {
                if (i17 > 0) {
                    zzaneVar.zza(bArrZzN, iZzd, iZza);
                    i = 0;
                } else {
                    i = -i17;
                }
                if (this.zzf.zzd(i)) {
                    zzane zzaneVar2 = this.zzf;
                    int iZzb = zzfp.zzb(zzaneVar2.zza, zzaneVar2.zzb);
                    zzed zzedVar2 = this.zze;
                    int i23 = zzen.zza;
                    zzedVar2.zzJ(this.zzf.zza, iZzb);
                    this.zzd.zza(this.zzo, this.zze);
                }
                if (i16 == 178) {
                    if (zzedVar.zzN()[iZza + 2] == 1) {
                        this.zzf.zzc(178);
                    }
                    i16 = 178;
                }
            }
            if (i16 == 0 || i16 == 179) {
                int i24 = iZze - iZza;
                if (this.zzq && this.zzk) {
                    j4 = -9223372036854775807L;
                    long j11 = this.zzo;
                    if (j11 != -9223372036854775807L) {
                        j4 = -9223372036854775807L;
                        this.zzc.zzs(j11, this.zzp ? 1 : 0, ((int) (this.zzi - this.zzn)) - i24, i24, null);
                    }
                } else {
                    j4 = -9223372036854775807L;
                }
                if (!this.zzj || this.zzq) {
                    this.zzn = this.zzi - ((long) i24);
                    long j12 = this.zzm;
                    if (j12 == j4) {
                        long j13 = this.zzo;
                        j12 = j13 != j4 ? j13 + this.zzl : j4;
                    }
                    this.zzo = j12;
                    z4 = false;
                    this.zzp = false;
                    this.zzm = j4;
                    z10 = true;
                    this.zzj = true;
                } else {
                    z10 = true;
                    z4 = false;
                }
                this.zzq = i16 == 0 ? z10 : z4;
            } else if (i16 == 184) {
                this.zzp = true;
            }
            iZzd = i15;
            iZze = iZze;
        }
        if (!this.zzk) {
            this.zzh.zza(bArrZzN, iZzd, iZze);
        }
        zzane zzaneVar3 = this.zzf;
        if (zzaneVar3 != null) {
            zzaneVar3.zza(bArrZzN, iZzd, iZze);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamm
    public final void zzb(zzacu zzacuVar, zzaoa zzaoaVar) {
        zzaoaVar.zzc();
        this.zzb = zzaoaVar.zzb();
        this.zzc = zzacuVar.zzw(zzaoaVar.zza(), 2);
        zzaod zzaodVar = this.zzd;
        if (zzaodVar != null) {
            zzaodVar.zzb(zzacuVar, zzaoaVar);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.gms.internal.ads.zzamm
    public final void zzc(boolean z4) {
        zzdb.zzb(this.zzc);
        if (z4) {
            boolean z10 = this.zzp;
            long j4 = this.zzi - this.zzn;
            this.zzc.zzs(this.zzo, z10 ? 1 : 0, (int) j4, 0, null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamm
    public final void zzd(long j4, int i) {
        this.zzm = j4;
    }

    @Override // com.google.android.gms.internal.ads.zzamm
    public final void zze() {
        zzfp.zzh(this.zzg);
        this.zzh.zzb();
        zzane zzaneVar = this.zzf;
        if (zzaneVar != null) {
            zzaneVar.zzb();
        }
        this.zzi = 0L;
        this.zzj = false;
        this.zzm = -9223372036854775807L;
        this.zzo = -9223372036854775807L;
    }

    public zzamo(zzaod zzaodVar) {
        zzed zzedVar;
        this.zzd = zzaodVar;
        this.zzg = new boolean[4];
        this.zzh = new zzamn(128);
        if (zzaodVar != null) {
            this.zzf = new zzane(178, 128);
            zzedVar = new zzed();
        } else {
            zzedVar = null;
            this.zzf = null;
        }
        this.zze = zzedVar;
        this.zzm = -9223372036854775807L;
        this.zzo = -9223372036854775807L;
    }
}
