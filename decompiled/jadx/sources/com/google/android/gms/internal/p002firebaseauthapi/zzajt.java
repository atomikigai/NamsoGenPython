package com.google.android.gms.internal.p002firebaseauthapi;

import java.io.IOException;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzajt {
    private final zzajs zza;

    private zzajt(zzajs zzajsVar) {
        byte[] bArr = zzakq.zzd;
        this.zza = zzajsVar;
        zzajsVar.zze = this;
    }

    public static zzajt zza(zzajs zzajsVar) {
        zzajt zzajtVar = zzajsVar.zze;
        return zzajtVar != null ? zzajtVar : new zzajt(zzajsVar);
    }

    public final void zzA(int i, int i10) throws IOException {
        this.zza.zzr(i, (i10 >> 31) ^ (i10 + i10));
    }

    public final void zzB(int i, List list, boolean z4) throws IOException {
        int i10 = 0;
        if (!z4) {
            while (i10 < list.size()) {
                zzajs zzajsVar = this.zza;
                int iIntValue = ((Integer) list.get(i10)).intValue();
                zzajsVar.zzr(i, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                i10++;
            }
            return;
        }
        this.zza.zzq(i, 2);
        int iZzA = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            int iIntValue2 = ((Integer) list.get(i11)).intValue();
            iZzA += zzajs.zzA((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
        }
        this.zza.zzs(iZzA);
        while (i10 < list.size()) {
            zzajs zzajsVar2 = this.zza;
            int iIntValue3 = ((Integer) list.get(i10)).intValue();
            zzajsVar2.zzs((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
            i10++;
        }
    }

    public final void zzC(int i, long j4) throws IOException {
        this.zza.zzt(i, (j4 >> 63) ^ (j4 + j4));
    }

    public final void zzD(int i, List list, boolean z4) throws IOException {
        int i10 = 0;
        if (!z4) {
            while (i10 < list.size()) {
                zzajs zzajsVar = this.zza;
                long jLongValue = ((Long) list.get(i10)).longValue();
                zzajsVar.zzt(i, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                i10++;
            }
            return;
        }
        this.zza.zzq(i, 2);
        int iZzB = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            long jLongValue2 = ((Long) list.get(i11)).longValue();
            iZzB += zzajs.zzB((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
        }
        this.zza.zzs(iZzB);
        while (i10 < list.size()) {
            zzajs zzajsVar2 = this.zza;
            long jLongValue3 = ((Long) list.get(i10)).longValue();
            zzajsVar2.zzu((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
            i10++;
        }
    }

    @Deprecated
    public final void zzE(int i) throws IOException {
        this.zza.zzq(i, 3);
    }

    public final void zzF(int i, String str) throws IOException {
        this.zza.zzo(i, str);
    }

    public final void zzG(int i, List list) throws IOException {
        int i10 = 0;
        if (!(list instanceof zzakx)) {
            while (i10 < list.size()) {
                this.zza.zzo(i, (String) list.get(i10));
                i10++;
            }
            return;
        }
        zzakx zzakxVar = (zzakx) list;
        while (i10 < list.size()) {
            Object objZzf = zzakxVar.zzf(i10);
            if (objZzf instanceof String) {
                this.zza.zzo(i, (String) objZzf);
            } else {
                this.zza.zzL(i, (zzajf) objZzf);
            }
            i10++;
        }
    }

    public final void zzH(int i, int i10) throws IOException {
        this.zza.zzr(i, i10);
    }

    public final void zzI(int i, List list, boolean z4) throws IOException {
        int i10 = 0;
        if (!z4) {
            while (i10 < list.size()) {
                this.zza.zzr(i, ((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        this.zza.zzq(i, 2);
        int iZzA = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            iZzA += zzajs.zzA(((Integer) list.get(i11)).intValue());
        }
        this.zza.zzs(iZzA);
        while (i10 < list.size()) {
            this.zza.zzs(((Integer) list.get(i10)).intValue());
            i10++;
        }
    }

    public final void zzJ(int i, long j4) throws IOException {
        this.zza.zzt(i, j4);
    }

    public final void zzK(int i, List list, boolean z4) throws IOException {
        int i10 = 0;
        if (!z4) {
            while (i10 < list.size()) {
                this.zza.zzt(i, ((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        this.zza.zzq(i, 2);
        int iZzB = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            iZzB += zzajs.zzB(((Long) list.get(i11)).longValue());
        }
        this.zza.zzs(iZzB);
        while (i10 < list.size()) {
            this.zza.zzu(((Long) list.get(i10)).longValue());
            i10++;
        }
    }

    public final void zzb(int i, boolean z4) throws IOException {
        this.zza.zzK(i, z4);
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
    public final void zzc(int i, List list, boolean z4) throws IOException {
        int i10 = 0;
        if (!z4) {
            while (i10 < list.size()) {
                this.zza.zzK(i, ((Boolean) list.get(i10)).booleanValue());
                i10++;
            }
            return;
        }
        this.zza.zzq(i, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Boolean) list.get(i12)).getClass();
            i11++;
        }
        this.zza.zzs(i11);
        while (i10 < list.size()) {
            this.zza.zzJ(((Boolean) list.get(i10)).booleanValue() ? (byte) 1 : (byte) 0);
            i10++;
        }
    }

    public final void zzd(int i, zzajf zzajfVar) throws IOException {
        this.zza.zzL(i, zzajfVar);
    }

    public final void zze(int i, List list) throws IOException {
        for (int i10 = 0; i10 < list.size(); i10++) {
            this.zza.zzL(i, (zzajf) list.get(i10));
        }
    }

    public final void zzf(int i, double d10) throws IOException {
        this.zza.zzj(i, Double.doubleToRawLongBits(d10));
    }

    public final void zzg(int i, List list, boolean z4) throws IOException {
        int i10 = 0;
        if (!z4) {
            while (i10 < list.size()) {
                this.zza.zzj(i, Double.doubleToRawLongBits(((Double) list.get(i10)).doubleValue()));
                i10++;
            }
            return;
        }
        this.zza.zzq(i, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Double) list.get(i12)).getClass();
            i11 += 8;
        }
        this.zza.zzs(i11);
        while (i10 < list.size()) {
            this.zza.zzk(Double.doubleToRawLongBits(((Double) list.get(i10)).doubleValue()));
            i10++;
        }
    }

    @Deprecated
    public final void zzh(int i) throws IOException {
        this.zza.zzq(i, 4);
    }

    public final void zzi(int i, int i10) throws IOException {
        this.zza.zzl(i, i10);
    }

    public final void zzj(int i, List list, boolean z4) throws IOException {
        int i10 = 0;
        if (!z4) {
            while (i10 < list.size()) {
                this.zza.zzl(i, ((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        this.zza.zzq(i, 2);
        int iZzx = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            iZzx += zzajs.zzx(((Integer) list.get(i11)).intValue());
        }
        this.zza.zzs(iZzx);
        while (i10 < list.size()) {
            this.zza.zzm(((Integer) list.get(i10)).intValue());
            i10++;
        }
    }

    public final void zzk(int i, int i10) throws IOException {
        this.zza.zzh(i, i10);
    }

    public final void zzl(int i, List list, boolean z4) throws IOException {
        int i10 = 0;
        if (!z4) {
            while (i10 < list.size()) {
                this.zza.zzh(i, ((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        this.zza.zzq(i, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Integer) list.get(i12)).getClass();
            i11 += 4;
        }
        this.zza.zzs(i11);
        while (i10 < list.size()) {
            this.zza.zzi(((Integer) list.get(i10)).intValue());
            i10++;
        }
    }

    public final void zzm(int i, long j4) throws IOException {
        this.zza.zzj(i, j4);
    }

    public final void zzn(int i, List list, boolean z4) throws IOException {
        int i10 = 0;
        if (!z4) {
            while (i10 < list.size()) {
                this.zza.zzj(i, ((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        this.zza.zzq(i, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Long) list.get(i12)).getClass();
            i11 += 8;
        }
        this.zza.zzs(i11);
        while (i10 < list.size()) {
            this.zza.zzk(((Long) list.get(i10)).longValue());
            i10++;
        }
    }

    public final void zzo(int i, float f10) throws IOException {
        this.zza.zzh(i, Float.floatToRawIntBits(f10));
    }

    public final void zzp(int i, List list, boolean z4) throws IOException {
        int i10 = 0;
        if (!z4) {
            while (i10 < list.size()) {
                this.zza.zzh(i, Float.floatToRawIntBits(((Float) list.get(i10)).floatValue()));
                i10++;
            }
            return;
        }
        this.zza.zzq(i, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Float) list.get(i12)).getClass();
            i11 += 4;
        }
        this.zza.zzs(i11);
        while (i10 < list.size()) {
            this.zza.zzi(Float.floatToRawIntBits(((Float) list.get(i10)).floatValue()));
            i10++;
        }
    }

    public final void zzq(int i, Object obj, zzamb zzambVar) throws IOException {
        zzajs zzajsVar = this.zza;
        zzajsVar.zzq(i, 3);
        zzambVar.zzm((zzalp) obj, zzajsVar.zze);
        zzajsVar.zzq(i, 4);
    }

    public final void zzr(int i, int i10) throws IOException {
        this.zza.zzl(i, i10);
    }

    public final void zzs(int i, List list, boolean z4) throws IOException {
        int i10 = 0;
        if (!z4) {
            while (i10 < list.size()) {
                this.zza.zzl(i, ((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        this.zza.zzq(i, 2);
        int iZzx = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            iZzx += zzajs.zzx(((Integer) list.get(i11)).intValue());
        }
        this.zza.zzs(iZzx);
        while (i10 < list.size()) {
            this.zza.zzm(((Integer) list.get(i10)).intValue());
            i10++;
        }
    }

    public final void zzt(int i, long j4) throws IOException {
        this.zza.zzt(i, j4);
    }

    public final void zzu(int i, List list, boolean z4) throws IOException {
        int i10 = 0;
        if (!z4) {
            while (i10 < list.size()) {
                this.zza.zzt(i, ((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        this.zza.zzq(i, 2);
        int iZzB = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            iZzB += zzajs.zzB(((Long) list.get(i11)).longValue());
        }
        this.zza.zzs(iZzB);
        while (i10 < list.size()) {
            this.zza.zzu(((Long) list.get(i10)).longValue());
            i10++;
        }
    }

    public final void zzv(int i, Object obj, zzamb zzambVar) throws IOException {
        this.zza.zzn(i, (zzalp) obj, zzambVar);
    }

    public final void zzw(int i, int i10) throws IOException {
        this.zza.zzh(i, i10);
    }

    public final void zzx(int i, List list, boolean z4) throws IOException {
        int i10 = 0;
        if (!z4) {
            while (i10 < list.size()) {
                this.zza.zzh(i, ((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        this.zza.zzq(i, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Integer) list.get(i12)).getClass();
            i11 += 4;
        }
        this.zza.zzs(i11);
        while (i10 < list.size()) {
            this.zza.zzi(((Integer) list.get(i10)).intValue());
            i10++;
        }
    }

    public final void zzy(int i, long j4) throws IOException {
        this.zza.zzj(i, j4);
    }

    public final void zzz(int i, List list, boolean z4) throws IOException {
        int i10 = 0;
        if (!z4) {
            while (i10 < list.size()) {
                this.zza.zzj(i, ((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        this.zza.zzq(i, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Long) list.get(i12)).getClass();
            i11 += 8;
        }
        this.zza.zzs(i11);
        while (i10 < list.size()) {
            this.zza.zzk(((Long) list.get(i10)).longValue());
            i10++;
        }
    }
}
