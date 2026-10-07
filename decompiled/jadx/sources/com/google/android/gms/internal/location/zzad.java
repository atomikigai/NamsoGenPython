package com.google.android.gms.internal.location;

import android.os.RemoteException;
import com.google.android.gms.common.api.b;
import com.google.android.gms.common.api.o;
import w7.z;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzad extends zzae {
    final /* synthetic */ z zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzad(zzaf zzafVar, o oVar, z zVar) {
        super(oVar);
        this.zza = zVar;
    }

    @Override // com.google.android.gms.common.api.internal.d
    public final /* bridge */ /* synthetic */ void doExecute(b bVar) throws RemoteException {
        ((zzaz) bVar).zzw(this.zza, this);
    }
}
