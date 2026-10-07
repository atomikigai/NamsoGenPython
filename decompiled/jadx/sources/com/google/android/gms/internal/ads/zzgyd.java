package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzgyd implements zzhcc {
    private final zzgyc zza;

    private zzgyd(zzgyc zzgycVar) {
        zzgzk.zzc(zzgycVar, "output");
        this.zza = zzgycVar;
        zzgycVar.zze = this;
    }

    public static zzgyd zza(zzgyc zzgycVar) {
        zzgyd zzgydVar = zzgycVar.zze;
        return zzgydVar != null ? zzgydVar : new zzgyd(zzgycVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zzA(int i, List list, boolean z4) throws IOException {
        int i10 = 0;
        if (!(list instanceof zzgzx)) {
            if (!z4) {
                while (i10 < list.size()) {
                    this.zza.zzj(i, ((Long) list.get(i10)).longValue());
                    i10++;
                }
                return;
            }
            this.zza.zzs(i, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                ((Long) list.get(i12)).getClass();
                i11 += 8;
            }
            this.zza.zzu(i11);
            while (i10 < list.size()) {
                this.zza.zzk(((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        zzgzx zzgzxVar = (zzgzx) list;
        if (!z4) {
            while (i10 < zzgzxVar.size()) {
                this.zza.zzj(i, zzgzxVar.zza(i10));
                i10++;
            }
            return;
        }
        this.zza.zzs(i, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < zzgzxVar.size(); i14++) {
            zzgzxVar.zza(i14);
            i13 += 8;
        }
        this.zza.zzu(i13);
        while (i10 < zzgzxVar.size()) {
            this.zza.zzk(zzgzxVar.zza(i10));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zzB(int i, int i10) throws IOException {
        this.zza.zzt(i, (i10 >> 31) ^ (i10 + i10));
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zzC(int i, List list, boolean z4) throws IOException {
        int i10 = 0;
        if (!(list instanceof zzgyy)) {
            if (!z4) {
                while (i10 < list.size()) {
                    zzgyc zzgycVar = this.zza;
                    int iIntValue = ((Integer) list.get(i10)).intValue();
                    zzgycVar.zzt(i, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                    i10++;
                }
                return;
            }
            this.zza.zzs(i, 2);
            int iZzD = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                int iIntValue2 = ((Integer) list.get(i11)).intValue();
                iZzD += zzgyc.zzD((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
            }
            this.zza.zzu(iZzD);
            while (i10 < list.size()) {
                zzgyc zzgycVar2 = this.zza;
                int iIntValue3 = ((Integer) list.get(i10)).intValue();
                zzgycVar2.zzu((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                i10++;
            }
            return;
        }
        zzgyy zzgyyVar = (zzgyy) list;
        if (!z4) {
            while (i10 < zzgyyVar.size()) {
                zzgyc zzgycVar3 = this.zza;
                int iZzd = zzgyyVar.zzd(i10);
                zzgycVar3.zzt(i, (iZzd >> 31) ^ (iZzd + iZzd));
                i10++;
            }
            return;
        }
        this.zza.zzs(i, 2);
        int iZzD2 = 0;
        for (int i12 = 0; i12 < zzgyyVar.size(); i12++) {
            int iZzd2 = zzgyyVar.zzd(i12);
            iZzD2 += zzgyc.zzD((iZzd2 >> 31) ^ (iZzd2 + iZzd2));
        }
        this.zza.zzu(iZzD2);
        while (i10 < zzgyyVar.size()) {
            zzgyc zzgycVar4 = this.zza;
            int iZzd3 = zzgyyVar.zzd(i10);
            zzgycVar4.zzu((iZzd3 >> 31) ^ (iZzd3 + iZzd3));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zzD(int i, long j4) throws IOException {
        this.zza.zzv(i, (j4 >> 63) ^ (j4 + j4));
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zzE(int i, List list, boolean z4) throws IOException {
        int i10 = 0;
        if (!(list instanceof zzgzx)) {
            if (!z4) {
                while (i10 < list.size()) {
                    zzgyc zzgycVar = this.zza;
                    long jLongValue = ((Long) list.get(i10)).longValue();
                    zzgycVar.zzv(i, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                    i10++;
                }
                return;
            }
            this.zza.zzs(i, 2);
            int iZzE = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                long jLongValue2 = ((Long) list.get(i11)).longValue();
                iZzE += zzgyc.zzE((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
            }
            this.zza.zzu(iZzE);
            while (i10 < list.size()) {
                zzgyc zzgycVar2 = this.zza;
                long jLongValue3 = ((Long) list.get(i10)).longValue();
                zzgycVar2.zzw((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
                i10++;
            }
            return;
        }
        zzgzx zzgzxVar = (zzgzx) list;
        if (!z4) {
            while (i10 < zzgzxVar.size()) {
                zzgyc zzgycVar3 = this.zza;
                long jZza = zzgzxVar.zza(i10);
                zzgycVar3.zzv(i, (jZza >> 63) ^ (jZza + jZza));
                i10++;
            }
            return;
        }
        this.zza.zzs(i, 2);
        int iZzE2 = 0;
        for (int i12 = 0; i12 < zzgzxVar.size(); i12++) {
            long jZza2 = zzgzxVar.zza(i12);
            iZzE2 += zzgyc.zzE((jZza2 >> 63) ^ (jZza2 + jZza2));
        }
        this.zza.zzu(iZzE2);
        while (i10 < zzgzxVar.size()) {
            zzgyc zzgycVar4 = this.zza;
            long jZza3 = zzgzxVar.zza(i10);
            zzgycVar4.zzw((jZza3 >> 63) ^ (jZza3 + jZza3));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    @Deprecated
    public final void zzF(int i) throws IOException {
        this.zza.zzs(i, 3);
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zzG(int i, String str) throws IOException {
        this.zza.zzq(i, str);
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zzH(int i, List list) throws IOException {
        int i10 = 0;
        if (!(list instanceof zzgzu)) {
            while (i10 < list.size()) {
                this.zza.zzq(i, (String) list.get(i10));
                i10++;
            }
            return;
        }
        zzgzu zzgzuVar = (zzgzu) list;
        while (i10 < list.size()) {
            Object objZzc = zzgzuVar.zzc();
            if (objZzc instanceof String) {
                this.zza.zzq(i, (String) objZzc);
            } else {
                this.zza.zzN(i, (zzgxp) objZzc);
            }
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zzI(int i, int i10) throws IOException {
        this.zza.zzt(i, i10);
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zzJ(int i, List list, boolean z4) throws IOException {
        int i10 = 0;
        if (!(list instanceof zzgyy)) {
            if (!z4) {
                while (i10 < list.size()) {
                    this.zza.zzt(i, ((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            this.zza.zzs(i, 2);
            int iZzD = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                iZzD += zzgyc.zzD(((Integer) list.get(i11)).intValue());
            }
            this.zza.zzu(iZzD);
            while (i10 < list.size()) {
                this.zza.zzu(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        zzgyy zzgyyVar = (zzgyy) list;
        if (!z4) {
            while (i10 < zzgyyVar.size()) {
                this.zza.zzt(i, zzgyyVar.zzd(i10));
                i10++;
            }
            return;
        }
        this.zza.zzs(i, 2);
        int iZzD2 = 0;
        for (int i12 = 0; i12 < zzgyyVar.size(); i12++) {
            iZzD2 += zzgyc.zzD(zzgyyVar.zzd(i12));
        }
        this.zza.zzu(iZzD2);
        while (i10 < zzgyyVar.size()) {
            this.zza.zzu(zzgyyVar.zzd(i10));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zzK(int i, long j4) throws IOException {
        this.zza.zzv(i, j4);
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zzL(int i, List list, boolean z4) throws IOException {
        int i10 = 0;
        if (!(list instanceof zzgzx)) {
            if (!z4) {
                while (i10 < list.size()) {
                    this.zza.zzv(i, ((Long) list.get(i10)).longValue());
                    i10++;
                }
                return;
            }
            this.zza.zzs(i, 2);
            int iZzE = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                iZzE += zzgyc.zzE(((Long) list.get(i11)).longValue());
            }
            this.zza.zzu(iZzE);
            while (i10 < list.size()) {
                this.zza.zzw(((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        zzgzx zzgzxVar = (zzgzx) list;
        if (!z4) {
            while (i10 < zzgzxVar.size()) {
                this.zza.zzv(i, zzgzxVar.zza(i10));
                i10++;
            }
            return;
        }
        this.zza.zzs(i, 2);
        int iZzE2 = 0;
        for (int i12 = 0; i12 < zzgzxVar.size(); i12++) {
            iZzE2 += zzgyc.zzE(zzgzxVar.zza(i12));
        }
        this.zza.zzu(iZzE2);
        while (i10 < zzgzxVar.size()) {
            this.zza.zzw(zzgzxVar.zza(i10));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zzb(int i, boolean z4) throws IOException {
        this.zza.zzM(i, z4);
    }

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
    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zzc(int i, List list, boolean z4) throws IOException {
        int i10 = 0;
        if (!(list instanceof zzgxf)) {
            if (!z4) {
                while (i10 < list.size()) {
                    this.zza.zzM(i, ((Boolean) list.get(i10)).booleanValue());
                    i10++;
                }
                return;
            }
            this.zza.zzs(i, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                ((Boolean) list.get(i12)).getClass();
                i11++;
            }
            this.zza.zzu(i11);
            while (i10 < list.size()) {
                this.zza.zzL(((Boolean) list.get(i10)).booleanValue() ? (byte) 1 : (byte) 0);
                i10++;
            }
            return;
        }
        zzgxf zzgxfVar = (zzgxf) list;
        if (!z4) {
            while (i10 < zzgxfVar.size()) {
                this.zza.zzM(i, zzgxfVar.zzh(i10));
                i10++;
            }
            return;
        }
        this.zza.zzs(i, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < zzgxfVar.size(); i14++) {
            zzgxfVar.zzh(i14);
            i13++;
        }
        this.zza.zzu(i13);
        while (i10 < zzgxfVar.size()) {
            this.zza.zzL(zzgxfVar.zzh(i10) ? (byte) 1 : (byte) 0);
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zzd(int i, zzgxp zzgxpVar) throws IOException {
        this.zza.zzN(i, zzgxpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zze(int i, List list) throws IOException {
        for (int i10 = 0; i10 < list.size(); i10++) {
            this.zza.zzN(i, (zzgxp) list.get(i10));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zzf(int i, double d10) throws IOException {
        this.zza.zzj(i, Double.doubleToRawLongBits(d10));
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zzg(int i, List list, boolean z4) throws IOException {
        int i10 = 0;
        if (!(list instanceof zzgye)) {
            if (!z4) {
                while (i10 < list.size()) {
                    this.zza.zzj(i, Double.doubleToRawLongBits(((Double) list.get(i10)).doubleValue()));
                    i10++;
                }
                return;
            }
            this.zza.zzs(i, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                ((Double) list.get(i12)).getClass();
                i11 += 8;
            }
            this.zza.zzu(i11);
            while (i10 < list.size()) {
                this.zza.zzk(Double.doubleToRawLongBits(((Double) list.get(i10)).doubleValue()));
                i10++;
            }
            return;
        }
        zzgye zzgyeVar = (zzgye) list;
        if (!z4) {
            while (i10 < zzgyeVar.size()) {
                this.zza.zzj(i, Double.doubleToRawLongBits(zzgyeVar.zzd(i10)));
                i10++;
            }
            return;
        }
        this.zza.zzs(i, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < zzgyeVar.size(); i14++) {
            zzgyeVar.zzd(i14);
            i13 += 8;
        }
        this.zza.zzu(i13);
        while (i10 < zzgyeVar.size()) {
            this.zza.zzk(Double.doubleToRawLongBits(zzgyeVar.zzd(i10)));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    @Deprecated
    public final void zzh(int i) throws IOException {
        this.zza.zzs(i, 4);
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zzi(int i, int i10) throws IOException {
        this.zza.zzl(i, i10);
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zzj(int i, List list, boolean z4) throws IOException {
        int i10 = 0;
        if (!(list instanceof zzgyy)) {
            if (!z4) {
                while (i10 < list.size()) {
                    this.zza.zzl(i, ((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            this.zza.zzs(i, 2);
            int iZzE = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                iZzE += zzgyc.zzE(((Integer) list.get(i11)).intValue());
            }
            this.zza.zzu(iZzE);
            while (i10 < list.size()) {
                this.zza.zzm(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        zzgyy zzgyyVar = (zzgyy) list;
        if (!z4) {
            while (i10 < zzgyyVar.size()) {
                this.zza.zzl(i, zzgyyVar.zzd(i10));
                i10++;
            }
            return;
        }
        this.zza.zzs(i, 2);
        int iZzE2 = 0;
        for (int i12 = 0; i12 < zzgyyVar.size(); i12++) {
            iZzE2 += zzgyc.zzE(zzgyyVar.zzd(i12));
        }
        this.zza.zzu(iZzE2);
        while (i10 < zzgyyVar.size()) {
            this.zza.zzm(zzgyyVar.zzd(i10));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zzk(int i, int i10) throws IOException {
        this.zza.zzh(i, i10);
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zzl(int i, List list, boolean z4) throws IOException {
        int i10 = 0;
        if (!(list instanceof zzgyy)) {
            if (!z4) {
                while (i10 < list.size()) {
                    this.zza.zzh(i, ((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            this.zza.zzs(i, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                ((Integer) list.get(i12)).getClass();
                i11 += 4;
            }
            this.zza.zzu(i11);
            while (i10 < list.size()) {
                this.zza.zzi(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        zzgyy zzgyyVar = (zzgyy) list;
        if (!z4) {
            while (i10 < zzgyyVar.size()) {
                this.zza.zzh(i, zzgyyVar.zzd(i10));
                i10++;
            }
            return;
        }
        this.zza.zzs(i, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < zzgyyVar.size(); i14++) {
            zzgyyVar.zzd(i14);
            i13 += 4;
        }
        this.zza.zzu(i13);
        while (i10 < zzgyyVar.size()) {
            this.zza.zzi(zzgyyVar.zzd(i10));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zzm(int i, long j4) throws IOException {
        this.zza.zzj(i, j4);
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zzn(int i, List list, boolean z4) throws IOException {
        int i10 = 0;
        if (!(list instanceof zzgzx)) {
            if (!z4) {
                while (i10 < list.size()) {
                    this.zza.zzj(i, ((Long) list.get(i10)).longValue());
                    i10++;
                }
                return;
            }
            this.zza.zzs(i, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                ((Long) list.get(i12)).getClass();
                i11 += 8;
            }
            this.zza.zzu(i11);
            while (i10 < list.size()) {
                this.zza.zzk(((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        zzgzx zzgzxVar = (zzgzx) list;
        if (!z4) {
            while (i10 < zzgzxVar.size()) {
                this.zza.zzj(i, zzgzxVar.zza(i10));
                i10++;
            }
            return;
        }
        this.zza.zzs(i, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < zzgzxVar.size(); i14++) {
            zzgzxVar.zza(i14);
            i13 += 8;
        }
        this.zza.zzu(i13);
        while (i10 < zzgzxVar.size()) {
            this.zza.zzk(zzgzxVar.zza(i10));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zzo(int i, float f10) throws IOException {
        this.zza.zzh(i, Float.floatToRawIntBits(f10));
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zzp(int i, List list, boolean z4) throws IOException {
        int i10 = 0;
        if (!(list instanceof zzgyo)) {
            if (!z4) {
                while (i10 < list.size()) {
                    this.zza.zzh(i, Float.floatToRawIntBits(((Float) list.get(i10)).floatValue()));
                    i10++;
                }
                return;
            }
            this.zza.zzs(i, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                ((Float) list.get(i12)).getClass();
                i11 += 4;
            }
            this.zza.zzu(i11);
            while (i10 < list.size()) {
                this.zza.zzi(Float.floatToRawIntBits(((Float) list.get(i10)).floatValue()));
                i10++;
            }
            return;
        }
        zzgyo zzgyoVar = (zzgyo) list;
        if (!z4) {
            while (i10 < zzgyoVar.size()) {
                this.zza.zzh(i, Float.floatToRawIntBits(zzgyoVar.zzd(i10)));
                i10++;
            }
            return;
        }
        this.zza.zzs(i, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < zzgyoVar.size(); i14++) {
            zzgyoVar.zzd(i14);
            i13 += 4;
        }
        this.zza.zzu(i13);
        while (i10 < zzgyoVar.size()) {
            this.zza.zzi(Float.floatToRawIntBits(zzgyoVar.zzd(i10)));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zzq(int i, Object obj, zzhbb zzhbbVar) throws IOException {
        zzgyc zzgycVar = this.zza;
        zzgycVar.zzs(i, 3);
        zzhbbVar.zzj((zzhai) obj, zzgycVar.zze);
        zzgycVar.zzs(i, 4);
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zzr(int i, int i10) throws IOException {
        this.zza.zzl(i, i10);
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zzs(int i, List list, boolean z4) throws IOException {
        int i10 = 0;
        if (!(list instanceof zzgyy)) {
            if (!z4) {
                while (i10 < list.size()) {
                    this.zza.zzl(i, ((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            this.zza.zzs(i, 2);
            int iZzE = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                iZzE += zzgyc.zzE(((Integer) list.get(i11)).intValue());
            }
            this.zza.zzu(iZzE);
            while (i10 < list.size()) {
                this.zza.zzm(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        zzgyy zzgyyVar = (zzgyy) list;
        if (!z4) {
            while (i10 < zzgyyVar.size()) {
                this.zza.zzl(i, zzgyyVar.zzd(i10));
                i10++;
            }
            return;
        }
        this.zza.zzs(i, 2);
        int iZzE2 = 0;
        for (int i12 = 0; i12 < zzgyyVar.size(); i12++) {
            iZzE2 += zzgyc.zzE(zzgyyVar.zzd(i12));
        }
        this.zza.zzu(iZzE2);
        while (i10 < zzgyyVar.size()) {
            this.zza.zzm(zzgyyVar.zzd(i10));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zzt(int i, long j4) throws IOException {
        this.zza.zzv(i, j4);
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zzu(int i, List list, boolean z4) throws IOException {
        int i10 = 0;
        if (!(list instanceof zzgzx)) {
            if (!z4) {
                while (i10 < list.size()) {
                    this.zza.zzv(i, ((Long) list.get(i10)).longValue());
                    i10++;
                }
                return;
            }
            this.zza.zzs(i, 2);
            int iZzE = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                iZzE += zzgyc.zzE(((Long) list.get(i11)).longValue());
            }
            this.zza.zzu(iZzE);
            while (i10 < list.size()) {
                this.zza.zzw(((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        zzgzx zzgzxVar = (zzgzx) list;
        if (!z4) {
            while (i10 < zzgzxVar.size()) {
                this.zza.zzv(i, zzgzxVar.zza(i10));
                i10++;
            }
            return;
        }
        this.zza.zzs(i, 2);
        int iZzE2 = 0;
        for (int i12 = 0; i12 < zzgzxVar.size(); i12++) {
            iZzE2 += zzgyc.zzE(zzgzxVar.zza(i12));
        }
        this.zza.zzu(iZzE2);
        while (i10 < zzgzxVar.size()) {
            this.zza.zzw(zzgzxVar.zza(i10));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zzv(int i, Object obj, zzhbb zzhbbVar) throws IOException {
        this.zza.zzn(i, (zzhai) obj, zzhbbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zzw(int i, Object obj) throws IOException {
        if (obj instanceof zzgxp) {
            this.zza.zzp(i, (zzgxp) obj);
        } else {
            this.zza.zzo(i, (zzhai) obj);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zzx(int i, int i10) throws IOException {
        this.zza.zzh(i, i10);
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zzy(int i, List list, boolean z4) throws IOException {
        int i10 = 0;
        if (!(list instanceof zzgyy)) {
            if (!z4) {
                while (i10 < list.size()) {
                    this.zza.zzh(i, ((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            this.zza.zzs(i, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                ((Integer) list.get(i12)).getClass();
                i11 += 4;
            }
            this.zza.zzu(i11);
            while (i10 < list.size()) {
                this.zza.zzi(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        zzgyy zzgyyVar = (zzgyy) list;
        if (!z4) {
            while (i10 < zzgyyVar.size()) {
                this.zza.zzh(i, zzgyyVar.zzd(i10));
                i10++;
            }
            return;
        }
        this.zza.zzs(i, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < zzgyyVar.size(); i14++) {
            zzgyyVar.zzd(i14);
            i13 += 4;
        }
        this.zza.zzu(i13);
        while (i10 < zzgyyVar.size()) {
            this.zza.zzi(zzgyyVar.zzd(i10));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zzz(int i, long j4) throws IOException {
        this.zza.zzj(i, j4);
    }
}
