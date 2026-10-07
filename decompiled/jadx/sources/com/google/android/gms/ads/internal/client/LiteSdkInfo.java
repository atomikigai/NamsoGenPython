package com.google.android.gms.ads.internal.client;

import android.content.Context;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbpc;
import com.google.android.gms.internal.ads.zzbpg;
import e6.g1;
import e6.w2;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class LiteSdkInfo extends g1 {
    public LiteSdkInfo(Context context) {
        super("com.google.android.gms.ads.internal.client.ILiteSdkInfo");
    }

    @Override // e6.h1
    public zzbpg getAdapterCreator() {
        return new zzbpc();
    }

    @Override // e6.h1
    public w2 getLiteSdkVersion() {
        return new w2(ModuleDescriptor.MODULE_VERSION, 243799000, "23.5.0");
    }
}
