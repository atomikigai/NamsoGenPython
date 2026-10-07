package com.google.android.recaptcha.internal;

import com.google.android.recaptcha.internal.zzge;
import com.google.android.recaptcha.internal.zzgf;
import da.v;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import q1.a;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzgf<MessageType extends zzgf<MessageType, BuilderType>, BuilderType extends zzge<MessageType, BuilderType>> implements zzke {
    protected int zza = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public static void zzc(Iterable iterable, List list) {
        byte[] bArr = zzjc.zzd;
        iterable.getClass();
        if (iterable instanceof zzjm) {
            List listZzh = ((zzjm) iterable).zzh();
            zzjm zzjmVar = (zzjm) list;
            int size = list.size();
            for (Object obj : listZzh) {
                if (obj == null) {
                    String strJ = a.j(zzjmVar.size() - size, "Element at index ", " is null.");
                    int size2 = zzjmVar.size();
                    while (true) {
                        size2--;
                        if (size2 < size) {
                            throw new NullPointerException(strJ);
                        }
                        zzjmVar.remove(size2);
                    }
                } else if (obj instanceof zzgw) {
                    zzjmVar.zzi((zzgw) obj);
                } else {
                    zzjmVar.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof zzkm) {
            list.addAll(iterable);
            return;
        }
        if (list instanceof ArrayList) {
            ((ArrayList) list).ensureCapacity(iterable.size() + list.size());
        }
        int size3 = list.size();
        for (Object obj2 : iterable) {
            if (obj2 == null) {
                String strJ2 = a.j(list.size() - size3, "Element at index ", " is null.");
                int size4 = list.size();
                while (true) {
                    size4--;
                    if (size4 < size3) {
                        throw new NullPointerException(strJ2);
                    }
                    list.remove(size4);
                }
            } else {
                list.add(obj2);
            }
        }
    }

    public int zza(zzkr zzkrVar) {
        throw null;
    }

    @Override // com.google.android.recaptcha.internal.zzke
    public final zzgw zzb() {
        try {
            int iZzn = zzn();
            zzgw zzgwVar = zzgw.zzb;
            byte[] bArr = new byte[iZzn];
            zzhh zzhhVarZzA = zzhh.zzA(bArr, 0, iZzn);
            zze(zzhhVarZzA);
            zzhhVarZzA.zzB();
            return new zzgt(bArr);
        } catch (IOException e) {
            throw new RuntimeException(v.i("Serializing ", getClass().getName(), " to a ByteString threw an IOException (should never happen)."), e);
        }
    }

    public final byte[] zzd() {
        try {
            int iZzn = zzn();
            byte[] bArr = new byte[iZzn];
            zzhh zzhhVarZzA = zzhh.zzA(bArr, 0, iZzn);
            zze(zzhhVarZzA);
            zzhhVarZzA.zzB();
            return bArr;
        } catch (IOException e) {
            throw new RuntimeException(v.i("Serializing ", getClass().getName(), " to a byte array threw an IOException (should never happen)."), e);
        }
    }
}
