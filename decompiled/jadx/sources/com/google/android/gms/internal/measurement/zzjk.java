package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzjj;
import com.google.android.gms.internal.measurement.zzjk;
import da.v;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import q1.a;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzjk<MessageType extends zzjk<MessageType, BuilderType>, BuilderType extends zzjj<MessageType, BuilderType>> implements zzmi {
    protected int zzb = 0;

    public static void zzbw(Iterable iterable, List list) {
        byte[] bArr = zzlj.zzd;
        iterable.getClass();
        if (iterable instanceof zzlq) {
            List listZzh = ((zzlq) iterable).zzh();
            zzlq zzlqVar = (zzlq) list;
            int size = list.size();
            for (Object obj : listZzh) {
                if (obj == null) {
                    String strJ = a.j(zzlqVar.size() - size, "Element at index ", " is null.");
                    int size2 = zzlqVar.size();
                    while (true) {
                        size2--;
                        if (size2 < size) {
                            throw new NullPointerException(strJ);
                        }
                        zzlqVar.remove(size2);
                    }
                } else if (obj instanceof zzka) {
                    zzlqVar.zzi((zzka) obj);
                } else {
                    zzlqVar.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof zzmp) {
            list.addAll((Collection) iterable);
            return;
        }
        if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
            ((ArrayList) list).ensureCapacity(((Collection) iterable).size() + list.size());
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

    public int zzbu(zzmt zzmtVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzmi
    public final zzka zzbv() {
        try {
            int iZzbz = zzbz();
            zzka zzkaVar = zzka.zzb;
            byte[] bArr = new byte[iZzbz];
            zzki zzkiVarZzz = zzki.zzz(bArr, 0, iZzbz);
            zzbQ(zzkiVarZzz);
            zzkiVarZzz.zzA();
            return new zzjx(bArr);
        } catch (IOException e) {
            throw new RuntimeException(v.i("Serializing ", getClass().getName(), " to a ByteString threw an IOException (should never happen)."), e);
        }
    }

    public final byte[] zzbx() {
        try {
            int iZzbz = zzbz();
            byte[] bArr = new byte[iZzbz];
            zzki zzkiVarZzz = zzki.zzz(bArr, 0, iZzbz);
            zzbQ(zzkiVarZzz);
            zzkiVarZzz.zzA();
            return bArr;
        } catch (IOException e) {
            throw new RuntimeException(v.i("Serializing ", getClass().getName(), " to a byte array threw an IOException (should never happen)."), e);
        }
    }
}
