package com.google.android.gms.internal.p002firebaseauthapi;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzafr extends BroadcastReceiver {
    final /* synthetic */ zzaft zza;
    private final String zzb;

    public zzafr(zzaft zzaftVar, String str) {
        this.zza = zzaftVar;
        this.zzb = str;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("com.google.android.gms.auth.api.phone.SMS_RETRIEVED".equals(intent.getAction())) {
            Bundle extras = intent.getExtras();
            if (((Status) extras.get("com.google.android.gms.auth.api.phone.EXTRA_STATUS")).f2045a == 0) {
                String str = (String) extras.get("com.google.android.gms.auth.api.phone.EXTRA_SMS_MESSAGE");
                zzafs zzafsVar = (zzafs) this.zza.zzd.get(this.zzb);
                if (zzafsVar == null) {
                    zzaft.zza.c("Verification code received with no active retrieval session.", new Object[0]);
                } else {
                    Matcher matcher = Pattern.compile("(?<!\\d)\\d{6}(?!\\d)").matcher(str);
                    String strGroup = matcher.find() ? matcher.group() : null;
                    zzafsVar.zze = strGroup;
                    if (strGroup == null) {
                        zzaft.zza.c("Unable to extract verification code.", new Object[0]);
                    } else if (!zzac.zzd(zzafsVar.zzd)) {
                        zzaft.zzd(this.zza, this.zzb);
                    }
                }
            }
            context.getApplicationContext().unregisterReceiver(this);
        }
    }
}
