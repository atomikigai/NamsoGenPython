package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.content.Intent;
import d6.p;
import h6.r0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzbrz implements DialogInterface.OnClickListener {
    final /* synthetic */ zzbsb zza;

    public zzbrz(zzbsb zzbsbVar) {
        this.zza = zzbsbVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        zzbsb zzbsbVar = this.zza;
        Intent intentZzb = zzbsbVar.zzb();
        r0 r0Var = p.C.f2979c;
        r0.p(zzbsbVar.zzb, intentZzb);
    }
}
