package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzfxd {
    private final zzfxc zza;

    private zzfxd(zzfxc zzfxcVar) {
        int i = zzfwe.zzb;
        this.zza = zzfxcVar;
    }

    public static zzfxd zza(int i) {
        return new zzfxd(new zzfwz(4000));
    }

    public static zzfxd zzb(zzfwf zzfwfVar) {
        return new zzfxd(new zzfwx(zzfwfVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Iterator zzf(CharSequence charSequence) {
        return this.zza.zza(this, charSequence);
    }

    public final Iterable zzc(CharSequence charSequence) {
        charSequence.getClass();
        return new zzfxa(this, charSequence);
    }

    public final List zze(CharSequence charSequence) {
        charSequence.getClass();
        Iterator itZzf = zzf(charSequence);
        ArrayList arrayList = new ArrayList();
        while (itZzf.hasNext()) {
            arrayList.add((String) itZzf.next());
        }
        return Collections.unmodifiableList(arrayList);
    }
}
