package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzakc {
    private static final zzakc zzb = new zzakc(true);
    final zzamo zza = new zzame(16);
    private boolean zzc;
    private boolean zzd;

    private zzakc() {
    }

    public static zzakc zza() {
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:27:0x0047 A[RETURN] */
    private static final void zzd(zzakb zzakbVar, Object obj) {
        boolean z4;
        zzanl zzanlVarZzb = zzakbVar.zzb();
        byte[] bArr = zzakq.zzd;
        obj.getClass();
        zzanl zzanlVar = zzanl.zza;
        zzanm zzanmVar = zzanm.INT;
        switch (zzanlVarZzb.zza().ordinal()) {
            case 0:
                z4 = obj instanceof Integer;
                if (z4) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzakbVar.zza()), zzakbVar.zzb().zza(), obj.getClass().getName()));
            case 1:
                z4 = obj instanceof Long;
                if (z4) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzakbVar.zza()), zzakbVar.zzb().zza(), obj.getClass().getName()));
            case 2:
                z4 = obj instanceof Float;
                if (z4) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzakbVar.zza()), zzakbVar.zzb().zza(), obj.getClass().getName()));
            case 3:
                z4 = obj instanceof Double;
                if (z4) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzakbVar.zza()), zzakbVar.zzb().zza(), obj.getClass().getName()));
            case 4:
                z4 = obj instanceof Boolean;
                if (z4) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzakbVar.zza()), zzakbVar.zzb().zza(), obj.getClass().getName()));
            case 5:
                z4 = obj instanceof String;
                if (z4) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzakbVar.zza()), zzakbVar.zzb().zza(), obj.getClass().getName()));
            case 6:
                if ((obj instanceof zzajf) || (obj instanceof byte[])) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzakbVar.zza()), zzakbVar.zzb().zza(), obj.getClass().getName()));
            case 7:
                if ((obj instanceof Integer) || (obj instanceof zzakm)) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzakbVar.zza()), zzakbVar.zzb().zza(), obj.getClass().getName()));
            case 8:
                if ((obj instanceof zzalp) || (obj instanceof zzaku)) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzakbVar.zza()), zzakbVar.zzb().zza(), obj.getClass().getName()));
            default:
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzakbVar.zza()), zzakbVar.zzb().zza(), obj.getClass().getName()));
        }
    }

    public final /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
        zzakc zzakcVar = new zzakc();
        for (int i = 0; i < this.zza.zzb(); i++) {
            Map.Entry entryZzg = this.zza.zzg(i);
            zzakcVar.zzc((zzakb) entryZzg.getKey(), entryZzg.getValue());
        }
        for (Map.Entry entry : this.zza.zzc()) {
            zzakcVar.zzc((zzakb) entry.getKey(), entry.getValue());
        }
        zzakcVar.zzd = this.zzd;
        return zzakcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzakc) {
            return this.zza.equals(((zzakc) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final void zzb() {
        if (this.zzc) {
            return;
        }
        for (int i = 0; i < this.zza.zzb(); i++) {
            Map.Entry entryZzg = this.zza.zzg(i);
            if (entryZzg.getValue() instanceof zzakk) {
                ((zzakk) entryZzg.getValue()).zzF();
            }
        }
        this.zza.zza();
        this.zzc = true;
    }

    public final void zzc(zzakb zzakbVar, Object obj) {
        if (!zzakbVar.zzc()) {
            zzd(zzakbVar, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                zzd(zzakbVar, arrayList.get(i));
            }
            obj = arrayList;
        }
        if (obj instanceof zzaku) {
            this.zzd = true;
        }
        this.zza.put(zzakbVar, obj);
    }

    private zzakc(boolean z4) {
        zzb();
        zzb();
    }
}
