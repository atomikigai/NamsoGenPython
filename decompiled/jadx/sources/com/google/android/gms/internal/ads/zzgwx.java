package com.google.android.gms.internal.ads;

import a2.g;
import com.google.android.gms.internal.ads.zzgwx;
import com.google.android.gms.internal.ads.zzgwy;
import da.v;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzgwx<MessageType extends zzgwy<MessageType, BuilderType>, BuilderType extends zzgwx<MessageType, BuilderType>> implements zzhah {
    private String zza(String str) {
        return v.k("Reading ", getClass().getName(), " from a ", str, " threw an IOException (should never happen).");
    }

    private static <T> void zzb(Iterable<T> iterable, List<? super T> list) {
        if (iterable instanceof Collection) {
            int size = ((Collection) iterable).size();
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(list.size() + size);
            }
            if (list instanceof zzhat) {
                ((zzhat) list).zze(list.size() + size);
            }
        }
        int size2 = list.size();
        if (!(iterable instanceof List) || !(iterable instanceof RandomAccess)) {
            for (Object obj : iterable) {
                if (obj == null) {
                    zzc(list, size2);
                }
                list.add(obj);
            }
            return;
        }
        List list2 = (List) iterable;
        int size3 = list2.size();
        for (int i = 0; i < size3; i++) {
            g gVar = (Object) list2.get(i);
            if (gVar == null) {
                zzc(list, size2);
            }
            list.add(gVar);
        }
    }

    public static zzhbm zzbb(zzhai zzhaiVar) {
        return new zzhbm(zzhaiVar);
    }

    @Deprecated
    public static <T> void zzbc(Iterable<T> iterable, Collection<? super T> collection) {
        zzbd(iterable, (List) collection);
    }

    public static <T> void zzbd(Iterable<T> iterable, List<? super T> list) {
        byte[] bArr = zzgzk.zzb;
        iterable.getClass();
        if (!(iterable instanceof zzgzu)) {
            if (iterable instanceof zzhar) {
                list.addAll((Collection) iterable);
                return;
            } else {
                zzb(iterable, list);
                return;
            }
        }
        List listZza = ((zzgzu) iterable).zza();
        zzgzu zzgzuVar = (zzgzu) list;
        int size = list.size();
        for (Object obj : listZza) {
            if (obj == null) {
                String strJ = q1.a.j(zzgzuVar.size() - size, "Element at index ", " is null.");
                int size2 = zzgzuVar.size();
                while (true) {
                    size2--;
                    if (size2 < size) {
                        throw new NullPointerException(strJ);
                    }
                    zzgzuVar.remove(size2);
                }
            } else if (obj instanceof zzgxp) {
                zzgzuVar.zzb();
            } else if (obj instanceof byte[]) {
                byte[] bArr2 = (byte[]) obj;
                zzgxp.zzv(bArr2, 0, bArr2.length);
                zzgzuVar.zzb();
            } else {
                zzgzuVar.add((String) obj);
            }
        }
    }

    private static void zzc(List<?> list, int i) {
        String strJ = q1.a.j(list.size() - i, "Element at index ", " is null.");
        int size = list.size();
        while (true) {
            size--;
            if (size < i) {
                throw new NullPointerException(strJ);
            }
            list.remove(size);
        }
    }

    @Override // 
    /* JADX INFO: renamed from: zzaC, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public abstract BuilderType zzaP();

    public abstract BuilderType zzaD(MessageType messagetype);

    public BuilderType zzaE(zzgxp zzgxpVar) throws zzgzm {
        try {
            zzgxv zzgxvVarZzl = zzgxpVar.zzl();
            zzaR(zzgxvVarZzl);
            zzgxvVarZzl.zzy(0);
            return this;
        } catch (zzgzm e) {
            throw e;
        } catch (IOException e4) {
            throw new RuntimeException(zza("ByteString"), e4);
        }
    }

    /* JADX INFO: renamed from: zzaF, reason: merged with bridge method [inline-methods] */
    public BuilderType zzaR(zzgxv zzgxvVar) throws IOException {
        int i = zzgyh.zzb;
        int i10 = zzhas.zza;
        return (BuilderType) zzaW(zzgxvVar, zzgyh.zza);
    }

    /* JADX INFO: renamed from: zzaG, reason: merged with bridge method [inline-methods] */
    public BuilderType zzaS(zzhai zzhaiVar) {
        if (zzbt().getClass().isInstance(zzhaiVar)) {
            return (BuilderType) zzaD((zzgwy) zzhaiVar);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }

    public BuilderType zzaH(InputStream inputStream) throws IOException {
        zzgxv zzgxvVarZzG = zzgxv.zzG(inputStream, 4096);
        zzaR(zzgxvVarZzG);
        zzgxvVarZzG.zzy(0);
        return this;
    }

    /* JADX INFO: renamed from: zzaI, reason: merged with bridge method [inline-methods] */
    public BuilderType zzaU(byte[] bArr) throws zzgzm {
        return (BuilderType) zzaZ(bArr, 0, bArr.length);
    }

    public BuilderType zzaJ(zzgxp zzgxpVar, zzgyh zzgyhVar) throws zzgzm {
        try {
            zzgxv zzgxvVarZzl = zzgxpVar.zzl();
            zzaW(zzgxvVarZzl, zzgyhVar);
            zzgxvVarZzl.zzy(0);
            return this;
        } catch (zzgzm e) {
            throw e;
        } catch (IOException e4) {
            throw new RuntimeException(zza("ByteString"), e4);
        }
    }

    @Override // 
    /* JADX INFO: renamed from: zzaK, reason: merged with bridge method [inline-methods] */
    public abstract BuilderType zzaW(zzgxv zzgxvVar, zzgyh zzgyhVar) throws IOException;

    public BuilderType zzaL(InputStream inputStream, zzgyh zzgyhVar) throws IOException {
        zzgxv zzgxvVarZzG = zzgxv.zzG(inputStream, 4096);
        zzaW(zzgxvVarZzG, zzgyhVar);
        zzgxvVarZzG.zzy(0);
        return this;
    }

    /* JADX INFO: renamed from: zzaM, reason: merged with bridge method [inline-methods] */
    public BuilderType zzaY(byte[] bArr, zzgyh zzgyhVar) throws zzgzm {
        return (BuilderType) zzba(bArr, 0, bArr.length, zzgyhVar);
    }

    @Override // 
    /* JADX INFO: renamed from: zzaN, reason: merged with bridge method [inline-methods] */
    public BuilderType zzaZ(byte[] bArr, int i, int i10) throws zzgzm {
        try {
            zzgxv zzgxvVarZzH = zzgxv.zzH(bArr, i, i10, false);
            zzaR(zzgxvVarZzH);
            zzgxvVarZzH.zzy(0);
            return this;
        } catch (zzgzm e) {
            throw e;
        } catch (IOException e4) {
            throw new RuntimeException(zza("byte array"), e4);
        }
    }

    @Override // 
    /* JADX INFO: renamed from: zzaO, reason: merged with bridge method [inline-methods] */
    public BuilderType zzba(byte[] bArr, int i, int i10, zzgyh zzgyhVar) throws zzgzm {
        try {
            zzgxv zzgxvVarZzH = zzgxv.zzH(bArr, i, i10, false);
            zzaW(zzgxvVarZzH, zzgyhVar);
            zzgxvVarZzH.zzy(0);
            return this;
        } catch (zzgzm e) {
            throw e;
        } catch (IOException e4) {
            throw new RuntimeException(zza("byte array"), e4);
        }
    }

    public /* bridge */ /* synthetic */ zzhah zzaQ(zzgxp zzgxpVar) throws zzgzm {
        zzaE(zzgxpVar);
        return this;
    }

    public /* bridge */ /* synthetic */ zzhah zzaT(InputStream inputStream) throws IOException {
        zzaH(inputStream);
        return this;
    }

    public /* bridge */ /* synthetic */ zzhah zzaV(zzgxp zzgxpVar, zzgyh zzgyhVar) throws zzgzm {
        zzaJ(zzgxpVar, zzgyhVar);
        return this;
    }

    public /* bridge */ /* synthetic */ zzhah zzaX(InputStream inputStream, zzgyh zzgyhVar) throws IOException {
        zzaL(inputStream, zzgyhVar);
        return this;
    }

    public boolean zzbe(InputStream inputStream) throws IOException {
        int i = zzgyh.zzb;
        int i10 = zzhas.zza;
        return zzbf(inputStream, zzgyh.zza);
    }

    public boolean zzbf(InputStream inputStream, zzgyh zzgyhVar) throws IOException {
        int i = inputStream.read();
        if (i == -1) {
            return false;
        }
        zzaL(new zzgww(inputStream, zzgxv.zzE(i, inputStream)), zzgyhVar);
        return true;
    }
}
