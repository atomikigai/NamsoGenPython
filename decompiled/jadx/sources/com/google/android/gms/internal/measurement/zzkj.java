package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzkj implements zzoc {
    private final zzki zza;

    private zzkj(zzki zzkiVar) {
        byte[] bArr = zzlj.zzd;
        this.zza = zzkiVar;
        zzkiVar.zza = this;
    }

    public static zzkj zza(zzki zzkiVar) {
        zzkj zzkjVar = zzkiVar.zza;
        return zzkjVar != null ? zzkjVar : new zzkj(zzkiVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzA(int i, int i10) throws IOException {
        this.zza.zzp(i, (i10 >> 31) ^ (i10 + i10));
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzB(int i, List list, boolean z4) throws IOException {
        int i10 = 0;
        if (!z4) {
            while (i10 < list.size()) {
                zzki zzkiVar = this.zza;
                int iIntValue = ((Integer) list.get(i10)).intValue();
                zzkiVar.zzp(i, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                i10++;
            }
            return;
        }
        this.zza.zzo(i, 2);
        int iZzx = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            int iIntValue2 = ((Integer) list.get(i11)).intValue();
            iZzx += zzki.zzx((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
        }
        this.zza.zzq(iZzx);
        while (i10 < list.size()) {
            zzki zzkiVar2 = this.zza;
            int iIntValue3 = ((Integer) list.get(i10)).intValue();
            zzkiVar2.zzq((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzC(int i, long j4) throws IOException {
        this.zza.zzr(i, (j4 >> 63) ^ (j4 + j4));
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzD(int i, List list, boolean z4) throws IOException {
        int i10 = 0;
        if (!z4) {
            while (i10 < list.size()) {
                zzki zzkiVar = this.zza;
                long jLongValue = ((Long) list.get(i10)).longValue();
                zzkiVar.zzr(i, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                i10++;
            }
            return;
        }
        this.zza.zzo(i, 2);
        int iZzy = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            long jLongValue2 = ((Long) list.get(i11)).longValue();
            iZzy += zzki.zzy((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
        }
        this.zza.zzq(iZzy);
        while (i10 < list.size()) {
            zzki zzkiVar2 = this.zza;
            long jLongValue3 = ((Long) list.get(i10)).longValue();
            zzkiVar2.zzs((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    @Deprecated
    public final void zzE(int i) throws IOException {
        this.zza.zzo(i, 3);
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzF(int i, String str) throws IOException {
        this.zza.zzm(i, str);
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzG(int i, List list) throws IOException {
        int i10 = 0;
        if (!(list instanceof zzlq)) {
            while (i10 < list.size()) {
                this.zza.zzm(i, (String) list.get(i10));
                i10++;
            }
            return;
        }
        zzlq zzlqVar = (zzlq) list;
        while (i10 < list.size()) {
            Object objZzf = zzlqVar.zzf(i10);
            if (objZzf instanceof String) {
                this.zza.zzm(i, (String) objZzf);
            } else {
                this.zza.zze(i, (zzka) objZzf);
            }
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzH(int i, int i10) throws IOException {
        this.zza.zzp(i, i10);
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzI(int i, List list, boolean z4) throws IOException {
        int i10 = 0;
        if (!z4) {
            while (i10 < list.size()) {
                this.zza.zzp(i, ((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        this.zza.zzo(i, 2);
        int iZzx = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            iZzx += zzki.zzx(((Integer) list.get(i11)).intValue());
        }
        this.zza.zzq(iZzx);
        while (i10 < list.size()) {
            this.zza.zzq(((Integer) list.get(i10)).intValue());
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzJ(int i, long j4) throws IOException {
        this.zza.zzr(i, j4);
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzK(int i, List list, boolean z4) throws IOException {
        int i10 = 0;
        if (!z4) {
            while (i10 < list.size()) {
                this.zza.zzr(i, ((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        this.zza.zzo(i, 2);
        int iZzy = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            iZzy += zzki.zzy(((Long) list.get(i11)).longValue());
        }
        this.zza.zzq(iZzy);
        while (i10 < list.size()) {
            this.zza.zzs(((Long) list.get(i10)).longValue());
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzb(int i, boolean z4) throws IOException {
        this.zza.zzd(i, z4);
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
    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzc(int i, List list, boolean z4) throws IOException {
        int i10 = 0;
        if (!z4) {
            while (i10 < list.size()) {
                this.zza.zzd(i, ((Boolean) list.get(i10)).booleanValue());
                i10++;
            }
            return;
        }
        this.zza.zzo(i, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Boolean) list.get(i12)).getClass();
            i11++;
        }
        this.zza.zzq(i11);
        while (i10 < list.size()) {
            this.zza.zzb(((Boolean) list.get(i10)).booleanValue() ? (byte) 1 : (byte) 0);
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzd(int i, zzka zzkaVar) throws IOException {
        this.zza.zze(i, zzkaVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zze(int i, List list) throws IOException {
        for (int i10 = 0; i10 < list.size(); i10++) {
            this.zza.zze(i, (zzka) list.get(i10));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzf(int i, double d10) throws IOException {
        this.zza.zzh(i, Double.doubleToRawLongBits(d10));
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzg(int i, List list, boolean z4) throws IOException {
        int i10 = 0;
        if (!z4) {
            while (i10 < list.size()) {
                this.zza.zzh(i, Double.doubleToRawLongBits(((Double) list.get(i10)).doubleValue()));
                i10++;
            }
            return;
        }
        this.zza.zzo(i, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Double) list.get(i12)).getClass();
            i11 += 8;
        }
        this.zza.zzq(i11);
        while (i10 < list.size()) {
            this.zza.zzi(Double.doubleToRawLongBits(((Double) list.get(i10)).doubleValue()));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    @Deprecated
    public final void zzh(int i) throws IOException {
        this.zza.zzo(i, 4);
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzi(int i, int i10) throws IOException {
        this.zza.zzj(i, i10);
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzj(int i, List list, boolean z4) throws IOException {
        int i10 = 0;
        if (!z4) {
            while (i10 < list.size()) {
                this.zza.zzj(i, ((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        this.zza.zzo(i, 2);
        int iZzu = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            iZzu += zzki.zzu(((Integer) list.get(i11)).intValue());
        }
        this.zza.zzq(iZzu);
        while (i10 < list.size()) {
            this.zza.zzk(((Integer) list.get(i10)).intValue());
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzk(int i, int i10) throws IOException {
        this.zza.zzf(i, i10);
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzl(int i, List list, boolean z4) throws IOException {
        int i10 = 0;
        if (!z4) {
            while (i10 < list.size()) {
                this.zza.zzf(i, ((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        this.zza.zzo(i, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Integer) list.get(i12)).getClass();
            i11 += 4;
        }
        this.zza.zzq(i11);
        while (i10 < list.size()) {
            this.zza.zzg(((Integer) list.get(i10)).intValue());
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzm(int i, long j4) throws IOException {
        this.zza.zzh(i, j4);
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzn(int i, List list, boolean z4) throws IOException {
        int i10 = 0;
        if (!z4) {
            while (i10 < list.size()) {
                this.zza.zzh(i, ((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        this.zza.zzo(i, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Long) list.get(i12)).getClass();
            i11 += 8;
        }
        this.zza.zzq(i11);
        while (i10 < list.size()) {
            this.zza.zzi(((Long) list.get(i10)).longValue());
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzo(int i, float f10) throws IOException {
        this.zza.zzf(i, Float.floatToRawIntBits(f10));
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzp(int i, List list, boolean z4) throws IOException {
        int i10 = 0;
        if (!z4) {
            while (i10 < list.size()) {
                this.zza.zzf(i, Float.floatToRawIntBits(((Float) list.get(i10)).floatValue()));
                i10++;
            }
            return;
        }
        this.zza.zzo(i, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Float) list.get(i12)).getClass();
            i11 += 4;
        }
        this.zza.zzq(i11);
        while (i10 < list.size()) {
            this.zza.zzg(Float.floatToRawIntBits(((Float) list.get(i10)).floatValue()));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzq(int i, Object obj, zzmt zzmtVar) throws IOException {
        zzki zzkiVar = this.zza;
        zzkiVar.zzo(i, 3);
        zzmtVar.zzi((zzmi) obj, zzkiVar.zza);
        zzkiVar.zzo(i, 4);
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzr(int i, int i10) throws IOException {
        this.zza.zzj(i, i10);
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzs(int i, List list, boolean z4) throws IOException {
        int i10 = 0;
        if (!z4) {
            while (i10 < list.size()) {
                this.zza.zzj(i, ((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        this.zza.zzo(i, 2);
        int iZzu = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            iZzu += zzki.zzu(((Integer) list.get(i11)).intValue());
        }
        this.zza.zzq(iZzu);
        while (i10 < list.size()) {
            this.zza.zzk(((Integer) list.get(i10)).intValue());
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzt(int i, long j4) throws IOException {
        this.zza.zzr(i, j4);
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzu(int i, List list, boolean z4) throws IOException {
        int i10 = 0;
        if (!z4) {
            while (i10 < list.size()) {
                this.zza.zzr(i, ((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        this.zza.zzo(i, 2);
        int iZzy = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            iZzy += zzki.zzy(((Long) list.get(i11)).longValue());
        }
        this.zza.zzq(iZzy);
        while (i10 < list.size()) {
            this.zza.zzs(((Long) list.get(i10)).longValue());
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzv(int i, Object obj, zzmt zzmtVar) throws IOException {
        zzmi zzmiVar = (zzmi) obj;
        zzkf zzkfVar = (zzkf) this.zza;
        zzkfVar.zzq((i << 3) | 2);
        zzkfVar.zzq(((zzjk) zzmiVar).zzbu(zzmtVar));
        zzmtVar.zzi(zzmiVar, zzkfVar.zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzw(int i, int i10) throws IOException {
        this.zza.zzf(i, i10);
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzx(int i, List list, boolean z4) throws IOException {
        int i10 = 0;
        if (!z4) {
            while (i10 < list.size()) {
                this.zza.zzf(i, ((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        this.zza.zzo(i, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Integer) list.get(i12)).getClass();
            i11 += 4;
        }
        this.zza.zzq(i11);
        while (i10 < list.size()) {
            this.zza.zzg(((Integer) list.get(i10)).intValue());
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzy(int i, long j4) throws IOException {
        this.zza.zzh(i, j4);
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzz(int i, List list, boolean z4) throws IOException {
        int i10 = 0;
        if (!z4) {
            while (i10 < list.size()) {
                this.zza.zzh(i, ((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        this.zza.zzo(i, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Long) list.get(i12)).getClass();
            i11 += 8;
        }
        this.zza.zzq(i11);
        while (i10 < list.size()) {
            this.zza.zzi(((Long) list.get(i10)).longValue());
            i10++;
        }
    }
}
