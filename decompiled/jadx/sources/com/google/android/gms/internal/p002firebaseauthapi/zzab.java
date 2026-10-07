package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzab {
    private final zzj zza;
    private final zzaa zzb;

    private zzab(zzaa zzaaVar) {
        zzi zziVar = zzi.zza;
        this.zzb = zzaaVar;
        this.zza = zziVar;
    }

    public static zzab zzb(zzj zzjVar) {
        return new zzab(new zzw(zzjVar));
    }

    public static zzab zzc(String str) {
        zzp zzpVar = new zzp(Pattern.compile("[.-]"));
        if (((zzo) zzpVar.zza("")).zza.matches()) {
            throw new IllegalArgumentException(zzac.zzb("The pattern may not match the empty string: %s", zzpVar));
        }
        return new zzab(new zzy(zzpVar));
    }

    public final List zzd(CharSequence charSequence) {
        charSequence.getClass();
        Iterator itZza = this.zzb.zza(this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (itZza.hasNext()) {
            arrayList.add((String) itZza.next());
        }
        return Collections.unmodifiableList(arrayList);
    }
}
