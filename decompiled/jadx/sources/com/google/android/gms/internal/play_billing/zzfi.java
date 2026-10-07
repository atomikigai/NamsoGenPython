package com.google.android.gms.internal.play_billing;

import com.google.android.gms.common.api.f;
import com.google.android.gms.internal.play_billing.zzfe;
import com.google.android.gms.internal.play_billing.zzfi;
import da.v;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzfi<MessageType extends zzfi<MessageType, BuilderType>, BuilderType extends zzfe<MessageType, BuilderType>> extends zzds<MessageType, BuilderType> {
    private static final Map zzb = new ConcurrentHashMap();
    private int zzd = -1;
    protected zzhi zzc = zzhi.zzc();

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean zzA(zzfi zzfiVar, boolean z4) {
        byte bByteValue = ((Byte) zzfiVar.zzb(1, null, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zZzk = zzgs.zza().zzb(zzfiVar.getClass()).zzk(zzfiVar);
        if (z4) {
            zzfiVar.zzb(2, true != zZzk ? null : zzfiVar, null);
        }
        return zZzk;
    }

    private final int zzc(zzgv zzgvVar) {
        return zzgs.zza().zzb(getClass()).zza(this);
    }

    private static zzfi zzd(zzfi zzfiVar, byte[] bArr, int i, int i10, zzeu zzeuVar) throws zzfq {
        if (i10 == 0) {
            return zzfiVar;
        }
        zzfi zzfiVarZzo = zzfiVar.zzo();
        try {
            zzgv zzgvVarZzb = zzgs.zza().zzb(zzfiVarZzo.getClass());
            zzgvVarZzb.zzh(zzfiVarZzo, bArr, 0, i10, new zzdw(zzeuVar));
            zzgvVarZzb.zzf(zzfiVarZzo);
            return zzfiVarZzo;
        } catch (zzfq e) {
            throw e;
        } catch (zzhg e4) {
            throw e4.zza();
        } catch (IOException e10) {
            if (e10.getCause() instanceof zzfq) {
                throw ((zzfq) e10.getCause());
            }
            throw new zzfq(e10);
        } catch (IndexOutOfBoundsException unused) {
            throw new zzfq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    public static zzfi zzn(Class cls) {
        Map map = zzb;
        zzfi zzfiVar = (zzfi) map.get(cls);
        if (zzfiVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzfiVar = (zzfi) map.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (zzfiVar != null) {
            return zzfiVar;
        }
        zzfi zzfiVar2 = (zzfi) ((zzfi) zzho.zze(cls)).zzb(6, null, null);
        if (zzfiVar2 == null) {
            throw new IllegalStateException();
        }
        map.put(cls, zzfiVar2);
        return zzfiVar2;
    }

    public static zzfi zzp(zzfi zzfiVar, byte[] bArr, zzeu zzeuVar) throws zzfq {
        zzfi zzfiVarZzd = zzd(zzfiVar, bArr, 0, bArr.length, zzeuVar);
        if (zzfiVarZzd == null || zzA(zzfiVarZzd, true)) {
            return zzfiVarZzd;
        }
        throw new zzhg(zzfiVarZzd).zza();
    }

    public static zzfm zzq() {
        return zzfj.zzf();
    }

    public static zzfn zzr() {
        return zzgt.zze();
    }

    public static Object zzs(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e4) {
            Throwable cause = e4.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static Object zzt(zzgl zzglVar, String str, Object[] objArr) {
        return new zzgu(zzglVar, str, objArr);
    }

    public static void zzw(Class cls, zzfi zzfiVar) {
        zzfiVar.zzv();
        zzb.put(cls, zzfiVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return zzgs.zza().zzb(getClass()).zzj(this, (zzfi) obj);
    }

    public final int hashCode() {
        if (zzz()) {
            return zzi();
        }
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int iZzi = zzi();
        this.zza = iZzi;
        return iZzi;
    }

    public final String toString() {
        return zzgn.zza(this, super.toString());
    }

    @Override // com.google.android.gms.internal.play_billing.zzgl
    public final /* synthetic */ zzgk zzK() {
        return (zzfe) zzb(5, null, null);
    }

    @Override // com.google.android.gms.internal.play_billing.zzgl
    public final void zzL(zzep zzepVar) throws IOException {
        zzgs.zza().zzb(getClass()).zzi(this, zzeq.zza(zzepVar));
    }

    public abstract Object zzb(int i, Object obj, Object obj2);

    @Override // com.google.android.gms.internal.play_billing.zzds
    public final int zze(zzgv zzgvVar) {
        if (zzz()) {
            int iZza = zzgvVar.zza(this);
            if (iZza >= 0) {
                return iZza;
            }
            throw new IllegalStateException(v.f(iZza, "serialized size must be non-negative, was "));
        }
        int i = this.zzd & f.API_PRIORITY_OTHER;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int iZza2 = zzgvVar.zza(this);
        if (iZza2 < 0) {
            throw new IllegalStateException(v.f(iZza2, "serialized size must be non-negative, was "));
        }
        this.zzd = (this.zzd & Integer.MIN_VALUE) | iZza2;
        return iZza2;
    }

    @Override // com.google.android.gms.internal.play_billing.zzgm
    public final /* synthetic */ zzgl zzh() {
        return (zzfi) zzb(6, null, null);
    }

    public final int zzi() {
        return zzgs.zza().zzb(getClass()).zzb(this);
    }

    @Override // com.google.android.gms.internal.play_billing.zzgl
    public final int zzj() {
        if (zzz()) {
            int iZzc = zzc(null);
            if (iZzc >= 0) {
                return iZzc;
            }
            throw new IllegalStateException(v.f(iZzc, "serialized size must be non-negative, was "));
        }
        int i = this.zzd & f.API_PRIORITY_OTHER;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int iZzc2 = zzc(null);
        if (iZzc2 < 0) {
            throw new IllegalStateException(v.f(iZzc2, "serialized size must be non-negative, was "));
        }
        this.zzd = (this.zzd & Integer.MIN_VALUE) | iZzc2;
        return iZzc2;
    }

    @Override // com.google.android.gms.internal.play_billing.zzgm
    public final boolean zzk() {
        return zzA(this, true);
    }

    public final zzfe zzl() {
        return (zzfe) zzb(5, null, null);
    }

    public final zzfe zzm() {
        zzfe zzfeVar = (zzfe) zzb(5, null, null);
        zzfeVar.zzd(this);
        return zzfeVar;
    }

    public final zzfi zzo() {
        return (zzfi) zzb(4, null, null);
    }

    public final void zzu() {
        zzgs.zza().zzb(getClass()).zzf(this);
        zzv();
    }

    public final void zzv() {
        this.zzd &= f.API_PRIORITY_OTHER;
    }

    public final void zzx(int i) {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | f.API_PRIORITY_OTHER;
    }

    public final boolean zzz() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }
}
