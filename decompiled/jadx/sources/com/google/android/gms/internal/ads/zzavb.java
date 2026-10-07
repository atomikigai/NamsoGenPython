package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzavb extends zzava {
    private zzavb(Context context, zzauz zzauzVar) {
        super(context, zzauzVar);
    }

    public static zzavb zzu(Context context, zzauz zzauzVar) {
        zzava.zzs(context, zzauzVar);
        return new zzavb(context, zzauzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzava
    public final List zzq(zzawf zzawfVar, Context context, zzasf zzasfVar, zzars zzarsVar) {
        if (zzawfVar.zzk() == null || !((zzava) this).zzu.zza) {
            return super.zzq(zzawfVar, context, zzasfVar, null);
        }
        int iZza = zzawfVar.zza();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(super.zzq(zzawfVar, context, zzasfVar, null));
        arrayList.add(new zzawx(zzawfVar, "I548ixRBwSg+qVTan0l7SrCz1ZaKKX3ZWtyXgu8y1OX29GkbAkB2rT1/ilUIPvFa", "lJ7kzsnnwzWch0Zt9duIk9QjvlIbpzkFDyarwE3sjFc=", zzasfVar, iZza, 24));
        return arrayList;
    }
}
