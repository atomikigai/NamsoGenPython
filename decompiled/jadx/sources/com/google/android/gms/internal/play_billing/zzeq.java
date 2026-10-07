package com.google.android.gms.internal.play_billing;

import java.io.IOException;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzeq implements zzhu {
    private final zzep zza;

    private zzeq(zzep zzepVar) {
        byte[] bArr = zzfo.zzb;
        this.zza = zzepVar;
        zzepVar.zza = this;
    }

    public static zzeq zza(zzep zzepVar) {
        zzeq zzeqVar = zzepVar.zza;
        return zzeqVar != null ? zzeqVar : new zzeq(zzepVar);
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zzA(int i, List list, boolean z4) throws IOException {
        int i10 = 0;
        if (!(list instanceof zzga)) {
            if (!z4) {
                while (i10 < list.size()) {
                    this.zza.zzi(i, ((Long) list.get(i10)).longValue());
                    i10++;
                }
                return;
            }
            zzep zzepVar = this.zza;
            zzepVar.zzt(i, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                ((Long) list.get(i12)).getClass();
                i11 += 8;
            }
            zzepVar.zzv(i11);
            while (i10 < list.size()) {
                zzepVar.zzj(((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        zzga zzgaVar = (zzga) list;
        if (!z4) {
            while (i10 < zzgaVar.size()) {
                this.zza.zzi(i, zzgaVar.zze(i10));
                i10++;
            }
            return;
        }
        zzep zzepVar2 = this.zza;
        zzepVar2.zzt(i, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < zzgaVar.size(); i14++) {
            zzgaVar.zze(i14);
            i13 += 8;
        }
        zzepVar2.zzv(i13);
        while (i10 < zzgaVar.size()) {
            zzepVar2.zzj(zzgaVar.zze(i10));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zzB(int i, int i10) throws IOException {
        this.zza.zzu(i, (i10 >> 31) ^ (i10 + i10));
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zzC(int i, List list, boolean z4) throws IOException {
        int i10 = 0;
        if (!(list instanceof zzfj)) {
            if (!z4) {
                while (i10 < list.size()) {
                    zzep zzepVar = this.zza;
                    int iIntValue = ((Integer) list.get(i10)).intValue();
                    zzepVar.zzu(i, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                    i10++;
                }
                return;
            }
            zzep zzepVar2 = this.zza;
            zzepVar2.zzt(i, 2);
            int iZzC = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                int iIntValue2 = ((Integer) list.get(i11)).intValue();
                iZzC += zzep.zzC((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
            }
            zzepVar2.zzv(iZzC);
            while (i10 < list.size()) {
                int iIntValue3 = ((Integer) list.get(i10)).intValue();
                zzepVar2.zzv((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                i10++;
            }
            return;
        }
        zzfj zzfjVar = (zzfj) list;
        if (!z4) {
            while (i10 < zzfjVar.size()) {
                zzep zzepVar3 = this.zza;
                int iZze = zzfjVar.zze(i10);
                zzepVar3.zzu(i, (iZze >> 31) ^ (iZze + iZze));
                i10++;
            }
            return;
        }
        zzep zzepVar4 = this.zza;
        zzepVar4.zzt(i, 2);
        int iZzC2 = 0;
        for (int i12 = 0; i12 < zzfjVar.size(); i12++) {
            int iZze2 = zzfjVar.zze(i12);
            iZzC2 += zzep.zzC((iZze2 >> 31) ^ (iZze2 + iZze2));
        }
        zzepVar4.zzv(iZzC2);
        while (i10 < zzfjVar.size()) {
            int iZze3 = zzfjVar.zze(i10);
            zzepVar4.zzv((iZze3 >> 31) ^ (iZze3 + iZze3));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zzD(int i, long j4) throws IOException {
        this.zza.zzw(i, (j4 >> 63) ^ (j4 + j4));
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zzE(int i, List list, boolean z4) throws IOException {
        int i10 = 0;
        if (!(list instanceof zzga)) {
            if (!z4) {
                while (i10 < list.size()) {
                    zzep zzepVar = this.zza;
                    long jLongValue = ((Long) list.get(i10)).longValue();
                    zzepVar.zzw(i, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                    i10++;
                }
                return;
            }
            zzep zzepVar2 = this.zza;
            zzepVar2.zzt(i, 2);
            int iZzD = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                long jLongValue2 = ((Long) list.get(i11)).longValue();
                iZzD += zzep.zzD((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
            }
            zzepVar2.zzv(iZzD);
            while (i10 < list.size()) {
                long jLongValue3 = ((Long) list.get(i10)).longValue();
                zzepVar2.zzx((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
                i10++;
            }
            return;
        }
        zzga zzgaVar = (zzga) list;
        if (!z4) {
            while (i10 < zzgaVar.size()) {
                zzep zzepVar3 = this.zza;
                long jZze = zzgaVar.zze(i10);
                zzepVar3.zzw(i, (jZze >> 63) ^ (jZze + jZze));
                i10++;
            }
            return;
        }
        zzep zzepVar4 = this.zza;
        zzepVar4.zzt(i, 2);
        int iZzD2 = 0;
        for (int i12 = 0; i12 < zzgaVar.size(); i12++) {
            long jZze2 = zzgaVar.zze(i12);
            iZzD2 += zzep.zzD((jZze2 >> 63) ^ (jZze2 + jZze2));
        }
        zzepVar4.zzv(iZzD2);
        while (i10 < zzgaVar.size()) {
            long jZze3 = zzgaVar.zze(i10);
            zzepVar4.zzx((jZze3 >> 63) ^ (jZze3 + jZze3));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    @Deprecated
    public final void zzF(int i) throws IOException {
        this.zza.zzt(i, 3);
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zzG(int i, String str) throws IOException {
        this.zza.zzr(i, str);
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zzH(int i, List list) throws IOException {
        int i10 = 0;
        if (!(list instanceof zzfx)) {
            while (i10 < list.size()) {
                this.zza.zzr(i, (String) list.get(i10));
                i10++;
            }
            return;
        }
        zzfx zzfxVar = (zzfx) list;
        while (i10 < list.size()) {
            Object objZza = zzfxVar.zza();
            if (objZza instanceof String) {
                this.zza.zzr(i, (String) objZza);
            } else {
                this.zza.zze(i, (zzei) objZza);
            }
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zzI(int i, int i10) throws IOException {
        this.zza.zzu(i, i10);
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zzJ(int i, List list, boolean z4) throws IOException {
        int i10 = 0;
        if (!(list instanceof zzfj)) {
            if (!z4) {
                while (i10 < list.size()) {
                    this.zza.zzu(i, ((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            zzep zzepVar = this.zza;
            zzepVar.zzt(i, 2);
            int iZzC = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                iZzC += zzep.zzC(((Integer) list.get(i11)).intValue());
            }
            zzepVar.zzv(iZzC);
            while (i10 < list.size()) {
                zzepVar.zzv(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        zzfj zzfjVar = (zzfj) list;
        if (!z4) {
            while (i10 < zzfjVar.size()) {
                this.zza.zzu(i, zzfjVar.zze(i10));
                i10++;
            }
            return;
        }
        zzep zzepVar2 = this.zza;
        zzepVar2.zzt(i, 2);
        int iZzC2 = 0;
        for (int i12 = 0; i12 < zzfjVar.size(); i12++) {
            iZzC2 += zzep.zzC(zzfjVar.zze(i12));
        }
        zzepVar2.zzv(iZzC2);
        while (i10 < zzfjVar.size()) {
            zzepVar2.zzv(zzfjVar.zze(i10));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zzK(int i, long j4) throws IOException {
        this.zza.zzw(i, j4);
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zzL(int i, List list, boolean z4) throws IOException {
        int i10 = 0;
        if (!(list instanceof zzga)) {
            if (!z4) {
                while (i10 < list.size()) {
                    this.zza.zzw(i, ((Long) list.get(i10)).longValue());
                    i10++;
                }
                return;
            }
            zzep zzepVar = this.zza;
            zzepVar.zzt(i, 2);
            int iZzD = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                iZzD += zzep.zzD(((Long) list.get(i11)).longValue());
            }
            zzepVar.zzv(iZzD);
            while (i10 < list.size()) {
                zzepVar.zzx(((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        zzga zzgaVar = (zzga) list;
        if (!z4) {
            while (i10 < zzgaVar.size()) {
                this.zza.zzw(i, zzgaVar.zze(i10));
                i10++;
            }
            return;
        }
        zzep zzepVar2 = this.zza;
        zzepVar2.zzt(i, 2);
        int iZzD2 = 0;
        for (int i12 = 0; i12 < zzgaVar.size(); i12++) {
            iZzD2 += zzep.zzD(zzgaVar.zze(i12));
        }
        zzepVar2.zzv(iZzD2);
        while (i10 < zzgaVar.size()) {
            zzepVar2.zzx(zzgaVar.zze(i10));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zzb(int i, boolean z4) throws IOException {
        this.zza.zzd(i, z4);
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
    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zzc(int i, List list, boolean z4) throws IOException {
        int i10 = 0;
        if (!(list instanceof zzdy)) {
            if (!z4) {
                while (i10 < list.size()) {
                    this.zza.zzd(i, ((Boolean) list.get(i10)).booleanValue());
                    i10++;
                }
                return;
            }
            zzep zzepVar = this.zza;
            zzepVar.zzt(i, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                ((Boolean) list.get(i12)).getClass();
                i11++;
            }
            zzepVar.zzv(i11);
            while (i10 < list.size()) {
                zzepVar.zzb(((Boolean) list.get(i10)).booleanValue() ? (byte) 1 : (byte) 0);
                i10++;
            }
            return;
        }
        zzdy zzdyVar = (zzdy) list;
        if (!z4) {
            while (i10 < zzdyVar.size()) {
                this.zza.zzd(i, zzdyVar.zzf(i10));
                i10++;
            }
            return;
        }
        zzep zzepVar2 = this.zza;
        zzepVar2.zzt(i, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < zzdyVar.size(); i14++) {
            zzdyVar.zzf(i14);
            i13++;
        }
        zzepVar2.zzv(i13);
        while (i10 < zzdyVar.size()) {
            zzepVar2.zzb(zzdyVar.zzf(i10) ? (byte) 1 : (byte) 0);
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zzd(int i, zzei zzeiVar) throws IOException {
        this.zza.zze(i, zzeiVar);
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zze(int i, List list) throws IOException {
        for (int i10 = 0; i10 < list.size(); i10++) {
            this.zza.zze(i, (zzei) list.get(i10));
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zzf(int i, double d10) throws IOException {
        this.zza.zzi(i, Double.doubleToRawLongBits(d10));
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zzg(int i, List list, boolean z4) throws IOException {
        int i10 = 0;
        if (!(list instanceof zzer)) {
            if (!z4) {
                while (i10 < list.size()) {
                    this.zza.zzi(i, Double.doubleToRawLongBits(((Double) list.get(i10)).doubleValue()));
                    i10++;
                }
                return;
            }
            zzep zzepVar = this.zza;
            zzepVar.zzt(i, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                ((Double) list.get(i12)).getClass();
                i11 += 8;
            }
            zzepVar.zzv(i11);
            while (i10 < list.size()) {
                zzepVar.zzj(Double.doubleToRawLongBits(((Double) list.get(i10)).doubleValue()));
                i10++;
            }
            return;
        }
        zzer zzerVar = (zzer) list;
        if (!z4) {
            while (i10 < zzerVar.size()) {
                this.zza.zzi(i, Double.doubleToRawLongBits(zzerVar.zze(i10)));
                i10++;
            }
            return;
        }
        zzep zzepVar2 = this.zza;
        zzepVar2.zzt(i, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < zzerVar.size(); i14++) {
            zzerVar.zze(i14);
            i13 += 8;
        }
        zzepVar2.zzv(i13);
        while (i10 < zzerVar.size()) {
            zzepVar2.zzj(Double.doubleToRawLongBits(zzerVar.zze(i10)));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    @Deprecated
    public final void zzh(int i) throws IOException {
        this.zza.zzt(i, 4);
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zzi(int i, int i10) throws IOException {
        this.zza.zzk(i, i10);
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zzj(int i, List list, boolean z4) throws IOException {
        int i10 = 0;
        if (!(list instanceof zzfj)) {
            if (!z4) {
                while (i10 < list.size()) {
                    this.zza.zzk(i, ((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            zzep zzepVar = this.zza;
            zzepVar.zzt(i, 2);
            int iZzD = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                iZzD += zzep.zzD(((Integer) list.get(i11)).intValue());
            }
            zzepVar.zzv(iZzD);
            while (i10 < list.size()) {
                zzepVar.zzl(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        zzfj zzfjVar = (zzfj) list;
        if (!z4) {
            while (i10 < zzfjVar.size()) {
                this.zza.zzk(i, zzfjVar.zze(i10));
                i10++;
            }
            return;
        }
        zzep zzepVar2 = this.zza;
        zzepVar2.zzt(i, 2);
        int iZzD2 = 0;
        for (int i12 = 0; i12 < zzfjVar.size(); i12++) {
            iZzD2 += zzep.zzD(zzfjVar.zze(i12));
        }
        zzepVar2.zzv(iZzD2);
        while (i10 < zzfjVar.size()) {
            zzepVar2.zzl(zzfjVar.zze(i10));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zzk(int i, int i10) throws IOException {
        this.zza.zzg(i, i10);
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zzl(int i, List list, boolean z4) throws IOException {
        int i10 = 0;
        if (!(list instanceof zzfj)) {
            if (!z4) {
                while (i10 < list.size()) {
                    this.zza.zzg(i, ((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            zzep zzepVar = this.zza;
            zzepVar.zzt(i, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                ((Integer) list.get(i12)).getClass();
                i11 += 4;
            }
            zzepVar.zzv(i11);
            while (i10 < list.size()) {
                zzepVar.zzh(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        zzfj zzfjVar = (zzfj) list;
        if (!z4) {
            while (i10 < zzfjVar.size()) {
                this.zza.zzg(i, zzfjVar.zze(i10));
                i10++;
            }
            return;
        }
        zzep zzepVar2 = this.zza;
        zzepVar2.zzt(i, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < zzfjVar.size(); i14++) {
            zzfjVar.zze(i14);
            i13 += 4;
        }
        zzepVar2.zzv(i13);
        while (i10 < zzfjVar.size()) {
            zzepVar2.zzh(zzfjVar.zze(i10));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zzm(int i, long j4) throws IOException {
        this.zza.zzi(i, j4);
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zzn(int i, List list, boolean z4) throws IOException {
        int i10 = 0;
        if (!(list instanceof zzga)) {
            if (!z4) {
                while (i10 < list.size()) {
                    this.zza.zzi(i, ((Long) list.get(i10)).longValue());
                    i10++;
                }
                return;
            }
            zzep zzepVar = this.zza;
            zzepVar.zzt(i, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                ((Long) list.get(i12)).getClass();
                i11 += 8;
            }
            zzepVar.zzv(i11);
            while (i10 < list.size()) {
                zzepVar.zzj(((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        zzga zzgaVar = (zzga) list;
        if (!z4) {
            while (i10 < zzgaVar.size()) {
                this.zza.zzi(i, zzgaVar.zze(i10));
                i10++;
            }
            return;
        }
        zzep zzepVar2 = this.zza;
        zzepVar2.zzt(i, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < zzgaVar.size(); i14++) {
            zzgaVar.zze(i14);
            i13 += 8;
        }
        zzepVar2.zzv(i13);
        while (i10 < zzgaVar.size()) {
            zzepVar2.zzj(zzgaVar.zze(i10));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zzo(int i, float f10) throws IOException {
        this.zza.zzg(i, Float.floatToRawIntBits(f10));
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zzp(int i, List list, boolean z4) throws IOException {
        int i10 = 0;
        if (!(list instanceof zzfb)) {
            if (!z4) {
                while (i10 < list.size()) {
                    this.zza.zzg(i, Float.floatToRawIntBits(((Float) list.get(i10)).floatValue()));
                    i10++;
                }
                return;
            }
            zzep zzepVar = this.zza;
            zzepVar.zzt(i, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                ((Float) list.get(i12)).getClass();
                i11 += 4;
            }
            zzepVar.zzv(i11);
            while (i10 < list.size()) {
                zzepVar.zzh(Float.floatToRawIntBits(((Float) list.get(i10)).floatValue()));
                i10++;
            }
            return;
        }
        zzfb zzfbVar = (zzfb) list;
        if (!z4) {
            while (i10 < zzfbVar.size()) {
                this.zza.zzg(i, Float.floatToRawIntBits(zzfbVar.zze(i10)));
                i10++;
            }
            return;
        }
        zzep zzepVar2 = this.zza;
        zzepVar2.zzt(i, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < zzfbVar.size(); i14++) {
            zzfbVar.zze(i14);
            i13 += 4;
        }
        zzepVar2.zzv(i13);
        while (i10 < zzfbVar.size()) {
            zzepVar2.zzh(Float.floatToRawIntBits(zzfbVar.zze(i10)));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zzq(int i, Object obj, zzgv zzgvVar) throws IOException {
        zzep zzepVar = this.zza;
        zzepVar.zzt(i, 3);
        zzgvVar.zzi((zzgl) obj, zzepVar.zza);
        zzepVar.zzt(i, 4);
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zzr(int i, int i10) throws IOException {
        this.zza.zzk(i, i10);
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zzs(int i, List list, boolean z4) throws IOException {
        int i10 = 0;
        if (!(list instanceof zzfj)) {
            if (!z4) {
                while (i10 < list.size()) {
                    this.zza.zzk(i, ((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            zzep zzepVar = this.zza;
            zzepVar.zzt(i, 2);
            int iZzD = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                iZzD += zzep.zzD(((Integer) list.get(i11)).intValue());
            }
            zzepVar.zzv(iZzD);
            while (i10 < list.size()) {
                zzepVar.zzl(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        zzfj zzfjVar = (zzfj) list;
        if (!z4) {
            while (i10 < zzfjVar.size()) {
                this.zza.zzk(i, zzfjVar.zze(i10));
                i10++;
            }
            return;
        }
        zzep zzepVar2 = this.zza;
        zzepVar2.zzt(i, 2);
        int iZzD2 = 0;
        for (int i12 = 0; i12 < zzfjVar.size(); i12++) {
            iZzD2 += zzep.zzD(zzfjVar.zze(i12));
        }
        zzepVar2.zzv(iZzD2);
        while (i10 < zzfjVar.size()) {
            zzepVar2.zzl(zzfjVar.zze(i10));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zzt(int i, long j4) throws IOException {
        this.zza.zzw(i, j4);
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zzu(int i, List list, boolean z4) throws IOException {
        int i10 = 0;
        if (!(list instanceof zzga)) {
            if (!z4) {
                while (i10 < list.size()) {
                    this.zza.zzw(i, ((Long) list.get(i10)).longValue());
                    i10++;
                }
                return;
            }
            zzep zzepVar = this.zza;
            zzepVar.zzt(i, 2);
            int iZzD = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                iZzD += zzep.zzD(((Long) list.get(i11)).longValue());
            }
            zzepVar.zzv(iZzD);
            while (i10 < list.size()) {
                zzepVar.zzx(((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        zzga zzgaVar = (zzga) list;
        if (!z4) {
            while (i10 < zzgaVar.size()) {
                this.zza.zzw(i, zzgaVar.zze(i10));
                i10++;
            }
            return;
        }
        zzep zzepVar2 = this.zza;
        zzepVar2.zzt(i, 2);
        int iZzD2 = 0;
        for (int i12 = 0; i12 < zzgaVar.size(); i12++) {
            iZzD2 += zzep.zzD(zzgaVar.zze(i12));
        }
        zzepVar2.zzv(iZzD2);
        while (i10 < zzgaVar.size()) {
            zzepVar2.zzx(zzgaVar.zze(i10));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zzv(int i, Object obj, zzgv zzgvVar) throws IOException {
        this.zza.zzn(i, (zzgl) obj, zzgvVar);
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zzw(int i, Object obj) throws IOException {
        if (obj instanceof zzei) {
            this.zza.zzq(i, (zzei) obj);
        } else {
            this.zza.zzp(i, (zzgl) obj);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zzx(int i, int i10) throws IOException {
        this.zza.zzg(i, i10);
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zzy(int i, List list, boolean z4) throws IOException {
        int i10 = 0;
        if (!(list instanceof zzfj)) {
            if (!z4) {
                while (i10 < list.size()) {
                    this.zza.zzg(i, ((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            zzep zzepVar = this.zza;
            zzepVar.zzt(i, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                ((Integer) list.get(i12)).getClass();
                i11 += 4;
            }
            zzepVar.zzv(i11);
            while (i10 < list.size()) {
                zzepVar.zzh(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        zzfj zzfjVar = (zzfj) list;
        if (!z4) {
            while (i10 < zzfjVar.size()) {
                this.zza.zzg(i, zzfjVar.zze(i10));
                i10++;
            }
            return;
        }
        zzep zzepVar2 = this.zza;
        zzepVar2.zzt(i, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < zzfjVar.size(); i14++) {
            zzfjVar.zze(i14);
            i13 += 4;
        }
        zzepVar2.zzv(i13);
        while (i10 < zzfjVar.size()) {
            zzepVar2.zzh(zzfjVar.zze(i10));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zzz(int i, long j4) throws IOException {
        this.zza.zzi(i, j4);
    }
}
