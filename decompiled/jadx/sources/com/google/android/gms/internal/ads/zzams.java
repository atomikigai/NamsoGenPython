package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzams {
    private final zzadx zza;
    private final SparseArray zzb = new SparseArray();
    private final SparseArray zzc = new SparseArray();
    private final byte[] zzd;
    private int zze;
    private long zzf;
    private long zzg;
    private boolean zzh;
    private long zzi;
    private long zzj;
    private boolean zzk;
    private boolean zzl;

    public zzams(zzadx zzadxVar, boolean z4, boolean z10) {
        this.zza = zzadxVar;
        byte[] bArr = new byte[128];
        this.zzd = bArr;
        new zzfq(bArr, 0, 0);
        this.zzh = false;
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
    private final void zzg(int i) {
        long j4 = this.zzj;
        if (j4 == -9223372036854775807L) {
            return;
        }
        boolean z4 = this.zzk;
        long j10 = this.zzf - this.zzi;
        this.zza.zzs(j4, z4 ? 1 : 0, (int) j10, i, null);
    }

    private final void zzh() {
        boolean z4 = this.zzl;
        boolean z10 = this.zzk;
        int i = this.zze;
        boolean z11 = true;
        if (i != 5 && (!z4 || i != 1)) {
            z11 = false;
        }
        this.zzk = z10 | z11;
    }

    public final void zza(long j4) {
        zzh();
        this.zzf = j4;
        zzg(0);
        this.zzh = false;
    }

    public final void zzb(zzfn zzfnVar) {
        this.zzc.append(zzfnVar.zza, zzfnVar);
    }

    public final void zzc(zzfo zzfoVar) {
        this.zzb.append(zzfoVar.zzd, zzfoVar);
    }

    public final void zzd() {
        this.zzh = false;
    }

    public final void zze(long j4, int i, long j10, boolean z4) {
        this.zze = i;
        this.zzg = j10;
        this.zzf = j4;
        this.zzl = z4;
    }

    public final boolean zzf(long j4, int i, boolean z4) {
        if (this.zze == 9) {
            if (z4 && this.zzh) {
                zzg(i + ((int) (j4 - this.zzf)));
            }
            this.zzi = this.zzf;
            this.zzj = this.zzg;
            this.zzk = false;
            this.zzh = true;
        }
        zzh();
        return this.zzk;
    }
}
