package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.provider.CalendarContract;
import android.text.TextUtils;
import app.namso_gen.spacehowen.R;
import d6.p;
import h6.r0;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbsb extends zzbsk {
    private final Map zza;
    private final Context zzb;
    private final String zzc;
    private final long zzd;
    private final long zze;
    private final String zzf;
    private final String zzg;

    public zzbsb(zzcfk zzcfkVar, Map map) {
        super(zzcfkVar, "createCalendarEvent");
        this.zza = map;
        this.zzb = zzcfkVar.zzi();
        this.zzc = zze("description");
        this.zzf = zze("summary");
        this.zzd = zzd("start_ticks");
        this.zze = zzd("end_ticks");
        this.zzg = zze("location");
    }

    private final long zzd(String str) {
        String str2 = (String) this.zza.get(str);
        if (str2 == null) {
            return -1L;
        }
        try {
            return Long.parseLong(str2);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    private final String zze(String str) {
        return TextUtils.isEmpty((CharSequence) this.zza.get(str)) ? "" : (String) this.zza.get(str);
    }

    public final Intent zzb() {
        Intent data = new Intent("android.intent.action.EDIT").setData(CalendarContract.Events.CONTENT_URI);
        data.putExtra("title", this.zzc);
        data.putExtra("eventLocation", this.zzg);
        data.putExtra("description", this.zzf);
        long j4 = this.zzd;
        if (j4 > -1) {
            data.putExtra("beginTime", j4);
        }
        long j10 = this.zze;
        if (j10 > -1) {
            data.putExtra("endTime", j10);
        }
        data.setFlags(268435456);
        return data;
    }

    public final void zzc() {
        Context context = this.zzb;
        if (context == null) {
            zzh("Activity context is not available.");
            return;
        }
        p pVar = p.C;
        r0 r0Var = pVar.f2979c;
        if (!new zzbbv(context).zzb()) {
            zzh("This feature is not available on the device.");
            return;
        }
        r0 r0Var2 = pVar.f2979c;
        AlertDialog.Builder builderI = r0.i(this.zzb);
        Resources resourcesZze = pVar.f2982g.zze();
        builderI.setTitle(resourcesZze != null ? resourcesZze.getString(R.string.s5) : "Create calendar event");
        builderI.setMessage(resourcesZze != null ? resourcesZze.getString(R.string.s6) : "Allow Ad to create a calendar event?");
        builderI.setPositiveButton(resourcesZze != null ? resourcesZze.getString(R.string.s3) : "Accept", new zzbrz(this));
        builderI.setNegativeButton(resourcesZze != null ? resourcesZze.getString(R.string.s4) : "Decline", new zzbsa(this));
        builderI.create().show();
    }
}
