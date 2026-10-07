package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzamu {
    private final zzadx zza;
    private long zzb;
    private boolean zzc;
    private int zzd;
    private long zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;
    private long zzk;
    private long zzl;
    private boolean zzm;

    public zzamu(zzadx zzadxVar) {
        this.zza = zzadxVar;
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
    private final void zzf(int i) {
        long j4 = this.zzl;
        if (j4 == -9223372036854775807L) {
            return;
        }
        boolean z4 = this.zzm;
        long j10 = this.zzb - this.zzk;
        this.zza.zzs(j4, z4 ? 1 : 0, (int) j10, i, null);
    }

    public final void zza(long j4) {
        this.zzm = this.zzc;
        zzf((int) (j4 - this.zzb));
        this.zzk = this.zzb;
        this.zzb = j4;
        zzf(0);
        this.zzi = false;
    }

    public final void zzb(long j4, int i, boolean z4) {
        if (this.zzj && this.zzg) {
            this.zzm = this.zzc;
            this.zzj = false;
        } else if (this.zzh || this.zzg) {
            if (z4 && this.zzi) {
                zzf(i + ((int) (j4 - this.zzb)));
            }
            this.zzk = this.zzb;
            this.zzl = this.zze;
            this.zzm = this.zzc;
            this.zzi = true;
        }
    }

    public final void zzc(byte[] bArr, int i, int i10) {
        if (this.zzf) {
            int i11 = this.zzd;
            int i12 = (i + 2) - i11;
            if (i12 >= i10) {
                this.zzd = (i10 - i) + i11;
            } else {
                this.zzg = (bArr[i12] & 128) != 0;
                this.zzf = false;
            }
        }
    }

    public final void zzd() {
        this.zzf = false;
        this.zzg = false;
        this.zzh = false;
        this.zzi = false;
        this.zzj = false;
    }

    public final void zze(long j4, int i, int i10, long j10, boolean z4) {
        this.zzg = false;
        this.zzh = false;
        this.zze = j10;
        this.zzd = 0;
        this.zzb = j4;
        if (i10 >= 32 && i10 != 40) {
            if (this.zzi && !this.zzj) {
                if (z4) {
                    zzf(i);
                }
                this.zzi = false;
            }
            if (i10 <= 35 || i10 == 39) {
                this.zzh = !this.zzj;
                this.zzj = true;
            }
        }
        boolean z10 = i10 >= 16 && i10 <= 21;
        this.zzc = z10;
        this.zzf = z10 || i10 <= 9;
    }
}
