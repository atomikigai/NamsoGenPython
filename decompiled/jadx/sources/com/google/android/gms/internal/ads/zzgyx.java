package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.f;
import com.google.android.gms.internal.ads.zzgyr;
import com.google.android.gms.internal.ads.zzgyx;
import da.v;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzgyx<MessageType extends zzgyx<MessageType, BuilderType>, BuilderType extends zzgyr<MessageType, BuilderType>> extends zzgwy<MessageType, BuilderType> {
    private static final int zza = Integer.MIN_VALUE;
    private static final int zzb = Integer.MAX_VALUE;
    private static Map<Class<?>, zzgyx<?, ?>> zzc = new ConcurrentHashMap();
    static final int zzr = Integer.MAX_VALUE;
    static final int zzs = 0;
    private int zzd = -1;
    protected zzhbo zzt = zzhbo.zzc();

    public static zzgyz zzbA() {
        return zzgxf.zzd();
    }

    public static zzgyz zzbB(zzgyz zzgyzVar) {
        int size = zzgyzVar.size();
        return zzgyzVar.zzf(size == 0 ? 10 : size + size);
    }

    public static zzgza zzbC() {
        return zzgye.zze();
    }

    public static zzgza zzbD(zzgza zzgzaVar) {
        int size = zzgzaVar.size();
        return zzgzaVar.zzf(size == 0 ? 10 : size + size);
    }

    public static zzgze zzbE() {
        return zzgyo.zze();
    }

    public static zzgze zzbF(zzgze zzgzeVar) {
        int size = zzgzeVar.size();
        return zzgzeVar.zzf(size == 0 ? 10 : size + size);
    }

    public static zzgzf zzbG() {
        return zzgyy.zzg();
    }

    public static zzgzf zzbH(zzgzf zzgzfVar) {
        int size = zzgzfVar.size();
        return zzgzfVar.zzf(size == 0 ? 10 : size + size);
    }

    public static zzgzi zzbI() {
        return zzgzx.zzh();
    }

    public static zzgzi zzbJ(zzgzi zzgziVar) {
        int size = zzgziVar.size();
        return zzgziVar.zzf(size == 0 ? 10 : size + size);
    }

    public static <E> zzgzj<E> zzbK() {
        return zzhat.zzd();
    }

    public static <E> zzgzj<E> zzbL(zzgzj<E> zzgzjVar) {
        int size = zzgzjVar.size();
        return zzgzjVar.zzf(size == 0 ? 10 : size + size);
    }

    public static Object zzbR(Method method, Object obj, Object... objArr) {
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

    public static Object zzbS(zzhai zzhaiVar, String str, Object[] objArr) {
        return new zzhau(zzhaiVar, str, objArr);
    }

    public static Method zzbT(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(v.k("Generated message class \"", cls.getName(), "\" missing method \"", str, "\"."), e);
        }
    }

    public static <ContainingType extends zzhai, Type> zzgyv<ContainingType, Type> zzbe(ContainingType containingtype, zzhai zzhaiVar, zzgzc zzgzcVar, int i, zzhca zzhcaVar, boolean z4, Class cls) {
        return new zzgyv<>(containingtype, Collections.EMPTY_LIST, zzhaiVar, new zzgyu(zzgzcVar, i, zzhcaVar, true, z4), cls);
    }

    public static <ContainingType extends zzhai, Type> zzgyv<ContainingType, Type> zzbf(ContainingType containingtype, Type type, zzhai zzhaiVar, zzgzc zzgzcVar, int i, zzhca zzhcaVar, Class cls) {
        return new zzgyv<>(containingtype, type, zzhaiVar, new zzgyu(zzgzcVar, i, zzhcaVar, false, false), cls);
    }

    public static <T extends zzgyx> T zzbh(Class<T> cls) {
        zzgyx<?, ?> zzgyxVar = zzc.get(cls);
        if (zzgyxVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzgyxVar = zzc.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (zzgyxVar != null) {
            return zzgyxVar;
        }
        zzgyx<?, ?> zzgyxVarZzbt = ((zzgyx) zzhbu.zzg(cls)).zzbt();
        if (zzgyxVarZzbt == null) {
            throw new IllegalStateException();
        }
        zzc.put(cls, zzgyxVarZzbt);
        return zzgyxVarZzbt;
    }

    public static <T extends zzgyx<T, ?>> T zzbk(T t10, InputStream inputStream) throws zzgzm {
        int i = zzgyh.zzb;
        int i10 = zzhas.zza;
        T t11 = (T) zzg(t10, inputStream, zzgyh.zza);
        zzf(t11);
        return t11;
    }

    public static <T extends zzgyx<T, ?>> T zzbl(T t10, InputStream inputStream, zzgyh zzgyhVar) throws zzgzm {
        T t11 = (T) zzg(t10, inputStream, zzgyhVar);
        zzf(t11);
        return t11;
    }

    public static <T extends zzgyx<T, ?>> T zzbm(T t10, zzgxp zzgxpVar) throws zzgzm {
        int i = zzgyh.zzb;
        int i10 = zzhas.zza;
        T t11 = (T) zzbr(t10, zzgxpVar, zzgyh.zza);
        zzf(t11);
        return t11;
    }

    public static <T extends zzgyx<T, ?>> T zzbn(T t10, zzgxv zzgxvVar) throws zzgzm {
        int i = zzgyh.zzb;
        int i10 = zzhas.zza;
        return (T) zzbs(t10, zzgxvVar, zzgyh.zza);
    }

    public static <T extends zzgyx<T, ?>> T zzbo(T t10, InputStream inputStream) throws zzgzm {
        zzgxv zzgxvVarZzG = zzgxv.zzG(inputStream, 4096);
        int i = zzgyh.zzb;
        int i10 = zzhas.zza;
        T t11 = (T) zzbz(t10, zzgxvVarZzG, zzgyh.zza);
        zzf(t11);
        return t11;
    }

    public static <T extends zzgyx<T, ?>> T zzbp(T t10, ByteBuffer byteBuffer) throws zzgzm {
        int i = zzgyh.zzb;
        int i10 = zzhas.zza;
        return (T) zzbv(t10, byteBuffer, zzgyh.zza);
    }

    public static <T extends zzgyx<T, ?>> T zzbq(T t10, byte[] bArr) throws zzgzm {
        int length = bArr.length;
        int i = zzgyh.zzb;
        int i10 = zzhas.zza;
        T t11 = (T) zzi(t10, bArr, 0, length, zzgyh.zza);
        zzf(t11);
        return t11;
    }

    public static <T extends zzgyx<T, ?>> T zzbr(T t10, zzgxp zzgxpVar, zzgyh zzgyhVar) throws zzgzm {
        T t11 = (T) zzh(t10, zzgxpVar, zzgyhVar);
        zzf(t11);
        return t11;
    }

    public static <T extends zzgyx<T, ?>> T zzbs(T t10, zzgxv zzgxvVar, zzgyh zzgyhVar) throws zzgzm {
        T t11 = (T) zzbz(t10, zzgxvVar, zzgyhVar);
        zzf(t11);
        return t11;
    }

    public static <T extends zzgyx<T, ?>> T zzbu(T t10, InputStream inputStream, zzgyh zzgyhVar) throws zzgzm {
        T t11 = (T) zzbz(t10, zzgxv.zzG(inputStream, 4096), zzgyhVar);
        zzf(t11);
        return t11;
    }

    public static <T extends zzgyx<T, ?>> T zzbv(T t10, ByteBuffer byteBuffer, zzgyh zzgyhVar) throws zzgzm {
        zzgxv zzgxvVarZzH;
        boolean z4 = false;
        if (byteBuffer.hasArray()) {
            zzgxvVarZzH = zzgxv.zzH(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.remaining(), false);
        } else if (byteBuffer.isDirect() && zzhbu.zzB()) {
            zzgxvVarZzH = new zzgxt(byteBuffer, z4, null);
        } else {
            int iRemaining = byteBuffer.remaining();
            byte[] bArr = new byte[iRemaining];
            byteBuffer.duplicate().get(bArr);
            zzgxvVarZzH = zzgxv.zzH(bArr, 0, iRemaining, true);
        }
        T t11 = (T) zzbs(t10, zzgxvVarZzH, zzgyhVar);
        zzf(t11);
        return t11;
    }

    public static <T extends zzgyx<T, ?>> T zzbx(T t10, byte[] bArr, zzgyh zzgyhVar) throws zzgzm {
        T t11 = (T) zzi(t10, bArr, 0, bArr.length, zzgyhVar);
        zzf(t11);
        return t11;
    }

    public static <T extends zzgyx<T, ?>> T zzby(T t10, zzgxv zzgxvVar) throws zzgzm {
        int i = zzgyh.zzb;
        int i10 = zzhas.zza;
        return (T) zzbz(t10, zzgxvVar, zzgyh.zza);
    }

    public static <T extends zzgyx<T, ?>> T zzbz(T t10, zzgxv zzgxvVar, zzgyh zzgyhVar) throws zzgzm {
        T t11 = (T) t10.zzbj();
        try {
            zzhbb zzhbbVarZzb = zzhas.zza().zzb(t11.getClass());
            zzhbbVarZzb.zzh(t11, zzgxw.zzq(zzgxvVar), zzgyhVar);
            zzhbbVarZzb.zzf(t11);
            return t11;
        } catch (zzgzm e) {
            if (e.zzb()) {
                throw new zzgzm(e);
            }
            throw e;
        } catch (zzhbm e4) {
            throw e4.zza();
        } catch (IOException e10) {
            if (e10.getCause() instanceof zzgzm) {
                throw ((zzgzm) e10.getCause());
            }
            throw new zzgzm(e10);
        } catch (RuntimeException e11) {
            if (e11.getCause() instanceof zzgzm) {
                throw ((zzgzm) e11.getCause());
            }
            throw e11;
        }
    }

    private int zzc(zzhbb<?> zzhbbVar) {
        if (zzhbbVar != null) {
            return zzhbbVar.zza(this);
        }
        return zzhas.zza().zzb(getClass()).zza(this);
    }

    public static <T extends zzgyx> void zzcb(Class<T> cls, T t10) {
        t10.zzbX();
        zzc.put(cls, t10);
    }

    public static final <T extends zzgyx<T, ?>> boolean zzce(T t10, boolean z4) {
        byte bByteValue = ((Byte) t10.zzbP(zzgyw.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zZzl = zzhas.zza().zzb(t10.getClass()).zzl(t10);
        if (z4) {
            t10.zzbQ(zzgyw.SET_MEMOIZED_IS_INITIALIZED, true != zZzl ? null : t10);
        }
        return zZzl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <MessageType extends zzgyt<MessageType, BuilderType>, BuilderType, T> zzgyv<MessageType, T> zzd(zzgyf<MessageType, T> zzgyfVar) {
        return (zzgyv) zzgyfVar;
    }

    private static <T extends zzgyx<T, ?>> T zzf(T t10) throws zzgzm {
        if (t10 == null || t10.zzbw()) {
            return t10;
        }
        throw t10.zzaP().zza();
    }

    private static <T extends zzgyx<T, ?>> T zzg(T t10, InputStream inputStream, zzgyh zzgyhVar) throws zzgzm {
        try {
            int i = inputStream.read();
            if (i == -1) {
                return null;
            }
            zzgxv zzgxvVarZzG = zzgxv.zzG(new zzgww(inputStream, zzgxv.zzE(i, inputStream)), 4096);
            T t11 = (T) zzbz(t10, zzgxvVarZzG, zzgyhVar);
            zzgxvVarZzG.zzy(0);
            return t11;
        } catch (zzgzm e) {
            if (e.zzb()) {
                throw new zzgzm(e);
            }
            throw e;
        } catch (IOException e4) {
            throw new zzgzm(e4);
        }
    }

    private static <T extends zzgyx<T, ?>> T zzh(T t10, zzgxp zzgxpVar, zzgyh zzgyhVar) throws zzgzm {
        zzgxv zzgxvVarZzl = zzgxpVar.zzl();
        T t11 = (T) zzbz(t10, zzgxvVarZzl, zzgyhVar);
        zzgxvVarZzl.zzy(0);
        return t11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T extends zzgyx<T, ?>> T zzi(T t10, byte[] bArr, int i, int i10, zzgyh zzgyhVar) throws zzgzm {
        if (i10 == 0) {
            return t10;
        }
        T t11 = (T) t10.zzbj();
        try {
            zzhbb zzhbbVarZzb = zzhas.zza().zzb(t11.getClass());
            zzhbbVarZzb.zzi(t11, bArr, i, i + i10, new zzgxd(zzgyhVar));
            zzhbbVarZzb.zzf(t11);
            return t11;
        } catch (zzgzm e) {
            if (e.zzb()) {
                throw new zzgzm(e);
            }
            throw e;
        } catch (zzhbm e4) {
            throw e4.zza();
        } catch (IOException e10) {
            if (e10.getCause() instanceof zzgzm) {
                throw ((zzgzm) e10.getCause());
            }
            throw new zzgzm(e10);
        } catch (IndexOutOfBoundsException unused) {
            throw new zzgzm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    private void zzj() {
        if (this.zzt == zzhbo.zzc()) {
            this.zzt = zzhbo.zzf();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return zzhas.zza().zzb(getClass()).zzk(this, (zzgyx) obj);
    }

    public int hashCode() {
        if (zzcf()) {
            return zzaW();
        }
        if (zzcd()) {
            zzcc(zzaW());
        }
        return zzaX();
    }

    public String toString() {
        return zzhak.zza(this, super.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzgwy
    public int zzaL() {
        return this.zzd & f.API_PRIORITY_OTHER;
    }

    @Override // com.google.android.gms.internal.ads.zzgwy
    public int zzaM(zzhbb zzhbbVar) {
        if (zzcf()) {
            int iZzc = zzc(zzhbbVar);
            if (iZzc >= 0) {
                return iZzc;
            }
            throw new IllegalStateException(v.f(iZzc, "serialized size must be non-negative, was "));
        }
        if (zzaL() != Integer.MAX_VALUE) {
            return zzaL();
        }
        int iZzc2 = zzc(zzhbbVar);
        zzaS(iZzc2);
        return iZzc2;
    }

    @Override // com.google.android.gms.internal.ads.zzgwy
    public zzhan zzaO() {
        throw new UnsupportedOperationException("Lite does not support the mutable API.");
    }

    @Override // com.google.android.gms.internal.ads.zzgwy
    public void zzaS(int i) {
        if (i < 0) {
            throw new IllegalStateException(v.f(i, "serialized size must be non-negative, was "));
        }
        this.zzd = i | (this.zzd & zza);
    }

    public int zzaW() {
        return zzhas.zza().zzb(getClass()).zzb(this);
    }

    public int zzaX() {
        return this.zzq;
    }

    @Override // com.google.android.gms.internal.ads.zzhai
    public int zzaY() {
        return zzaM(null);
    }

    public final <MessageType extends zzgyx<MessageType, BuilderType>, BuilderType extends zzgyr<MessageType, BuilderType>> BuilderType zzaZ() {
        return (BuilderType) zzbP(zzgyw.NEW_BUILDER);
    }

    public final zzhaq<MessageType> zzbN() {
        return (zzhaq) zzbP(zzgyw.GET_PARSER);
    }

    public Object zzbO() throws Exception {
        return zzbP(zzgyw.BUILD_MESSAGE_INFO);
    }

    public Object zzbP(zzgyw zzgywVar) {
        return zzde(zzgywVar, null, null);
    }

    public Object zzbQ(zzgyw zzgywVar, Object obj) {
        return zzde(zzgywVar, obj, null);
    }

    public void zzbU() {
        this.zzq = 0;
    }

    public void zzbV() {
        zzaS(f.API_PRIORITY_OTHER);
    }

    public void zzbW() {
        zzhas.zza().zzb(getClass()).zzf(this);
        zzbX();
    }

    public void zzbX() {
        this.zzd &= f.API_PRIORITY_OTHER;
    }

    public void zzbY(int i, zzgxp zzgxpVar) {
        zzj();
        zzhbo zzhboVar = this.zzt;
        zzhboVar.zzg();
        if (i == 0) {
            throw new IllegalArgumentException("Zero is not a valid field number.");
        }
        zzhboVar.zzj((i << 3) | 2, zzgxpVar);
    }

    public final void zzbZ(zzhbo zzhboVar) {
        this.zzt = zzhbo.zze(this.zzt, zzhboVar);
    }

    public final <MessageType extends zzgyx<MessageType, BuilderType>, BuilderType extends zzgyr<MessageType, BuilderType>> BuilderType zzba(MessageType messagetype) {
        BuilderType buildertype = (BuilderType) zzaZ();
        buildertype.zzbj(messagetype);
        return buildertype;
    }

    @Override // com.google.android.gms.internal.ads.zzhai
    /* JADX INFO: renamed from: zzbb, reason: merged with bridge method [inline-methods] */
    public final BuilderType zzcZ() {
        return (BuilderType) zzbP(zzgyw.NEW_BUILDER);
    }

    /* JADX INFO: renamed from: zzbc, reason: merged with bridge method [inline-methods] */
    public final BuilderType zzbM() {
        BuilderType buildertype = (BuilderType) zzbP(zzgyw.NEW_BUILDER);
        buildertype.zzbj(this);
        return buildertype;
    }

    @Override // com.google.android.gms.internal.ads.zzhaj
    /* JADX INFO: renamed from: zzbi, reason: merged with bridge method [inline-methods] */
    public final MessageType zzbt() {
        return (MessageType) zzbP(zzgyw.GET_DEFAULT_INSTANCE);
    }

    public MessageType zzbj() {
        return (MessageType) zzbP(zzgyw.NEW_MUTABLE_INSTANCE);
    }

    @Override // com.google.android.gms.internal.ads.zzhaj
    public final boolean zzbw() {
        return zzce(this, true);
    }

    public void zzca(int i, int i10) {
        zzj();
        zzhbo zzhboVar = this.zzt;
        zzhboVar.zzg();
        if (i == 0) {
            throw new IllegalArgumentException("Zero is not a valid field number.");
        }
        zzhboVar.zzj(i << 3, Long.valueOf(i10));
    }

    public void zzcc(int i) {
        this.zzq = i;
    }

    public boolean zzcd() {
        return zzaX() == 0;
    }

    public boolean zzcf() {
        return (this.zzd & zza) != 0;
    }

    public boolean zzcg(int i, zzgxv zzgxvVar) throws IOException {
        if ((i & 7) == 4) {
            return false;
        }
        zzj();
        return this.zzt.zzm(i, zzgxvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhai
    public void zzda(zzgyc zzgycVar) throws IOException {
        zzhas.zza().zzb(getClass()).zzj(this, zzgyd.zza(zzgycVar));
    }

    public abstract Object zzde(zzgyw zzgywVar, Object obj, Object obj2);
}
