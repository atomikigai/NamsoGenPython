package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzamq {
    private final zzadx zza;
    private boolean zzb;
    private boolean zzc;
    private boolean zzd;
    private int zze;
    private int zzf;
    private long zzg;
    private long zzh;

    public zzamq(zzadx zzadxVar) {
        this.zza = zzadxVar;
    }

    public final void zza(byte[] bArr, int i, int i10) {
        if (this.zzc) {
            int i11 = this.zzf;
            int i12 = (i + 1) - i11;
            if (i12 >= i10) {
                this.zzf = (i10 - i) + i11;
            } else {
                this.zzd = ((bArr[i12] & 192) >> 6) == 0;
                this.zzc = false;
            }
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
    public final void zzb(long j4, int i, boolean z4) {
        zzdb.zzf(this.zzh != -9223372036854775807L);
        if (this.zze == 182 && z4 && this.zzb) {
            this.zza.zzs(this.zzh, this.zzd ? 1 : 0, (int) (j4 - this.zzg), i, null);
        }
        if (this.zze != 179) {
            this.zzg = j4;
        }
    }

    public final void zzc(int i, long j4) {
        boolean z4;
        this.zze = i;
        this.zzd = false;
        if (i == 182) {
            z4 = true;
        } else if (i == 179) {
            i = 179;
            z4 = true;
        } else {
            z4 = false;
        }
        this.zzb = z4;
        this.zzc = i == 182;
        this.zzf = 0;
        this.zzh = j4;
    }

    public final void zzd() {
        this.zzb = false;
        this.zzc = false;
        this.zzd = false;
        this.zze = -1;
    }
}
